public class TestaPorta {

public static void main(String[] args){

	Porta porta = new Porta();
	porta.abre();
	porta.fecha();
	
	porta.cor = "Rosa";
	porta.cor = "Azul";
	porta.cor = "Verde";
	porta.cor = "Amarelo";
	
	porta.dimensaoX = 80;
	porta.dimensaoY = 75;
	porta.dimensaoZ = 100;
	
	System.out.println("A porta está aberta? " + porta.estaAberta());
	System.out.println(porta.cor);
}
}
