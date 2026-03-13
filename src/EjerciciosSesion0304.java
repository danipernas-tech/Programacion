import java.util.Scanner;

public class EjerciciosSesion0304 {

    static String nombre;
    static int edad;
    static boolean autorizacionMedica;
    static int numeroEntrenos;
    static String participacion;
    static String clasificacionEdad;

    static Scanner sc = new Scanner(System.in);

    static void main() {
        leerdatos();
        clasificarEdad();
        mostrarInforme();
    }


    static void leerdatos(){

        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();

        System.out.println("Dime tu edad");
        edad = sc.nextInt();

        sc.nextLine(); // limpiar buffer

        System.out.println("Tienes autorización médica? Si/No");
        String confirmacion = sc.next();
        if (confirmacion.equalsIgnoreCase("sí") || confirmacion.equalsIgnoreCase("si")) {
            autorizacionMedica = true;
        } else {
            autorizacionMedica = false;
        }

        System.out.println("Cuantos entrenos has hecho?");
        numeroEntrenos = sc.nextInt();

        if (autorizacionMedica == true && numeroEntrenos >=3 && edad >= 16){
            participacion = "Si";
        }else {
            participacion ="No";
        }

        System.out.println("\nNombre: " + nombre + "\n" + "Edad: " + edad + "\n"
                + "Autorización Médica: " + autorizacionMedica + "\n" + "Numero de entrenos: " + numeroEntrenos);
    }

    static String puedeParticipar (){
        return participacion;
    }

    static void clasificarEdad (){
        if (edad < 18){
            clasificacionEdad = "menor";
        } else if (edad >= 18 && edad < 40) {
            clasificacionEdad = "adulto";
        } else if (edad >= 40){
            clasificacionEdad = "veterano";
        }
    }

    static void mostrarInforme(){
        System.out.println("\nINFORME");
        System.out.println("Nombre: " + nombre);
        System.out.println("Clasificación edad: " + clasificacionEdad);
        System.out.println("Puede participar: " + puedeParticipar());
    }


}
