package schritt_1;

public class Spieler extends Person {

    private String name;
    private int alter;
    private int staerke;
    private int torschuss;
    private int motivation;
    private int tore;

    public Spieler(String name, int alter, int staerke, int torschuss, int motivation, int tore) {

    super(name, alter);
    this.staerke = staerke;
    this.torschuss = torschuss;
    this.motivation = motivation;
    this.tore = tore;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStärke: " + getStaerke() + "\nTorschuss: " + getTorschuss() + "\nMotivation: " + getMotivation() + "\nTore: " + getTore();
    }

    public int getStaerke() {
        return staerke;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public int getMotivation() {
        return motivation;
    }

    public int getTore() {
        return tore;
    }


    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }







}
