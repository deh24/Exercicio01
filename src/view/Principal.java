package view;

import java.util.Random;

import Controller.ThreadV;

public class Principal {

	public static void main(String[] args) {
		Random random = new Random();
		int v;
		int vetor[]= new int [1000];
		for (int i = 0; i< vetor.length; i++){
			vetor[i]=random.nextInt(101);
			
		}
		for(v =1; v < 3; v++ ){
			 Thread threadV = new ThreadV(v, vetor);
			 threadV.start();
		}

	}

}
