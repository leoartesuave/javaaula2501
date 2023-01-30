import java.util.Scanner;

public class animal {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome, cor, raca;
        double tamanho;

        System.out.println("Insira o nome do animal: ");
        nome = scanner.nextLine();

        System.out.println("Insira a cor do animal: ");
        cor = scanner.nextLine();

        System.out.println("Insira a raça do animal: ");
        raca = scanner.nextLine();

        System.out.println("Insira o tamanho do animal: ");
        tamanho = scanner.nextDouble();

        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 

        System.out.println("nome: " + nome + "\n" + "cor: " + cor + "\n" + "tamanho: " + tamanho + "\n" + "raça: " + raca);
    }
}
