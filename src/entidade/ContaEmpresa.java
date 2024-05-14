package entidade;

public class ContaEmpresa extends Conta {
	
	private Double valorDeEmprestimo;
		
	public ContaEmpresa() {
		super();
		}
	
	public ContaEmpresa(Integer conta,String nome,Double saldo,Double valorDeEmprestimo) {
		super(conta,nome,saldo);
		this.valorDeEmprestimo = valorDeEmprestimo;
	}
	
	public double getValorDeEmpresa() {
		return valorDeEmprestimo;
	}
	
	public void setValorDeEmpresa(Double valorDaEmpresa) {
		this.valorDeEmprestimo = valorDaEmpresa;
	}
	
	public void emprestimo(double quantidade) {
		if (quantidade <= valorDeEmprestimo){
		saldo += quantidade - 10.0;
		}
	}
}
