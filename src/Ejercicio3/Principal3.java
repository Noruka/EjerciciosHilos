package Ejercicio3;

public class Principal3 {
    public static void main(String[] args) {
        String texto="Buenas que tal, aqui Borja Zazoo, y aqui estamos en un nuevo videotutorial de como romper un equipo";

        vocal a=new vocal(texto, 'a');
        vocal e=new vocal(texto, 'e');
        vocal i=new vocal(texto, 'i');
        vocal o=new vocal(texto, 'o');
        vocal u=new vocal(texto, 'u');

        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("En total hay "+vocal.numvocales+" vocales");
    }
}
