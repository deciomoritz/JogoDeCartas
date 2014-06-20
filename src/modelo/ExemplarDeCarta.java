package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ExemplarDeCarta implements Interagível{
	
	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne
	private CartaAbstrata c;
	
	public ExemplarDeCarta(CartaAbstrata c) {
		this.c = c;
	}
	
	public ExemplarDeCarta(){
		
	}
	
	public String getNome() {
		return c.getNome();
	}
	
	public String getTipo(){
		return c.getTipo().toString();
	}
	
	public String getDescricao(){
		return c.getDescricao();
	}
	
	public CartaAbstrata getCarta(){
		return c;
	}
	
	@Override
	public void interagir(Interagível a) {
		c.interagir(a);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c == null) ? 0 : c.hashCode());
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
		ExemplarDeCarta other = (ExemplarDeCarta) obj;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}
}
