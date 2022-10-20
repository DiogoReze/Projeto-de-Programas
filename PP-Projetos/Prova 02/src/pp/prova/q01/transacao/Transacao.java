package pp.prova.q01.transacao;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
	private String operacao;
	private float valor;
	private float saldo;	
	String dataHora;
	
	public Transacao(float saldo, String operacao, float valor) {
		this.operacao = operacao;
		this.saldo = saldo;
		this.valor = valor;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
		this.dataHora = dtf.format(LocalDateTime.now());
	}
	
	public String getOperacao() {
		return this.operacao;
	}
	
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return this.valor;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setDataHora() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
		this.dataHora = dtf.format(LocalDateTime.now());
	}
	
	public String getDataHora() {
		return this.dataHora;
	}
	
}

