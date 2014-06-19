public class Monstro extends CartaAbstrata{
	
	private Pontos ataque;
	
	public Monstro(String nome, String descricao, Tipo t, Integer ataque){
		super(nome, descricao, t);
		this.ataque = new Pontos(ataque);
	}

	@Override
	public void interagir(Interagível a) {
		a.interagir(ataque.negativo());
	}
}