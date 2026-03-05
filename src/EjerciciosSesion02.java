public class EjerciciosSesion02 {

    static void main() {
        //Ejercicio 1
        //Declara una constante llamada IVA con valor 0.21 (21%) y calcula el precio final
        //de un producto que cuesta 100€.
        final double IVA = 0.21;
        double PRODUCTO = 100.0;
        double PRECIO_FINAL= PRODUCTO * IVA + PRODUCTO;
        System.out.println("El precio con IVA es de: " + PRECIO_FINAL+ "€");

        //Ejercicio 2
        //Declara una variable de cada tipo primitivo:
        boolean booleana = true;
        byte un_byte = 100;
        short un_short = 10000;
        int un_int = 10;
        long un_long = 100000000;
        float un_float = 9.8f;
        double un_double = 5.6;
        char character = 'D';
        System.out.println(booleana + "\n" + un_byte + "\n" + un_double + "\n" + un_float + "\n" + un_int + "\n" + un_long + "\n" + un_short + "\n" + character);

        //Ejercicio 3
        //Indica el tipo de cada literal y crea una variable adecuada para cada uno:
        int var1 = 10; //primitivo
        double var2 = 10.0; //primitivo
        long var3 = 10L; //primitivo
        float var4 = 10.0f; //primitivo
        char var5 = 'A'; //primitivo
        String var6 = "Hola"; //referencia
        boolean var7 = true; //primitivo

        //Ejercicio 4
        //Escribe un programa que muestre la diferencia entre:
        int var8 = var1 / 3; // (3) Divide 2 enteros con resultado entero
        double var9 = var2 / 3; // (3)
        double var10 = var1 / 3;
        System.out.println(var8); //Resu: 3
        System.out.println(var9); //Resu 3.333333333335
        System.out.println(var10); //Resu 3.0

        //Ejercicio 5
        //Casteo explícito
        double var11 = 9.75;
        int var12 = (int) var11;
        byte var13 = (byte) var11;
        System.out.println(var11 + "\n" + var12 + "\n" + var13);
        //Perddemos la parte decimal, sin redondeo
        //Perdemos precisión e infroamción
        //En este caso, el número 9 cabe
        // perfectamente en un byte (que aguanta de -128 a 127)

        //Ejercicio 6
        //Completa eñ siguiente código
        byte a = 10;
        byte b = 20;
        byte resultado = (byte) (a + b); // error
        //Java entiende que al sumar dos numeros byte podemos quedarnos fuera de su rango (-128 a 127)
        //Por eso forzamos a que el resultado sea tipo byte

        //Ejercicio 7
        int edad = 20;
        boolean tieneCarnet = true;

        if (edad >= 18 && tieneCarnet) {
            System.out.println("Tiene carnet");
        } else{
            System.out.println("No tiene carnet");
        }

        //Ejercicio 8
        int var14 = 10;
        int var15 = 0;
        int resu;
        if (var14 != 0 && var15 != 0) {
            System.out.println(resu = var14 / var15);
        } else {
            System.out.println("No se puede realizar esta división");
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

        //Ejercicio 10
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
