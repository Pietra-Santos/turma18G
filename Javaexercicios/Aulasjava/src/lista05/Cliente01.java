package lista05;

/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
*
*1- criar uma classe cliente
*2- atributos = nome, idade, cpf
*3- m�todos
*4- criar um objeto cliente, em seguida, definir as intancias
*5- apresentar no console
*/

public class Cliente01 {
	
	public String nomeCompleto;
    public int idade;
    public String cpf;
    
    public void  cliente (String nome,int idade, String cpf) {
    
    System.out.printf(" O Seu nome � %s,sua idade %d anos e o cpf: %s",nome,idade,cpf);
    	
    }
}
