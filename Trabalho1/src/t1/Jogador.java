package t1;

import java.util.Random;

public class Jogador extends Thread {

	public String nome;
	public String rps;
	private int rpsRNG;
	public int score;
	
	public void run() {
		Random r = new Random();
		rpsRNG = r.nextInt(3);
		if(rpsRNG == 0) {
			rps = "Rock";
			System.out.println(nome + " jogou pedra!");
		}	
		else if(rpsRNG == 1) {
			rps = "Paper";
			System.out.println(nome + " jogou papel!");
		} else {
			rps = "Scissors";
			System.out.println(nome + " jogou tesoura!");
		}
	}
}
