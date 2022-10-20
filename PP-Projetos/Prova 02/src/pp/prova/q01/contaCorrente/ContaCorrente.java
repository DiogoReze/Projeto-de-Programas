package pp.prova.q01.contaCorrente;
import pp.prova.q01.transacao.*;

import java.util.ArrayList;

public class ContaCorrente {
	private float saldo;
	private int numeroConta;
	private int numeroAgencia;	
	private ArrayList<Transacao> transacoes;
	
	public ContaCorrente(int numeroConta, int numeroAgencia) {
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = 0.0f;
		this.transacoes = new ArrayList<Transacao>();
	}
	
	public void registrarTransacao(Transacao transacao) {
		this.transacoes.add(transacao); 
	}
	
	public void depositar(float v) {
		this.saldo += v;	
		Transacao t = new Transacao(this.saldo,"Depósito: ",v);
		registrarTransacao(t);		
	}
	
	public boolean sacar(float v) {
		if (this.saldo - v >= 0.0f ) {
			this.saldo -= v;
			Transacao t;
			if (this.saldo > 0) {
				t = new Transacao(this.saldo,"Saque: ",v);
			} else {
				t = new Transacao(this.saldo,"Conta vazia: ",v);
			}
			registrarTransacao(t);			
			return true;
		} else {
			return false;
		}		
	}
	
	public String obterExtrato() {
		String t = "Extrato de transações: \n";
		for (int i = 0; i < this.transacoes.size(); i++) {
			t += this.transacoes.get(i).getOperacao()+": R$"+
					this.transacoes.get(i).getValor()+" --- "+
					" Data/Hora: "+this.transacoes.get(i).getDataHora()+" --- "+
					"Saldo: "+this.transacoes.get(i).getSaldo()+"\n";
		}	
		return t;
	}
	
	public float getSaldo(){
		return this.saldo;
	}
	
	public int getNumeroConta(){
		return this.numeroConta;
	}
	
	public int getNumeroAgencia(){
		return this.numeroAgencia;
	}
}
