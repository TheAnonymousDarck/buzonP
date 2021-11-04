/**
 *
 * @author mario
 */

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon b1 = new Buzon(5, "Buzón 1");
        Escritor e1 = new Escritor("Yo soy el escritor 1");
        
        System.out.println("El mensaje del escritor 1 es: " + e1.mensaje);
        
    }
    
}
