
public class TesteCasa {
    public static void main (String args[]){
        Casa casa1 = new Casa();
        casa1.porta1 = true;
        casa1.porta2 = true;
        casa1.porta3 = true;   
        
        casa1.setPinta("Rosa");
        System.out.println("A quantidade de portas abertas é: " + casa1.getQuantasPortasEstaoAbertas());        
    }
    
}
