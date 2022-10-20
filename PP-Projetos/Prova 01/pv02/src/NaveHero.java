import java.util.Random;
import javax.swing.*;

public class NaveHero {
	Random gerador = new Random();
	private int nVidas;
	private int xN;
	private int yN;
	
	void setNaveHero(int n){
		this.nVidas = 3;
		this.xN = gerador.nextInt(n-1);
		this.yN = gerador.nextInt(n-1);
	}
	
	public int updateLives() {
		if (this.nVidas > 0) {
			this.nVidas -= 1;
		}
		return this.nVidas;
	}
	
	void movNaveX(int n, int f, int x) {
		this.xN = x;
		if(f == 4) {
			if (x > 0) {
				this.xN -= 1;
			} 
		}
		if(f == 6) {
			if (x < n-1) {
				this.xN += 1;
			} 
		}
		//this.xN = x;
		//return this.xN;
	}
	
	void movNaveY(int n, int f, int y) {
		this.yN = y;
		if(f == 8) {
			if (y > 0) {
				this.yN -= 1;
			} 
		}
		if(f == 2) {
			if (y < n-1) {
				this.yN += 1;
			} 
		}
		//this.yN = y;
		//return this.yN;
	}
	
	void perdeVida() {
		this.nVidas -= 1;
	}
	
	public int getNaveHeroLife() {
		return this.nVidas;
	}
	public int getNaveHero_xN() {
		return this.xN;
	}
	public int getNaveHero_yN() {
		return this.yN;
	}	
	public int getVidas() {
		return this.nVidas;
	}
	
}
