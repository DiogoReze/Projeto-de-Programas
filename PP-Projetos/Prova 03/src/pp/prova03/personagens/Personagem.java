package pp.prova03.personagens;
import pp.prova03.comportamento.ComportamentoNormal;

public abstract class Personagem implements ComportamentoNormal{
	private String nome;
	
	public Personagem(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Personagem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void guardarItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void usarItem() {
		// TODO Auto-generated method stub
		
	}

}
