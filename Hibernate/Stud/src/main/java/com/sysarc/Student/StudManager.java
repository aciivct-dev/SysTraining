package com.sysarc.Student;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudManager {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookUnit");
		EntityManager emm = emf.createEntityManager();
		emm.getTransaction().begin();
		StudLog std = new StudLog();

		System.out.println("Enter the Student Name");
		std.setName(s.nextLine());
		System.out.println("Enter the Student Mailid");
		std.setMail(s.next());
		System.out.println("Enter the Student Contact");
		std.setContact(s.nextLong());

		emm.persist(std);
		emm.getTransaction().commit();
		emm.close();
		emf.close();

	}

}
