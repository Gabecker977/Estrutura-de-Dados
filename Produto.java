package av1;

public class Produto {
	String nome, código, código_do_fornecedor;
	float preço;
	int estoque;
	void listProdutos() {
		System.out.print("\n Nome: "+nome);
		System.out.print(" Código: "+código);
		System.out.print(" Preço: "+preço);
		System.out.print(" Estoque: "+estoque);
		System.out.print(" Código do fornecedor: "+código_do_fornecedor);
	}
}
