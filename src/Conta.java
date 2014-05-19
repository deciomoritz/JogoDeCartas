public class Conta {
	
	private String login;
	private String senha;
	
	public Conta(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public boolean equal(Conta c) {
		return login == c.login && senha == c.senha;
	}

}
