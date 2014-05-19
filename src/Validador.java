
public class Validador {
	
	public Validador() {
	}
	
	public boolean validar(Baralho b) {
		if(!validarQuantidade(b))
			return false;
		return validarRepetidas(b);
	}
	
	private boolean validarQuantidade(Baralho b) {
		if(b.compararTamanho(Config.MAX)<0)
			return false;
		return b.compararTamanho(Config.MIN)>0;
	}
	
	private boolean validarRepetidas(Baralho b) {
		for(int i=0;b.compararTamanho(i)>0;i++){
			String nome = b.getCarta(i);
			int repetidas = b.quantidadeDeExemplares(nome);
			if(repetidas>Config.MAX_COPIAS){
				return false;
			}
		}
		return true;
	}

}
