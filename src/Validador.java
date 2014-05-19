
public class Validador {
	
	public Validador() {
	}
	
	public boolean validar(Baralho b) {
		if(!validarQuantidade(b))
			return false;
		return validarRepetidas(b);
	}
	
	private boolean validarQuantidade(Baralho b) {
		if(b.compararTamanho(MAX)<0)
			return false;
		return b.compararTamanho(MIN)>0;
	}
	
	private boolean validarRepetidas(Baralho b) {
		for(int i=0;b.compararTamanho(i)>0;i++){
			
		}
		return false;
	}

}
