import java.util.Scanner;

public class imc {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int teste = 1;

        while(teste == 1){
            System.out.println("calcular o imc? 1 = sim! ou 2 = nao!");
            teste = entrada.nextInt();

           if(teste == 1){
        System.out.println("Entre com o peso: ");
        
        Float peso = entrada.nextFloat();

        System.out.println("entre com altura: ");
        Float altura = entrada.nextFloat();

        Float imc = peso / (altura * altura);
        System.out.println("seu imc e: " + imc);



        String classificacao = "";

        if(imc < 18.5) classificacao = "magreza";
        else if(imc < 24.9) classificacao = "normal";
        else if(imc < 29.9) classificacao = "sobrepeso";
        else if(imc < 39.9) classificacao = "obesidade";
        else  classificacao = "obesidade grave";

System.out.println("sua classificacao e: " + classificacao);
        }
    }
    entrada.close();
}

}