package wello_j;
import java.util.Scanner;

public class Questao3Lista1 {

	public static void main(String[] args) {
		float baseM,baseMn,altura,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULO DA AREA DO TRAP�ZIO...");
		System.out.println("DIGITE A BASE MAIOR: ");
		baseM = sc.nextFloat();
		System.out.println("DIGITE A BASE MENOR: ");
		baseMn = sc.nextFloat();
		System.out.println("DIGITE A ALTURA DO TRAP�ZIO");
		altura = sc.nextFloat();
		area = ((baseM + baseMn)*altura)/2;
		System.out.print("A area do trap�zio em cm� � "+area);

	}

}
