package lista02;

import java.util.Scanner;

public class Exerjava01 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);

        int a,b,c,maior=0;

        System.out.print("digite valor de A: ");
        a = ler.nextInt();

        System.out.print("digite o valor de B: ");
        b = ler.nextInt();

        System.out.print("digite o valor de C: ");
        c = ler.nextInt();

        if(a>b && a>c)
        {
            maior=a;
        }
        else if (b>a && b>c)
        {
            maior=b;
        }
        else if (c>a && c>b)
        {
            maior=c;
        }

        System.out.printf("o maior numero é: %d ",maior);
	}

}
