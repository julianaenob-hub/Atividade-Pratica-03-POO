
package Carro;

public class TestaCarros {

    public static void criarCarroEletrico(String modelo, int velocidade,
                                          int bateria, int aceleracao) {

        try {
            CarroEletrico carro = new CarroEletrico(modelo, velocidade, bateria);
            carro.acelerar(aceleracao);
            carro.visualizar();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        criarCarroEletrico("Tesla", 0, 100, 20);

        criarCarroEletrico("BYD Dolphin", 0, 80, 0);

        criarCarroEletrico("Volvo EX30", 0, 5, 20);

        criarCarroEletrico("Renault Kwid E-Tech", 0, 120, 20);
        
        criarCarroEletrico("BMW i4", 0, -10, 20);
    }
}