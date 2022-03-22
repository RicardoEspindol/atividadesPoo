package wello_j;

import java.util.Random;

public class Questao6Lista2 {

	public static void main(String[] args) {
		Random aleat = new Random();
		int[] a100 = new int[100];
		for(int i = 0; i < 100;i++) {
			a100[i] = aleat.nextInt(100);
		}
		System.out.println("IMPRIMINDO O ARRAY GERADO\n");
		for(int j = 0; j < a100.length;j++) {
			
				System.out.print(a100[j]+" ");
		}
		System.out.println("\n");
		System.out.println("IMPRIMINDO SOMENTE OS NUMEROS PARES\n");
		for(int j = 0; j < a100.length;j++) {
			if(a100[j]%2==0) {
				System.out.print(a100[j]+" ");
				
			}
		}
		
	}
}


