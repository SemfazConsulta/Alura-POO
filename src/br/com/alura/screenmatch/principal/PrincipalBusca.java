package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exececao.ErroConversaoExcption;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de um filme: ");
        var busca = scanner.nextLine();

        String endereco = "https://www.omdbapi.com/?t="+ busca.replace(" ", "+") +"&apikey=6fad4aa1";
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request =  HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmdb meuTituloOmd =  gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmd);
//        try {
            Titulo meuTitulo =  new Titulo(meuTituloOmd);
            System.out.println("Titulo ja convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e){
            System.out.print("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("ERRO Verifique o endereço/nome por favor !!!");
        } catch (ErroConversaoExcption e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Finalizou tudo certo");



//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();
    }
}
