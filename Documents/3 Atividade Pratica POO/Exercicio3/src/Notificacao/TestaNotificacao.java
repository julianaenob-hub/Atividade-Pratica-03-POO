package Notificacao;

public class TestaNotificacao {

    public static void criarNotificacao(String tipo, String destinatario, String mensagem) {

        try {

            if (tipo.equalsIgnoreCase("Email")) {

                NotificacaoEmail email = new NotificacaoEmail(destinatario);
                email.enviar(mensagem);

            } else if (tipo.equalsIgnoreCase("SMS")) {

                NotificacaoSms sms = new NotificacaoSms(destinatario);
                sms.enviar(mensagem);

            } else {

                throw new IllegalArgumentException("Tipo de notificação inexistente!");

            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

        // E-mail válido
        criarNotificacao("Email", "ana@email.com", "Bem-vindo ao sistema");

        // SMS válido
        criarNotificacao("SMS", "11988887777", "Seu código é 1234");

        // Mensagem vazia
        criarNotificacao("Email", "ana@email.com", "");

        // Destinatário vazio
        criarNotificacao("SMS", "", "Teste");

        // Tipo inexistente
        criarNotificacao("WhatsApp", "11988887777", "Olá");

    }
}