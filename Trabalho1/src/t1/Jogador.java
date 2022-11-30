package t1;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Jogador extends Thread {

	public String nome;
	private int rpsRNG;
	public int score;
	private int nRodadas;
	private Semaphore semaphore;
	public String[] jogadas;
	
	public Jogador(String nome, Semaphore semaphore, int nRodadas) {
		this.nome = nome;
		this.semaphore = semaphore;
		this.nRodadas = nRodadas;
	}
	
	
	public void run() {
		try {
				semaphore.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
				}

		Random r = new Random();
		jogadas = new String[nRodadas];
		
		for(int i = 0; i < nRodadas; i++) {
			rpsRNG = r.nextInt(3);
			if(rpsRNG == 0) {
				jogadas[i] = "Rock";
			}	
			else if(rpsRNG == 1) {
				jogadas[i] = "Paper";
			} else {
					jogadas[i] = "Scissors";
			}
		
		}
		semaphore.release();
	}	
}
