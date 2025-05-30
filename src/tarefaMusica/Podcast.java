package tarefaMusica;

public class Podcast extends Audio{
    private String host;
    private String descrição;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
