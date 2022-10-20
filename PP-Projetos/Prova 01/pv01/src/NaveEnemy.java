import java.util.Random;
import javax.swing.*;

public class NaveEnemy {
	Random gerador = new Random();
	private int hp;
	private int xE;
	private int yE;
	private int hpShooted;
	
	void setHPEnemy(){
		this.hp = 100;
	}
	
	void setPosEnemy(int n) {
		this.xE = gerador.nextInt(n-1);
		this.yE = gerador.nextInt(n-1);
	}
	
	public int atingiu(int xN, int yN, int xE, int yE) {
		if ((Math.abs(yE-yN) == 0) || (Math.abs(xE-xN) == 0)) {
			this.hp -= 10;
		}
		return this.hp;
	}
	
	public int decreaseHPEnemy() {
		this.hp -= 10;
		return this.hp;		
	}
	
	public int getHPEnemy() {
		return this.hp;
	}
	
	public int getxE() {
		return this.xE;
	}
	
	public int getyE() {
		return this.yE;
	}
}
