package Ejercicio5;

import java.util.concurrent.Semaphore;

public class Relevo extends Thread{

    Semaphore sem;

    Relevo(Semaphore sem, String nombre){

        this.setName(nombre);
        this.sem=sem;

    }

    @Override
    public void run() {
        try {
            if (this.getName().equalsIgnoreCase("Hilo 2")) sleep(30);
            if (this.getName().equalsIgnoreCase("Hilo 3")) sleep(60);
            if (this.getName().equalsIgnoreCase("Hilo 4")) sleep(90);
            sem.acquire();
            System.out.println("Soy el "+this.getName()+", corriendo... ");
            sleep(200);
            if(this.getName().equalsIgnoreCase("hilo 4")){
                System.out.println("Terminé la carrera, soy el ultimo.");
            }else{
            System.out.println("Terminé, pasando el testigo...");
            }
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
