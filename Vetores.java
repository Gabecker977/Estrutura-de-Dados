package av1;



public class Vetores {
	 

	public static void main(String[] args) {
		String[] descricao= {"Prova 1","Trabalho 1","Prova 2", "Trabalho 2"};
		int[] notas= {10,5,8,6};
		notas=Vetores.adcionarNota(9, notas);
		descricao=Vetores.adcionarDescricao("Recuperação", descricao);
		for(int i=0;i<notas.length;i++) {
			System.out.println(descricao[i]+": "+notas[i]);
		}
	
	}
	public static int[]adcionarNota(int nota, int[] notas){
		int[] novasNotas=new int[notas.length+1];
		for(int i =0;i<notas.length;i++) {
			novasNotas[i]=notas[i];
		}
		novasNotas[novasNotas.length-1]=nota;
		return novasNotas;
	}
	public static String[]adcionarDescricao(String descricao, String[] descricoes){
		String[] novasDescricoes=new String[descricoes.length+1];
		for(int i=0;i<descricoes.length;i++) {
			novasDescricoes[i]=descricoes[i];
		}
		novasDescricoes[novasDescricoes.length-1]=descricao;
		return novasDescricoes;
	}

}
