
public class Casa {
 
    private String cor;
    Boolean porta1;
    Boolean porta2;
    Boolean porta3;
    private int total;
    
    public void setPinta(String s) {        
        cor = s;
        System.out.println("A cor da casa é "+ cor);
    }
    
    public int getQuantasPortasEstaoAbertas() {
       if (porta1 == true) {
           int p1 = 1;
           total = p1;
       }
       if (porta2 == true) {
           int p2 = 1;
           total = total + p2;
       }
       if (porta3 == true) {
           int p3 = 1;
           total = total + p3;
       }       
       return total;       
    }
}
    

