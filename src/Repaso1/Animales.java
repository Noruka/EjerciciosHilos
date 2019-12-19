package Repaso1;

public class Animales extends Thread{

    private String nombre;

    public Animales (String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        super.run();

        //Tortuga
        if (nombre.equalsIgnoreCase("tortuga")){
            try {
                sleep(30);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if(nombre.equalsIgnoreCase("perro")){
            try {
                sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombre+" ha empezado la carrera");

        for (int i = 0; i < 10; i++) {
            System.out.println(nombre + " lleva "+i+" metros");
        }

        System.out.println(nombre + " ha acabado la carrera");

    }
}
