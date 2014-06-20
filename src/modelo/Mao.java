package modelo;
import java.util.ArrayList;

public class Mao {
	
	private ArrayList<ExemplarDeCarta> mao;
	
	public Mao() {
		mao = new ArrayList<ExemplarDeCarta>();
	}

	public void adicionar(ExemplarDeCarta e){
		mao.add(e);
	}

	public ExemplarDeCarta getExemplar(int index) {
		return mao.get(index);
	}
	
	public int tamanho(){
		return mao.size();
	}

	public boolean jogar(ExemplarDeCarta e){
		if(!mao.contains(e))
			return false;
		return mao.remove(e);
	}
}
