 public class shoppings{
 
    public String nome, cidade, bairro, rua;
    public int numero;


    public shoppings(String nome, String cidade, String bairro, String rua, int numero){    
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public void imprimirdados(){
        System.out.println("nome: " + nome + ",cidade: " + cidade + ",bairro: " + bairro + ",rua: " + rua);
    }

    public static void main(String[] args){
        shoppings shop = new shoppings("partage", "SG", "centro", "rua sao gonçalo", 05 );
        shop.imprimirdados();
       
    }





}
