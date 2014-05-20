public enum Tipo {
	
	MONSTRO(1),
	MAGIA(2),
	TRIBUTO(3),
	ENCANTAMENTO(4);
	
	private int valor;
	
	Tipo(int v) {
		valor = v;
	}
	
	public int getValor() {
		return this.valor;
	}

}
