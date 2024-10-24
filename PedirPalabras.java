import java.util.Scanner;

public class PedirPalabras {

    public static void main(String[] args) {
        
        var scanner  = new Scanner(System.in);

        System.out.println("Introduzca la primer palabra: ");
        var palabra1 = scanner.nextLine();
    
        
        System.out.println("Introduzca la segunda palabra: ");
        var palabra2 = scanner.nextLine();
 

        System.out.println("Introduzca la tercer palabra: ");
        var palabra3 = scanner.nextLine();
  
       System.out.println(palabra1 + " " + palabra2 + " " + palabra3);

        scanner.close();

    }

}