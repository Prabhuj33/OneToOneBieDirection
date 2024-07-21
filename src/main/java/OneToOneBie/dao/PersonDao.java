package OneToOneBie.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneBie.dto.AadharCard;
import OneToOneBie.dto.Person;



public class PersonDao 
{

	      public EntityManager getEntityManager() {
			return Persistence.createEntityManagerFactory("vinod").createEntityManager();
		}
		
		
		public void upadetPerson(int id,Person person) {
			EntityManager entityManager=getEntityManager();
			Person dbPerson=entityManager.find(Person.class, id);
			if(dbPerson!=null) {
//				id is present then i can update the data
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				person.setId(id);
				person.setAadharcard(dbPerson.getAadharcard());
				entityManager.merge(person);
				entityTransaction.commit();
			}else {
				System.out.println("Sorry Idis not present");
			}
		}
		
		public void findPerson(int id) {
			EntityManager entityManager=getEntityManager();
			Person dbPerson=entityManager.find(Person.class, id);
			if(dbPerson!=null) {
//				id is present then i can update the data
				System.out.println(dbPerson);
			}else {
				System.out.println("Sorry Idis not present");
			}
		}
		public void deletePerson(int id) {
			EntityManager entityManager=getEntityManager();
			Person dbPerson=entityManager.find(Person.class, id);
			if(dbPerson!=null) {
//				id is present then i can update the data
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				AadharCard dbAadharCard=dbPerson.getAadharcard();
				dbAadharCard.setPerson(null);
				entityManager.remove(dbPerson);
				entityTransaction.commit();
			}else {
				System.out.println("Sorry Idis not present");
			}
		}
	}


