package schritt_1;

public class Ergebnis {

    private int toreHeim;
    private int toreGast;

    @Override
    public String toString() {
        return "\nTore der Heim Mannschaft: " + getToreHeim() + "\nTore der Gast Mannschaft: " + getToreGast();
    }

    public int getToreHeim() {
        return toreHeim;
    }

    public void ToreHeim() {
        toreHeim++;
    }

    public int getToreGast() {
        return toreGast;
    }

    public void ToreGast() {
        toreGast++;
    }
}
