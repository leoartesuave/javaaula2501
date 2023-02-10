# introdução ao Spring

## conceito de interfaces e classes abstratas

### p que é uma interface?

#### é um tipo especial de classe que define uma serie de ações que outras classes deverão implementar. Ela fornece uma garantia de que as classes que a implementam irão fornecer ações específicas, mas permite que cada classe as implemente de forma individual.]

//public interface alunos{
    id int
    home string
    cpf int
    rg int
    cnh int
    altura double
    peso double
}

### classe abstrata?

#### Classe abstrata é uma classe que não pode ser instanciada diretamente. ou seja, você não pode criar objetos a partir dela. 

#### Intanciar => Criar Objetos!

### Em vez disso, as classes abstratas servem como modelos para outras classes que podem herdar seus atributos e comportamentos.

### Diferanças entre classes abstratas e interfaces

#### 1. Herança única versus Múltipla Implementação. Uma classe pode herdar apenas de uma classe "mãe", mas pode implementar várias interfaces.

#### isso significa que as interfaces permitem que uma classe implemente vários comportamentos, enquanto as classes abstratas só permitem herança de um comportamento.

### Métodos abstratos. Ambas as classes abstratas e as interfaces podem conter métodos abstratos. No entanto as classes abstratas também podem conter métodos concretos com implementação de códigos.Enquanto as interfaces só podem conter métodos abstratos.

### Pra  que servem as classes abstratas e interfaces?

### As classes abstratas são usadas para fornecer uma estrutura geral pra outras classes.

#### As interfaces são usadas para garantir que certos comportamentos sejam implementados em várias classes.

#### As classes abstratas podem fornecer implementacões  de código para comportamentos padrão que podem ser herdados e usados por classes filhas.

#### As interfaces não fornecem implementações de código, apenas definem os COMPORTAMENTOS que devem ser implementados.