package av1;

import java.util.Scanner;

public class Av1 {

	public static void main(String[] args) {
		Produto temp;
		Scanner scan = new Scanner(System.in);
		int n=50;
		Produto produto[]=new Produto[n];
		for(int i=0;i<n;i++) {
			produto[i] = new Produto();
			System.out.print("Nome do produto: ");
			produto[i].nome=scan.nextLine();
			System.out.print("C�digo do produto: ");
			produto[i].c�digo=scan.nextLine();
			System.out.print("Pre�o de custo do produto: ");
			produto[i].pre�o=scan.nextFloat();
			System.out.print("Estoque do produto: ");
			produto[i].estoque=scan.nextInt();
			scan.nextLine();
			System.out.print("C�digo do fornecedo: ");
			produto[i].c�digo_do_fornecedor=scan.nextLine();
			scan.nextLine();
		}
		for(int i=0;i<produto.length;i++) {
			for(int j=i+1;j<produto.length;j++) {
				if(produto[i].nome.compareTo(produto[j].nome)>0) {
					temp=produto[i];
					produto[i]=produto[j];
					produto[j]=temp;
				}
			}
			produto[i].listProdutos();
		}
	}
}
