public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada =false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando o volume para: " + volume);
        
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo o volume para: " + volume);

    }

    public void aumentareCanal(){
        canal++;
    }

    public void diminurCanal(){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}
