package persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Baralho;
import modelo.Config;

public class ListaDeBaralhos {

	private List<Baralho> baralhos;

	EntityManagerFactory factory;
	EntityManager em;

	public ListaDeBaralhos() {
		baralhos = new ArrayList<Baralho>();

		trazerDoBanco();
	}

	public boolean existe(String nome) {
		for (Baralho baralho : baralhos) {
			if (baralho.getNome() == nome)
				return true;
		}
		return false;
	}

	public boolean adicionar(Baralho b) {
		if (baralhos.add(b)) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(Config.NOME_ENTITY_MANAGER);
			EntityManager em = factory.createEntityManager();

			em.getTransaction().begin();

			for (int i = 0; i < b.getTamanho(); i++) {
				em.persist(b.getExemplar(i));
				em.persist(b.getExemplar(i).getCarta());
			}
			em.persist(b);

			em.getTransaction().commit();
			em.close();
		}
		return false;
	}

	public int quantidade() {
		return baralhos.size();
	}

	public Baralho getBaralho(int i) {
		return baralhos.get(i);
	}

	@SuppressWarnings("unchecked")
	private void trazerDoBanco() {
		factory = Persistence.createEntityManagerFactory(Config.NOME_ENTITY_MANAGER);
		em = factory.createEntityManager();
		em.getTransaction().begin();

		List<Baralho> aux = em.createQuery("select b from Baralho b").getResultList();

		baralhos.addAll(aux);

		em.getTransaction().commit();
		em.close();
	}

}
