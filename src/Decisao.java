

public enum Decisao {
	
	NÃO_TOMADA(0),
	REMOVER(1),
	ADICIONAR(2),
	TERMINAR(3);
	
	private int valor;
	
	Decisao(int v) {
		valor = v;
	}
	
	public int getValor() {
		return this.valor;
	}
}
