public class Main {

    private static void irgendEineMethode(Wasauchimmer wasauchimmer) {
        // mache was auch immer mit wasauchimmer
        wasauchimmer.machWas();
    }

    public static void main(String[] args) {
        Wasauchimmer wasauchimmer = new Wasauchimmer("he?", 42);
        irgendEineMethode(wasauchimmer);
    }
}
