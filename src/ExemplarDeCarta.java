public class ExemplarDeCarta {
	
	private Carta c;
	
	public ExemplarDeCarta(Carta c) {
		this.c = c;
	}
	
	public String getNome() {
		return c.getNome();
	}
	
	public String getTipo(){
		return c.getT();
	}
	
	public String getDescricao(){
		return c.getDescricao();
	}
	
	public Carta getCarta(){
		return c;
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
