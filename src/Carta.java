public class Carta {
	
	private String nome;
	private String descricao;
	private Tipo t;
	
	public Carta(){
	}
	
	public Carta(String nome, String descricao, Tipo t) {
		this.nome = nome;
		this.descricao = descricao;
		this.t = t;
	}
	
	public Carta(Carta c){
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

	public String getT() {
		return t.toString();
	}

	public ExemplarDeCarta getExemplar() {
		return new ExemplarDeCarta(this);
	}

}
