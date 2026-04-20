import java.util.Scanner;

public class switch_MAIN {

    static String turnoUser;
    static String diaSemana;
    static char salaUser;

    static Scanner sc = new Scanner(System.in);

    static void main() {

    leerDatos();
    elegirDiaSemana(diaSemana);
    elegirTurno(turnoUser);
    elegirSala(salaUser);

    }

    static void leerDatos(){

        System.out.println("¿Porque día prefieres empezar?");
        diaSemana = sc.nextLine();

        System.out.println("¿Qué turno prefieres? (Mañana/Tarde)");
        turnoUser = sc.nextLine();

        System.out.println("¿A que sala quieres ir? (A/B)");
        salaUser = sc.nextLine().toUpperCase().charAt(0);


    }
    static void elegirTurno (String turno){

        switch (turno.toUpperCase()){
            case "MAÑANA" -> System.out.println("Empiezas mañana a las 9am");
            case "TARDE" -> System.out.println("Empiezas mañana a las 15pm");
            default -> System.out.println("Turno no reconocido");
        }
    }

    static void elegirDiaSemana (String dia){

        switch (dia.toLowerCase()){
            case "lunes", "martes", "miercoles", "jueves", "viernes" -> System.out.println("Dia laborable: " + dia);
            case "sabado", "domingo" -> System.out.println("Dia no laborable: " + dia + ", empiezas el Lunes");
            default -> System.out.println("Dia no reconocido");
        }
    }

    static void elegirSala (char sala){

        switch (sala){
            case 'A' -> System.out.println("Has elegido la sala A");
            case 'B' -> System.out.println("Has elegido la sala B");
            default -> System.out.println("Sala no reconozida");
        }
    }

}
