package Notificacao;

public class NotificacaoEmail extends Notificacao {

	public NotificacaoEmail(String email) {
	    super(email);
	    Validacao.validarEmail(email);
	}

	@Override
	public void enviar(String mensagem) {
	    Validacao.validarMensagem(mensagem);

	    System.out.println("Enviando Email para "
	            + getDestinatario()
	            + " - Mensagem: "
	            + mensagem);
	}
}