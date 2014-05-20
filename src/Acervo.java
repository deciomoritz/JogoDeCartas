import java.util.ArrayList;

public class Acervo {
	
	private ArrayList<Carta> listaDeCartas;
	
	public Acervo() {
		listaDeCartas = new ArrayList<Carta>();
		
		Carta c1 = new Carta("Guardi� dos ventos", "Ela � o esp�rito protetor da fam�lia real de Trehan", Tipo.MONSTRO);
		Carta c2 = new Carta("Daryn", "Amaldi�oado por uma deusa, esse homem jamais poder� sair das ru�nas do castelo de Of�ria", Tipo.MONSTRO);
		Carta c3 = new Carta("Nathaniel", "Um dos �ltimos membros da fam�lia real de Trehan. Tamb�m conhecido como O s�bio guerreiro", Tipo.MONSTRO);
		Carta c4 = new Carta("Katherine", "Com uma apar�ncia fr�gil e olhar frio, � lider de um ex�rcito e conhecida como a Filha da Morte", Tipo.MONSTRO);
		Carta c5 = new Carta("Marcus", "Marcus � o nome mais recente do s�bio que viu toda a hist�ria da humanidade", Tipo.MONSTRO);
		Carta c6 = new Carta("Katherine", "Com uma apar�ncia fr�gil e olhar frio, � lider de um ex�rcito e conhecida como a Filha da Morte", Tipo.MONSTRO);
		Carta c7 = new Carta("S�lion", "Uma ra�a de criaturas que vive nas velhas trihas suspensas sobre o p�ntano entre as terras de N�vron e Trehan", Tipo.MONSTRO);
		Carta c8 = new Carta("Thomas", "Um dos mensageiros entre o mundo criado pelos deuses e o mundo criado pelos homens", Tipo.MONSTRO);
		Carta c9 = new Carta("Sara", "Uma deusa perdida na terra dos homens", Tipo.MONSTRO);
		Carta c10 = new Carta("Morah", "O guardi�o das criaturas selvagens. � o esp�rito protetor das terras negras do norte", Tipo.MONSTRO);
		Carta c11 = new Carta("Guardi�o dos portais", "Um jovem exilado que aprendeu a criar selos e abrir portais entre os mundos criados pelos deuses", Tipo.MONSTRO);
		Carta c12 = new Carta("Caos", "Entidade existente antes do nascimento dos deuses", Tipo.MONSTRO);
		Carta c13 = new Carta("Ramiro", "O rei da grande montanha de gelo, que fica nas plan�cies antes do fim do mundo", Tipo.MONSTRO);
		Carta c14 = new Carta("Martin", "Velho general que acompanhou o antigo rei de Trehan em suas batalhas", Tipo.MONSTRO);
		Carta c15 = new Carta("Mortan", "Deusa que guia a alma dos mortos para o arquip�lago de seu nome", Tipo.MONSTRO);
		Carta c16 = new Carta("Eron", "Rei do arquip�lago de Cistalus, �ltimo lugar acess�vel aos habitantes do continente.", Tipo.MONSTRO);
		Carta c17 = new Carta("Zeron", "Rei da cidade suspensa nas selvas de N�vron", Tipo.MONSTRO);
		Carta c18 = new Carta("Soria", "A deusa das esta��es. Criadora da guardi� dos ventos e da �rvore de Trehan", Tipo.MONSTRO);
		Carta c19 = new Carta("Of�ria", "Deusa que criou os desertos e as serpentes no mundo dos deuses", Tipo.MONSTRO);
		Carta c20 = new Carta("T�nio", "General que controla o ex�rcito negro do norte", Tipo.MONSTRO);
		Carta c21 = new Carta("Itan", "S�bio que vive no povoado na montanhas das cachoeiras.", Tipo.MONSTRO);
		Carta c22 = new Carta("Ramiro", "Nascido no povoado dos ladr�es. � um excelente 'comerciante'", Tipo.MONSTRO);
		Carta c23 = new Carta("Ralph", "Com uma mente criativa, � uma das poucas pessoas capaz de criar m�quinas avan�adas", Tipo.MONSTRO);
		Carta c24 = new Carta("Zohar", "Um dos moradores da cidade dos homens. H�bil em lutar com lan�a e manipular fogo", Tipo.MONSTRO);
		Carta c25 = new Carta("Lara", "Uma das moradoras da cidade dos homens. Capaz de manipular �gua.", Tipo.MONSTRO);
		Carta c26 = new Carta("Erius", "Irm�o de Lara, � um h�bil manipulador de gelo e capaz de criar um drag�o ao lado da irm�.", Tipo.MONSTRO);
		Carta c27 = new Carta("Martin", "Um dos poderosos criadores da cidade dos homens. Tamb�m conhecido como o Deus humano", Tipo.MONSTRO);
		Carta c28 = new Carta("Nicolas", "Irm�o mais novo de Nathaniel. Tamb�m conhecido como o guerreiro dos ventos", Tipo.MONSTRO);
		Carta c29 = new Carta("Raz�r", "Um dos poucos homens vivos capaz de usar magias em suas flechas.", Tipo.MONSTRO);
		Carta c30 = new Carta("Roger", "Pirata temido pelos povos que vivem pr�ximos ao mar.", Tipo.MONSTRO);
		Carta c31 = new Carta("Calisto", "Um dos criadores da terra dos homens", Tipo.MONSTRO);
		Carta c32 = new Carta("Sally", "Alma de uma crian�a morta durante a guerra da cidade negra do norte", Tipo.MONSTRO);
		
		listaDeCartas.add(c1);
		listaDeCartas.add(c2);
		listaDeCartas.add(c3);
		listaDeCartas.add(c4);
		listaDeCartas.add(c5);
		listaDeCartas.add(c6);
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
	
	public Carta getCarta(int i){
		return new Carta(listaDeCartas.get(i));
	}
	
	public int quantidade(){
		return listaDeCartas.size();
	}

}
