public class Encantamento extends CartaAbstrata{

	private Pontos b�nus;
	
	public Encantamento(Integer b�nus) {
		super();
		this.b�nus = new Pontos(b�nus);
	}

	@Override
	public void interagir(Interag�vel a) {
		a.interagir(b�nus);
	}

}
