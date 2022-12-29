package com.sysarc.hibernate;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BooksManager {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookUnit");
		EntityManager emm = emf.createEntityManager();
		emm.getTransaction().begin();
		Book bk = new Book();
		System.out.println("Enter the Title of the Book");
		bk.setTitle(s.next());
		System.out.println("Enter the Author Name");
		bk.setAuthor(s.next());
		System.out.println("Enter the Price of the Book");
		bk.setPrice(s.nextInt());

		emm.persist(bk);
		emm.getTransaction().commit();
		emm.close();
		emf.close();

	}

}
