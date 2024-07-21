package OneToOneBieController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneBie.dao.AadharCardDao;
import OneToOneBie.dao.PersonDao;
import OneToOneBie.dto.AadharCard;
import OneToOneBie.dto.Person;

public class PersonAadharCardController 
{


	public static void main(String[] args) {
 
		//insert
		
//		Person person=new Person();
//		person.setId(1);
//		person.setName("Prabhu");
//		person.setAddress("kochi");
//		
//		
//		AadharCard aadharCard=new AadharCard();
//		aadharCard.setId(101);
//		aadharCard.setName("pooji");
//		aadharCard.setAge(18);
//		
//		
//		
//		person.setAadharcard(aadharCard);
//		aadharCard.setPerson(person);
//		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		entityTransaction.begin();
//		entityManager.persist(person);
//		entityManager.persist(aadharCard);
//		entityTransaction.commit();
//		
		
		
		
		
		//delete

//    PersonDao dao=new PersonDao();
//		dao.deletePerson(1);
//		
//		
//		AadharCardDao cardDao=new AadharCardDao();
//		cardDao.deleteAadharCard(101);
		
		
		
		
		
		//find
		
		PersonDao dao=new PersonDao();
		dao.findPerson(2);
		
		
		AadharCardDao cardDao=new AadharCardDao();
	    cardDao.findAadharCard(102);
		
		
		
	}
	}

