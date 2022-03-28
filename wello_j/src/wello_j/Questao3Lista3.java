package wello_j;

public class Questao3Lista3 {

	public static void main(String[] args) {
		int [][] MatrizA = {
				{3,4,5},
				{5,6,1}};
		int[][] MatrizB = {
				{10,1},
				{3,5},
				{0,21}};
		int linA = MatrizA.length;
		int colA = MatrizA[0].length;
		int linB = MatrizB.length;
		int colB = MatrizB[0].length;
		int [][] MatrizC = new int[colA-1][linB-1];
		if(MatrizA[0].length == MatrizB.length) {
			for(int i = 0; i < linA ; i++) {
				for(int j = 0; j < colB ; j++) {
					for(int k = 0; k < colA ; k++) {
						MatrizC[i][j] += MatrizA[i][k] * MatrizB[k][j];
					}
				}
			}
			System.out.println("MATRIZES COM NUMERO IGUAL DE COLUNAS DA PRIMEIRA AO NUMERO DE LINHAS DA SEGUNDA");
			System.out.println("MULTIPLICANDO A MATRIZ 'A' PELA MATRIZ 'B' OBTEMOS:");
			for(int m = 0; m < MatrizC.length; m++) {
				for(int n = 0;n < MatrizC[0].length;n++) {
					System.out.print(MatrizC[m][n]+ " ");
				}System.out.println();
			}
		}else {
			System.out.println(" ERRO! PARA SER REALIZADO A OPERAÇÃO DE MULTIPLICAÇÃO ENTRE DUAS MATRIZES É NECESSÁRIO \n"
					+ " QUE O NUMERO DE COLUNAS DA PRIMEIRA SEJA IGUAL AO NUMERO DE LINHAS DA SEGUNDA ");
		}
		
	}

}
