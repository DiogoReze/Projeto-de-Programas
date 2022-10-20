import java.util.Random;
import javax.swing.*;

public class GameTextv00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		NaveHero nave01 = new NaveHero();
		TelaJogo tela01 = new TelaJogo();
		NaveEnemy et01 = new NaveEnemy();
		
		int nMalha = 4;
		int turno = 1;
		String f;
		int xE, yE;
		int hp;
		int xN, yN;
		int nContinue;
		int[][] screen = new int[nMalha][nMalha];
		
		//mudanca de estado dos atributos da nave
		nave01.setNaveHero(nMalha);
		nContinue = nave01.getNaveHeroLife();
		xN = nave01.getNaveHero_xN();
		yN = nave01.getNaveHero_yN();
		JOptionPane.showMessageDialog(null, nContinue+"\n"+xN+"\n"+yN);
		
		//mudanca de estado dos atributos do inimigo
		et01.setHPEnemy();
		et01.setPosEnemy(nMalha);
		hp = et01.getHPEnemy();
		xE = et01.getxE();
		yE = et01.getyE();
		JOptionPane.showMessageDialog(null, hp+"\n"+xE+"\n"+yE);
		
		//tela do jogo
		tela01.setDimTela(nMalha);
		tela01.setTela(nMalha, screen);
		screen = tela01.updateTela(xE, yE, xN, yN, nMalha, screen);
		tela01.hpMessage(nave01.getNaveHeroLife(), et01.getHPEnemy());
		tela01.showTela(nMalha, screen);
		tela01.displayComands();		
		
		//nave01.setNaveHero(n);
		//JOptionPane.showMessageDialog(null,"Vidas: "+nave01.getNaveHeroLife()+
		//		"\n\n[xN][yN]: ["+nave01.getNaveHero_xN()+"]["+nave01.getNaveHero_yN()+"]");
		
		/*for(int i = 1; i < 4; i++) {
			JOptionPane.showMessageDialog(null,"Vidas: "+nave01.getNaveHeroLife()+
					"\n\n[xN][yN]: ["+nave01.getNaveHero_xN()+"]["+nave01.getNaveHero_yN()+"]");
			System.out.println(nave01.updateLives());
		}*/
		/*int f = 1;
		int xN, yN;
		String f1;*/
		
		/*while(f != 0) {
			xN = nave01.getNaveHero_xN();
			yN = nave01.getNaveHero_yN();
			
			JOptionPane.showMessageDialog(null, "Novo x:"+nave01.movNaveX(n, f, xN)+
					"\nNovo y:"+nave01.movNaveY(n, f, yN));
			JOptionPane.showMessageDialog(null, "["+nave01.getNaveHero_xN()+"]["+nave01.getNaveHero_yN()+"]");
			f1 = JOptionPane.showInputDialog(null,"entre com o numero do movimento");
			f = Integer.parseInt(f1);		
		}*/
		
		/*int hpE, xE, yE;
		NaveEnemy et01 = new NaveEnemy();
		*/
		/*et01.setHPEnemy();
		et01.setPosEnemy(n);
		xE = et01.getxE();
		yE = et01.getyE();
		hpE = et01.getHPEnemy();
		
		for (int t = 1; t <= 10; t++) {
			et01.setPosEnemy(n);
			xE = et01.getxE();
			yE = et01.getyE();
			hpE = et01.decreaseHPEnemy();
			JOptionPane.showMessageDialog(null, "HP: "+hpE+"\nxE: "+xE+"\nyE: "+yE);
		}*/
		/*TelaJogo tela01 = new TelaJogo();
		JOptionPane.showMessageDialog(null, tela01.displayComands());
		JOptionPane.showMessageDialog(null, tela01.winMessage());
		JOptionPane.showMessageDialog(null, tela01.gameOver());
		*/
	}

}
