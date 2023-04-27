public class Garage {
    private Auto[] stellplätze;

    public Garage(int anzahlStellplätze) {
        this.stellplätze = new Auto[ anzahlStellplätze ];
    }

    public boolean autoParken(Auto auto) {
        for (int i=0; i < stellplätze.length; i++) {
            if (stellplätze[i] == null) {
                stellplätze[i] = auto;
                return true;
            }
        }
        return false;
    }

    public boolean autoAusparken(Auto auto) {
        for (int i=0; i < stellplätze.length; i++) {
            if (stellplätze[i] == auto) {
                stellplätze[i] = null;
                return true;
            }
        }
        return false;
    }

    public Auto autoAusparken(int i) {
        if (i >= 0 && i < stellplätze.length) {
            if (stellplätze[i] != null) {
                Auto auto = stellplätze[i];
                stellplätze[i] = null;
                return auto;
            }
        }
        return null;
    }
}
