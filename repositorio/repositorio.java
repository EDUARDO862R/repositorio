package repositorio;

import java.util.Scanner;

public class repositorio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuestionario fácil sobre manzanas");
        System.out.println("¿Te gustan las manzanas? (si/no)");
        
        String respuesta = sc.nextLine();
        
        if(respuesta.equalsIgnoreCase("si")) {
            System.out.println("¡Genial! Las manzanas son muy saludables 🍎");
        } else {
            System.out.println("Bueno, quizás prefieres otra fruta.");
        }
        
        sc.close();
    }

} g
