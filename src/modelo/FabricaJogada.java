package modelo;
public class FabricaJogada {

	public static Jogada criarJogada(Interagível afetado, ExemplarDeCarta exemplar, Jogador executor){
		if(exemplar.tipo() == Tipo.MONSTRO)
			return new JogadaSimples(afetado, exemplar, executor);
		return new JogadaDupla(afetado, exemplar, executor);
	}
}