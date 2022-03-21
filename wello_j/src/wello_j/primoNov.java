package wello_j;

import java.util.Random;

public class primoNov {

	public static void main(String[] args) {
		Random aleat = new Random();
		int[] a100 = new int[100];
		for(int i = 0; i < 100;i++) {
			a100[i]= aleat.nextInt(100);
		}
        for (int i = 0; i < a100.length; i++) {
            if( ehPrimo(a100[i]) )
                System.out.println(a100[i] + " é primo. Posição no vetor: " + i);
        }    
    }
     
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;

	}

}
