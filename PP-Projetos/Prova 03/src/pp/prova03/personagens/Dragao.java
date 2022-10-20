package pp.prova03.personagens;
import javax.swing.JOptionPane;
import pp.prova03.comportamento.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz {
	String nome;
	
	public Dragao (String nome) {
		super(nome);
		this.nome = nome;
	}
	
	public void andar() {
		JOptionPane.showMessageDialog(null, "O dragão "+this.nome+" está andando!");
	}
	
	public void guardarItem() {
		JOptionPane.showMessageDialog(null, "O dragão "+this.nome+" guardou o ítem!");
	}
	
	public void usarItem() {
		JOptionPane.showMessageDialog(null, "O dragão "+this.nome+" usou o ítem!");
	}	
	
	@Override
	public void atirarFogo() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "O dragão "+this.nome+" atirou fogo!");
	}

	@Override
	public void voar() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "O dragão "+this.nome+" está voando!");
	}

	@Override
	public void morder() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "O dragão "+this.nome+" deu uma mordida!");
	}

}
