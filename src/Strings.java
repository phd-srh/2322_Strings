public class Strings {

    public static String array2stringMoreFast(int[] array) {
        StringBuilder ausgabe = new StringBuilder();
        for (int i=0; i < array.length; i++) {
            if (i > 0)
                ausgabe.append(",");
            ausgabe.append(array[i]);
        }
        return ausgabe.toString();
    }

    public static String array2stringFast(int[] array) {
        StringBuffer ausgabe = new StringBuffer();
        for (int i=0; i < array.length; i++) {
            if (i > 0)
                ausgabe.append(",");
            ausgabe.append(array[i]);
        }
        return ausgabe.toString();
    }

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
        int[] array = new int[100000];

        // Array mit Zufallszahlen initialisieren
        for (int i=0; i < array.length; i++ ) {
            array[i] = (int)(Math.random() * 100);
        }

        long laufzeit = System.nanoTime();
        array2string(array);
        laufzeit = System.nanoTime() - laufzeit;
        System.out.println(laufzeit/1000 + "µs");

        laufzeit = System.nanoTime();
        array2stringFast(array);
        laufzeit = System.nanoTime() - laufzeit;
        System.out.println(laufzeit/1000 + "µs");

        laufzeit = System.nanoTime();
        array2stringMoreFast(array);
        laufzeit = System.nanoTime() - laufzeit;
        System.out.println(laufzeit/1000 + "µs");

        String string = "Hallo Text";
    }

}
