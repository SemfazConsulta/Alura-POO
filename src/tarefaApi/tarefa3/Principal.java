package tarefaApi.tarefa3;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);
    }
}
