package TarefaLista.animaiscachorro;

public class Cachorro extends Animal{
    private String f1;

    @Override
    public void fazSom() {
        System.out.println("Late AUUUUU");
    }

    public void abanarRabo(){
        System.out.println("Cachorro esta banando o rabo");
    }
}
