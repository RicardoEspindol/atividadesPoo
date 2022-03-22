package wello_j;
import java.util.Random;
public class TestesAula2 {

	public static void main(String[] args) {
		Random aleat = new Random();
		int numD = 0;
		float amor =0;
		int[] a100 = new int[100];
		for(int i = 0; i < 100;i++) {
			a100[i]= aleat.nextInt(50);
		}
		System.out.println("ARRAY GERADO\n");
		for(int i =0; i <100;i++) {
			System.out.print(a100[i]+" ");
			if (i==24) {
				System.out.print("\n");
			}
			if (i==49) {
				System.out.print("\n");
			}
			if (i==74) {
				System.out.print("\n");
			}
		}
		int contador=0;

		for(int i =0; i < a100.length-1;i++) {
			contador = 0;
			for(int j = a100[i]; j>=1;j--) {
				if(a100[i]%j==0) {
					contador++;
					if(contador==2) {
						System.out.println("PrimO");
					}
					if(contador==2) {
						System.out.println("NAO PRIMO");
				}
				
				}
			}
			
			
		}
		
	}

}
