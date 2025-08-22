
public class Cachorro {
// Definindo atributos
	String nome;
	int idade;
	
	
	//Construtor
	public Cachorro(String nomeCachorro, int idadeCachorro) {
		this.nome = nomeCachorro;
		this.idade = idadeCachorro;
	}
	
	
	//Criando Método
	public void latir() {
		System.out.println("Au au!");
	}
}
