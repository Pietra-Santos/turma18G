package CLASSES;

import java.util.Scanner;

public class ContaEstudantil extends Conta {
	
	double emprestimoEstudantil = 0;
	Scanner s = new Scanner(System.in);
	
	public ContaEstudantil() {
		System.out.println("Entre na sua conta:");
		System.out.println("Digite o n�mero da sua conta:");
        numero = s.nextInt();
        System.out.println("Digite o seu CPF: ");
        cpf = s.next();
        System.out.println("Essa conta est� ativa?:");
        System.out.println();
        System.out.println("[1] Ativa [2] inativa");
        int a = s.nextInt();
        if(a == 1) ativa = true;
        if(a == 2) ativa = false;
        saldo = 0;
    
        solicitarEmprestimo (); 
     }

		private void solicitarEmprestimo() 
		{	
			System.out.println("Solicitar empr�stimo?: ");
	        var emp = s.next().toLowerCase().charAt(0);
	        if(emp == 's')
	        {
	    	
	        	System.out.println(" Digite o valor do empr�stimo: ("+(5000 - emprestimoEstudantil)+" dispon�vel)"); 
        	}
		  double novoEmprestimo = s.nextDouble();
          if(emprestimoEstudantil+ novoEmprestimo <= 5000)
          {
        	  fazerEmprestimo(novoEmprestimo);
          }
      	  else 
          {
        	  System.out.println("Valor indispon�vel. N�o foi poss�vel realizar o empr�stimo.");
          }
		}
		  public void fazerEmprestimo(double valor) 
		  {
			 emprestimoEstudantil = emprestimoEstudantil + valor;
			 saldo = saldo + valor;
			 System.out.println("Empr�stimo de "+valor+" realizado.");
		  }
		  @Override
		  public void Debito (double valor) 
		  {
			 if(valor <= saldo) 
			 {
				 saldo = saldo - valor;
				 System.out.println("Transa��o realizada com sucesso.");
			 }
			 else 
			 {
                   System.out.println("O d�bito n�o foi realizado. Valor insufieciente..");
					if(emprestimoEstudantil < 5000) 
					{
						solicitarEmprestimo();
						Debito(valor);
					}
			 }

		 }
}

