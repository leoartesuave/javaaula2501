public class pessoa {// classe

    private String nome;// atributos, propriedades
    private int idade;// atributos, propriedades
    private double altura;// atributos, propriedades

    /*
     * chamamos de entidade de atributos, ou caractere
     * 
     */

    // metodo construtor -> pra criar ou excluir objetos

    public pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void imprimirdados() { // metodo de imprimirdados()
        System.out.println("nome: " + nome + "idade: " + idade + "altura" + altura);

    }

    public static void main(String[] args){
            pessoa pessoa = new pessoa("kimura",27,  1.75 );
            pessoa.imprimirdados();
        }

    /*
     * se for mais de uma pessoa, é necessário colocar em uma lista, array
     * 
     * JSON= notação de objetos em javascript
     * 
     * na hora de testar as apis, é dessa forma que exibimos os nossos objetos, com
     * essa notação.
     * 
     * lista = [{"nome": "kimura",
     * "idade": 27,
     * "altura": 1.75},
     * 
     * {
     * "nome": "Demetrius Ferreira", "idade": 27, "altura": 1.75
     * },
     * {
     * "nome": "kimura", "idade": 27, "altura": 1.75
     * 
     * },
     * {
     * "nome": "Demetrius Ferreira",
     * "idade": 27,
     * "altura": 1.75
     * },
     * 
     * ]
     */

}
