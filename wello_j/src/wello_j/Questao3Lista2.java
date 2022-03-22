package wello_j;
import java.util.Random;
public class Questao3Lista2 {

	public static void main(String[] args) {
		Random aleat = new Random();
		int[] array100= new int [100];
		for(int i = 0;  i<100;i++) {
			array100[i]=aleat.nextInt(100);
			
		}
		System.out.println("NÚMEROS DO ARRAY IMPRIMIDOS DO INDICE 0 ATÉ O INDICE 100\n\n");
		for(int i=0;i<100;i++) {
			System.out.print(array100[i]+" ");
			if (i==50) {
				System.out.println("\n");
			}
		}
		System.out.println("\n\nNÚMEROS DO ARRAY IMPRIMIDOS DO INDICE 100 ATÉ O INDICE 0\n\n");
		for(int i=array100.length-1;i>=0;i--) {
			System.out.print(array100[i]+" ");
			if (i==50) {
				System.out.println("\n");
			}
		}
	}
	

}
