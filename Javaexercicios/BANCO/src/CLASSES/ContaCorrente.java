package CLASSES;

import java.util.*;

public class ContaCorrente extends Conta {
	
	int contadorTalao = 0;
	Scanner s = new Scanner(System.in);
	
	public ContaCorrente() {
		System.out.println("Logue na sua conta.");
		System.out.println("Digite o numero da sua conta:");
        numero = s.nextInt();
        System.out.println("Digite o seu CPF: ");
        cpf = s.next();
        System.out.println("Essa conta esta ativa?");
        System.out.println();
        System.out.println("[1]Ativa[2]Inativa");
        int a = s.nextInt();
        if(a == 1) ativa = true;
        if(a == 2) ativa = false;
        saldo = 0;
	}
	
	public void pedirTalao() 
	{
		System.out.println("Deseja pedir talão de cheque?");
		System.out.println();
		System.out.println("[1] Sim | [2] Nao");
		int r = s.nextInt();	
		
		if (r == 1) 
		{
			if (this.contadorTalao < 3) {
				System.out.println("Talão solicitado com sucesso. Você ainda tem direito a: " + (this.contadorTalao) + " talão[ões]!");		
				this.contadorTalao = this.contadorTalao + 1;
			} else {
				System.out.println("Limite de talão excedido!");
			}
		}
		
	}

	
//	public int getPedirTalao() {
//		return PedirTalao;
//	}
//
//	public void setPedirTalao(int pedirTalao) {
//		this.PedirTalao = pedirTalao;
//	}
}

