public class Sesion02 {

    static void main() {

        final double NOTA_APROBADO = 5.0;
        final double IVA = 0.10;
        final double PRECIO_BASE = 500.0;
        final double DESC_FAMILIA_NUM = 0.10;

        String nombre;
        int edad;

        double nota1;
        double nota2;

        boolean familiaNumerosa;
        saludar();
        saludar("Dani", "Pernas");
        System.out.println(saludar("Dani", "Pernas", "Benito"));

    }

//Funcion sin parámetro de entrada
//Las variables de la función son independientes
    static void saludar(){
        System.out.println("Hola Pipa");
    }

//Función con parámetros de entrada, no devuelve, imprime porque tiene la acción print
    static void saludar(String nombreFuncion, String apellidoFuncion){
        System.out.println("Hola " + nombreFuncion + " " + apellidoFuncion); //Concatenación de Strings
    }
//Funcion con parámetros de entrada y devolución de variable String
    static String saludar(String nombreFuncion, String apellidoFuncion, String apellido2Funcion){
        String mensaje = "Hola " + nombreFuncion + " " + apellidoFuncion + " " + apellido2Funcion;
        return mensaje;
}



}
