package atividades;

import java.util.Random;
import java.util.Scanner;

public class matriz001 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		
		int matriz[][] = new int[4][3];
		int vetor[] = new int[4],soma =0;
		int lin,col;
		
		for(col = 0;col < 4;col++){
			for(lin = 0;lin < 3;lin++){
				matriz[col][lin] = random.nextInt(10);
				System.out.printf("%3d",matriz[col][lin]);
				vetor[col] = vetor[col] + matriz[col][lin];
			}
			System.out.println(" = "+vetor[col]);
		}
		
	}

}
