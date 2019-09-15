    
    public class Pessoa {      
        String nome;
        int idade;  
    

    
        public void setFazAniversario(int a){     
             int aniver = this.idade+1;     
             this.idade =  aniver;  
    }    

    void setFazAniversario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
    }   

