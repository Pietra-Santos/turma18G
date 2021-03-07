package CLASSES;

import java.util.Scanner;

public class ContaEstudantil extends Conta {

	private double emprestimoEstudantil = 0;
	Scanner ler = new Scanner(System.in);

	public ContaEstudantil() {
		System.out.println("        Painel - Informe os dados da sua conta \n");
		System.out.println("    ========================================== \n");
		System.out.println("              Digite o numero da sua conta:    \n");
		numero = ler.nextInt();
		System.out.println("              Digite o seu CPF:                \n");
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

		solicitarEmprestimo();
	}

	private void solicitarEmprestimo() {
		System.out.println("     Você gostaria de um empréstimo ?          \n");
		System.out.println("                [1]Sim [2]Não                  \n");
		System.out.println("    ========================================== \n");
		var emp = ler.next().charAt(0);
		if (emp == 1){
			System.out.println("");
			System.out.println("Informe o valor do emprestimo: (" + (5000 - emprestimoEstudantil) + " disponíveis)");
		}
		
		double novoEmprestimo = ler.nextDouble();
		
		System.out.println("========================================================================");
		if (emprestimoEstudantil + novoEmprestimo <= 5000) {
			fazerEmprestimo(novoEmprestimo);
		} else {
			System.out.println("Valor indisponivel. Emprestimo não realizado.");
			System.out.println("");
			System.out.println("========================================================================");
		}
	}

	public void fazerEmprestimo(double valor) {
		emprestimoEstudantil = emprestimoEstudantil + valor;
		saldo = saldo + valor;
		System.out.println("++++++++++++++++++++++++++ Extrato Conta +++++++++++++++++++++");
		System.out.println("\t\tTransação realizada com sucesso. ");
		System.out.println("- Número da conta   \t\t\t   " + numero);
		System.out.println("- Saldo  Anterior   \t\t\t R$: " + valor);
		System.out.println("- Operação          \t\t\t Emprestimo");
		System.out.println("Emprestimo valor    \t\t\t R$: " + valor);
		System.out.println("- Saldo Atual       \t\t\t R$: " + saldo);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");		
		
	}

	@Override
	public void Credito(double valor) {
		saldo = saldo + valor;
		System.out.println("++++++++++++++++++++++++++ Extrato Conta +++++++++++++++++++++");
		System.out.println("\t\tTransação realizada com sucesso.");
		System.out.println("- Número da conta   \t\t\t " + numero);
		System.out.println("- Saldo  Anterior   \t\t\t R$ " + valor);
		System.out.println("- Operação          \t\t\t Deposito");
		System.out.println("- Saldo Atual       \t\t\t R$" + saldo);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Override
	public void Debito(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("++++++++++++++++++++++++++ Extrato Conta +++++++++++++++++++++");
			System.out.println("\t\tTransação realizada com sucesso.");
			System.out.println("-Número da conta   \t\t\t " + numero);
			System.out.println("- Saldo  Anterior   \t\t\t R$ " + valor);
			System.out.println("- Operação          \t\t\t Saque");
			System.out.println("- Saldo Atual       \t\t\t R$" + saldo);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		} else {
			System.out.println("O débito não foi realizado.\n\tValor insuficiente em conta.");
			System.out.println("     ===================================================== ");
			if (emprestimoEstudantil < 5000) {
				solicitarEmprestimo();
				Debito(valor);
			}
		}
	}

}