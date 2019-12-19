package Ejercicio1;

public class Fibonacci extends Thread{
    Thread t;
    int n;

    Fibonacci(int n){
        this.n=n;
        t=new Thread(this, "Fibo Thread");
        System.out.println("Creado el hilo "+t);
        t.start();
    }

    @Override
    public void run() {
        int res=Fibo(n);
        System.out.println("El resultado es "+res);
    }

    public int Fibo(int n){
        if (n==1 || n==2){
            return 1;
        }else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
}
