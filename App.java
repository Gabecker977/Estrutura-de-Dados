import java.util.Scanner;

public class App {
    int lenth;
    static int[] vet;
    public static void main(String[] args) throws Exception {
        Scanner scan =new Scanner(System.in);
        System.out.println("Qual é tamanho de sua lista?");
        vet = new int[scan.nextInt()];
        scan.nextLine();
        for(int i=0;i<vet.length;i++){
        
        System.out.println("Digite um numero");
        //scan.nextLine();
        vet[i] = scan.nextInt();
        
    }
    scan.close();
    System.out.println("\n");
    PrintarListaIvc(vet);
    }
    public static void PrintarListaIvc(int[] vet){
        for(int i=vet.length-1;i>=0;i--){
            System.out.println(vet[i]);
        }
    }
}
