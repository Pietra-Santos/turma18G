package  Lista1 ;

import  java.util.Scanner ;

 classe  p�blica Atividade4 
{
	public  static  void  main ( String [] args ){
		int triaguloB,trianguloH
		
		Scanner ler =  novo  Scanner ( Sistema . In);
		duplo a, b, c, d, r, s;
		Sistema . para fora . println ( " Digite o valor de a: " );
		a = ler . nextInt ();
		Sistema . para fora . println ( " Digite o valor de b: " );
		b = ler . nextInt ();
		Sistema . para fora . println ( " Digite o valor de c: " );
		c = ler . nextInt ();
		
		
		r =  matem�tica . pow ((a + b), 2 );
		s =  matem�tica . pow ((b + c), 2 );
		d = (r + s) /  2 ;
		
		
		Sistema . para fora . println ( " O valor de d �: "  + d);
	}
}
