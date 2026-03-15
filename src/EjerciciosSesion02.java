public class EjerciciosSesion02 {


    static final double IVA = 0.21;
    static final int producto = 100;

    static void main() {

        System.out.println("Precio con IVA: " + ejercicio01() + "€");
        ejercicio02();
        ejercicio04();
        ejercicio05();
        ejercicio06();
        ejercicio07();
        ejercicio08();
        ejercicio10();
    }

    static double ejercicio01(){
        double precioFinal = producto + (producto * IVA);
        return precioFinal;
    }

    static void ejercicio02(){
        /// Primitivos
        boolean booleanVar = true;
        byte byteVar = 127;
        short shortVar = 10000;
        int intVar = 50;
        long longVar = 5000000;
        float floatVar = 2.5f;
        double doubleVar = 88.8;
        char charVar = 'A';
        System.out.println(booleanVar + "\n" + byteVar + "\n" + shortVar + "\n" + intVar + "\n" + longVar + "\n" + floatVar + "\n" + doubleVar + "\n" + charVar);
    }

    static void ejercicio03(){
        int var01 = 10;
        double var02 = 10.0;
        long var03 = 10L;
        float var04 = 10.0F;
        char var05 = 'A';
        String var06 = "Hola"; ///Es referencia, guarda una ruta de memoria
        boolean var07 = true;
    }

    static void ejercicio04(){
        // División entera
        int resultado1 = 10 /3; //Division entero por entero, se guarda en una variable de entero, no se opera ni se muestra con deimales
        // División decimal
        double resultado2 = 10.0/3; //División decimal con numero entero, Java pasa el int 3 a 3.0 internamente para la operacion y guardar decimal en el resultado
        // División forzada o casteo
        double resultado3 = (double) 10/3; //(double) tiene prioridad en la operación, convierte el 10 y 3 a 10.0 y 3.0, lo cual el resu es double
        System.out.println(resultado1 + "\n" + resultado2 + "\n" + resultado3);
    }

    static void ejercicio05(){
        double numero = 9.75;
        int numero2 = (int) numero;
        byte numero3 = (byte)numero;
        System.out.println(numero + "\n" + numero2 + "\n" + numero3);
    }
    static void ejercicio06(){
        byte a = 10;
        byte b = 20;
        byte resultado = (byte) (a + b);
        System.out.println(resultado);
        //a + b se promociona automaticamente a int
    }

    static void ejercicio07(){
        int edad = 20;
        boolean tieneCarnet = true;
        if (edad >= 18 && tieneCarnet){
            System.out.println("Puede conducir");
        }else{
            System.out.println("No puede conducir");
        }
    }

    static void ejercicio08(){
        int numero = 8;
        int divisor = 3;
        if (divisor != 0 && (numero%divisor==0)){
            System.out.println(divisor + " es divisor de " + numero);
        } else if (divisor==0) {
            System.out.println("No se puede dividir entre 0");
        }else {
            System.out.println("Se puede dividir pero, " + divisor + " no es divisor de " + numero);
        }
    }

    //Ejercicio 9
        /*
        int x = 10;
        if (x == 10) {
        int y = 20;
        }
        System.out.println(y);
         */
    //La variable y vive en la condición lo cual no puede ser llamada fuera de ella

    static void ejercicio10(){
        //Primitivo: guardan valor real

        int varA = 10;
        int varB = varA;
        varB = 20;
        System.out.println(varA); //varB cambia su valor a 20, pero varA mantiene el suyo

        //Referencia: guardan dirección de memoria
        String s1 = "Hola";
        String s2 = s1;
        s2 = "Adiós";
        System.out.println(s1); //s2 apunta a "Adiós" pero s1 sigue apuntando a "Hola"
    }
}
