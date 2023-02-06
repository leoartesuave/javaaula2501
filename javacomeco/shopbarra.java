public class shopbarra extends shoppings {

    public shopbarra(String nome, String cidade, String bairro, String rua, int numero){
        super(nome, cidade, bairro, rua, numero);
    }

public static void main(String[] args){

    shoppings shop3 = new shoppings("Barramall", "Barra", "centro", "rua riachuelo", 55 );
    shop3.imprimirdados();
  
}

}

