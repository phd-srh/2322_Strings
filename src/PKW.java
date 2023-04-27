public class PKW extends Auto {
    private int kofferraum;
    private int sitzplätze;

    public PKW(int achsenZahl, String motor, int kofferraum, int sitzplätze) {
        super(achsenZahl, motor);
        this.kofferraum = kofferraum;
        this.sitzplätze = sitzplätze;
    }

    public int getKofferraum() {
        return kofferraum;
    }

    public void setKofferraum(int kofferraum) {
        this.kofferraum = kofferraum;
    }

    public int getSitzplätze() {
        return sitzplätze;
    }

    public void setSitzplätze(int sitzplätze) {
        this.sitzplätze = sitzplätze;
    }
}
