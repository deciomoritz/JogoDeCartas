package modelo;
import java.util.Random;

public class Turno {
	
	private Jogador j;

	public Turno() {
	}

	public Turno(Jogador jogador, Jogador oponente) {
		this.j = decideInicio(jogador, oponente);
	}
	
	public Jogador jogador(){
		return j;
	}

	private static Jogador decideInicio(Jogador usuario, Jogador oponente) {
		Random r = new Random();
		if (r.nextBoolean())
			return usuario;
		return oponente;
	}
	
	public Jogador passarVez(Jogador usuario, Jogador oponente){
		if(j == usuario)
			j = oponente;
		j = usuario;
		return j;
	}
}
