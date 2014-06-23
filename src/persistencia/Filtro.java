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
		public List<ExemplarDeCarta> filtrar(String campo){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(Config.NOME_ENTITY_MANAGER);
			EntityManager em = factory.createEntityManager();
			
			em.getTransaction().begin();
			Query consulta = em.createQuery("select e from Encantamento e");
			
			List<ExemplarDeCarta> lista = consulta.getResultList();
			
			em.getTransaction().commit();
			em.close();
			return lista;
		}
	}, 
	Tipo{
		@SuppressWarnings("unchecked")
		@Override
		public List<ExemplarDeCarta> filtrar(String campo){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(Config.NOME_ENTITY_MANAGER);
			EntityManager em = factory.createEntityManager();
			
			em.getTransaction().begin();
			Query consulta = em.createQuery("select e from " + campo + " e");
			
			List<ExemplarDeCarta> lista = consulta.getResultList();
			
			em.getTransaction().commit();
			em.close();
			return lista;
		}
	};
	
	public abstract List<ExemplarDeCarta> filtrar(String campo);
}
