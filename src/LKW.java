public class LKW extends Auto {
    private boolean anhänger;
    private double ladekapazität;

    public LKW(int achsenZahl, String motor, boolean anhänger, double ladekapazität) {
        super(achsenZahl, motor);
        this.anhänger = anhänger;
        this.ladekapazität = ladekapazität;
    }

    public boolean isAnhänger() {
        return anhänger;
    }

    public void setAnhänger(boolean anhänger) {
        this.anhänger = anhänger;
    }

    public double getLadekapazität() {
        return ladekapazität;
    }

    public void setLadekapazität(double ladekapazität) {
        this.ladekapazität = ladekapazität;
    }
}
