package wello_j;
import java.util.Scanner;

public class Questao5Lista1 {

	public static void main(String[] args) {
		int numero;
		Scanner in= new Scanner(System.in);
		System.out.print("digite um numero = " );
		numero=in.nextInt();
		if(numero%2==0) {
			System.out.print("NUMERO "+numero+" É PAR");
	
		}else {
			System.out.print("NUMERO "+numero+" IMPAR");
			
		}
		
	}

}
