package lista05;
/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
*1- definir o produto eletronico
*2-
*/
public class ProdutoEletronico03 {
	
	public String nomeProduto;
	public String marca;
	public double preco;
	
	void mostrarProduto() {
		System.out.println("O produto é "+this.nomeProduto+", a marca do produto é "+this.marca+" e o seu preco é "+this.preco);
	}


}
