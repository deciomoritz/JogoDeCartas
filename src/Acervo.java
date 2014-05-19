

import java.util.ArrayList;

public class Acervo {
	
	private ArrayList<Carta> listaDeCartas;
	
	public Acervo() {
		listaDeCartas = new ArrayList<Carta>();
	}
	
	public ArrayList<Carta> mostrarAcervo() {
		ArrayList<Carta> copiaLista = new ArrayList<Carta>();
		for (int i = 0; i < listaDeCartas.size() ; i++) {
			copiaLista.add(listaDeCartas.get(i));
		}
		return copiaLista;
	}

}
