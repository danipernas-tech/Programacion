import java.util.Scanner;

public class ProyectoSesion02 {

    // Declarar variable constante final, no cambia el valor despues de asignarse
    // Ejemplo, nota para aprobar: 5
    static final double NOTA_APROBADO = 5.0;
    static final double IVA = 0.10;
    static final double PRECIO_BASE = 500.0;
    static final double DESC_FAMILIA_IVA = 0.10;

    // Variables, puede cambiar, mezcla num y letras, pero no es un número, si no un identificador
    static String nombre;

    // Varieble int, entero
    static int edad;

    // Variable Double
    static double nota1;
    static double nota2;

    // Variable Boolean, hacen evaluaciones, true o false, 1 y 0
    static boolean FamiliaNumerosa;

    //Declarar y crear objeto, ya que es parte generada po clase nativa de Java
    static Scanner sc = new Scanner(System.in);


    static void main() {
     // Funciones: Recibe parámetros de entrada, donde suceden ciertas acciones definidas
            saludar();
            saludar("Dani");
            System.out.println(saludar("Dani", "Pernas"));
            leerdatos();
            //System.out.println(nombre);
            ///System.out.println(saludar(nombre, "Pernas"));
            saludar(nombre);

    }

    //Vamos a pedir al user nombre, edad y notas
    static void leerdatos(){
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        //Clase nativa


    }

    // Funcion sin entrada
    static void saludar(){
        System.out.println("Hola");
    }

    // Misma funcion con Parametro de entrada
    static void saludar(String NombreFuncion){
        System.out.println("Hola " + NombreFuncion); //Concatenación de string
    }

    // Misma funcion con Parametro de entrada
    static String saludar(String NombreFuncion, String ApellidoFuncion){
        String mensaje = "Hola " + NombreFuncion + " " + ApellidoFuncion; //Lo pasamos a variable
        //Devolver String con la palabra reservada return
        return mensaje;
    }

    //f = formateo


}

