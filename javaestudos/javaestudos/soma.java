import java.util.Scanner;

public class soma {
    
    public static void main(String[] args){
Scanner entrada = new Scanner(System.in);

System.out.println("entre com um numero");
int pri = entrada.nextInt();

System.out.println();
int seg = entrada.nextInt();

 double soma = pri + seg;

 System.out.println("a soma e: " + soma);

 entrada.close();
    }
}
