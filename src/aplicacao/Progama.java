package aplicacao;

import entidade.Conta;
import entidade.ContaEmpresa;
import entidade.ContaPoupanca;

public class Progama {

	public static void main(String[] args) {
		
		/*Conta acc = new Conta(1001, "IGOR NASCIMENTO", 0.0);
		
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
			System.out.println("EMPRESTIMO!!");
		}
		
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			acc5.atualizarSaldo();
			System.out.println("ATUALIZADO!!");
		}*/
		
		Conta acc1 = new Conta(1001,"IGOR NASIMENTO",1000.00);
		acc1.saque(200.00);
		
		System.out.println(acc1.getSaldo());
		
		Conta acc2 = new ContaPoupanca(1002, "IGOR NASCIMENTO", 1000.00, 0.01);
		acc2.saque(200.00);
		
		System.out.println(acc2.getSaldo());
		
		Conta acc3 = new ContaEmpresa(1003, "IGOR NASCIMENTO", 1000.00, 0.01);
		acc3.saque(200.00);
		
		System.out.println(acc3.getSaldo());
		
	}
}
