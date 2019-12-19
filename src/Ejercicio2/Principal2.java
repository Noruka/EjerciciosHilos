package Ejercicio2;

public class Principal2 {

    public static void main(String[] args) {
        Animal tortuga=new Animal("tortuga");
        Animal liebre=new Animal("liebre");
        Animal guepardo=new Animal("guepardo");
        Animal tortuga1=new Animal("tortuga1");
        Animal liebre1=new Animal("liebre1");
        Animal guepardo1=new Animal("guepardo1");


        tortuga.setPriority(1);
        liebre.setPriority(5);
        guepardo.setPriority(10);
        tortuga1.setPriority(1);
        liebre1.setPriority(5);
        guepardo1.setPriority(10);

        tortuga.start();
        liebre.start();
        guepardo.start();
        tortuga1.start();
        liebre1.start();
        guepardo1.start();
    }
}
