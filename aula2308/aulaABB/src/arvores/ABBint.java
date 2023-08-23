package arvores;

public class ABBint {

	private class Arvore{
		int dado;
		Arvore esq, dir;
	}
	
	public Arvore root = null;
	
	public Arvore inserir(Arvore p, int info) {
		if(p == null) {
			p = new Arvore();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		}
		else if(info < p.dado) {
			p.esq = inserir (p.esq, info);
		} else
			p.dir = inserir(p.dir, info);
		return p;
	}
	
	public void listaEmOrdem(Arvore p ) {
		if(p!=null) {
			listaEmOrdem(p.esq);
			System.out.println(" " + p.dado);
			listaEmOrdem(p.dir);
		}
	}
	
}
