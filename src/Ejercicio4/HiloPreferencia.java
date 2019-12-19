package Ejercicio4;

import java.util.concurrent.Semaphore;

public class HiloPreferencia extends Thread {
    Semaphore sem;
    String nombre;

    HiloPreferencia(Semaphore sem, String nombre){
        this.sem=sem;
        this.nombre=nombre;
    }

    @Override
    public void run() {
        //Detecto y paro a los hilos 1 y 3
        if (this.nombre.equalsIgnoreCase("Hilo 1") || this.nombre.equalsIgnoreCase("Hilo 3")){
            try {
                sem.acquire();
                sleep(500);
                if (this.nombre.equalsIgnoreCase("Hilo 1")){
                    sem.acquire();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Hola, soy el "+this.nombre);

        if (this.nombre.equalsIgnoreCase("Hilo 2")){
            sem.release(2);
        }

        if (this.nombre.equalsIgnoreCase("Hilo 3")){
            sem.release(1);
        }
    }
}
