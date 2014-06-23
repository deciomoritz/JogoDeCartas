package modelo;

import persistencia.GerenciadorDeContas;
import persistencia.ListaDeBaralhos;

public class Jogo {

	private GerenciadorDeContas g;
	private ListaDeBaralhos l;
	
	private Partida partida;

	private Baralho baralhoTemp;
	
	public void efetuarJogada(Interagível afetado, ExemplarDeCarta exemplar, Jogador executor){
		Jogada j = FabricaJogada.criarJogada(afetado, exemplar, executor);
		if(!partida.terminada())
			partida.efetuar(j);
	}
	
	public boolean partidaTerminada(){
		return partida.terminada();
	}
	
	public Jogador vencedor(){
		return partida.vencedor();
	}
	
	public void iniciarPartida(){
		partida.iniciar();
	}
	
	public String nomeDaPartida(){
		return partida.getNome();
	}
	
	public void escolherBaralho(Baralho b, Jogador j){
		j.escolher(b);
	}
	
	public boolean criarPartida(String nome, Jogador j){
		if(logar(j)){
			partida = new Partida(j, nome);
			return true;
		}
		return false;
	}
	
	public boolean conectarAPartida(Jogador oponente){
		if(logar(oponente))
			return partida.conectar(oponente);
		return false;
	}
	
	public Baralho getBaralhoTemp(){
		return baralhoTemp;
	}
	
	public ListaDeBaralhos getListaDeBaralhos(){
		return l;
	}

	public Jogo() {
		g = new GerenciadorDeContas();
		l = new ListaDeBaralhos();
	}

	public void remover(CartaAbstrata c, Baralho b) {
		ExemplarDeCarta e = c.getExemplar();
		b.remover(e);
	}

	public boolean criarConta(String login, String senha) {
		Conta c = new Conta(login, senha);
		return g.adicionar(c);
	}

	public void adicionar(CartaAbstrata c, Baralho b) {
		ExemplarDeCarta e = c.getExemplar();
		b.adicionar(e);
	}

	public boolean salvarBaralhoTemporario() {
		return salvar(baralhoTemp);
	}

	public boolean salvar(Baralho b) {
		if (!Validador.validar(b))
			return false;
		l.adicionar(b);
		return true;
	}

	public void editarBaralho(Baralho b, CartaAbstrata c, Decisao d) {
		switch (d) {
		case REMOVER:
			this.remover(c, b);
			break;
		case ADICIONAR:
			this.adicionar(c, b);
			break;
		}
	}

	public void editarBaralho(CartaAbstrata c, Decisao d) {
		editarBaralho(baralhoTemp, c, d);
	}

	public boolean montar(String nome) {
		if (!l.existe(nome)) {
			baralhoTemp = new Baralho(nome);
			return true;
		}
		return false;
	}

	public boolean logar(Jogador j) {
		if(g.existe(j.getConta())){
			return true;
		}
		return false;
	}
	
	public boolean logar(String login, String senha) {
		Conta c = new Conta(login, senha);
		Jogador j = new Jogador(c);
		return logar(j);
	}
}
