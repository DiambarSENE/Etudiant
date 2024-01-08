package net.codejava;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EtudiantManager {
	static EntityManagerFactory factory;
	static EntityManager entityManager;
	public static void main(String[] args) {
		begin();
		
		create();
		
		//update();
		
		//remove();
		
		end();
		
	}



public static void create(){
	Etudiant newEtudiant = new Etudiant();
	newEtudiant.setNom("DIOUF");
	newEtudiant.setPrenom("Ibrahima");
	
	Etudiant e = new Etudiant();
	e.setNom("SENE");
	e.setPrenom("Diambar");
	
	Etudiant e1 = new Etudiant();
	e1.setNom("SARR");
	e1.setPrenom("Fatou");
	
	Etudiant e2 = new Etudiant();
	e2.setNom("DIOP");
	e2.setPrenom("Khadim");
	
	//entityManager.persist(newEtudiant);
	//entityManager.persist(e);
	//entityManager.persist(e1);
	entityManager.persist(e2);
	}

private static void end() {
	entityManager.getTransaction().commit();
	entityManager.close();
	factory.close();
}
private static void begin() {
	factory = Persistence.createEntityManagerFactory("EtudiantUnit");
	entityManager = factory.createEntityManager();
	
	entityManager.getTransaction().begin();
}
	
}