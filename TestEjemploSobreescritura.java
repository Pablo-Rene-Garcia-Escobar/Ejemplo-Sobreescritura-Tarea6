package EjemploSobreescritura;

import java.util.Scanner;

public class TestEjemploSobreescritura {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              
        System.out.println("Ingrese un numero:");
        int a = in.nextInt();
        
        System.out.println("Ingrese otro numero");
        int b = in.nextInt();
        
        SubclaseEjemploSobreescritura sc = new SubclaseEjemploSobreescritura(a, b);
        
        System.out.println(a + " - " + b + " = " + sc.operar(a, b));
    }
    
}
