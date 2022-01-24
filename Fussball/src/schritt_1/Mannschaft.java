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

    @Override
    public String toString() {
        return "Mannschaft{" + "name='" + name + '\'' + ", trainer=" + trainer + ", torwart=" + torwart + ", spielerListe=" + spielerListe + ", motivation=" + motivation + ", staerke=" + staerke + ", torschuss=" + torschuss + '}';
    }

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerListe) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
    }

    public int getMotivation() {
        int gesamtMotivation = 0;
        for (Spieler s : spielerListe) {
            gesamtMotivation = gesamtMotivation + s.getMotivation();
        }

        gesamtMotivation = gesamtMotivation + torwart.getMotivation();

        gesamtMotivation = gesamtMotivation / spielerListe.size();

        return gesamtMotivation;
    }

    public int getStaerke() {
        int gesamtStaerke = 0;
        for (Spieler s : spielerListe) {
            gesamtStaerke = gesamtStaerke + s.getStaerke();
        }

        gesamtStaerke = gesamtStaerke + torwart.getStaerke();

        gesamtStaerke = gesamtStaerke / spielerListe.size();

        return gesamtStaerke;
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


