import java.util.Random;
import javax.swing.*;

public class TelaJogo {
	int n;
	//int[][] tela = new int[n][n];
	
	void setDimTela(int n) {
		this.n = n;
	}
	void setTela(int n, int[][] tela) {
		//JOptionPane.showMessageDialog(null, "Tamanho da tela: "+tela.length);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				tela[i][j] = 0;
			}
		}
	}
	
	public int[][] updateTela(int xE, int yE, int xN, int yN, int n, int[][] tela) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				//System.out.println("["+i+"]["+j+"]");
				tela[i][j] = 0;
			}
		}
		tela[yE][xE] = 7;
		tela[yN][xN] = 1;
		return tela;
	}
	
	void showTela(int n, int[][] tela) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(tela[i][j]+"  ");
			}
			System.out.println("  ");
		}
	}
	
	void displayComands() {
		String textCom;
		textCom = "Comandos:\n___^___\n"+
		"___8___\n"+
		"<4___6>\n"+
		"___2___\n"+
		"___v___\n";
		System.out.println(textCom);
	}
	
	void gameOver() {
		String GameOvermessage;
		GameOvermessage = "Suas vidas terminaram. Você perdeu!";
		JOptionPane.showMessageDialog(null, GameOvermessage);
	}
	
	void winMessage(){
		String winText;
		winText = "Você venceu! Inimigo sem hp.";
		JOptionPane.showMessageDialog(null, winText);
	}
	
	void hpMessage(int nVidas, int hp) {
		System.out.println("Player: "+nVidas+" | Enemy HP: ["+hp+"]");
	}
}
