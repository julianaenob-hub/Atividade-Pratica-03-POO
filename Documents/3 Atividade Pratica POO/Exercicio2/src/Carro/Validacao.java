package Carro;

public class Validacao {

    public static void validarAceleracao(int aceleracao) {

        if (aceleracao <= 0) {
            throw new IllegalArgumentException("A aceleração deve ser maior que zero!");
        }

    }

    public static void validarNivelBateria(int nivelBateria) {

        if (nivelBateria < 0 || nivelBateria > 100) {
            throw new IllegalArgumentException("O nível da bateria deve estar entre 0 e 100!");
        }

    }

    public static void validarConsumo(int consumo, int nivelBateria) {

        if (consumo > nivelBateria) {
            throw new IllegalArgumentException("Bateria insuficiente para acelerar!");
        }

    }

}