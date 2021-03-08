package CLASSES;

import java.util.Scanner;

public class ContaEspecial extends Conta {

    double limiteEspecial = 1000;
    Scanner s = new Scanner(System.in);
    
    public ContaEspecial() {
	    System.out.println("Logue na sua conta.");
	    System.out.println("Digite o numero da sua conta:");
	    numero = s.nextInt();
	    System.out.println("Digite o seu CPF: ");
	    cpf = s.next();
	    System.out.println("Essa conta esta ativa?");
	    System.out.println();
	    System.out.println("[1]Ativa[2]inativa");
	    char c = s.next().charAt(0);
	    if(c == 1) ativa = true;
	    if(c == 2) ativa = false;
    }
    
    @Override
    public void Debito(double valor) {
    	double saldoAtual = getSaldo();  
    	
        if(valor <= saldoAtual) {
            super.Debito(valor);
        }
        
        if(valor > saldoAtual) {
        	double limiteNecessario = valor - saldoAtual; 
        	if (limiteNecessario > limiteEspecial) {
        		System.out.println("Saldo e limite insuficientes para realizar o debito...");
        		return;
        	}
        	
        	if(saldoAtual > 0) {
        		System.out.println("Debitando "+saldoAtual+" da conta");
        		super.Debito(saldoAtual);
        	}
        	
        	usarLimite(limiteNecessario);
        }        
    }
    
    public void usarLimite(double valor) {
    	System.out.println("Utilizando R$"+valor+" do limite especial...");
        limiteEspecial = limiteEspecial - valor;
        System.out.println("Limite especial restante R$"+limiteEspecial + " utilize com sabedoria :)");
    }
}
