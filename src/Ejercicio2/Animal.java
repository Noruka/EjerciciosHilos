package Ejercicio2;

public class Animal extends Thread{
    String nombre;

    Animal(String nombre){
        this.nombre=nombre;

    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Soy "+this.nombre+" y llevo "+i+" metros");
        }
    }
}
