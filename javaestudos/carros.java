
public class carros{
    private String marca;
    private String modelo;

public carros(String marca, String modelo){
    //construtor -> é o que usamos para criar objetos (instaciar)
    this.marca = marca;
    this.modelo = modelo;
}

//GETTERS & SETTERS (OBTER & DETERMINAR)

public String getMarca(){  // GET => OBTENHO INFORMAÇÕES DO OBJETO
    return marca; //OBTER UM RETORNO VISUAL DA INFORMAÇÃO DESEJADA DO OBJETO
}

public void setMarca(String marca){ //DETERMINAR, ALTERAR INFORMAÇÕES
    this.marca = marca;
}

public String getModelo(){
    return modelo;
}

public void setModelo(String modelo){
    this.modelo = modelo;
}
}


