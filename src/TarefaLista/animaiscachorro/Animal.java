package TarefaLista.animaiscachorro;

public class Animal {
    private String nome;
    private int idade;
    private String especie;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void fazSom(){
        System.out.println("Sons");
    }
}
