import java.util.ArrayList;

public class ListaDeBaralhos {
	
	private ArrayList<Baralho> baralhos;
	
	public ListaDeBaralhos() {
		baralhos = new ArrayList<Baralho>();
	}
	
	public boolean existe(String nome) {
		for (Baralho baralho : baralhos) {
			if(baralho.getNome() == nome)
				return true;
		}
		return false;
	}
	
	public boolean adicionar(Baralho b) {
		return baralhos.add(b);
	}
	
	public int quantidade(){
		return baralhos.size();
	}
	
	public Baralho getBaralho(int i){
		return baralhos.get(i);
	}

}
