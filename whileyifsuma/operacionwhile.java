package whileyifsuma;

import java.util.Scanner;

public class operacionwhile {

    public static void main (String [] args){

        Scanner info = new Scanner(System.in);

        int dato , n1 , n2 , resultado;

        do{
          
        System.out.println("1-Suma\n2-Resta\n3-Salir");
        dato = info.nextInt();

        switch (dato) {
            case 1:
                System.out.println("OK ingresa el primer numero a sumar");
                n1 = info.nextInt();
                System.out.println("OK ingresa el segundo numero a sumar");
                n2 = info.nextInt();

                resultado = n1 + n2;
                System.out.println("EL RESULTADO DE LA SUMA ES: "+resultado);
                break;

            case 2:
                System.out.println("OK ingresa el primer numero a sumar");
                n1 = info.nextInt();
                System.out.println("OK ingresa el segundo numero a sumar");
                n2 = info.nextInt();

                resultado = n1 - n2;
                System.out.println("EL RESULTADO DE LA SUMA ES: "+resultado);
        
            default:
                System.out.println("ok bye!");
                break;
        }

        }while (dato !=3);
    }
}