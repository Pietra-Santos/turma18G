package lista05;
/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
*1- definir o produto eletronico
*2-
*/
public class ProdutoEletronico03 {
	
	public String nomeProduto;
	public String marca;
	public double preco;
	
	void mostrarProduto() {
		System.out.println("O produto � "+this.nomeProduto+", a marca do produto � "+this.marca+" e o seu preco � "+this.preco);
	}


}
