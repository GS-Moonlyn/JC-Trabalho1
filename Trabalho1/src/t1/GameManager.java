package t1;

public class GameManager {
	
	private Jogador j1;
	private Jogador j2;

	public GameManager(Jogador j1, Jogador j2) {
		this.j1 = j1;
		this.j2 = j2;
	}
	
	public void rpsSystem(int i) {
		
		System.out.println("Rodada " + (i + 1) + ":");
		
		if(j1.jogadas[i] == j2.jogadas[i]) {
			
			if(j1.jogadas[i] == "Rock") {System.out.println(j1.nome + " jogou pedra!");
										System.out.println(j2.nome + " jogou pedra!");}
			else if(j1.jogadas[i] == "Paper") {System.out.println(j1.nome + " jogou papel!");
											  System.out.println(j2.nome + " jogou papel!");}
			else {System.out.println(j1.nome + " jogou tesoura!");
				  System.out.println(j2.nome + " jogou tesoura!");}
			
			System.out.println("É um empate!");
		}
		else if(j1.jogadas[i] == "Rock" && j2.jogadas[i] == "Scissors") {
			j1.score++;
			System.out.println(j1.nome + " jogou pedra!");
			System.out.println(j2.nome + " jogou tesoura!");
			System.out.println(j1.nome + " venceu!");
		}		
		else if(j1.jogadas[i] == "Paper" && j2.jogadas[i] == "Rock") {
			j1.score++;
			System.out.println(j1.nome + " jogou papel!");
			System.out.println(j2.nome + " jogou pedra!");
			System.out.println(j1.nome + " venceu!");
		}	
		else if(j1.jogadas[i] == "Scissors" && j2.jogadas[i] == "Paper") {
			j1.score++;
			System.out.println(j1.nome + " jogou tesoura!");
			System.out.println(j2.nome + " jogou papel!");
			System.out.println(j1.nome + " venceu!");
		}		
		else if(j1.jogadas[i] == "Rock" && j2.jogadas[i] == "Paper") {
			j2.score++;
			System.out.println(j1.nome + " jogou pedra!");
			System.out.println(j2.nome + " jogou papel!");
			System.out.println(j2.nome + " venceu!");
		}
		else if(j1.jogadas[i] == "Paper" && j2.jogadas[i] == "Scissors") {
			j2.score++;
			System.out.println(j1.nome + " jogou papel!");
			System.out.println(j2.nome + " jogou tesoura!");
			System.out.println(j2.nome + " venceu!");
		}
		else if(j1.jogadas[i] == "Scissors" && j2.jogadas[i] == "Rock") {
			j2.score++;
			System.out.println(j1.nome + " jogou tesoura!");
			System.out.println(j2.nome + " jogou pedra!");
			System.out.println(j2.nome + " venceu!");
		} else {
			System.out.println("Erro");
		}
	}
}
