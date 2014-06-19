public class FabricaJogada {

	public static Jogada criarJogada(Interagível afetado, ExemplarDeCarta exemplar, Jogador executor){
		if(exemplar.getCarta().getTipo() == Tipo.MONSTRO)
			return new JogadaSimples(afetado, exemplar, executor);
		return new JogadaDupla(afetado, exemplar, executor);
	}
}