package t1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {

		int nRodadas = 1;
		Scanner sc = new Scanner(System.in);
		Thread[] threads = new Thread[3];
		System.out.println("Insira o numero de Rodadas:");
			try {
				nRodadas = sc.nextInt();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Input invalido. Jogando apenas 1 rodada...");
			}
		
		int rodadaAtual = 0;
		
		Semaphore semaphore = new Semaphore(1);
		
		Jogador jogador1 = new Jogador("Jogador 1", semaphore, nRodadas);
		Jogador jogador2 = new Jogador("Jogador 2", semaphore, nRodadas);
		
		GameManager gameManager = new GameManager(jogador1, jogador2, nRodadas);
		
		threads[0] = jogador1;
		threads[1] = jogador2;
		threads[2] = gameManager;
		
		System.out.println("-------- INICIO DE JOGO --------");
		
		for(int i = 0; i < threads.length; i++) {
			threads[i].start();	
			try {
				threads[i].join();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
		
		if(!gameManager.isAlive()) {
			System.out.println("-------- FIM DE JOGO --------");
			System.out.println("Placar Final: ");
			System.out.println(jogador1.nome + ":" + " " + jogador1.score);
			System.out.println(jogador2.nome + ":" + " " + jogador2.score);
			if(jogador1.score > jogador2.score) {
				System.out.println(jogador1.nome + " venceu o jogo!");
			}		
			else if(jogador1.score < jogador2.score) {
				System.out.println(jogador2.nome + " venceu o jogo!");
			} else {
				System.out.println("Empate!");
				}
		}
	}
}
