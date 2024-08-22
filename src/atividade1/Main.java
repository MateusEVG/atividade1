package atividade1;

import java.util.*;
/**
 * @author MateusEvangelistaDoNascimento
 * 
 * Atividade 1 de ti2 back-end: Ler dois numeros e somá-los
 * 
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		// data
		int x;
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro :");
		x = sc.nextInt();
		System.out.println("Digite outro numero inteiro :");
		y = sc.nextInt();
		
		System.out.println("A soma dos dois numeros digitados é: " + (x + y));
		
	}

}
