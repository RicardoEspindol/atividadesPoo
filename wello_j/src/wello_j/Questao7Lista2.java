package wello_j;
import java.util.Random;
public class Questao7Lista2 {

	public static void main(String[] args) {
		Random aleat = new Random();
		int[] a100 = new int[100];
		int maiorN = 0;
		int menorN = 0;
		for(int i =0; i < 100;i++) {
			a100[i] = aleat.nextInt(100);
		}
		System.out.print("EXIBINDO ARRAY GERADO \n ");
		for(int i = 0 ; i < 100;i++) {
			System.out.print(a100[i]+" ");
			if (i==50) {
				System.out.println("\n");
			}
		}
		
		System.out.println("\n");
		for(int i = 0;i<100;i++) {
			if(a100[i]<menorN ) {
				menorN = a100[i];
			}
			if(a100[i]>maiorN) {
				maiorN = a100[i];
			}
		}
		System.out.println("MAIOR NUMERO DO ARRAY = "+maiorN);
		System.out.println("MENOR NUMERO DO ARRAY = "+menorN);
		
	}

}
