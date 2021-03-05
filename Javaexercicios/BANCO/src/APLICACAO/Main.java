package APLICACAO;

import java.util.Scanner;
import CLASSES.Conta;
import CLASSES.ContaPoupanca;
import CLASSES.ContaCorrente;
import CLASSES.ContaEspecial;
import CLASSES.ContaEmpresa;
import CLASSES.ContaEstudantil;

public class Main
{
	public static void main(String[] args)
	{
		Conta conta = new Conta();
		int opcao = 0;
		int acao = 0;
		double valor;
		int mov = 0;
		String variedade = "";
		
		Scanner s = new Scanner(System.in);
		
		do
		{
			System.out.println("Banco Edbank");
			System.out.println("*Slogan*");
			System.out.println();
			System.out.println("1 - CONTA POUPAN�A");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - CONTA ESTUDANTIL");
			System.out.println("6 - SAIR");
			System.out.println();
			System.out.print("DIGITE O C�DIGO DA OP��O SELECIONADA: ");
			opcao = s.nextInt();
			if(opcao == 1)//////////////////////////////////////CONTA/POUPAN�A///////////////////////////////////////////
			{
				conta = new ContaPoupanca();
				variedade = "POUPAN�A";
			}
			else if(opcao == 2)//////////////////////////////////////CONTA/CORRENTE///////////////////////////////////////////
			{
				//conta = new ContaCorrente();
				variedade = "CORRENTE";
			}
			else if(opcao == 3)//////////////////////////////////////CONTA/ESPECIAL///////////////////////////////////////////
			{
				//conta = new ContaEspecial();
				variedade = "ESPECIAL";
			}
			else if(opcao == 4)//////////////////////////////////////CONTA/EMPRESA////////////////////////////////////////////
			{
				conta = new ContaEmpresa();
				variedade = "EMPRESA";
			}
			else if(opcao == 5)//////////////////////////////////////CONTA/ESTUDANTIL/////////////////////////////////////////
			{
				//conta = new ContaEstudantil();
				variedade = "ESTUDANTIL";
			}
			else
			{
				conta = new Conta();
			}
			do
			{
				System.out.println("Banco Edbank");
				System.out.println("*Slogan*");
				System.out.println();
				System.out.println("CONTA "+variedade);
				System.out.println("Saldo Atual: "+conta.getSaldo());
				System.out.print("MOVIMENTO : 1-Debito ou 2-Credito: ");
				valor = s.nextInt();
				if(acao == 1)
				{
					acao = s.nextInt();
					System.out.print("Valor do movimento: R$");
					conta.Debito(valor);
				}
				else if(acao == 2)
				{
					acao = s.nextInt();
					System.out.print("Valor do movimento: R$");
					conta.Credito(valor);
				}
				else
				{
					System.out.println("Erro, entrada inv�lida.");
					mov = mov - 1;
				}
				System.out.print("Continuar S/N:");
				var mais = s.next().toUpperCase().charAt(0);
				if(mais == 'N')
				{
					mov = 10;
				}
			}
			while(mov < 10);
			if(opcao == 2)
			{
				//conta.PedirTalao();
			}
		}
		while(opcao != 6);
	}
}