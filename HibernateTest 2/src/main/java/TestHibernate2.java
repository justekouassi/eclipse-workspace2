import org.hibernate.*; 
import org.hibernate.cfg.Configuration; 

public class TestHibernate2 { 
  
  public static void main(String args[]) throws Exception { 
	  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); 
    Session session = sessionFactory.openSession(); 
    
    try { 
      Personnes personne = (Personnes) session.load(Personnes.class, new Integer(1)); 
      System.out.println("nom = " + personne.getNomPersonne()); 
    } finally { 
      session.close(); 
    } 
    
    sessionFactory.close(); 
  } 
} 