public class Strings {

    public static String array2string(int[] array) {
        String ausgabe = "";
        for (int i=0; i < array.length; i++) {
            if (i > 0)
                ausgabe = ausgabe + ",";
            ausgabe = ausgabe + array[i];
//            if (i < array.length-1)
//                ausgabe = ausgabe + ",";
        }
        return ausgabe;
    }

    public static void main(String[] args) {
        int[] array = new int[1000];

        // Array mit Zufallszahlen initialisieren
        for (int i=0; i < array.length; i++ ) {
            array[i] = (int)(Math.random() * 100);
        }

        System.out.println( array2string(array) );
    }

}
