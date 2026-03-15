import java.util.Scanner;

public class EjerciciosSesion04_1 {

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

        String autorizacion;
        System.out.println("Tienes autorización médica? Si/No");
        String confirmacion = sc.next();
        if (confirmacion.equalsIgnoreCase("sí") || confirmacion.equalsIgnoreCase("si")) {
            autorizacionMedica = true;
        } else {
            autorizacionMedica = false;
        }
        if(autorizacionMedica == true){
            autorizacion = "Si";
        }else {
            autorizacion = "No";
        }

        System.out.println("Cuantos entrenos has hecho?");
        numeroEntrenos = sc.nextInt();

        if (autorizacionMedica == true && numeroEntrenos >=3 && edad >= 16){
            participacion = "Si";
        }else {
            participacion ="No";
        }

        System.out.println("\nNombre: " + nombre + "\n" + "Edad: " + edad + "\n"
                + "Autorización Médica: " + autorizacion + "\n" + "Numero de entrenos: " + numeroEntrenos);
    }

    static String puedeParticipar (){
        return participacion;
    }

    static void clasificarEdad (){
        if (edad < 18){
            clasificacionEdad = "Menor";
        } else if (edad >= 18 && edad < 40) {
            clasificacionEdad = "Adulto";
        } else if (edad >= 40){
            clasificacionEdad = "Veterano";
        }
    }

    static void mostrarInforme(){
        System.out.println("\nINFORME");
        System.out.println("Nombre: " + nombre);
        System.out.println("Clasificación edad: " + clasificacionEdad);
        System.out.println("Puede participar: " + puedeParticipar());
    }


}
