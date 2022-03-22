package wello_j;
import java.util.Scanner;
public class Questao2Lista2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int escolha, soma1;
		float somaT;
		int[] ab = new int[10];
		System.out.println("DIGITE UM NUMERO INTEIRO: ");
		escolha = sc.nextInt();
		soma1 = escolha;
		ab[0] = escolha;
		somaT=0;
		for(int i =1 ;i <10 ;i++) {
			ab[i] = soma1+1;
			soma1 = soma1+1;
		}
		for(int i =0 ;i <10 ;i++ ) {
			System.out.print(ab[i]+" ");
			somaT = somaT+ab[i];
	}
		System.out.println("\nSOMA TOTAL "+somaT);
		System.out.println("MEDIA ARITMETICA "+somaT/10);
		System.out.println("IMPRIMINDO NUMEROS EM SEQUENCIA DECRESCENTE ");
		for(int i = ab.length-1;i>=0;i--) {
			System.out.print(ab[i]+" ");
		}
	}
}
