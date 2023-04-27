public class AutoMain {
    public static void main(String[] args) {
        PKW opel = new PKW(2, "Benzin", 50, 4);
        PKW vw = new PKW(2, "Elektro", 35, 5);
        PKW audi = new PKW(2, "Diesel", 42, 3);

        Garage garage = new Garage(2);
        System.out.println( garage.autoParken(opel) );
        System.out.println( garage.autoParken(vw) );
        System.out.println( garage.autoParken(audi) );
        garage.autoAusparken(opel);
        System.out.println( garage.autoParken(audi) );
    }
}
