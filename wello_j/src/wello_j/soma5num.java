package wello_j;
import java.util.Scanner;

public class soma5num {

	public static void main(String[] args) {
		int num1,num2,num3,num4,num5;
		float soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("MÉDIA ARITMETICA DE 5 NUMEROS");
		System.out.println("DIGITE O PRIMEIRO NUMERO: ");
		num1=sc.nextInt();
		System.out.println("DIGITE O SEGUNDO NUMERO: ");
		num2=sc.nextInt();
		System.out.println("DIGITE O TERCEIRO NUMERO: ");
		num3=sc.nextInt();
		System.out.println("DIGITE O QUARTO NUMERO: ");
		num4=sc.nextInt();
		System.out.println("DIGITE O QUINTO NUMERO: ");
		num5=sc.nextInt();
		soma = (num1+num2+num3+num4+num5)/5;
		System.out.println("a media aritmétmeticas dos numeros fornecidos por vc é "+soma+".");
	}

}
