import java.util.ArrayList;

public class Acervo {
	
	private ArrayList<CartaAbstrata> listaDeCartas;
	
	public Acervo() {
		listaDeCartas = new ArrayList<CartaAbstrata>();
		
		CartaAbstrata c1 = new Monstro("Guardiã dos ventos", "Ela é o espírito protetor da família real de Trehan", Tipo.MONSTRO,2);
		CartaAbstrata c2 = new Monstro("Daryn", "Amaldiçoado por uma deusa, esse homem jamais poderá sair das ruínas do castelo de Ofíria", Tipo.MONSTRO,2);
		CartaAbstrata c3 = new Monstro("Nathaniel", "Um dos últimos membros da família real de Trehan. Também conhecido como O sábio guerreiro", Tipo.MONSTRO,2);
		CartaAbstrata c4 = new Monstro("Katherine", "Com uma aparência frágil e olhar frio, é lider de um exército e conhecida como a Filha da Morte", Tipo.MONSTRO,2);
		CartaAbstrata c5 = new Monstro("Marcus", "Marcus é o nome mais recente do sábio que viu toda a história da humanidade", Tipo.ENCANTAMENTO,2);
		CartaAbstrata c7 = new Monstro("Sílion", "Uma raça de criaturas que vive nas velhas trihas suspensas sobre o pântano entre as terras de Nívron e Trehan", Tipo.ENCANTAMENTO,3);
		CartaAbstrata c8 = new Monstro("Thomas", "Um dos mensageiros entre o mundo criado pelos deuses e o mundo criado pelos homens", Tipo.MONSTRO,2);
		CartaAbstrata c9 = new Monstro("Sara", "Uma deusa perdida na terra dos homens", Tipo.MONSTRO,2);
		CartaAbstrata c10 = new Monstro("Morah", "O guardião das criaturas selvagens. É o espírito protetor das terras negras do norte", Tipo.MONSTRO,2);
		CartaAbstrata c11 = new Monstro("Guardião dos portais", "Um jovem exilado que aprendeu a criar selos e abrir portais entre os mundos criados pelos deuses", Tipo.MONSTRO,2);
		CartaAbstrata c12 = new Monstro("Caos", "Entidade existente antes do nascimento dos deuses", Tipo.MONSTRO,2);
		CartaAbstrata c13 = new Monstro("Ramiro", "O rei da grande montanha de gelo, que fica nas planícies antes do fim do mundo", Tipo.MONSTRO,2);
		CartaAbstrata c14 = new Monstro("Martin", "Velho general que acompanhou o antigo rei de Trehan em suas batalhas", Tipo.MONSTRO,2);
		CartaAbstrata c15 = new Monstro("Mortan", "Deusa que guia a alma dos mortos para o arquipélago de seu nome", Tipo.MONSTRO,2);
		CartaAbstrata c16 = new Monstro("Eron", "Rei do arquipélago de Cistalus, último lugar acessível aos habitantes do continente.", Tipo.MONSTRO,2);
		CartaAbstrata c17 = new Monstro("Zeron", "Rei da cidade suspensa nas selvas de Nívron", Tipo.MONSTRO,2);
		CartaAbstrata c18 = new Monstro("Soria", "A deusa das estações. Criadora da guardiã dos ventos e da árvore de Trehan", Tipo.MONSTRO,2);
		CartaAbstrata c19 = new Monstro("Ofíria", "Deusa que criou os desertos e as serpentes no mundo dos deuses", Tipo.MONSTRO,2);
		CartaAbstrata c20 = new Monstro("Tânio", "General que controla o exército negro do norte", Tipo.MONSTRO,2);
		CartaAbstrata c21 = new Monstro("Itan", "Sábio que vive no povoado na montanhas das cachoeiras.", Tipo.MONSTRO,2);
		CartaAbstrata c22 = new Monstro("Ramiro", "Nascido no povoado dos ladrões. É um excelente 'comerciante'", Tipo.MONSTRO,2);
		CartaAbstrata c23 = new Monstro("Ralph", "Com uma mente criativa, é uma das poucas pessoas capaz de criar máquinas avançadas", Tipo.MONSTRO,2);
		CartaAbstrata c24 = new Monstro("Zohar", "Um dos moradores da cidade dos homens. Hábil em lutar com lança e manipular fogo", Tipo.MONSTRO,2);
		CartaAbstrata c25 = new Monstro("Lara", "Uma das moradoras da cidade dos homens. Capaz de manipular água.", Tipo.MONSTRO,2);
		CartaAbstrata c26 = new Monstro("Erius", "Irmão de Lara, é um hábil manipulador de gelo e capaz de criar um dragão ao lado da irmã.", Tipo.MONSTRO,2);
		CartaAbstrata c27 = new Monstro("Martin", "Um dos poderosos criadores da cidade dos homens. Também conhecido como o Deus humano", Tipo.MONSTRO,2);
		CartaAbstrata c28 = new Monstro("Nicolas", "Irmão mais novo de Nathaniel. Também conhecido como o guerreiro dos ventos", Tipo.MONSTRO,2);
		CartaAbstrata c29 = new Monstro("Razár", "Um dos poucos homens vivos capaz de usar magias em suas flechas.", Tipo.MONSTRO,2);
		CartaAbstrata c30 = new Monstro("Roger", "Pirata temido pelos povos que vivem próximos ao mar.", Tipo.MONSTRO,2);
		CartaAbstrata c31 = new Monstro("Calisto", "Um dos criadores da terra dos homens", Tipo.MONSTRO,2);
		CartaAbstrata c32 = new Monstro("Sally", "Alma de uma criança morta durante a guerra da cidade negra do norte", Tipo.MONSTRO,2);
		
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
