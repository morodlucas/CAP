package pilhas;

import java.util.Iterator;

public class PilhaInt {

	public final int  N = 8;

	int dados[] = new int[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public void push(int elem) {
		if(isFull())
			System.out.println("Stack overflow");
		else {
			
			dados[topo]=elem;
			topo++;
		}
	}
	
	public boolean isFull() {
		if(topo == N)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if(topo == 0)
			return true;
		else
			return false;
	}
	

	public int pop() {
		topo--;
		return dados[topo];
	}
	
	public int top() {
		return dados[topo-1];
	}
	
	public void esvaziar() {
//		for (int i = N; i < 0; i--) {
//			pop();
//		}
		
		while(!isEmpty()) {
			System.out.print(" " + pop());
		}
		System.out.println();
		
	}

	
}
