import java.util.Random;
import java.util.Scanner;

public class Exercicio2{
  static  int m;
static Random rand;
int lenth;
static int[] vet;
static int max;
public static void main(String[] args) throws Exception {
    rand=new Random();
    Scanner scan =new Scanner(System.in);
    System.out.println("Qual é tamanho de sua lista?");
    vet = new int[scan.nextInt()];
    System.out.println("Qual é o valor maximo da lista?");
    max=scan.nextInt();
    scan.nextLine();
    for(int i=0;i<vet.length;i++){
    //scan.nextLine();
    vet[i] = rand.nextInt(0,max+1);
    
        }
    scan.close();
    System.out.println("\n");
    Printar(vet);
    }
    static void Printar(int[] vet){
        for(int i=0;i<vet.length;i++){
           System.out.println(vet[i]);
        }
    }
}