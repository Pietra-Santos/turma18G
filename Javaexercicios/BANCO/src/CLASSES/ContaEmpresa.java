package CLASSES;

import java.util.Scanner;

public class ContaEmpresa extends Conta
{
	double emprestimoEmpresa = 0;
	Scanner s = new Scanner(System.in);
	
	public ContaEmpresa()
	{
		System.out.println("        Painel - Informe os dados da sua conta \n");
		System.out.println("    ========================================== \n");
		System.out.println("              Informe o numero da contas");
		System.out.print("                      (4 digitos):               \n");
		numero = s.nextInt();
		System.out.println("              Informe o numero do CPF:           ");
		System.out.print("                      (8 digitos):               \n");
		cpf = s.next();
		System.out.println("              Essa conta esta ativa?           \n");
		System.out.println("              [1]Ativa    [2]Inativa           \n");
		int a = s.nextInt();
		System.out.println("    ========================================== \n");
		if (a == 1)
			ativa = true;
		if (a == 2)
			ativa = false;
        if(ativa)OferecerEmprestimo();
	}
	
	public void OferecerEmprestimo()
	{
        System.out.println("Você gostaria de um empréstimo ? ");
        var emp = s.next().toLowerCase().charAt(0);
        if(emp == 's')
        {
        	System.out.println("...de quanto ? ("+(10000-emprestimoEmpresa)+" disponível)");
            double novoEmprestimo = s.nextDouble();
            if(emprestimoEmpresa+novoEmprestimo <= 10000)
            {
            	FazerEmprestimo(novoEmprestimo);
            }
            else
            {
            	System.out.println("Valor indisponivel. O emprestimo não foi realizado.");
            }
        }
	}
	
	public void FazerEmprestimo(double valor)
	{
		emprestimoEmpresa = emprestimoEmpresa + valor;
		Credito(valor);
		System.out.println("Emprestimo de "+valor+" realizado.");
	}
	
	@Override
	public void Debito(double valor)
	{
		if(valor <= getSaldo())
		{
			Debito(valor);
			System.out.println("Transação realizada com sucesso.");
		}
		else
		{
			System.out.println("O débito não foi realizado. Valor insuficiente em conta.");
			if(emprestimoEmpresa < 10000)
			{
				OferecerEmprestimo();
				Debito(valor);
			}
		}
	}
}
