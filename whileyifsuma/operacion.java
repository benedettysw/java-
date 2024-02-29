package whileyifsuma;
import java.util.Scanner;

public class operacion {

    public static void main (String [] args){

        Scanner info = new Scanner(System.in);

        int n1 , n2 , resultado ;

        System.out.println("1-Suma\n2-Resta\n3-Multiplicacion\n4-Divicion");
        int dato=info.nextInt();


        if(dato==1){
            System.out.println("OK ingresa el primer numero a sumar");
            n1 = info.nextInt();
            System.out.println("OK ingresa el segundo numero a sumar");
            n2 = info.nextInt();

            resultado = n1 + n2;
            System.out.println("EL RESULTADO DE LA SUMA ES: "+resultado);

        }else if (dato ==2){
            System.out.println("OK ingresa el primer numero a resta");
            n1 = info.nextInt();
            System.out.println("OK ingresa el segundo numero a resta");
            n2 = info.nextInt();

            resultado = n1 - n2;
            System.out.println("EL RESULTADO DE LA RESTA ES: "+resultado);

        }else if(dato ==3){
            System.out.println("OK ingresa el primer numero a multiplicacion");
            n1 = info.nextInt();
            System.out.println("OK ingresa el segundo numero a multiplicacion");
            n2 = info.nextInt();

            resultado = n1 * n2;
            System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: "+resultado);
        }else  if(dato == 4){
            System.out.println("OK ingresa el primer numero a divicion");
            n1 = info.nextInt();
            System.out.println("OK ingresa el segundo numero a divicion");
            n2 = info.nextInt();
            resultado = n1 / n2;

            System.out.println("EL RESULTADO DE LA DIVICION ES: "+resultado);


            
        }else{
            System.out.println("NUMERO NO ENCONTRADO");
        }



        



    }
    
}
