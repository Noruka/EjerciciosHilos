package Ejercicio3;

public class vocal extends Thread{
    String frase;
    char letra;
    static int numvocales;

    vocal(String frase, char letra){
        this.frase=frase;
        this.letra=letra;
        Thread t=new Thread(this, "Mi vocal"+letra);
        t.start();
    }

    @Override
    public void run() {
        int contador=0;
        for (int i = 0; i < frase.length() ; i++) {
            if (frase.charAt(i)==letra){
                contador++;
                SumaVocales();
            }
        }
        System.out.println("Hay "+contador+" "+letra+"s");
    }

    private synchronized void SumaVocales(){
        numvocales++;
    }
}
