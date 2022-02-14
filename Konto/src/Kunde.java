public class Kunde extends Person{

    Mitarbeiter betreuer;

    @Override
    public String toString() {
        return super.toString() + "Kunde: " + "\nbetreuer: " + betreuer;
    }

    public Kunde(Mitarbeiter betreuer, String vorname, String nachname) {
        super(vorname, nachname);
        this.betreuer = betreuer;
    }

    public Mitarbeiter getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(Mitarbeiter betreuer) {
        this.betreuer = betreuer;
    }
}
