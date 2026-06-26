package Usuario;

public class TestaUsuarios {

	    public static void main(String[] args) {

	        // Teste 1 - Usuário válido
	        try {
	            Usuario usuario = new Usuario("Juliana", "juliana@gmail.com");
	            usuario.visualizar();
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println("-------------------------");

	        // Teste 2 - Administrador válido
	        try {
	            Administrador admin = new Administrador(
	                    "Carlos",
	                    "carlos@gmail.com",
	                    "Administrador");

	            admin.visualizar();
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println("-------------------------");

	        // Teste 3 - Nome inválido
	        try {
	            Usuario usuario = new Usuario("", "teste@gmail.com");
	            usuario.visualizar();
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println("-------------------------");

	        // Teste 4 - E-mail inválido
	        try {
	            Usuario usuario = new Usuario("Maria", "maria.com");
	            usuario.visualizar();
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	    }

	}


