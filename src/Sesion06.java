import java.util.Scanner;

public class Sesion06 {
}


static Scanner sc = new Scanner(System.in);

void main() {
    System.out.print("Dime A o B:");
    String opcionS = sc.next();
    char opcion = opcionS.toUpperCase().charAt(0);
    mostarOpcionChar(opcion);

    System.out.print("Dime turno: (mañana/tarde)");
    String turno = sc.nextLine();
    mostrarTurno(turno);

    System.out.println(obtenerCalificacion(7));


}
static void mostarOpcionChar (char opcion){

    switch (opcion) {

        case 'A':
            System.out.println("Has elegido Alta");
            break;
        case 'B':
            System.out.println("Has elegido Baja");
            break;
        default:
            System.out.println("Opción no válida");

    }

}

static void mostrarTurno (String turno){

    switch (turno.toLowerCase()){
        case "mañana" -> System.out.println("Turno de mañana");
        case "tarde" -> System.out.println("Turno de tarde");
        default -> System.out.println("Turno no reconocido");
    }
}
static void mostrarDiaSemanaNuevo (int dia){

    switch (dia) {

        case 1 -> {
            System.out.println("Lunes");
            System.out.println("Hola");
        }
        case 2 -> System.out.println("Martes");
        default -> System.out.println("Opción incorrecta");


    }

}

static String obtenerCalificacion(int nota){

    return switch (nota){
        case 10, 9 -> "Sobresaliente";
        case 8, 7 -> {
            System.out.println("Nota buena");
            yield "Notable";
        }
        case 6, 5 -> "Aprobado";
        default -> "Suspenso";
    };
}