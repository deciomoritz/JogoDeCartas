import java.util.ArrayList;

public class Acervo {
	
	private ArrayList<Carta> listaDeCartas;
	
	public Acervo() {
		listaDeCartas = new ArrayList<Carta>();
		
		Carta c1 = new Carta("The 5.75 terror", "Esta carta é ativada todo final de semestre", Tipo.ENCANTAMENTO);
		Carta c2 = new Carta("The KAHSSIAN", "Esta carta é muito efetiva contra o tipo Estudante", Tipo.MONSTRO);
		Carta c3 = new Carta("Diagrama de Sequencia", "Esta carta causa olheiras e sonolência", Tipo.MAGIA);
		
		listaDeCartas.add(c1);
		listaDeCartas.add(c2);
		listaDeCartas.add(c3);
	}
	
	public ArrayList<Carta> mostrarAcervo() {
		ArrayList<Carta> copiaLista = new ArrayList<Carta>();
		for (int i = 0; i < listaDeCartas.size() ; i++) {
			copiaLista.add(listaDeCartas.get(i));
		}
		return copiaLista;
	}
	
	public Carta getCarta(int i){
		return new Carta(listaDeCartas.get(i));
	}
	
	public int quantidade(){
		return listaDeCartas.size();
	}

}
