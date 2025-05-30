package br.com.alura.screenmatch.exececao;

public class ErroConversaoExcption extends RuntimeException {
    private String mensagem;

    public ErroConversaoExcption(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
