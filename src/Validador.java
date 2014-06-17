
public class Validador {
	
	public Validador() {
	}
	
	public static boolean validar(Baralho b) {
		if(!validarQuantidade(b)){
			return false;
		}
		return validarRepetidas(b);
	}
	
	private static boolean validarQuantidade(Baralho b) {
		if(b.compararTamanho(Config.MAX)<0){
			return false;
		}
		return b.compararTamanho(Config.MIN) <= 0; 
	}
	
	private static boolean validarRepetidas(Baralho b) {
		for(int i=0;i<b.quantidade();i++){
			String nome = b.getNomeCarta(i);
			int repetidas = b.quantidadeDeExemplares(nome);
			if(repetidas>Config.MAX_COPIAS){
				return false;
			}
		}
		return true;
	}

}
