package lista03;
import java.util.Scanner;
public class ExercicioLacosRepeticao02{

    public static void main(String[] args) {
    Scanner ler= new Scanner(System.in); 

    int n1,par=0, impar=0;
    for(int contador= 0; contador<10; contador++){

        System.out.print("Digite o numero: ");
        n1= ler.nextInt();

        if(n1%2==0) {
            //System.out.print("numero par");
            par++; 
        }else {
            //System.out.print("numero impar");
            impar++;
        }
    }
        System.out.print("\ntotal par: " + par + "\ntotal impar: "+ impar);
    }
}