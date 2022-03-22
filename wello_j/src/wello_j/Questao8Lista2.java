package wello_j;
import java.util.Random;
public class Questao8Lista2 {

	public static void main(String[] args) {
		Random aleat = new Random();
		float somaT = 0;
		float resul = 0;
		int[] a100 = new int[100];
		for(int i =0 ; i < 100 ;i++) {
			a100[i] = aleat.nextInt(50);
		}
		System.out.println("ARRAY GERADO ");
		for(int i=0;i<100;i++) {
			System.out.print(a100[i]+" ");
			if (i==24) {
				System.out.println("\n");
			}
			if (i==49) {
				System.out.println("\n");
			}
			if (i==74) {
				System.out.println("\n");
			}
		}
		for( int j = 0;j < 100;j++) {
			somaT= somaT+a100[j];
		}
		resul=somaT/100;
		System.out.println("\n\nSOMA TOTAL DOS ELEMENTOS DO ARRAY = "+somaT);
		System.out.println("MEDIA ARITMETICA = "+resul+".");
		
	}

}
