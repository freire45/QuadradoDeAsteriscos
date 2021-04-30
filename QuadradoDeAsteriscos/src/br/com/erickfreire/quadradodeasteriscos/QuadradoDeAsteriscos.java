package br.com.erickfreire.quadradodeasteriscos;

import java.util.Scanner;

/**
 * Programa em Java que desenha um quadrado de asteriscos
 * @author Erick Freire
 * @version 1 - Criado em 30-04-2021
 */

public class QuadradoDeAsteriscos {

	public static void main(String[] args) {
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que desenha um quadrado com asteriscos: ");
		
		System.out.print("Informe o tamanho do quadrado: ");
		numero = entrada.nextInt();
		
		System.out.println();
		
		desenhaQuadradoDeAsteriscos(numero);

	}
	
	public static void desenhaQuadradoDeAsteriscos(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("*");
				
				if(j == n) {
					System.out.println();
				}
			}
		}
		
	}

}
