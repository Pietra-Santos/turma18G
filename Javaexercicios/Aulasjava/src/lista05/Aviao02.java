package lista05;
/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*1- criar uma classe avião 
*2- atributos = assentos, portas, janelas, em seguida, definir as instancias
*3- apresentar informações no console
*
*/
public class Aviao02 {
	
	public String Assentos;
    public String Portas;
    public String Janelas;
    
    void aviao(){
    System.out.println("Neste aviao, há um numero total de "+this.Assentos +" assentos,"+ this.Portas +" portas e "+this.Janelas+ " janelas ");
    }
}
