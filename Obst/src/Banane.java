public class Banane extends Obst {

    private double kruemmung;

    public Banane() {
        super("Banane");
    }

    public String toString() {
        return super.toString() + "\nKruemmung:\t" + getKruemmung();
    }

    public double getKruemmung() {
        return kruemmung;
    }

    public void setKruemmung(double kruemmung) {
        this.kruemmung = kruemmung;
    }

}
