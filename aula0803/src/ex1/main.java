package ex1;

import java.util.Scanner;

import pilhas.PilhaInt;

//pilhas sequencais

public class main {

	public static void main(String[] args) {

		PilhaInt pilha = new PilhaInt();
		pilha.init();
		
		Scanner kb = new Scanner(System.in);
		int valor;
			
		System.out.print("Digite um valor inteiro: ");
		valor = kb.nextInt();
		pilha.push(valor);

		valor = pilha.pop();
		System.out.println("Retirado valor: " + valor);
	  

		
	}

}
