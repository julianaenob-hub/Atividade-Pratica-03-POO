package Notificacao;

public class Validacao {

    public static void validarMensagem(String mensagem) {
        if (mensagem == null || mensagem.isBlank()) {
            throw new IllegalArgumentException("A mensagem nao pode ser vazia!");
        }
    }

    public static void validarDestinatario(String destinatario) {
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException("O destinatário nao pode ser vazio!");
        }
    }

    public static void validarEmail(String email) {
        validarDestinatario(email);

        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("E-mail invalido!");
        }
    }

    public static void validarTelefone(String telefone) {
        validarDestinatario(telefone);

        if (!telefone.matches("\\d{10,11}")) {
            throw new IllegalArgumentException("Telefone invalido!");
        }
    }

}