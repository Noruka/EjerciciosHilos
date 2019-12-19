package Repaso1;

public class repaso1 {

    public static void main(String[] args) {

        Animales tortuga = new Animales("tortuga");
        Animales perro = new Animales("perro");
        Animales tigre = new Animales("tigre");

        tortuga.setPriority(Thread.MIN_PRIORITY);
        perro.setPriority(Thread.NORM_PRIORITY);
        tigre.setPriority(Thread.MAX_PRIORITY);


        tortuga.start();
        perro.start();
        tigre.start();

    }

}
