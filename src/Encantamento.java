public class Encantamento extends Carta{

	private Pontos bAtaque;
	private Pontos bDefesa;
	
	public int qBonusAtaque(){
		return bAtaque.getQuantidade();
	}
	
	public int qBonusDefesa(){
		return bDefesa.getQuantidade();
	}
	
	public Pontos bonusAtaque(){
		return bAtaque;
	}
	
	public Pontos bonusDefesa(){
		return bDefesa;
	}
}
