package pp.prova03.principal;
import pp.prova03.personagens.*;
import pp.prova03.personagens.Personagem;
import pp.prova03.personagens.Mago;
import pp.prova03.jogo.*;

public class Principal {
	public static void main (String[] args) {
		Personagem[] personagem = new Personagem[6];
		
		personagem[0] = new Cavaleiro("El_Cid");
		personagem[1] = new Cavaleiro("Joana_D'Arc");
		personagem[2] = new Mago("Shazam");
		personagem[3] = new Mago("Gandalf");
		personagem[4] = new Dragao("Smaug");
		personagem[5] = new Dragao("Porunga");
		
		//Jogo j = new Jogo();
		for (int i = 0; i < personagem.length; i++) {
			//j.ControlarAcoesDosPersonagens(personagem[i]);
			Jogo.ControlarAcoesDosPersonagens(personagem[i]);
		}
		
		Personagem p = new Mago("Merlin");
		((Mago) p).invisibilidade();
	}
}
