
public class MainTeste {
	
	public MainTeste(){
		Jogo j = new Jogo();
		
		j.montar("teste");

		j.editarBaralho(new Carta("asdasd", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);
		j.editarBaralho(new Carta("asdasd", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);
		j.editarBaralho(new Carta("eeeeqweeeee", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);
		j.editarBaralho(new Carta("asdasd", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);
		//j.editarBaralho(new Carta("asdasd", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);
		/*j.editarBaralho(new Carta("eeeeeeee", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);
		j.editarBaralho(new Carta("eeeeqweeeee", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);
		j.editarBaralho(new Carta("eeeasdeeeee", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);
		j.editarBaralho(new Carta("eeqweeeeeee", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);
		j.editarBaralho(new Carta("eeqweeasdasdeeeee", "asdasd", Tipo.ENCANTAMENTO), Decisao.ADICIONAR);*/
		
		//System.out.println(j.getBaralhoTemp().quantidade());
		//j.editarBaralho(j.getBaralhoTemp().getCopiaCarta(0).getCarta(), Decisao.REMOVER);
		System.out.println(Validador.validar(j.getBaralhoTemp()));
	}
	
/*	public static void main(String[] args){
		new MainTeste();
	}*/
}
