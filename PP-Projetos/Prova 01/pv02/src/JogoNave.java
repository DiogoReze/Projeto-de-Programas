import java.util.Random;
import javax.swing.*;

public class JogoNave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon icon01 = new ImageIcon("boom.png");
		ImageIcon icon02 = new ImageIcon("missed.png");
		ImageIcon icon03 = new ImageIcon("rocket.png");
		ImageIcon icon04 = new ImageIcon("gameover.png");
		ImageIcon icon05 = new ImageIcon("winner.png");
		ImageIcon icon06 = new ImageIcon("obg.png");
		
		
		Random gerador = new Random();
		NaveHero nave01 = new NaveHero();
		TelaJogo tela01 = new TelaJogo();
		NaveEnemy et01 = new NaveEnemy();
		
		int nMalha = 10;
		int turno = 1;
		String f = "1";
		int xE, yE;
		int hp;
		int xN, yN;
		int nContinue;
		int[][] screen = new int[nMalha][nMalha];
		int t;
		
		//mudanca de estado dos atributos da nave
		nave01.setNaveHero(nMalha);
		nContinue = nave01.getNaveHeroLife();
		xN = nave01.getNaveHero_xN();
		yN = nave01.getNaveHero_yN();
		
		//mudanca de estado dos atributos do inimigo
		et01.setHPEnemy();
		et01.setPosEnemy(nMalha);
		hp = et01.getHPEnemy();
		xE = et01.getxE();
		yE = et01.getyE();
		
		JOptionPane.showMessageDialog(null, "Nave criada com sucesso!\n"+
		"Número de vidas: "+nContinue+"\nInimigo criado com sucesso!\n"+
		"HP inicial do inimigo: "+hp+"\nPosicao da nave: ["+(yN+1)+"]["+(xN+1)+"]\n"+
		"Posicao do inimigo: ["+(yE+1)+"]["+(xE+1)+"]","Início",JOptionPane.INFORMATION_MESSAGE, icon03);
		
		//Construcao da tela no terminal
		tela01.setDimTela(nMalha);
		tela01.setTela(nMalha, screen);
		screen = tela01.updateTela(xE, yE, xN, yN, nMalha, screen);
		//tela01.hpMessage(nave01.getNaveHeroLife(), et01.getHPEnemy());
		//tela01.showTela(nMalha, screen);
		//tela01.displayComands();
		
		while ((nContinue > 0) && (hp > 0) && (!(f.equals("0")))) {
			tela01.hpMessage(nave01.getNaveHeroLife(), et01.getHPEnemy());
			screen = tela01.updateTela(xE, yE, xN, yN, nMalha, screen);
			tela01.showTela(nMalha, screen);
			tela01.displayComands();
			
			f = JOptionPane.showInputDialog(null, "Posicao da nave: ["+yN+"]["+xN+"]\nPosicao do inimigo: ["+yE+
					"]["+xE+"]\n\nTurno "+turno+"\n\nGostaria de se mover?\n___^___\n___8___\n<4___6>\n___2___\n___v___\n"+
					"Gostaria de atirar? pressione f\nPressione 0 para sair.","f");
			
			if ((f.equals("f")) || (f.equals("F"))) {
				t = hp;
				hp = et01.atingiu(xN,yN,xE,yE);
				if (hp < t) {
					JOptionPane.showMessageDialog(null, "ET hp: "+hp, "Inimigo atingido!", JOptionPane.INFORMATION_MESSAGE, icon01);
				}
				else {
					JOptionPane.showMessageDialog(null, "ET hp: "+hp, "Errou o alvo!", JOptionPane.INFORMATION_MESSAGE, icon02);
				}
				
			}
			
			if ((f.equals("4"))||(f.equals("6"))){
				nave01.movNaveX(nMalha, Integer.parseInt(f), xN);
				xN = nave01.getNaveHero_xN();
			}
			
			if ((f.equals("2"))||(f.equals("8"))){
				nave01.movNaveY(nMalha, Integer.parseInt(f), yN);
				yN = nave01.getNaveHero_yN();
			}
			
			if ((xE == xN) && (yE == yN)) {
				nave01.perdeVida();
				nContinue = nave01.getVidas();
				JOptionPane.showMessageDialog(null, "Você foi atingido!. \nPerdeu uma vida!","HITTED",JOptionPane.INFORMATION_MESSAGE, icon06);
			}
			
			et01.setPosEnemy(nMalha);
			xE = et01.getxE();
			yE = et01.getyE();

		}
		if (nContinue == 0){
			JOptionPane.showMessageDialog(null, "Acabaram as vidas. \nVocê perdeu!","GAME OVER!",JOptionPane.INFORMATION_MESSAGE, icon04);
		}
		if (hp <= 0){
			JOptionPane.showMessageDialog(null, "Nave inimiga destruida. \nVocê ganhou!", "VENCEDOR!", JOptionPane.INFORMATION_MESSAGE, icon05);
		}
		
	}

}
