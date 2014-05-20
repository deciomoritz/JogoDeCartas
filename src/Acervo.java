import java.util.ArrayList;

public class Acervo {
	
	private ArrayList<Carta> listaDeCartas;
	
	public Acervo() {
		listaDeCartas = new ArrayList<Carta>();
		
		Carta c1 = new Carta("Guardiã dos ventos", "Ela é o espírito protetor da família real de Trehan", Tipo.MONSTRO);
		Carta c2 = new Carta("Daryn", "Amaldiçoado por uma deusa, esse homem jamais poderá sair das ruínas do castelo de Ofíria", Tipo.MONSTRO);
		Carta c3 = new Carta("Nathaniel", "Um dos últimos membros da família real de Trehan. Também conhecido como O sábio guerreiro", Tipo.MONSTRO);
		Carta c4 = new Carta("Katherine", "Com uma aparência frágil e olhar frio, é lider de um exército e conhecida como a Filha da Morte", Tipo.MONSTRO);
		Carta c5 = new Carta("Marcus", "Marcus é o nome mais recente do sábio que viu toda a história da humanidade", Tipo.MONSTRO);
		Carta c6 = new Carta("Katherine", "Com uma aparência frágil e olhar frio, é lider de um exército e conhecida como a Filha da Morte", Tipo.MONSTRO);
		Carta c7 = new Carta("Sílion", "Uma raça de criaturas que vive nas velhas trihas suspensas sobre o pântano entre as terras de Nívron e Trehan", Tipo.MONSTRO);
		Carta c8 = new Carta("Thomas", "Um dos mensageiros entre o mundo criado pelos deuses e o mundo criado pelos homens", Tipo.MONSTRO);
		Carta c9 = new Carta("Sara", "Uma deusa perdida na terra dos homens", Tipo.MONSTRO);
		Carta c10 = new Carta("Morah", "O guardião das criaturas selvagens. É o espírito protetor das terras negras do norte", Tipo.MONSTRO);
		Carta c11 = new Carta("Guardião dos portais", "Um jovem exilado que aprendeu a criar selos e abrir portais entre os mundos criados pelos deuses", Tipo.MONSTRO);
		Carta c12 = new Carta("Caos", "Entidade existente antes do nascimento dos deuses", Tipo.MONSTRO);
		Carta c13 = new Carta("Ramiro", "O rei da grande montanha de gelo, que fica nas planícies antes do fim do mundo", Tipo.MONSTRO);
		Carta c14 = new Carta("Martin", "Velho general que acompanhou o antigo rei de Trehan em suas batalhas", Tipo.MONSTRO);
		Carta c15 = new Carta("Mortan", "Deusa que guia a alma dos mortos para o arquipélago de seu nome", Tipo.MONSTRO);
		Carta c16 = new Carta("Eron", "Rei do arquipélago de Cistalus, último lugar acessível aos habitantes do continente.", Tipo.MONSTRO);
		Carta c17 = new Carta("Zeron", "Rei da cidade suspensa nas selvas de Nívron", Tipo.MONSTRO);
		Carta c18 = new Carta("Soria", "A deusa das estações. Criadora da guardiã dos ventos e da árvore de Trehan", Tipo.MONSTRO);
		Carta c19 = new Carta("Ofíria", "Deusa que criou os desertos e as serpentes no mundo dos deuses", Tipo.MONSTRO);
		Carta c20 = new Carta("Tânio", "General que controla o exército negro do norte", Tipo.MONSTRO);
		Carta c21 = new Carta("Itan", "Sábio que vive no povoado na montanhas das cachoeiras.", Tipo.MONSTRO);
		Carta c22 = new Carta("Ramiro", "Nascido no povoado dos ladrões. É um excelente 'comerciante'", Tipo.MONSTRO);
		Carta c23 = new Carta("Ralph", "Com uma mente criativa, é uma das poucas pessoas capaz de criar máquinas avançadas", Tipo.MONSTRO);
		Carta c24 = new Carta("Zohar", "Um dos moradores da cidade dos homens. Hábil em lutar com lança e manipular fogo", Tipo.MONSTRO);
		Carta c25 = new Carta("Lara", "Uma das moradoras da cidade dos homens. Capaz de manipular água.", Tipo.MONSTRO);
		Carta c26 = new Carta("Erius", "Irmão de Lara, é um hábil manipulador de gelo e capaz de criar um dragão ao lado da irmã.", Tipo.MONSTRO);
		Carta c27 = new Carta("Martin", "Um dos poderosos criadores da cidade dos homens. Também conhecido como o Deus humano", Tipo.MONSTRO);
		Carta c28 = new Carta("Nicolas", "Irmão mais novo de Nathaniel. Também conhecido como o guerreiro dos ventos", Tipo.MONSTRO);
		Carta c29 = new Carta("Razár", "Um dos poucos homens vivos capaz de usar magias em suas flechas.", Tipo.MONSTRO);
		Carta c30 = new Carta("Roger", "Pirata temido pelos povos que vivem próximos ao mar.", Tipo.MONSTRO);
		Carta c31 = new Carta("Calisto", "Um dos criadores da terra dos homens", Tipo.MONSTRO);
		Carta c32 = new Carta("Sally", "Alma de uma criança morta durante a guerra da cidade negra do norte", Tipo.MONSTRO);
		
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
