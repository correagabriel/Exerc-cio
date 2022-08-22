package metodo;

public class smartv {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume () {
        volume ++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int newCanal){
        canal = newCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

}
