package schritt_1;

import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;

    @Override
    public String toString() {
        return "\n\nTrainer: " + getTrainer() + "\n\n===================" + "\n\nTorwart: " + getTorwart() + "\n\n===================" + "\n\nHeim-Motivation: " + getGesamtMotivation() + "\n\nHeim-Stärke: " + getGesamtStaerke() + "\n\nGast-Motivation: " + getGesamtMotivation() + "\n\nGast-Stärke: " + getGesamtStaerke() + "\n\n===================";
    }

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerListe) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerListe = spielerListe;
    }

    public int getGesamtMotivation() {
        int gesamtMotivation = 0;
        for (Spieler s : spielerListe) {
            gesamtMotivation = gesamtMotivation + s.getMotivation();
        }

        gesamtMotivation = gesamtMotivation + torwart.getMotivation();

        gesamtMotivation = gesamtMotivation / spielerListe.size();

        return gesamtMotivation;
    }

    public int getGesamtStaerke() {
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


