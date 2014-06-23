package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.CartaAbstrata;
import modelo.Config;
import modelo.ExemplarDeCarta;

public enum Filtro {
	Nome{
		@SuppressWarnings("unchecked")
		@Override
		public List<CartaAbstrata> filtrar(String campo){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(Config.NOME_ENTITY_MANAGER);
			EntityManager em = factory.createEntityManager();
			
			em.getTransaction().begin();
			
			Query consulta = em.createQuery("Select c from Monstro c where c.nome=:arg1");
			consulta.setParameter("arg1", campo);
			
			List<CartaAbstrata> lista = consulta.getResultList();
			
			Query consulta2 = em.createQuery("Select c from Encantamento c where c.nome=:arg1");
			consulta2.setParameter("arg1", campo);
			
			lista.addAll(consulta2.getResultList());
			
			em.getTransaction().commit();
			em.close();
			return lista;
		}
	}, 
	Tipo{
		@SuppressWarnings("unchecked")
		@Override
		public List<CartaAbstrata> filtrar(String campo){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(Config.NOME_ENTITY_MANAGER);
			EntityManager em = factory.createEntityManager();
			
			em.getTransaction().begin();
			Query consulta = em.createQuery("select e from " + campo + " e");
			
			List<CartaAbstrata> lista = consulta.getResultList();
			
			em.getTransaction().commit();
			em.close();
			return lista;
		}
	};
	
	public abstract List<CartaAbstrata> filtrar(String campo);
}
