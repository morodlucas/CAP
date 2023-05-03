package listas;

public class ListaIntCrescente {

	private class Node{
		int dado;
		Node prox;
	}
	
	private Node lista = null;
	
	public void insere(int elem) {
		
		Node novo = new Node();
		novo.dado = elem;
		if(lista==null) {
			novo.prox = null;
		}
		else {
			if(novo.dado < lista.dado) {
				novo.prox = lista;
				lista = novo;
			}
			else {
				Node aux = lista;
				boolean achou = false;
				while(aux.prox != null && !achou) {
					if(aux.prox.dado < novo.dado) {
						aux = aux.prox;
					}
					else {
						achou = true;
					}
				}
			}
		}
		
	}
	
	public void apresenta() {
		Node aux = lista;
		System.out.println("\n *** Lista ***");
		while(aux!=null) {
			
			System.out.println("\t"+aux.dado);
			aux = aux.prox;
		}
	}
	
}
