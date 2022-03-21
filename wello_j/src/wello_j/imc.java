package wello_j;
import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		float peso, altura, imc;
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual sua altura? ");
		altura = sc.nextFloat();
		System.out.print("Qual seu peso? ");
		peso = sc.nextFloat();
		imc = peso/(altura*altura);
		System.out.print("O valor do seu IMC é "+imc+".");
	}

}
