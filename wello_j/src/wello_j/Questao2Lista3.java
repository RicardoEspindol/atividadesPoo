package wello_j;

public class Questao2Lista3 {

	public static void main(String[] args) {
		int[][] MatrizA = {
				{3,4,5},
				{5,6,1},
				{7,8,2}};
		int [][] MatrizB = {
				{10,1,2},
				{3,5,0},
				{0,21,15}};
		if(MatrizA.length == MatrizB.length && MatrizA[0].length == MatrizB[0].length) {
			System.out.println(" MATRIZES IGUAIS! \nEXIBINDO RESULTADO DA SUBTRAÇÃO...");
			int[][] resultado = new int[MatrizA.length][MatrizA[0].length];
			for(int i = 0; i < MatrizA.length;i++) {
				for(int j=0;j< MatrizA[0].length;j++) {
					resultado[i][j]= MatrizA[i][j]-MatrizB[i][j];
					System.out.print(resultado[i][j] + " ");
					
				}
				System.out.println();
			}
		}else {
			System.out.println(" ERRO! PARA SER REALIZADA A SOMA ENTRE MATRIZES É \n NECESSÁRIO QUE "+
		"ESTAS SEJAM DE MESMO TAMANHO M x N \n ");
		}
	}

}
