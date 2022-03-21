package wello_j;
import java.util.Scanner;

public class numbersprint {

	public static void main(String[] args) {
		long longo;
		int inteiro;
		float nfloat;
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE O NUMERO INTEIRO:");
		inteiro = sc.nextInt();
		System.out.println("DIGITE O NUMERO TIPO LONG:");
		longo = sc.nextLong();
		System.out.println("DIGITE O NUMERO FLOAT:");
		nfloat = sc.nextFloat();
		System.out.print("O numero inteiro digitado foi "+inteiro
		+", o número long digitado foi "+longo+" e o numero float foi "+nfloat+".");
	}

}
