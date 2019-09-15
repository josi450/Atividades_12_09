public class Porta {

private boolean aberta;
String cor;
double dimensaoX;
double dimensaoY;
double dimensaoZ;

public void setAbre() {
	aberta = true;
}

public void setFecha() {
	aberta = false;
}

public void getPinta(String s) {
	this.cor += s;
}

public boolean isEstaAberta() {
	return aberta;

}

}
    

