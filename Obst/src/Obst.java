public class Obst {

    private String name;
    private String farbe;
    private double gewicht;
    private boolean reif;

    // Konstruktor
    public Obst(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getFarbe() {
        return farbe;
    }

    // Setter
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public boolean isReif() {
        return reif;
    }

    public void setReif(boolean reif) {
        this.reif = reif;
    }

    public String toString() {
        String text = "";
        text += "\nName:\t\t" + getName();
        text += "\nFarbe:\t\t" + getFarbe();
        text += "\nGewicht:\t" + getGewicht();
        text += "\nReif:\t\t" + isReif();

        return text;
    }

}
