package lista02;
 
  import java.util.Scanner;
  public class Exercicio08 {
  
	  public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int numero ;
      System.out.println("Informe o n�mero");
      numero = ler.nextInt();
      
      if (numero > 100)
      {
          System.out.println("O n�mero � "+ numero);
      } 
      else
      {
          numero = 0 ;
          System.out.println("O n�mero � "+ numero);
      }
    		
}
  
  }