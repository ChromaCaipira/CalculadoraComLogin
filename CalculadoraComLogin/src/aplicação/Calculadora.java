package aplicação;

import modelagem.Usuario;

public class Calculadora {
	private Usuario user;
	private String login;
	private String senha;
	
	public Calculadora(Usuario user) {
		this.user = user;
	}
	
	public Calculadora(String loglogin, String senlogin) {
		this.login = loglogin;
		this.senha = senlogin;
	}
	
	public Usuario getUser() {
		return this.user;
	}
	
	public Usuario setUser() {
		return this.user;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String setLogin() {
		return this.login;
	}
	
	public String getSenha() {
		return this.senha;
	}

	public String setSenha() {
		return this.senha;
	}
	
	//SOMA
	public String soma(double numA, double numB) {
		return "O resultado da soma é: " + (numA + numB);
	}
	
	//SUBTRAÇÃO
	public String sub(double numA, double numB) {
		return "O resultado da subtração é: " + (numA - numB);
	}
		
	
	//MULTIPLICAÇÃO
	public String mult(double numA, double numB) {
		return "O resultado da multiplicação é: " + (numA * numB);
	}
	
	//DIVISÃO
	public String div(double numA, double numB) {
		return "O resultado da divisão é: " + (numA / numB);
	}
	
	//FUNÇÃO
	public String fun(double numA, double numB) {
		if (numA != 0) { //Se A difere de 0, a função é verdadeira
			return "X é igual a: " + (-numB / numA);
		} else { //Se A for igual a 0, o resultado sempre tende ao infinito
			return "O resultado da função (ou X) tende ao infinito";
		}
	}
	
	//POTENCIAÇÃO
	public String pot(double numA, double pot) {
		if (pot == 2) {
			return "O resultado da potenciação é: " + (numA * numA);
		} else {
			if (pot == 0) {
				return "O resultado da potenciação é: 1"; //Todo número potenciado a zero dá 1
			} else {
				double resultado = 1; //Resultado começará igualando-se à base, daí continua se multiplicando a ela
				int i = 0;
				while (i != pot) { //Enquanto o contador difere da potência, multiplica o resultado à base
					resultado = resultado * numA;
					i++; //O contador soma 1 a cada multiplicação ao resultado até igualar à potência
				}
				return "O resultado da potenciação é: " + (resultado);
			}
		}
	}
}
