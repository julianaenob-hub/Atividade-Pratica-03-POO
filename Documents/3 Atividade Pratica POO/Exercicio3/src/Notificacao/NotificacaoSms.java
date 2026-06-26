package Notificacao;

public class NotificacaoSms extends Notificacao {
	
	
	public NotificacaoSms(String sms) {
	    super(sms);
	    Validacao.validarTelefone(sms);
	}

	@Override
	public void enviar(String mensagem) {
	    Validacao.validarMensagem(mensagem);

	    System.out.println("Enviando SMS para "
	            + getDestinatario()
	            + " - Mensagem: "
	            + mensagem);
	}
	
}

