package TarefaLista.animaiscachorro;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Cachorro dog1 =  new Cachorro();
        dog1.setNome("Alemão");
        dog1.setEspecie("Pastor alemão");
        dog1.setIdade(12);

        Cachorro dog2 =  new Cachorro();
        dog2.setIdade(5);
        dog2.setNome("Lili");
        dog2.setEspecie("Lulu palmeria");

        Cachorro dog3 =  new Cachorro();
        dog3.setNome("Luxuria");
        dog3.setEspecie("Truainda");
        dog3.setIdade(3);

        Animal animal = (Animal) dog1;
        animal.fazSom();

        ArrayList<Cachorro> listaCachorro =  new ArrayList<>();
        listaCachorro.add(dog1);
        listaCachorro.add(dog2);
        listaCachorro.add(dog3);

        for (Animal item : listaCachorro) {
            if (item instanceof Cachorro cachorro){
                System.out.println("Cachorros: "  + cachorro.getEspecie());
            }
        }

    }
}
