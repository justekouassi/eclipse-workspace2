package com.justekouassi;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.justekouassi.entities.Utilisateur;

public class Test {

  public static void main(String[] args) throws HibernateException {
    Session session = HibernateUtil.currentSession();
    Transaction tx = null;
    try {
      tx = session.beginTransaction();
      Utilisateur utilisateur = new Utilisateur("Kouassi", "Justin");
      session.save(utilisateur);
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
  }
}