package entidade;

public class ContaPoupanca extends Conta {
	
	private Double taxaDeJuros;
	
	public ContaPoupanca() {
		super();
	}
	public ContaPoupanca(Integer conta, String nome, double saldo,double taxaDeJuros) {
		super(conta,nome,saldo);
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}
	
	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuros;
	}
	
	@Override
	public void saque(double quantia) {
		saldo -= quantia;
	}
}
