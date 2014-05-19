

public class FabricaConta {
	
	public FabricaConta() {
		// TODO
	}
	
	public static Conta criar(String login, String senha) {
		return new Conta(login, senha);
	}
}
