package Carro;

public class Carro {

    private String modelo;
    private int velocidade;

    public Carro(String modelo, int velocidade) {
        super();
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int valor) {
        this.velocidade += valor;
    }

    public void visualizar() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade: " + this.velocidade + " km/h");
    }

}