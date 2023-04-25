import java.math.BigDecimal;

public class PersonenMain {
    private static Object[] speicher = new Object[500];
    private static int aktuellesObjekt = 0;

    public static void println(Object o) {
        System.out.println("in meiner Methode println!");
        System.out.println(o.toString());
    }

    public static void akzeptiereAlleObjekte(Object o) {
        System.out.print("erhalte: " + o.getClass().getName());
        System.out.println(" mit Wert " + o);
        speicher[aktuellesObjekt++] = o;
    }

    public static void main(String[] args) {
        Person meyer = new Person("Meyer", 1990);
        Person schmidt = new Person("Schmidt", 1980);
        Person unbekannt = new Person("Meyer", 1990);
        int x = 17;
        Integer i = 13;

//        System.out.println(meyer.getName() + ", geb. " + meyer.getGeburtsjahr());
        println( meyer );
        println( schmidt );

        System.out.println( meyer.equals(meyer) );
        akzeptiereAlleObjekte(meyer);
        akzeptiereAlleObjekte("Hallo");
        akzeptiereAlleObjekte( new BigDecimal("0") );
        akzeptiereAlleObjekte( x );
        akzeptiereAlleObjekte( 3.1415 );
        System.out.println( Integer.toString(x) );
        System.out.println( x + i );
        System.out.println( i.getClass().getName() +
                ", Object?: " + (i instanceof Object) );
    }
}
