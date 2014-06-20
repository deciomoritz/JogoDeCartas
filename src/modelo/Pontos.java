package modelo;

import javax.persistence.Embeddable;

@Embeddable
public class Pontos implements Interag�vel{
	
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
	public void interagir(Interag�vel a) {
		Pontos p = (Pontos) a;
		quantidade += p.getQuantidade();
	}
}
