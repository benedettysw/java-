package matriz;

import java.util.Scanner;

public class matrizvacia {

    public  static  void main(String [] args) {


    Scanner sc = new Scanner(System.in);

    int miguel [] [] , fila , coluna;


    System.out.println("numero de fila");
    fila = sc.nextInt();

    System.out.println("numero de fila");
    coluna = sc.nextInt();


    miguel = new int[fila][coluna];

    System.out.println("digite la dimension de la matriz ");
    for (int i = 0; i <fila; i++) {
        for (int j = 0; j <coluna; j++) {
            System.out.println("matriz ["+i+"]  ["+j+"] ");
            miguel [i] [j] = sc.nextInt();
            
        }
        
    }

    System.out.println("\n la matriz es: ");
    for (int i = 0; i <fila; i++) {
        for (int j = 0; j <coluna; j++) {
            System.out.print(miguel [i] [j]);
            
        }
        System.out.println("");
    }


    
}
}
