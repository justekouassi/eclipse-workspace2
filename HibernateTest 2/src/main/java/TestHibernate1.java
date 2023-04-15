import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.Date;

public class TestHibernate1 {
  
  public static void main(String args[]) throws HibernateException {
	  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();  
	  Session session = sessionFactory.openSession(); 
    Transaction tx = null; 
    try { 
      tx = session.beginTransaction(); 
      Personnes personne = new Personnes("prenom3", "nom3", new Date());
      session.save(personne);
      session.flush();
      tx.commit();
    } catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      throw e;
    } finally { 
      session.close(); 
    } 
    
    sessionFactory.close(); 
  } 
}