package aplica��o;

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
		return "O resultado da soma �: " + (numA + numB);
	}
	
	//SUBTRA��O
	public String sub(double numA, double numB) {
		return "O resultado da subtra��o �: " + (numA - numB);
	}
		
	
	//MULTIPLICA��O
	public String mult(double numA, double numB) {
		return "O resultado da multiplica��o �: " + (numA * numB);
	}
	
	//DIVIS�O
	public String div(double numA, double numB) {
		return "O resultado da divis�o �: " + (numA / numB);
	}
	
	//FUN��O
	public String fun(double numA, double numB) {
		if (numA != 0) { //Se A difere de 0, a fun��o � verdadeira
			return "X � igual a: " + (-numB / numA);
		} else { //Se A for igual a 0, o resultado sempre tende ao infinito
			return "O resultado da fun��o (ou X) tende ao infinito";
		}
	}
	
	//POTENCIA��O
	public String pot(double numA, double pot) {
		if (pot == 2) {
			return "O resultado da potencia��o �: " + (numA * numA);
		} else {
			if (pot == 0) {
				return "O resultado da potencia��o �: 1"; //Todo n�mero potenciado a zero d� 1
			} else {
				double resultado = 1; //Resultado come�ar� igualando-se � base, da� continua se multiplicando a ela
				int i = 0;
				while (i != pot) { //Enquanto o contador difere da pot�ncia, multiplica o resultado � base
					resultado = resultado * numA;
					i++; //O contador soma 1 a cada multiplica��o ao resultado at� igualar � pot�ncia
				}
				return "O resultado da potencia��o �: " + (resultado);
			}
		}
	}
}
