package persistencia;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.CartaAbstrata;
import modelo.Config;
import modelo.ExemplarDeCarta;

//@Entity
public class Acervo {
	
/*	@Id
	@GeneratedValue
	private int id;*/
	
	//@OneToMany(cascade = {CascadeType.ALL, CascadeType.DETACH, CascadeType.PERSIST})   
	private List<CartaAbstrata> listaDeCartas;
	
	EntityManagerFactory factory;
	EntityManager em;
	
	public Acervo(List<CartaAbstrata> listaDeCartas) {
		this.listaDeCartas = listaDeCartas;
	}
	
	@SuppressWarnings("unchecked")
	public Acervo(){
		//listaDeCartas = new ArrayList<CartaAbstrata>();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(Config.NOME_ENTITY_MANAGER);
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Query consulta = em.createQuery("select m from Monstro m");
		
		listaDeCartas = consulta.getResultList();
		Query consulta2 = em.createQuery("select e from Encantamento e");
		List<CartaAbstrata> aux = consulta2.getResultList();
		listaDeCartas.addAll(aux);
		
		em.getTransaction().commit();
		em.close();
	}
	
	public ExemplarDeCarta getCarta(int i){
		return new ExemplarDeCarta(listaDeCartas.get(i));
	}
	
	public int quantidade(){
		return listaDeCartas.size();
	}

}
