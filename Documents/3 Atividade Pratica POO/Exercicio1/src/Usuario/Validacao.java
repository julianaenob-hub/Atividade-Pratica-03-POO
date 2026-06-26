package Usuario;

public class Validacao {
	
	public static void validarNome(String nome) {

	    if (nome == null || nome.isBlank()) {
	        throw new IllegalArgumentException("Nome invalido!");
	    }	     
	    
	    
	}
	
	public static void validarEmail(String email) {

	    if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
	        throw new IllegalArgumentException("E-mail invalido!");
	    }

	}
}
