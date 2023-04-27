public class Auto {
    private int achsenZahl;
    private String motor;

    public Auto(int achsenZahl, String motor) {
        this.achsenZahl = achsenZahl;
        this.motor = motor;
    }

    public int getAchsenZahl() {
        return achsenZahl;
    }

    public void setAchsenZahl(int achsenZahl) {
        this.achsenZahl = achsenZahl;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
