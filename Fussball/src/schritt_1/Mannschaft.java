package schritt_1;


import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;
    private int motivation = 0;
    private int staerke = 0;
    private int torschuss = 0;

    public Mannschaft(String name, Trainer trainer, Torwart torwart) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
    }


    public int getMotivation() {
        double ergebnis = 0;
        for (Spieler s : spielerListe) {
            ergebnis = ergebnis + s.getMotivation();
        }

        ergebnis = ergebnis + torwart.getMotivation();

        ergebnis = ergebnis / spielerListe.size();

        return (int) ergebnis;
    }









    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }
}
