package modelo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Encantamento extends CartaAbstrata{
	
	@Embedded
	@Column(name = "b�nus")
	private Pontos b�nus;
	
	public Encantamento(String nome, String descricao, Tipo t, Integer bonus) {
		super(nome, descricao, t);
		this.b�nus = new Pontos(bonus); 
	}
	
	public Encantamento(){
		
	}

	@Override
	public void interagir(Interag�vel a) {
		a.interagir(b�nus);
	}

}
