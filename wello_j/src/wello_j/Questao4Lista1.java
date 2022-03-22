package wello_j;
import java.util.Scanner;

public class Questao4Lista1 {
	
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE O PRIMEIRO NUMERO:");
		num1 = sc.nextInt();
		System.out.println("DIGITE O SEGUNDO NUMERO:");
		num2 = sc.nextInt();
		if(num1>num2) {
			System.out.print("O PRIMEIRO NUMERO É MAIOR QUE O SEGUNDO");
		}else {
			System.out.print("O SEGUNDO NUMERO É MAIOR QUE O PRIMEIRO");
		}
		
	}

}
