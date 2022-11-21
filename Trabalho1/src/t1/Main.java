package t1;

public class Main {

	public static void main(String[] args) {

		int nRodadas = 2;
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		jogador1.nome = "J1";
		jogador2.nome = "J2";
		
		jogador1.start();
		jogador2.start();
		
		while (nRodadas != 0){		
			if(jogador1.rps != null && jogador2.rps != null) {
				rpsSystem(jogador1, jogador2);
			}		
			nRodadas--;
			System.out.println(jogador1.score);
			System.out.println(jogador2.score);		
		}
		
		if(jogador1.score > jogador2.score) {
			System.out.println(jogador1.nome + " venceu o jogo!");
		}		
		else if(jogador1.score < jogador2.score) {
			System.out.println(jogador2.nome + " venceu o jogo!");
		} else {
			System.out.println("Empate!");
		}
	}
		
	private static void rpsSystem(Jogador j1, Jogador j2) {
		if(j1.rps == j2.rps) {
			System.out.println("É um empate!");
		}
		else if(j1.rps == "Rock" && j2.rps == "Scissors") {
			j1.score++;
			System.out.println(j1.nome + " venceu!");
		}		
		else if(j1.rps == "Paper" && j2.rps == "Rock") {
			j1.score++;
			System.out.println(j1.nome + " venceu!");
		}	
		else if(j1.rps == "Scissors" && j2.rps == "Paper") {
			j1.score++;
			System.out.println(j1.nome + " venceu!");
		}		
		else if(j1.rps == "Rock" && j2.rps == "Paper") {
			j2.score++;
			System.out.println(j2.nome + " venceu!");
		}
		else if(j1.rps == "Paper" && j2.rps == "Scissors") {
			j2.score++;
			System.out.println(j2.nome + " venceu!");
		}
		else if(j1.rps == "Scissors" && j2.rps == "Rock") {
			j2.score++;
			System.out.println(j2.nome + " venceu!");
		} else {
			System.out.println("Erro");
		}
	}
}
