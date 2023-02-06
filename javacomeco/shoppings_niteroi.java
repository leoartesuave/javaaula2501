public class shoppings_niteroi extends shoppings{

    public shoppings_niteroi (String nome, String cidade, String bairro, String rua, int numero){
        super(nome, cidade, bairro, rua, numero);

      
    }

    public static void main(String[] args){
      
        shoppings shop2 = new shoppings("niteroi", "nt", "centro", "rua niteroi", 15 );
        shop2.imprimirdados();
      
    }
    
}
