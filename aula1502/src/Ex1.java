import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n = 3;
		
		int rm[] = new int[n];
		double nota1[] = new double [n];
		double nota2[] = new double [n];
		int aprovado[] = new int [n];
		
		int aux;
		double aux2;
		
		for (int i = 0; i < n; i++) {
			aux2 = 0;
			System.out.println("RM aluno " + (i+1) + ": ");
			System.out.println("Ou digite -1 para encerrar o cadastro.");
			System.out.print("RM");
			aux = kb.nextInt();
			if(aux < 0) {
				break;
			}
			rm[i] = aux;
			System.out.print("Nota 1: ");
			nota1[i] = kb.nextDouble();
			System.out.print("Nota 2: ");
			nota2[i] = kb.nextDouble();
			
			aux2 = (nota1[i] + nota2[i]) / 2;
			if(aux2 >= 6) {
				aprovado[i] = 1;
			} else {
				aprovado[i] = 0;
			}
			System.out.println("Media: " + aux2);
			
			System.out.println("----------------------");
			
		}
		kb.close();
		
		System.out.println("Alunos aprovados:");
		
		for (int i = 0; i < n; i++) {
			if (aprovado[i] == 1) {
				System.out.println("RM"+rm[i]);
			}
		}
		
		
	}

}
