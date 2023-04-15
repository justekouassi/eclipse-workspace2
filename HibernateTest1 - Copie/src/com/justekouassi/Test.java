package com.justekouassi;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.justekouassi.entities.Utilisateur;

public class Test {

	public static void main(String[] args) throws HibernateException {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();

		Utilisateur utilisateur = new Utilisateur("Kouassi", "Justin");
		session.save(utilisateur);
		tx.commit();
		HibernateUtil.closeSession();
	}
}
