import java.util.Scanner;

public class EjerciciosSesion0304 {

    static String nombre;
    static int edad;
    static String autorizacionMedica;
    static int numeroEntrenos;
    static String puedeParticipar;
    static String clasificacionEdad;

    static Scanner sc = new Scanner(System.in);

    static void main() {
        leerdatos();
        clasificarEdad();
        mostrarInforme();
    }


    static void leerdatos(){

        System.out.println("Dime tu nombre");
        nombre = sc.next();

        System.out.println("Dime tu edad");
        edad = sc.nextInt();

        sc.nextLine(); // limpiar buffer

        System.out.println("Tienes autorización médica? Si/No");
        String confirmacion = sc.next();
        if (confirmacion.equalsIgnoreCase("sí") || confirmacion.equalsIgnoreCase("si")) {
            autorizacionMedica = "Si";
        } else {
            autorizacionMedica = "No";
        }

        System.out.println("Cuantos entrenos has hecho?");
        numeroEntrenos = sc.nextInt();

        if (autorizacionMedica == "Si" && numeroEntrenos >=3 && edad >= 16){
            puedeParticipar = "Si";
        }else {
            puedeParticipar ="No";
        }

            System.out.println("\nNombre: " + nombre + "\n" + "Edad: " + edad + "\n"
                + "Autorización Médica: " + autorizacionMedica + "\n" + "Numero de entrenos: " + numeroEntrenos);
    }

    static String puedeParticipar (){
        return puedeParticipar;
    }

    static void clasificarEdad (){
        if (edad < 18){
            clasificacionEdad = "menor";
        } else if (edad >= 18 && edad < 40) {
            clasificacionEdad = "adulto";
        } else {
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
