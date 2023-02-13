import java.util.Scanner;

public class menor {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

System.out.println("um numero: ");
int num = entrada.nextInt();

System.out. println("outro numero: ");
int num2 = entrada.nextInt();

if(num<num2){

    System.out.println("o menor e: " + num);
 
}else if (num>num2){
    System.out.println("o menor e: " + num2);
}
else{
    System.out.println("sao iguais!!");
}

entrada.close();
    }
    }
