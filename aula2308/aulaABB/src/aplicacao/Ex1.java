package aplicacao;

import arvores.ABBint;

public class Ex1 {

	public static void main(String[] args) {
		
		ABBint abb = new ABBint();
		
		abb.root = abb.inserir(abb.root, 6);
		abb.root = abb.inserir(abb.root, 10);
		abb.root = abb.inserir(abb.root, 7);
		abb.root = abb.inserir(abb.root, 4);
		
		System.out.println("Elementos da ABB");
		abb.listaEmOrdem(abb.root);

	}

}
