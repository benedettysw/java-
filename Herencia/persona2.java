package Herencia;

public class persona2  extends persona{

    private int idEstudiante;
    private float notaFinal;
    

//CONTRUSTOR
    public persona2(String nombre , String  apellido , int edad , int idEstudiante , float notaFinal){
        super(nombre, apellido, edad);
        this.idEstudiante = idEstudiante;
        this.notaFinal = notaFinal;


    }
    public void mostrardatos(){
        System.out.println("nombre: "+getNombre()+ "\nApellido: "+getApellido()+ "\nEdad: "+getEdad()+"\nCodigo: "+idEstudiante +"\nNotafinal: "+notaFinal);

    }
    
}
