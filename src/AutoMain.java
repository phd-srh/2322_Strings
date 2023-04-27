public class AutoMain {
    public static void main(String[] args) {
        PKW opel  = new PKW(2, "Benzin", 50, 4);
        PKW vw    = new PKW(2, "Elektro", 35, 5);
        Auto audi = new PKW(2, "Diesel", 42, 3);
        //new LKW(3, "Diesel", true, 2.5);

        int   s = 170_000;
        short x = (short)s;
        System.out.println(x);

        if (audi instanceof Object) {
            System.out.println("Der Audi ist ein Object");
        }
        if (audi instanceof PKW){
            ((PKW) audi).getKofferraum();
        }
        else if (audi instanceof LKW) {
            ((LKW) audi).isAnhänger();
        }

        Garage garage = new Garage(2);
        System.out.println( garage.autoParken(opel) );
        System.out.println( garage.autoParken(vw) );
        System.out.println( garage.autoParken(audi) );
        garage.autoAusparken(opel);
        System.out.println( garage.autoParken(audi) );
    }
}
