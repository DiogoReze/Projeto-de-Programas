package pp.prova03.personagens;
import javax.swing.JOptionPane;
import pp.prova03.comportamento.*;

public class Mago extends Personagem implements ComportamentoMagico {
	String nome;
	public Mago (String nome) {
		super(nome);
		this.nome = nome;
	}
	
	public void andar() {
		JOptionPane.showMessageDialog(null, "O mago "+this.nome+" está andando!");
	}
	
	public void guardarItem() {
		JOptionPane.showMessageDialog(null, "O mago "+this.nome+" guardou o ítem!");
	}
	
	public void usarItem() {
		JOptionPane.showMessageDialog(null, "O mago "+this.nome+" usou o ítem!");
	}	

	@Override
	public void invisibilidade() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "O mago "+this.nome+" ficou invisível!");
		
	}

	@Override
	public void ultraRapidez() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "O mago "+this.nome+" ativou a ultra-velocidade!");
	}

}
