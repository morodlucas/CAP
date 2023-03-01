import java.util.Scanner;

public class ex2 {

	public static final int N = 3;

	public static void main(String[] args) {

		int rm[] = new int[N];
		int aprovados[] = new int[N];
		double nota1[] = new double[N];
		double nota2[] = new double[N];
		double media[] = new double[N];

		int n = entradaDados(rm, nota1, nota2);
		calcularMedia(n, nota1, nota2, media);
		System.out.println("\n\n Media dos alunos");
		for (int i = 0; i < n; i++) {
			System.out.println("RM: " + rm[i] + "\t media: " + media[i]);
		}
		
		int nAp = geraListaAprovados(n, media, rm, aprovados);
		System.out.println("\n\n Lista de aprovados");
		for (int i = 0; i < nAp; i++) {
			System.out.println("RM: " + aprovados[i]);
		}
	}

	public static int geraListaAprovados(int n, double media[], int rm[], int aprovados[]) {
		int nAp = 0;
		for (int i = 0; i < n; i++) {
			if(media[i] >= 6) {
				aprovados[nAp] = rm[i];
				nAp++;
			}
		}
		return nAp;
	}
	
	public static int entradaDados(int rm[], double nota1[], double nota2[]) {
		Scanner kb = new Scanner(System.in);
		int n = 0;
		System.out.print("Digite -1 para finalizar cadastro ou RM:");
		int aux = kb.nextInt();
		while (aux > 0 && n < N) {
			rm[n] = aux;
			System.out.print("\t Nota1: ");
			nota1[n] = kb.nextDouble();
			System.out.print("\t Nota2: ");
			nota2[n] = kb.nextDouble();
			n++;
			System.out.print("Digite -1 para finalizar cadastro ou RM:");
			aux = kb.nextInt();
		}
		kb.close();
		return n;
	}
	
	public static void calcularMedia(int n, double nota1[], double nota2[], double media[]) {
		
	}
	
	

}
