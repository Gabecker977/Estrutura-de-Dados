package av1;

public class Produto {
	String nome, c�digo, c�digo_do_fornecedor;
	float pre�o;
	int estoque;
	void listProdutos() {
		System.out.print("\n Nome: "+nome);
		System.out.print(" C�digo: "+c�digo);
		System.out.print(" Pre�o: "+pre�o);
		System.out.print(" Estoque: "+estoque);
		System.out.print(" C�digo do fornecedor: "+c�digo_do_fornecedor);
	}
}
