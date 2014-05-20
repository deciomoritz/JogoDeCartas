import java.util.ArrayList;
public class Baralho {
	
	private int quantidade;
	private ArrayList<ExemplarDeCarta> listaDeExemplares;
	private String nome;
	
	public Baralho(String nome) {
		this.nome = nome;
		listaDeExemplares = new ArrayList<ExemplarDeCarta>();
	}
	
	public String getCarta(int index) {
		return listaDeExemplares.get(index).getNome();
	}
	
	public ExemplarDeCarta getCopiaCarta(int index) {
		return listaDeExemplares.get(index);
	}
	
	public int compararTamanho(int valor) {
		if(valor>quantidade)
			return 1;
		else if(valor<quantidade)
			return -1;
		return 0;
	}
	
	public int quantidadeDeExemplares(String nome) {
		int val =0;
		for(int i =0;i<quantidade;i++){
			if(getCarta(i)==nome)
				val++;
		}
		return val;
	}
	
	public void remover(ExemplarDeCarta e) {
		if(listaDeExemplares.remove(e))
			quantidade--;
	}
	
	public void adicionar(ExemplarDeCarta e) {
		quantidade++;
		listaDeExemplares.add(e);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int quantidade(){
		return quantidade;
	}

}
