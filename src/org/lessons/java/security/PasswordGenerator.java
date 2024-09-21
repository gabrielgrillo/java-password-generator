package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		String cognome;
		String colore;
		int giorno;
		int mese;
		int anno;
		
		
		System.out.println("Inserisci il tuo nome");
		nome = scan.next();
		
		System.out.println("Inserisci il tuo cognome");
		cognome = scan.next();
		
		System.out.println("Scegli un colore");
		colore = scan.next();
		
		System.out.println("Inserisci il tuo giorno di nascita");
		giorno = scan.nextInt();
		
		System.out.println("Inserisci il mese di nascita");
		mese = scan.nextInt();
		
		System.out.println("Inserisci il tuo anno di nascita");
		anno = scan.nextInt();
		
		int somma = giorno + mese + anno;

		System.out.println("La tua password è " + nome + "-" + cognome + "-" + colore + "-" + somma);
		
	}

}
