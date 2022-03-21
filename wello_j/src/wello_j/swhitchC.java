package wello_j;
import java.util.Scanner;

public class swhitchC {

	public static void main(String[] args) {
		String opcao;
		Scanner sc= new Scanner(System.in);
		System.out.println("DIGITE 1 CASO QUEIRA CALCULAR SEU IMC, 2 PARA CALCULAR \n SEU METABOLISMO BASAL OU 3 PARA SAIR DO PROGRAMA. ");
		opcao=sc.next();
		switch (opcao) {
		case "1": {
			String nome;
			float altura, peso, imc;
			System.out.println("HUMM, VOCÊ QUER CALCULAR SEU IMC, CERTO? VAMOS LÁ!");
			System.out.println("DIGITE SEU NOME: ");
			nome= sc.next();
			System.out.println("DIGITE SEU PESO: ");
			peso = sc.nextFloat();
			System.out.println("DIGITE SUA ALTURA: ");
			altura = sc.nextFloat();
			imc = peso/(altura*altura);
			System.out.println(nome +", DE ACORDO COM SUAS ENTRADAS NO SISTEMA SEU IMC É IGUAL A "+imc+".");
			}
		case "2":{
			System.out.println("HUMM, VOCÊ QUER CALCULAR SEU METABOLISMO BASAL, CERTO? VAMOS LÁ!");
			float peso;
			int alturaCm, idade;
			String opc;
			double mulher, homem;
			System.out.println("NOS INFORME SEU SEXO POR FAVOR!");
			System.out.println("M - MASCULINO / F - FEMININO ");
			opc= sc.next();
			System.out.println("DIGITE SEU PESO: ");
			peso = sc.nextFloat();
			System.out.println("DIGITE SUA ALTURA EM CM: ");
			alturaCm= sc.nextInt();
			System.out.println("DIGITE SUA IDADE: ");
			idade = sc.nextInt();
			if (opc =="F") {
				mulher = (665+(9.6*peso)+(1.8*alturaCm)-(4.7*idade));
				System.out.println("SEU METABOLISMO BASAL É DE "+mulher+".");
				
			}else {
				homem = (66+(13.7*peso)+(5*alturaCm)-(6.8*idade));
				System.out.println("SEU METABOLISMO BASAL É DE "+homem+".");

			}
		}
		case "3":{
			System.out.println("PROGRAMA INTERROMPIDO...");
			break;
			
		}
		default:
			System.out.println("DEFAULT!");
		}

	}

}
