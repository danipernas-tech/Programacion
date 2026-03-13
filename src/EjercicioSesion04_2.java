import java.util.Scanner;


public class EjercicioSesion04_2 {

    static String nombre;
    static int edad;
    static int precioBaseCurso;
    static double precioFinal;
    static double precioFinalIva;
    static boolean estudiante;
    static boolean materialAdiccional;
    static String decuentoAplicado;

    static final double iva = 0.10;
    static final double descuentoEstudiante = 0.10;
    static final double descuentoMenorEdad = 0.05;


    static Scanner sc = new Scanner(System.in);

    static void main() {
        leerdatos();
        calcularPrecioFinal();
        imprimirInforme();
    }

    static void leerdatos(){
        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();

        System.out.println("Dime tu edad");
        edad = sc.nextInt();

        System.out.println("Dime el precio base del curso");
        precioBaseCurso = sc.nextInt();

        System.out.println(("¿Eres estudiante? (Si/No)"));
        String esEstudiante = sc.next();
        if (esEstudiante.equalsIgnoreCase("Si")){
            estudiante = true;
        } else {
            estudiante = false;
        }

        System.out.println("¿Quieres material adiccional? (Si/No)");
        String quiereMaterial = sc.next();
        if (quiereMaterial.equalsIgnoreCase("Si")){
            materialAdiccional = true;
        }else {
            materialAdiccional = false;
        }

        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Precio base: " + precioBaseCurso + "€" + "\n"
                + "Estudiante:" + esEstudiante + "\n" + "Material adiccional: " + quiereMaterial);
    }


    static double calcularPrecioFinal(){
         double descuentoTotal;
         double preciomaterial;
         double precioDescuentoEstudiante;
         double precioDescuentoEdad;

        if(estudiante == true){
             precioDescuentoEstudiante = (double) (precioBaseCurso * descuentoEstudiante);
        }else {
            precioDescuentoEstudiante = 0;
        }
        if (edad < 18){
            precioDescuentoEdad = (double) (precioBaseCurso * descuentoMenorEdad);
        }
        else {
            precioDescuentoEdad = 0;
        }
        descuentoTotal = (int) (precioDescuentoEstudiante + precioDescuentoEdad);
        if(materialAdiccional == true){
            preciomaterial = 20;
        }else{
            preciomaterial = 0;
        }
        if (precioDescuentoEstudiante == 0 && precioDescuentoEdad == 0){
            decuentoAplicado = "0%";
        } else if (precioDescuentoEstudiante > 0 && precioDescuentoEdad == 0) {
            decuentoAplicado = "10%";
        } else if (precioDescuentoEstudiante > 0 && precioDescuentoEdad > 0) {
            decuentoAplicado = "15%";
        }

        precioFinal = ((precioBaseCurso - descuentoTotal) + preciomaterial) ;
        precioFinalIva = (int) (precioFinal + (precioFinal * iva));
        return precioFinalIva;
    }

    static void imprimirInforme() {
        System.out.println("\nINFORME:" + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Descuento aplicado: " + decuentoAplicado
                + "\n" + "Precio final: " + precioFinalIva + "€");
    }

}
