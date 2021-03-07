package CLASSES;

import java.util.Scanner;

public class ContaEmpresa extends Conta {
	double emprestimoEmpresa = 0;
	Scanner ler = new Scanner(System.in);

	public ContaEmpresa() {
		System.out.println("        Painel - Informe os dados da sua conta \n");
		System.out.println("    ========================================== \n");
		System.out.println("              Informe o numero da contas");
		System.out.print("                      (4 digitos):               \n");
		numero = ler.nextInt();
		System.out.println("              Informe o numero do CPF:           ");
		System.out.print("                      (8 digitos):               \n");
		cpf = ler.next();
		System.out.println("              Essa conta esta ativa?           \n");
		System.out.println("              [1]Ativa    [2]Inativa           \n");
		int a = ler.nextInt();
		System.out.println("    ========================================== \n");
		if (a == 1)
			ativa = true;
		if (a == 2)
			ativa = false;
		saldo = 0;
		OferecerEmprestimo();
	}
	
//metodo
	public void OferecerEmprestimo() {
		System.out.println("     Voc� gostaria de um empr�stimo ?          \n");
		System.out.println("                [1]Sim [2]N�o                  \n");
		System.out.println("    ========================================== \n");
		var emp = ler.next().charAt(0);
		if (emp == 1) {
			System.out.println("");
			System.out.println("Informe o valor do emprestimo: (" + (10000 - emprestimoEmpresa) + " dispon�veis)\n");
			double novoEmprestimo = ler.nextDouble();
			System.out.println("========================================================================");
			if (emprestimoEmpresa + novoEmprestimo <= 10000) {
				FazerEmprestimo(novoEmprestimo);
			} else {
				System.out.println("Valor indisponivel. Emprestimo n�o realizado.");
				System.out.println("");
				System.out.println("========================================================================");
			}
		}
	}
//metodo
	public void FazerEmprestimo(double valor) {
		emprestimoEmpresa = emprestimoEmpresa + valor;
		super.Debito(valor);
		System.out.println("++++++++++++++++++++++++++ Extrato Conta +++++++++++++++++++++");
		System.out.println("\t\tTransa��o realizada com sucesso. ");
		System.out.println("- N�mero da conta   \t\t\t   " + numero);
		System.out.println("- Saldo  Anterior   \t\t\t R$: " + valor);
		System.out.println("- Opera��o          \t\t\t Emprestimo");
		System.out.println("Emprestimo valor    \t\t\t R$: " + valor);
		System.out.println("- Saldo Atual       \t\t\t R$: " + getSaldo());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Override
	public void Credito(double valor) {
		super.Credito(valor);
		System.out.println("++++++++++++++++++++++++++ Extrato Conta +++++++++++++++++++++");
		System.out.println("\t\tTransa��o realizada com sucesso.");
		System.out.println("- N�mero da conta   \t\t\t " + numero);
		System.out.println("- Saldo  Anterior   \t\t\t R$ " + valor);
		System.out.println("- Opera��o          \t\t\t Deposito");
		System.out.println("- Saldo Atual       \t\t\t R$" + getSaldo());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Override
	public void Debito(double valor) {
		if (valor <= getSaldo()) {
			
			super.Debito(valor);
			System.out.println("++++++++++++++++++++++++++ Extrato Conta +++++++++++++++++++++");
			System.out.println("\t\tTransa��o realizada com sucesso.");
			System.out.println("- N�mero da conta   \t\t\t " + numero);
			System.out.println("- Saldo  Anterior   \t\t\t R$ " + valor);
			System.out.println("- Opera��o          \t\t\t Saque");
			System.out.println("- Saldo Atual       \t\t\t R$" + getSaldo());
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		} else {
			System.out.println("O d�bito n�o foi realizado.\n\tValor insuficiente em conta.");
			System.out.println("     ===================================================== ");
			if (emprestimoEmpresa < 10000) {
				OferecerEmprestimo();
				Debito(valor);
			}
		}
	}
}

