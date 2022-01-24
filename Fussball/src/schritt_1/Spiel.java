package schritt_1;

public class Spiel {

    public Mannschaft heim;

    public Mannschaft gast;

    public Ergebnis ergebnis;

    public StringBuilder spielverlauf;

    public Spiel (Mannschaft heim, Mannschaft gast, Ergebnis ergebnis) {
        this.heim = heim;
        this.gast = gast;
        this.ergebnis = ergebnis;
    }

    @Override
    public String toString() {
        return "Spiel: " + "\nheim: " + getHeim() + "\ngast: " + getGast() + "\nergebnis: " + getErgebnis() + "\nspielverlauf: " + getSpielverlauf();
    }

    public Mannschaft getHeim() {
        return heim;
    }

    public Mannschaft getGast() {
        return gast;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielverlauf() {
        return spielverlauf;
    }


}
