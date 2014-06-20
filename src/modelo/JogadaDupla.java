package modelo;
public class JogadaDupla extends JogadaSimples{

	public JogadaDupla(Interagível afetado, ExemplarDeCarta exemplar, Jogador executor) {
		super(afetado, exemplar, executor);
	}

	@Override
	public void executar(){
		super.executar();
		carta.interagir(this.executor());
	}
}
