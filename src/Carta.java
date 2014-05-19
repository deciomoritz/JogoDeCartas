public class Carta {
	
	private String nome;
	private String descrição;
	private Tipo t;
	
	public Carta() {
		//TODO
	}
	
	public String getNome() {
		return nome;
	}
	
	public ExemplarDeCarta getExemplar() {
		return new ExemplarDeCarta(this);
	}

}
