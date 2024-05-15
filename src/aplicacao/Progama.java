package aplicacao;

import entidade.Conta;
import entidade.ContaEmpresa;
import entidade.ContaPoupanca;

public class Progama {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1001, "IGOR NASCIMENTO", 0.0);
		
		ContaEmpresa ace = new ContaEmpresa(1002, "Morgana Peres Nascimento", 0.0, 500.00);
		
		// upcasting
		
		Conta acc1 = ace;
		Conta acc2 = new ContaEmpresa(1003,"Fernando luiz do Nascimento",0.0,200.00);
		Conta acc3 = new ContaPoupanca(1004, "MARIELLE", 0.0, 0.01);
		
		//downcasting
		
		ContaEmpresa acc4 = (ContaEmpresa)acc2;
		acc4.emprestimo(100.00);
		
		//ContaEmpresa acc5 = (ContaEmpresa)acc3;
		if(acc3 instanceof ContaEmpresa) {
			ContaEmpresa acc5 = (ContaEmpresa)acc3;
			acc5.emprestimo(200.00);
		}
	}
}
