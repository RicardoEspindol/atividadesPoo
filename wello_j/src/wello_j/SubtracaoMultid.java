package wello_j;

import java.util.Random;

public class SubtracaoMultid {

	public static void main(String[] args) {
		Random aleat = new Random();
		int [][] meuArray = new int [5][5];
		for( int i = 0;i < meuArray.length; i++) {
			for(int j = 0; j < meuArray[0].length; j++) {
				meuArray[i][j]= aleat.nextInt(50);
			}
		}
		int [][] meuArray2 = new int [5][5];
		for( int i = 0;i < meuArray2.length; i++) {
			for(int j = 0; j < meuArray2[0].length; j++) {
				meuArray2[i][j]= aleat.nextInt(50);
			}
	}
		int [][] resultado = new int[5][5];
		for( int i = 0;i < meuArray2.length; i++) {
			for(int j = 0; j < meuArray2[0].length; j++) {
				resultado[i][j] = meuArray[i][j] - meuArray2[i][j] ;
				System.out.print(resultado[i][j]+ " ");
				
			}
			System.out.println();
		
		}
    }
}

