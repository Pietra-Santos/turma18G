package lista05;
/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
*1- criar uma classe avi�o 
*2- atributos = assentos, portas, janelas, em seguida, definir as instancias
*3- apresentar informa��es no console
*
*/
public class Aviao02 {
	
	public String assentos;
    public String portas;
    public String janelas;
    
    void mostrarAviao(){
    	System.out.println("Neste aviao, h� um numero total de "+this.assentos +" assentos,"+ this.portas +" portas e "+this.janelas+ " janelas ");
    }
}
