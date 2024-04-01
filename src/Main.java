import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //ARRAYS DE CADA TIPO DE DATO Y MOSTRADO EN CONSOLA

        byte[] byteArray = new byte[5];
        byteArray[0] = 1;
        byteArray[1] = 2;
        byteArray[2] = 3;
        byteArray[3] = 4;
        byteArray[4] = 5;

        char[] charArray = new char[5];
        charArray[0] = 'a';
        charArray[1] = 'b';
        charArray[2] = 'c';
        charArray[3] = 'd';
        charArray[4] = 'e';

        Character[] characterArray = new Character[5];
        characterArray[0] = 'A';
        characterArray[1] = 'B';
        characterArray[2] = 'C';
        characterArray[3] = 'D';
        characterArray[4] = 'E';

        short[] shortArray = new short[5];
        shortArray[0] = 1;
        shortArray[1] = 2;
        shortArray[2] = 3;
        shortArray[3] = 4;
        shortArray[4] = 5;

        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        Integer[] integerArray = new Integer[5];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        integerArray[3] = 4;
        integerArray[4] = 5;

        long[] longArray = new long[5];
        longArray[0] = 1L;
        longArray[1] = 2L;
        longArray[2] = 3L;
        longArray[3] = 4L;
        longArray[4] = 5L;

        Long[] LongArray = new Long[5];
        LongArray[0] = 1L;
        LongArray[1] = 2L;
        LongArray[2] = 3L;
        LongArray[3] = 4L;
        LongArray[4] = 5L;

        float[] floatArray = new float[5];
        floatArray[0] = 1.1f;
        floatArray[1] = 2.2f;
        floatArray[2] = 3.3f;
        floatArray[3] = 4.4f;
        floatArray[4] = 5.5f;

        Float[] FloatArray = new Float[5];
        FloatArray[0] = 1.1f;
        FloatArray[1] = 2.2f;
        FloatArray[2] = 3.3f;
        FloatArray[3] = 4.4f;
        FloatArray[4] = 5.5f;

        double[] doubleArray = new double[5];
        doubleArray[0] = 1.1;
        doubleArray[1] = 2.2;
        doubleArray[2] = 3.3;
        doubleArray[3] = 4.4;
        doubleArray[4] = 5.5;

        Double[] DoubleArray = new Double[5];
        DoubleArray[0] = 1.1;
        DoubleArray[1] = 2.2;
        DoubleArray[2] = 3.3;
        DoubleArray[3] = 4.4;
        DoubleArray[4] = 5.5;

        Object[] ObjectArray = new Object[5];
        ObjectArray[0] = "Object";
        ObjectArray[1] = 'F';
        ObjectArray[2] = 10;
        ObjectArray[3] = 2.5;
        ObjectArray[4] = false;

        String[] StringArray = new String[5];
        StringArray[0] = "Uno";
        StringArray[1] = "Dos";
        StringArray[2] = "Tres";
        StringArray[3] = "Cuatro";
        StringArray[4] = "Cinco";



       System.out.print("byteArray: ");
     for (byte element : byteArray) {
          System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("charArray: ");
        for (char element : charArray) {
            System.out.print(element + " ");
      }
        System.out.println();

        System.out.print("characterArray: ");
        for (char element : characterArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("shortArray: ");
        for (short element : shortArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("intArray: ");
        for (int element : intArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("integerArray: ");
        for (int element : integerArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("longArray: ");
        for (long element : longArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("LongArray: ");
        for (long element : LongArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("floatArray: ");
        for (float element : floatArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("FloatArray: ");
        for (float element : FloatArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("doubleArray: ");
        for (double element : doubleArray) {
          System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("DoubleArray: ");
        for (double element : DoubleArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("ObjectArray: ");
        for (Object element : ObjectArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("StringArray: ");
        for (String element : StringArray) {
            System.out.print(element + " ");
        }
        System.out.println("");



        Random random = new Random();
        int total = 0;
        int Size = random.nextInt(100);

       //Llenar el Array de Valores Aleatorios
        Integer [] ArrayVentas = new Integer[Size];
        for (int i = 0; i < ArrayVentas.length; i++) {
                ArrayVentas[i] = random.nextInt(1000)+1;
        }


        System.out.println("-------------CANTIDAD,VALOR,TOTAL Y PROMEDIO DE VENTAS----------------------");
        System.out.println("Cantidad de Ventas: " + ArrayVentas.length);
        for(int j : ArrayVentas){
            System.out.println("Venta: "+ j);
            total+=j;
        }

        System.out.println("Ingresos totales: "+ total );
        System.out.println("Promedio de Ventas: "+ (total/ArrayVentas.length));

        System.out.println("----------------------------------------------------------");

        Ventas ventas = new Ventas();
        ventas.showInfoVentas(ArrayVentas);
        ventas.orderVentas(ArrayVentas);

        System.out.println("----------------------------------------------------------");



        Matriz matriz = new Matriz();
        Object[][] lenguajes= new Object[5][8];
        lenguajes[0][0]="Nombre";
        lenguajes[0][1]="Año";
        lenguajes[0][2]="Autor";
        lenguajes[0][3]="Detalles";
        lenguajes[0][4]="Frameworks";

        matriz.infoOfLenguajes(lenguajes);
        System.out.println(matriz.LenguajeExist(lenguajes,"C"));
        matriz.CoordenadasOfLenguaje(lenguajes,"C");
        matriz.getInfoAtFila(lenguajes,2);
        matriz.getInfoAtColumna(lenguajes,3);
        matriz.getInfoAtColAndFila(lenguajes,2,3);

        boolean[] booleans = new boolean[5];
        booleans[0]=true;
        booleans[1]=true;
        booleans[2]=true;
        booleans[3]=true;
        booleans[4]=false;

        matriz.showLenguajesBoolean(lenguajes,booleans);

        }

}














