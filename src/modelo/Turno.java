package modelo;
import java.util.Random;

public class Turno {
	
	private Jogador j;

	public Turno() {
	}

	public Turno(Jogador jogador, Jogador oponente) {
		decideInicio(jogador, oponente);
	}
	
	public Jogador jogador(){
		return j;
	}

	private void decideInicio(Jogador usuario, Jogador oponente) {
		Random r = new Random();
		if (r.nextBoolean()){
			j = usuario;
			return;
		}
		j = oponente;
	}
	
	public Jogador passarVez(Jogador usuario, Jogador oponente){
		if(j == usuario)
			j = oponente;
		j = usuario;
		return j;
	}
}
