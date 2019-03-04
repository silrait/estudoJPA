package br.com.silrait;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import br.com.silrait.modelo.Pessoa;

public class AppTest {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	static EntityManager em = emf.createEntityManager();

	@Test
	public void verificaBuscaPessoa() {
		Pessoa p = em.find(Pessoa.class, 1);
		assertNotNull(p);
	}

	@Test
	public void verificaExclusaoPessoa() {
		Pessoa p = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		p = em.find(Pessoa.class, p.getId());
		assertNull(p);
	}

	@AfterAll
	public static void fechaConexoes() {
		em.close();
		emf.close();
	}
}
