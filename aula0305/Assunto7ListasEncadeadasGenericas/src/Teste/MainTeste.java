package Teste;

import java.util.Scanner;

import listas.ListaIntCrescente;

public class MainTeste {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		ListaIntCrescente lista = new ListaIntCrescente();
		
		System.out.println("valor positivo para inserir ou negativo para encerrar");
		int valor = kb.nextInt();
		
		while(valor>=0) {
			lista.insere(valor);
			lista.apresenta();
			System.out.println("valor positivo para inserir ou negativo para encerrar");
			valor = kb.nextInt();
		}
		
		
		kb.close();

	}

}
