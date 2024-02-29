package advinaelnumero;
import java.util.Random;
import java.util.Scanner;


class hola{

    public static void main (String [] args){

        Scanner dato = new Scanner(System.in);

        Random random = new Random();

        int suerte = random.nextInt(10);

        int intentos = 0; 
        int intentosUsuario = 0;

        System.out.println("Adivina el numero del 1 al 10");

        while (intentosUsuario != suerte) {
            System.out.println("introduce tu intento");
            intentosUsuario = dato.nextInt();
            intentos ++;

            if (intentosUsuario == suerte) {
                System.out.println(suerte +"ganaste : "+intentos);
                
            }else if (intentosUsuario < suerte){
                System.out.println("el numero es mayor");
            }else{
                System.out.println("el numero es menor");
            }
            

    }
        
        
        
    }
}
