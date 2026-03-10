public class Personal {

    static final double IVA = 0.21;

    static void main() {

        double PRODUCTO = 100;
        double PRECIO_IVA = PRODUCTO * IVA;
        double PRECIO_FINAL = PRODUCTO + PRECIO_IVA;
        System.out.println("EL precio final es: " + PRECIO_FINAL + "€");

        boolean var1 = true;
        byte var2 = 50;
        short var3 = 100;
        int var4 = 150;
        long var5 = 200;
        float var6 = 10.9f;
        double var7 = 9.99;
        char var8 = 'A';
        System.out.println(var1 + "\n" + var2 + "\n" + var3 + "\n" + var4 + "\n" + var5 + "\n" + var6 + "\n" + var7 + "\n" + var8);

        int var9 = 10;
        double var10 = 10.0;
        long var11 = 10L;
        float var12 = 10.0f;
        char var13 = 'A';
        String var14 = "Hola"; //Referencia
        boolean var15 = true;

        int var16 = 10;
        int var17 = 3;
        double var18 = 10.0;
        int entera = var16 / var17;
        double decimal = var18 / var17;
        double decimal2 = var16 / var17;
        System.out.println(entera);
        System.out.println(decimal);
        System.out.println(decimal2);

        double numero = 9.75;
        int numero2 = (int)numero;
        byte numero3 = (byte)numero;
        System.out.println(numero2);
        System.out.println(numero3);

        byte a = 10;
        byte b = 20;
        int resultado = (byte) a + b;

        int edad = 20;
        boolean tieneCarnet = true;
        if (edad >= 18 && tieneCarnet) {
            System.out.println("Puede conducir");
        }
        else{
            System.out.println("No puede cnducir");
        }

        int n = 10;
        int d = 0;
        if (d != 0 && (n % d ==0)){
            System.out.println("Se puede dividir");
        } else {
            System.out.println("No se puede dividir");
        }

        int n1 = 10;
        int n2 = n1;
        b = 20;

    }





}
