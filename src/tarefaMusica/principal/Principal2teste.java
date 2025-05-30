package tarefaMusica.principal;

import tarefaMusica.Musica;
import tarefaMusica.Podcast;

public class Principal2teste {
    public static void main(String[] args) {
        Musica msc1 = new Musica();
        msc1.setTitulo("Hyns n' Huty");
        msc1.setAlbum("The ofers mans");
        msc1.setArtista("Babagau santos");
        msc1.setGenero("Rock");

        for (int i = 0; i < 1000; i++) {
            msc1.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            msc1.cuitir();
        }

        Podcast pdc1 =new Podcast();
        pdc1.setTitulo("Desgraça atomaica");
        pdc1.setDescrição("Podecaste sobre doentes na guerra atomica de 1994");
        pdc1.setHost("Spotyfire");

        for (int i = 0; i < 5000; i++) {
            pdc1.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            pdc1.cuitir();
        }

        MilhasPreferidas preferidas = new MilhasPreferidas();
        preferidas.inclui(pdc1);
        preferidas.inclui(msc1);
    }
}
