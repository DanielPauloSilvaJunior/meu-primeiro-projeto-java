import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String  usuarioCorreto  = "Daniel";
		String senhaCorreta  = "1234";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome ");
		
		String usuarioDigitado = scanner.nextLine();
		
		System.out.println("Digite sua senha ");
		String senhaDigitada = scanner.nextLine();
		
		if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
			System.out.println("Logado com sucesso");
		}else {
			System.out.println("Login ou senha inválidos");
		}
		
		
		scanner.close();
		
		
	}
}
