package modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class CartaAbstrata implements Interagível{
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	private String nome;
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private Tipo t;
	
	public CartaAbstrata(){
	}
	
	public CartaAbstrata(String nome, String descricao, Tipo t) {
		this.nome = nome;
		this.descricao = descricao;
		this.t = t;
	}
	
	public CartaAbstrata(CartaAbstrata c){
		this.nome = c.nome;
		this.descricao = c.descricao;
		this.t = c.t;
	}

	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public Tipo getTipo() {
		return t;
	}

	public ExemplarDeCarta getExemplar() {
		return new ExemplarDeCarta(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((t == null) ? 0 : t.hashCode());
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
		CartaAbstrata other = (CartaAbstrata) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (t != other.t)
			return false;
		return true;
	}
}