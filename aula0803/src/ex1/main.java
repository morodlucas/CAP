package ex1;

import pilhas.PilhaInt;

//pilhas sequencais

public class main {

	public static void main(String[] args) {

		PilhaInt pilha = new PilhaInt();
		pilha.init();
		
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.push(50);
		pilha.push(60);
		pilha.push(70);
		
		if(!pilha.isEmpty())
			System.out.println("Valor do dado do topo da pilha: " + pilha.top());
		else
			System.out.println("Pilha vazia");
		
		if(!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		else
			System.out.println("Pilha vazia");
		
		if(!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		else
			System.out.println("Pilha vazia");

		System.out.println("Esvaziando pilha");
		
		pilha.esvaziar();
		
		if(!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: " + pilha.pop());
		else
			System.out.println("Pilha vazia");
		
		
		
	}

}
