package tarefaApi.tarefa12;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        String jsonPessoa= "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasilia\"}";

        Gson gson = new GsonBuilder().setLenient().create();

        Pessoa pessoaJson = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Obejto pessoa: " + pessoaJson);
    }
}
