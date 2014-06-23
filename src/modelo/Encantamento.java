package modelo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Encantamento extends CartaAbstrata{
	
	@Embedded
	@Column(name = "bônus")
	private Pontos bônus;
	
	public Encantamento(String nome, String descricao, Tipo t, Integer bonus) {
		super(nome, descricao, t);
		this.bônus = new Pontos(bonus); 
	}
	
	public Encantamento(){
		
	}

	@Override
	public void interagir(Interagível a) {
		a.interagir(bônus);
	}

}
