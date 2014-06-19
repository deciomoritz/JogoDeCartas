import java.util.ArrayList;

public class Acervo {
	
	private ArrayList<CartaAbstrata> listaDeCartas;
	
	public Acervo() {
		listaDeCartas = new ArrayList<CartaAbstrata>();
		
		CartaAbstrata c1 = new Monstro("Guardi� dos ventos", "Ela � o esp�rito protetor da fam�lia real de Trehan", Tipo.MONSTRO,2);
		CartaAbstrata c2 = new Monstro("Daryn", "Amaldi�oado por uma deusa, esse homem jamais poder� sair das ru�nas do castelo de Of�ria", Tipo.MONSTRO,2);
		CartaAbstrata c3 = new Monstro("Nathaniel", "Um dos �ltimos membros da fam�lia real de Trehan. Tamb�m conhecido como O s�bio guerreiro", Tipo.MONSTRO,2);
		CartaAbstrata c4 = new Monstro("Katherine", "Com uma apar�ncia fr�gil e olhar frio, � lider de um ex�rcito e conhecida como a Filha da Morte", Tipo.MONSTRO,2);
		CartaAbstrata c5 = new Monstro("Marcus", "Marcus � o nome mais recente do s�bio que viu toda a hist�ria da humanidade", Tipo.ENCANTAMENTO,2);
		CartaAbstrata c7 = new Monstro("S�lion", "Uma ra�a de criaturas que vive nas velhas trihas suspensas sobre o p�ntano entre as terras de N�vron e Trehan", Tipo.ENCANTAMENTO,3);
		CartaAbstrata c8 = new Monstro("Thomas", "Um dos mensageiros entre o mundo criado pelos deuses e o mundo criado pelos homens", Tipo.MONSTRO,2);
		CartaAbstrata c9 = new Monstro("Sara", "Uma deusa perdida na terra dos homens", Tipo.MONSTRO,2);
		CartaAbstrata c10 = new Monstro("Morah", "O guardi�o das criaturas selvagens. � o esp�rito protetor das terras negras do norte", Tipo.MONSTRO,2);
		CartaAbstrata c11 = new Monstro("Guardi�o dos portais", "Um jovem exilado que aprendeu a criar selos e abrir portais entre os mundos criados pelos deuses", Tipo.MONSTRO,2);
		CartaAbstrata c12 = new Monstro("Caos", "Entidade existente antes do nascimento dos deuses", Tipo.MONSTRO,2);
		CartaAbstrata c13 = new Monstro("Ramiro", "O rei da grande montanha de gelo, que fica nas plan�cies antes do fim do mundo", Tipo.MONSTRO,2);
		CartaAbstrata c14 = new Monstro("Martin", "Velho general que acompanhou o antigo rei de Trehan em suas batalhas", Tipo.MONSTRO,2);
		CartaAbstrata c15 = new Monstro("Mortan", "Deusa que guia a alma dos mortos para o arquip�lago de seu nome", Tipo.MONSTRO,2);
		CartaAbstrata c16 = new Monstro("Eron", "Rei do arquip�lago de Cistalus, �ltimo lugar acess�vel aos habitantes do continente.", Tipo.MONSTRO,2);
		CartaAbstrata c17 = new Monstro("Zeron", "Rei da cidade suspensa nas selvas de N�vron", Tipo.MONSTRO,2);
		CartaAbstrata c18 = new Monstro("Soria", "A deusa das esta��es. Criadora da guardi� dos ventos e da �rvore de Trehan", Tipo.MONSTRO,2);
		CartaAbstrata c19 = new Monstro("Of�ria", "Deusa que criou os desertos e as serpentes no mundo dos deuses", Tipo.MONSTRO,2);
		CartaAbstrata c20 = new Monstro("T�nio", "General que controla o ex�rcito negro do norte", Tipo.MONSTRO,2);
		CartaAbstrata c21 = new Monstro("Itan", "S�bio que vive no povoado na montanhas das cachoeiras.", Tipo.MONSTRO,2);
		CartaAbstrata c22 = new Monstro("Ramiro", "Nascido no povoado dos ladr�es. � um excelente 'comerciante'", Tipo.MONSTRO,2);
		CartaAbstrata c23 = new Monstro("Ralph", "Com uma mente criativa, � uma das poucas pessoas capaz de criar m�quinas avan�adas", Tipo.MONSTRO,2);
		CartaAbstrata c24 = new Monstro("Zohar", "Um dos moradores da cidade dos homens. H�bil em lutar com lan�a e manipular fogo", Tipo.MONSTRO,2);
		CartaAbstrata c25 = new Monstro("Lara", "Uma das moradoras da cidade dos homens. Capaz de manipular �gua.", Tipo.MONSTRO,2);
		CartaAbstrata c26 = new Monstro("Erius", "Irm�o de Lara, � um h�bil manipulador de gelo e capaz de criar um drag�o ao lado da irm�.", Tipo.MONSTRO,2);
		CartaAbstrata c27 = new Monstro("Martin", "Um dos poderosos criadores da cidade dos homens. Tamb�m conhecido como o Deus humano", Tipo.MONSTRO,2);
		CartaAbstrata c28 = new Monstro("Nicolas", "Irm�o mais novo de Nathaniel. Tamb�m conhecido como o guerreiro dos ventos", Tipo.MONSTRO,2);
		CartaAbstrata c29 = new Monstro("Raz�r", "Um dos poucos homens vivos capaz de usar magias em suas flechas.", Tipo.MONSTRO,2);
		CartaAbstrata c30 = new Monstro("Roger", "Pirata temido pelos povos que vivem pr�ximos ao mar.", Tipo.MONSTRO,2);
		CartaAbstrata c31 = new Monstro("Calisto", "Um dos criadores da terra dos homens", Tipo.MONSTRO,2);
		CartaAbstrata c32 = new Monstro("Sally", "Alma de uma crian�a morta durante a guerra da cidade negra do norte", Tipo.MONSTRO,2);
		
		listaDeCartas.add(c1);
		listaDeCartas.add(c2);
		listaDeCartas.add(c3);
		listaDeCartas.add(c4);
		listaDeCartas.add(c5);
		listaDeCartas.add(c7);
		listaDeCartas.add(c8);
		listaDeCartas.add(c9);
		listaDeCartas.add(c10);
		listaDeCartas.add(c11);
		listaDeCartas.add(c12);
		listaDeCartas.add(c13);
		listaDeCartas.add(c14);
		listaDeCartas.add(c15);
		listaDeCartas.add(c16);
		listaDeCartas.add(c17);
		listaDeCartas.add(c18);
		listaDeCartas.add(c19);
		listaDeCartas.add(c20);
		listaDeCartas.add(c21);
		listaDeCartas.add(c22);
		listaDeCartas.add(c23);
		listaDeCartas.add(c24);
		listaDeCartas.add(c25);
		listaDeCartas.add(c26);
		listaDeCartas.add(c27);
		listaDeCartas.add(c28);
		listaDeCartas.add(c29);
		listaDeCartas.add(c30);
		listaDeCartas.add(c31);
		listaDeCartas.add(c32);
	}
	
	public ExemplarDeCarta getCarta(int i){
		return new ExemplarDeCarta(listaDeCartas.get(i));
	}
	
	public int quantidade(){
		return listaDeCartas.size();
	}

}
