
public class Produto {
    
    String nome;
    double preco;
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public double setDiminuir10(double diminui){
    double pro =(diminui * 0.9);
    return pro;
        
    }
    public double setAumenta25(double aumenta){
    double acrs= (aumenta * 1.25);
    return acrs;
    }
    
}

    

