package modelo;

import javax.persistence.Embeddable;

@Embeddable
public class Pontos implements Interagível{
	
	private int quantidade;
	
	public Pontos() {
	}

	public Pontos(int quantidade){
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public Pontos negativo(){
		return new Pontos(-quantidade);
	}
	
	@Override
	public String toString() {
		return "Pontos [quantidade=" + quantidade + "]";
	}

	@Override
	public void interagir(Interagível a) {
		Pontos p = (Pontos) a;
		quantidade += p.getQuantidade();
	}
}
