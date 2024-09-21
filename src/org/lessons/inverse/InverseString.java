package org.lessons.inverse;

import java.util.Scanner;

public class InverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String stringa;
		
		System.out.println("Inserisci una parola");
		stringa = scan.next();
		
		//conversione da stringa ad array
		char[] stringaArray = stringa.toCharArray();
		
		for (int i = stringaArray.length - 1; i >= 0; i--) {
			
			System.out.println(stringaArray[i]);
		
			
		}
		
	}

}
