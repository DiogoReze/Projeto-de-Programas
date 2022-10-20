package pp.prova03.personagens;
import pp.prova03.comportamento.*;
import javax.swing.JOptionPane;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {
	
	String nome;
	public Cavaleiro (String nome) {
		super(nome);
		this.nome = nome;
	}
	
	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "O cavaleiro "+this.nome+" Atacou!");
	}

	@Override
	public void defender() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "O cavaleiro "+this.nome+" defendeu-se!");
	}

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "O cavaleiro "+this.nome+" saltou!");
	}
	
	public void andar() {
		JOptionPane.showMessageDialog(null, "O cavaleiro "+this.nome+" está andando!");
	}
	
	public void guardarItem() {
		JOptionPane.showMessageDialog(null, "O cavaleiro "+this.nome+" está guardando ítem!");
	}
	
	public void usarItem() {
		JOptionPane.showMessageDialog(null, "O cavaleiro "+this.nome+" usou ítem!");
	}
}
