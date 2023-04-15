package com.justekouassi;


import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.justekouassi.entities.Utilisateur;

public class TestMenu {

	public static void main(String args[]) throws HibernateException {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			System.out.println("Que souhaitez-vous faire ?");
			System.out.println("1 - Afficher la liste des utilisateurs");
			System.out.println("2 - Ajouter un nouvel utilisateur");
			System.out.println("3 - Mettre à jour un utilisateur");
			System.out.println("4 - Supprimer un utilisateur");

			Scanner scanner = new Scanner(System.in);
			String choix = scanner.next();

			if (choix.equals("1")) {
				System.out.println("Liste des utilisateurs : ");
				List utilisateurs = session.createQuery("FROM utilisateurs").list();
				for (int i = 0; i < utilisateurs.size(); i++) {
					Utilisateur utilisateur = (Utilisateur) utilisateurs.get(i);
					System.out.println((i+1) + "- " + utilisateur.getNom() + " " + utilisateur.getPrenom());
				}
			}

			if (choix.equals("2")) {
				System.out.print("Nom : ");
				String nom = scanner.next();
				System.out.print("Prénoms : ");
				String prenoms = scanner.next();
				Utilisateur utilisateur = new Utilisateur(nom, prenoms);
				session.save(utilisateur);
				session.flush();
				tx.commit();
			}
			
			if (choix.equals("3")) {
				System.out.println("Entrez l'identifiant de l'utilisateur:");
				Integer id = scanner.nextInt();
				Query requete = session.createQuery("FROM utilisateurs WHERE id = :id");
				requete.setParameter("id", id);
				List utilisateurs = requete.list();
				Utilisateur utilisateur = (Utilisateur) utilisateurs.get(0);

				System.out.print("Nouveau nom :");
				String nom = scanner.next();
				utilisateur.setNom(nom);
				
				System.out.print("Nouveau prénom : ");
				String prenom = scanner.next();
				utilisateur.setPrenom(prenom);
				
				requete = session.createQuery("UPDATE utilisateurs SET nom = :nom, prenom = :prenom WHERE id = :id");
				requete.setParameter("nom", utilisateur.getNom());
				requete.setParameter("prenom", utilisateur.getPrenom());
				int resultat = requete.executeUpdate();
				if (resultat != 0) {
					System.out.println("Mise à jour réussie !");
				} else {
					System.out.println("Mise à jour échouée !");
				}
			}

			if (choix.equals("4")) {
				System.out.println("Entrez l'identifiant de l'utilisateur : ");
				String id = scanner.next();
				Query requete = session.createQuery("DELETE FROM utilisateurs WHERE id = :id");
				requete.setParameter("id", id);
				int resultat = requete.executeUpdate();
				if (resultat != 0) {
					System.out.println("Suppression réussie !");
				} else {
					System.out.println("Suppression échouée !");
					;
				}
			}

			scanner.close();
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
