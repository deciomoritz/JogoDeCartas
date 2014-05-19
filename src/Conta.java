public class Conta {
	
	private String login;
	private String senha;
	
	public Conta() {
	}
	
	public boolean equal(Conta c) {
		return login == c.login && senha == c.senha;
	}

}
