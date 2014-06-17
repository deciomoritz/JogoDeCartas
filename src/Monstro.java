public class Monstro extends Carta{
	private Pontos ataque;
	private Pontos defesa;
	
	public Monstro(String nome, String descricao, Tipo t, int ataque,
			int defesa) throws Exception {
		super(nome, descricao, t);
		this.ataque = new Pontos(ataque);
		this.defesa = new Pontos(defesa);
	}

	public int pontosDeAtaque(){
		return ataque.getQuantidade();
	}
	
	public int pontosDeDefesa(){
		return defesa.getQuantidade();
	}
}