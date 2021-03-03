package lista05;

public class ExercicioProdutoEletronico03 {

	public static void main(String[] args) {
		
		 
		ProdutoEletronico03 produto1 = new ProdutoEletronico03();
		produto1.nomeProduto = "Smartphone";
		produto1.marca = "Samsung A71";
		produto1.preco= 1900;
		produto1.mostrarProduto();

		ProdutoEletronico03 produto2 = new ProdutoEletronico03();
		produto2.nomeProduto = "Tablet";
	    produto2.marca = "Apple";
	    produto2.preco = 2500;
	    produto2.mostrarProduto();
	}  

}
