import java.util.Random;
/*A pilha se consiste em um conjunto de elementos em que o ultimo valor é o topo da pilha e o primeiro a ser alterado*/
public class Pilha {
	//tamanho da pilha
    public static int N=10;
    public static int vet[]=new int[N];
	
    public static int indiceTopo;
    
    public static void main(String[] args) {
       
        indiceTopo = -1;
        Random rand = new Random();
        for(int i=0;i<vet.length-1;i++){
            empilhar(rand.nextInt(10));
        }
	listar();
        desempilhar();
        listar();
    }
    
    public static void empilhar(int x){
        if(!cheio()){
            indiceTopo++;
            vet[indiceTopo]=x;
        }
    }
    
    public static void desempilhar(){
        if(!vazio()){
            indiceTopo--;
        }
    }
    //retorna o ultimo valor da pilha
    public static int topo(){
        return vet[indiceTopo];
        
    }
    //Retorna o tamanho atual da pilha
    public static int tamanho(){
        return indiceTopo+1;
    }
    //verificar se a pilha esta cheia
    public static boolean cheio(){
        if(indiceTopo==vet.length-1)
            return true;
        else
            return false;
       
    }
    //verificar se a pilha esta vazia
    public static boolean vazio(){
        if(indiceTopo==-1)
            return true;
        else
            return false;
    }
	//listar os elementos da pilha
    public static void listar(){
        if(!vazio()){
        for(int i=indiceTopo+1;i>=0;i--){
            System.out.println(vet[i]);
        }
        }
        else
          System.out.println("Vazio");
    }
    //Converte todos os elementos da pilha para binario 
    public static void bin(){
    if(!vazio()){
     for(int i=indiceTopo+1;i>=0;i--){
    vet[i] = Integer.valueOf(Integer.toBinaryString(vet[i]));}
    }}
    
}
