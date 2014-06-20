package modelo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Monstro extends CartaAbstrata{
	
	@Embedded
	@Column(name = "pontos de ataque")
	private Pontos ataque;
	
	public Monstro(String nome, String descricao, Tipo t, Integer ataque){
		super(nome, descricao, t);
		this.ataque = new Pontos(ataque);
	}
	
	public Monstro(){
		
	}

	@Override
	public void interagir(Interagível a) {
		a.interagir(ataque.negativo());
	}
}