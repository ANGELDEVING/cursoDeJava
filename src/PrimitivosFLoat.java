public class PrimitivosFLoat {
    public static void main(String[] args) {
        float realFloat = 1.5e4f;//2.12e3f notacion cientifica;//2120f;// notacion cientifica
        float realFloat2 = 1.5e-10f; // notacion cientifica recorrer hacia la izquierda;
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat = " + realFloat2);
        System.out.println(" tipo dato" + Float.MAX_VALUE);
        //constantes
        System.out.println("realFloat = " + realFloat);
        System.out.println("Flotante corresponde en byte a =\n" + Float.BYTES);
        System.out.println("Flotante corresponde a bites a = \n" + Float.SIZE);
        System.out.println("Maximo valor para float = \n" + Float.MAX_VALUE);
        System.out.println("Minimo valor para float = \n" + Float.MIN_VALUE);
        //tipo doble
        double realDouble = 3;
        System.out.println("real Double = " + realDouble);
        System.out.println("Double corresponde en byte a =\n" + Double.BYTES);
        System.out.println("Double corresponde a bites a = \n" + Double.SIZE);
        System.out.println("Maximo valor para double = \n" + Double.MAX_VALUE);
        System.out.println("Minimo valor para double = \n" + Double.MIN_VALUE);


    }
}
