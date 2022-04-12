package modelagem;

public class Usuario {
	private String nome;
	private String login;
	private String senha;
	
	public Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	public String getNome() { //Pega Nome
		return this.nome;
	}
	
	public String setNome() { //Muda Nome
		return this.nome;
	}
	
	public boolean login(String log, String sen) {
		if (log == this.login && sen == this.senha) {
			return true;
		} else {
			return false;
		}
	}
}
