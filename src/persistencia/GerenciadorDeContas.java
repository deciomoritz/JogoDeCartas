package persistencia;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Config;
import modelo.Conta;

public class GerenciadorDeContas {
	
	private Set<Conta> contas;
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public GerenciadorDeContas() {
		contas = new HashSet<Conta>();
		trazerDoBanco();
	}
	
	@SuppressWarnings("unchecked")
	private void trazerDoBanco(){
		emf = Persistence.createEntityManagerFactory(Config.NOME_ENTITY_MANAGER);
		em = emf.createEntityManager();
		em.getTransaction().begin();
		Query consulta = em.createQuery("select c from Conta c");
		contas.addAll(consulta.getResultList());
		em.getTransaction().commit();
		em.close();
	}
	
	public boolean adicionar(Conta conta) {
		trazerDoBanco();
		for (Conta c : contas) {
			if(c.getLogin() == conta.getLogin())
				return false;
		}
		if(contas.add(conta)){
			emf = Persistence.createEntityManagerFactory(Config.NOME_ENTITY_MANAGER);
			em = emf.createEntityManager();
			em.clear();
			em.getTransaction().begin();
			em.persist(conta);
			em.getTransaction().commit();
			em.close();
		}
		return true;
	}

	public boolean existe(Conta c) {
		trazerDoBanco();
		return contas.contains(c);
	}
}
