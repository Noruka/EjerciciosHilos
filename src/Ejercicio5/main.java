package Ejercicio5;

import java.util.concurrent.Semaphore;

public class main {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);

        Relevo r1 = new Relevo(sem, "Hilo 1");
        Relevo r2 = new Relevo(sem, "Hilo 2");
        Relevo r3 = new Relevo(sem, "Hilo 3");
        Relevo r4 = new Relevo(sem, "Hilo 4");

        r1.start();
        r2.start();
        r3.start();
        r4.start();

        while (!(r1.isAlive() && r2.isAlive() && r3.isAlive() && r4.isAlive())){
        }

        System.out.println("Todos los hilos creados");
        System.out.println("Doy la salida!!");


        try {


            r1.join();
            r2.join();
            r3.join();
            r4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todos los hilos terminados");

    }

}
