package lista02;

import java.util.Scanner;

public class Exerjava03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();

        if (idade<10 )
        {
            System.out.println("A sua idade n�o � permitida");
        }
        else if (idade<=14)
        {
            System.out.println("Voc� est� incluso na categoria infantil");
        }
        else if (idade<=17)
        {
            System.out.println("Voc� est� incluso na categoria juvenil");
        }
        else if (idade<=25)
        {
            System.out.println("Voc� est� incluso na categoria adulto");
        }
        else 
        {
            System.out.println("Voc� n�o faz parte de nenhuma das categorias");
        }
	}

}
