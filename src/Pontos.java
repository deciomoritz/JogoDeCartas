public class Pontos {
	
	private int quantidade;

	public Pontos(int quantidade) throws Exception{
		if(quantidade < 0)
			throw new Exception("Não pode existir uma quantidade de pontos negativa");
		this.quantidade = quantidade;
		
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void soma(Pontos p){
		quantidade += p.getQuantidade();
	}
}
