package t1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {

		int nRodadas = 1;
		Scanner sc = new Scanner(System.in);
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
		
		GameManager gameManager = new GameManager(jogador1, jogador2);
	
		jogador1.start();
		jogador2.start();
		
		while(jogador1.isAlive() || jogador2.isAlive()) {
				
		}
		
		System.out.println("-------- INICIO DE JOGO --------");
		while(nRodadas != 0) {
			gameManager.rpsSystem(rodadaAtual);
			nRodadas--;
			rodadaAtual++;
		}
		
		if(nRodadas == 0) {
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
