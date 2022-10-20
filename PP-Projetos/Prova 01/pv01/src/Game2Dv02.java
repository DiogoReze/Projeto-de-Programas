import java.util.Random;
import javax.swing.*;

public class Game2Dv02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		
		int n = 5, nVidas = 3, hp = 100;
		int turno = 1;
		
		String f;
		
		int[][] tela = new int[n][n];
		
		int xN, yN;
		int xE, yE;
		
		xE = gerador.nextInt(n-1);
		yE = gerador.nextInt(n-1);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				tela[i][j] = 0;
			}
		}
		tela[yE][xE] = 6;
		
		xN = gerador.nextInt(n-1);
		yN = gerador.nextInt(n-1);
		
		tela[yN][xN] = 1;
		
		while(nVidas > 0 && hp > 0){
			
			System.out.println("Player: "+nVidas+" | Enemy HP: ["+hp+"]");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(tela[i][j]+" ");
				}
				System.out.println("");				
			}
			System.out.println("___^___");
			System.out.println("___8___");
			System.out.println("<4___6>");
			System.out.println("___2___");
			System.out.println("___v___");
			
			f = JOptionPane.showInputDialog(null, "Posicao da nave: ["+yN+"]["+xN+"]\nPosicao do inimigo: ["+yE+
					"]["+xE+"]\n\nTurno "+turno+"\n\nGostaria de se mover?\n___^___\n___8___\n<4___6>\n___2___\n___v___\n"+
					"Gostaria de atirar? pressione f");
			
			if ((f.equals("f"))||(f.equals("F"))) {
				if ((Math.abs(yE-yN)==0)||(Math.abs(xE-xN)==0)) {
					hp = hp - 10;					
				}
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					tela[i][j] = 0;
				}
			}
			xE = gerador.nextInt(n-1);
			yE = gerador.nextInt(n-1);
			tela[yE][xE] = 6;
						
			if(f.equals("4")) {
				if (xN > 0) {
					xN -= 1;
				} 
			}
			if(f.equals("6")) {
				if (xN < n-1) {
					xN += 1;
				} 
			}
			if(f.equals("8")) {
				if (yN > 0) {
					yN -= 1;
				} 
			}
			if(f.equals("2")) {
				if (yN < n-1) {
					yN += 1;
				} 
			}
			tela[yN][xN] = 1;
			
			if ((xE==xN)&&(yE==yN)) {
				nVidas -= 1;
			}
			
			turno+=1;
			
		}
		
		if (nVidas == 0){
			JOptionPane.showMessageDialog(null, "Acabaram as vidas. \nVocê perdeu!");
		}
		if (hp <= 0){
			JOptionPane.showMessageDialog(null, "Nave inimiga destruida. \nVocê ganhou!");
		}
		
	}
}