public abstract class CartaAbstrata implements Interagível{
	
	private String nome;
	private String descricao;
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