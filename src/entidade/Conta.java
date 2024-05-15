package entidade;

public class Conta {
	private Integer conta;
	private String nome;
	protected Double saldo;
	
	public Conta(){
		}
	
	public Conta(Integer conta, String nome,Double saldo) {
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void retirar(double quantia) {
		saldo-=quantia;
	}
	
	public void colocar(double quantia) {
		saldo+=quantia;
	}
}
