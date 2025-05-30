package tarefaMusica.principal;

import tarefaMusica.Audio;

public class MilhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " É considerado sucesso absoluto e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " Uma exelente opção para ouvir depois");
        }
    }
}
