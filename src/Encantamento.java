public class Encantamento extends CartaAbstrata{

	private Pontos bônus;
	
	public Encantamento(Integer bônus) {
		super();
		this.bônus = new Pontos(bônus);
	}

	@Override
	public void interagir(Interagível a) {
		a.interagir(bônus);
	}

}
