public class MainTeste {
	
	public MainTeste(){
		Jogo j = new Jogo();
		
		j.criarConta("t1", "fuck");
		j.criarConta("t2", "fuck");
		
		Jogador usuario  = new Jogador(new Conta("t1", "fuck"));
		Jogador oponente = new Jogador(new Conta("t2", "fuck"));
		
		boolean usLogado = j.logar("t1", "fuck");
		boolean opLogado = j.logar("t2", "fuck");
		
		System.out.println("Usuario logado: " + usLogado);
		System.out.println("Oponente logado: " + opLogado);
		
		boolean criou = j.criarPartida("teste", usuario);
		
		boolean conectou = j.conectarAPartida(oponente);
		
		System.out.println("Criou: " + criou);
		System.out.println("Conectou: " + conectou);
		
		Acervo a = new Acervo();
		
		Baralho bU = new Baralho("us");
		bU.adicionar(a.getCarta(0));
		bU.adicionar(a.getCarta(1));
		bU.adicionar(a.getCarta(2));
		
		Baralho bO = new Baralho("op");
		bO.adicionar(a.getCarta(3));
		bO.adicionar(a.getCarta(4));
		bO.adicionar(a.getCarta(5));
		
		j.escolherBaralho(bU, usuario);
		j.escolherBaralho(bO, oponente);
		
		System.out.println("Nome da partida: " + j.nomeDaPartida());
		
		
		System.out.println("Baralhos: ");
		
		System.out.println("Jogador: ");
		for (int i = 0; i < bU.getTamanho(); i++) {
			System.out.println(bU.getNomeCarta(i));
		}
		System.out.println("Oponente: ");
		for (int i = 0; i < bO.getTamanho(); i++) {
			System.out.println(bO.getNomeCarta(i));
		}
		
		j.iniciarPartida();
		
		System.out.println("Mãos: ");
		System.out.println("Jogador: ");
		for (int i = 0; i < usuario.getMao().tamanho(); i++) {
			System.out.println(usuario.getMao().getExemplar(i).getNome());
		}
		System.out.println("Oponente: ");
		for (int i = 0; i < oponente.getMao().tamanho(); i++) {
			System.out.println(oponente.getMao().getExemplar(i).getNome());
		}
		
		System.out.println("Baralhos: ");
		
		System.out.println("Jogador: ");
		for (int i = 0; i < bU.getTamanho(); i++) {
			System.out.println(bU.getNomeCarta(i));
		}
		System.out.println("Oponente: ");
		for (int i = 0; i < bO.getTamanho(); i++) {
			System.out.println(bO.getNomeCarta(i));
		}
		
		//Uma jogada
		ExemplarDeCarta e = oponente.getMao().getExemplar(0);
		System.out.println(usuario.toString());
		System.out.println(oponente.toString());
		System.out.println(e.getNome());
		j.efetuarJogada(usuario, e, oponente);
		System.out.println(usuario.toString());
		System.out.println(oponente.toString());
		
		System.out.println();
		
		//Outra jogada
		e = oponente.getMao().getExemplar(1);
		System.out.println(usuario.toString());
		System.out.println(oponente.toString());
		System.out.println(e.getNome());
		j.efetuarJogada(oponente, e, usuario);
		System.out.println(usuario.toString());
		System.out.println(oponente.toString());
	}
	
	public static void main(String[] args){
		new MainTeste();
	}
}
