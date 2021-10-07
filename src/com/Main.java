package com;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculo cal = new Calculo();

		System.out.println("Digite os valores de entrada (separando por espaços e em ordem):");
		String ent = sc.nextLine();
		
		cal.calcular(ent);
		
	}
	
	
}
