package ex4;

import java.util.Scanner;

import pilhas.PilhaInt;

public class DecBin {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int decimal, resto;
		PilhaInt pilha = new PilhaInt();
		pilha.init();
		
		System.out.println("Informe valor em decimal: ");
		decimal = kb.nextInt();
		
		while(decimal != 0) {
			resto = decimal % 2;
			pilha.push(resto);
			decimal = decimal / 2;
		}
		
		System.out.println("Valor em binario: ");
		pilha.esvaziar();
		
		kb.close();
		
		
	}

}
