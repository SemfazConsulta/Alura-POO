package TarefaLista.Tarefa05;

public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio){
        this.raio=raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public String toString() {
        return "Circulo com raio " + raio;
    }
}
