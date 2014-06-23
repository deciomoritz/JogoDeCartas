package modelo;

import java.util.Collection;

public class Jogador implements Interagível{
	
	@Override
	public String toString() {
		return "Jogador [ip=" + ip + ", conta=" + conta + ", vida=" + vida + ", baralho=" + baralho + ", mao=" + mao + "]";
	}

	private String ip;
	private Conta conta;
	private Pontos vida;
	
	private Baralho baralho;
	private Mao mao;
	
	public Jogador(String ip, Conta conta){
		this.ip = ip;
		this.conta = conta;
		this.vida = new Pontos(Config.PONTOS_VIDA);
	}
	
	public Jogador(Conta conta){
		this.conta = conta;
		this.vida = new Pontos(Config.PONTOS_VIDA);
	}
	
	public void receber(Mao m){
		mao = m;
	}
	
	public Mao getMao(){
		return mao;
	}
	
	public void comprarCarta(){
		ExemplarDeCarta e = baralho.comprar();
		mao.adicionar(e);
	}
	
	public String getLogin(){
		return conta.getLogin();
	}
	
	public void escolher(Baralho b){
		baralho = b;
		baralho.embaralhar();
	}
	
	public Baralho getBaralho(){
		return baralho;
	}

	public Jogador() {
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conta == null) ? 0 : conta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		if (conta == null) {
			if (other.conta != null)
				return false;
		} else if (!conta.equals(other.conta))
			return false;
		return true;
	}

	public Conta getConta() {
		return conta;
	}

	@Override
	public void interagir(Interagível a) {
		vida.interagir(a);
	}
}