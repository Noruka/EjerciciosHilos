package Ejercicio4;

import java.util.concurrent.Semaphore;

public class Principal4 {

    public static void main(String[] args) {
        Semaphore sem=new Semaphore(0);

        HiloPreferencia h1=new HiloPreferencia(sem, "Hilo 1");
        HiloPreferencia h2=new HiloPreferencia(sem, "Hilo 2");
        HiloPreferencia h3=new HiloPreferencia(sem, "Hilo 3");

        h1.start();
        h2.start();
        h3.start();

        try {
            h1.join();
            h2.join();
            h3.join();

            System.out.println("Proceso principal terminado");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
