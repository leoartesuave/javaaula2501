import java.util.Scanner;

public class log {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com as posições: ");
        int posicoes = entrada.nextInt();

        int[] dados = new int[posicoes];

        for (int i = 0; i < dados.length; i++)
        {
            System.out.println("Entre com o numero: ");
            dados[i] = entrada.nextInt();       
        }
       
        System.out.println("escolha:");
        System.out.println("1 - listar em ordem " + "\n");
        System.out.println("2 - listar invertidos ");
   

    int operacao = entrada.nextInt();
    switch (operacao) {
        case 1:
            for(int i = 0; i < dados.length; i++){
        
            System.out.println(dados[i] + "\n");
        }
            break;

            case 2:
                for(int i = dados.length-1; i>=0; i--){
                System.out.println(dados[i] + "\n");
            }
            break;
    
        default:
           System.out.println("comando invalido");
    }
    entrada.close();
}
}
