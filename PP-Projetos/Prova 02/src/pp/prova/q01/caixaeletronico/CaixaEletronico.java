package pp.prova.q01.caixaeletronico;
import pp.prova.q01.cliente.*;
import pp.prova.q01.contaCorrente.*;
import javax.swing.JOptionPane;

/*
 Esta classe (principal), tem como objetivo a criação da classe CaixaEletronico.
 Nesta classe, criamos um objeto cliente, da classe Cliente, com os seus atributos nome, rg e endereço.
 Este objeto é instanciado na classe CaixaEletronico, tendo sua classe Cliente
 */

public class CaixaEletronico {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		
		String nome = JOptionPane.showInputDialog(null, "Entre com o nome do cliente: ");
		cliente.setNome(nome);
		
		String t = JOptionPane.showInputDialog(null, "Entre com o número da conta corrente: ");
		int nc = Integer.parseInt(t);
		
		t = JOptionPane.showInputDialog(null, "Entre com o número da agência: ");
		int na = Integer.parseInt(t);
		
		t = JOptionPane.showInputDialog(null, "Entre com o rg: ");
		int rg = Integer.parseInt(t);
		cliente.setRg(rg);
		
		String endereco = JOptionPane.showInputDialog(null, "Entre com enredeço: ");
		cliente.setEndereco(endereco);
		
		ContaCorrente cc = new ContaCorrente(nc, na);
		
		String operacao = "c";
		String temp;
		float v = 0.0f;
		boolean retornoConta = cc.sacar(v);
		
		while (!(operacao.equals("p")) && (retornoConta == true)) {
			operacao = JOptionPane.showInputDialog(null,"Informe a operação: \n"
					+ "Sacar [s] \t Depositar [d] \t Extrato [e] \t Sair[p]");
			
			if ((operacao.equals("s")) || (operacao.equals("S"))) {
				temp = JOptionPane.showInputDialog(null,"Entre com o valor a ser sacado: ");
				v = Float.parseFloat(temp);
				retornoConta = cc.sacar(v);
			}
			if ((operacao.equals("d")) || (operacao.equals("D"))) {
				temp = JOptionPane.showInputDialog(null,"Entre com o valor a ser depositado: ");
				v = Float.parseFloat(temp);
				cc.depositar(v);
			}
			if ((operacao.equals("e")) || (operacao.equals("E"))) {
				temp = cc.obterExtrato();
				JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nConta corrente: "+nc
						+"\nAgência: "+na+"\nRG: "+rg+"\nEndereço: "+endereco
						+"\nTransações: "+cc.obterExtrato());				
			}
		}
		if (retornoConta == false) {
			JOptionPane.showMessageDialog(null,"Você gastou mais do que tem!");
		}
	}
}
