package edd;

public class Array {

	public static void main(String[] args) {
		//Testes aqui
		
		
		}
	//retorna a soma de x até 1
	public static int soma(int x) {
		if(x==1) {
			return 1;
		}
		
		return x +soma(x-1);
		
			}
	//retorna o fatorial de x
	public static int fat(int x) {
		if(x==1) {
			 System.out.println(1);
			 return 1;
		}
		System.out.println(x);
		return x*fat(x-1);
	}
	//retorna a potencia de x sobre n
	public static int pot(int x,int n) {
		if(n==1||x==1) {
			return x;
		}
		return x*pot(x,n-1);
	}
	//Mostra os numeros de 1 até x
	public static void todos_crescente(int x) {
		if(x>=1) {
			System.out.println(x);
			todos_crescente(x-1);
		}
		
	}
	//Mostra os numeros de x até 1
	public static void todos_decrescente(int x) {
		if(x>=0) {
			todos_decrescente(x-1);
			System.out.println(x);
			
		}
	}
	//retorna a soma de todos elementos de um array
	public static int soma_vetor(int vet[], int n){
	    if(n>0){
	        return vet[n]+soma_vetor(vet,n-1);
	    }
	    return vet[n];
	}

	//retorna o menor elemento de um array
	public static int menor_vetor(int vet[], int n){
	    if(n>0){
	        int x = menor_vetor(vet, n-1);
	        
	        if(x<vet[n])
	            return x;
	        return vet[n];
	    }
	    return vet[n];
	}
	//Mostra o valor binario de n
	public static void Dec2Bin(int n){
	    if(n>0){
	        Dec2Bin(n/2);
	        System.out.print(n%2);
	    }else
	        System.out.print(0);
	}
}
