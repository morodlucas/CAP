package ex1;

import java.util.Scanner;

import filas.FilaInt;

public class Ex1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		fila.init();
		
		System.out.print("valor positivo: ");
		int valor = kb.nextInt();
		
		while(valor >= 0) {
			fila.enqueue(valor);
			System.out.print("valor positivo: ");
			valor = kb.nextInt();
		}
		
		while(!fila.isEmpty()) {
			System.out.println("valor retirado: " + fila.dequeue());
		}
		
		kb.close();

	}

}
