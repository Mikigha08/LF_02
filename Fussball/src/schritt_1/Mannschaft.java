package schritt_1;

import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;
    private int gesamtMotivation = 0;
    private int gesamtStaerke = 0;


    @Override
    public String toString() {
        return "\n\nTrainer: " + getTrainer() + "\n\n===================" + "\n\nTorwart: " + getTorwart() + "\n\n===================" + "\n\nHeim-Motivation: " + getGesamtHeimMotivation() + "\n\nHeim-Stärke: " + getGesamtHeimStaerke() + "\n\nGast-Motivation: " + getGesamtGastMotivation() + "\n\nGast-Stärke: " + getGesamtGastStaerke() + "\n\n===================";
    }

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerListe) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerListe = spielerListe;
    }

    public int getGesamtHeimMotivation() {
        int gesamtHeimMotivation = 0;
        for (Spieler s : spielerListe) {
            gesamtHeimMotivation = gesamtHeimMotivation + s.getMotivation();
        }

        gesamtHeimMotivation = gesamtHeimMotivation + torwart.getMotivation();

        gesamtHeimMotivation = gesamtHeimMotivation / spielerListe.size();

        return gesamtHeimMotivation;
    }

    public int getGesamtHeimStaerke() {
        int gesamtHeimStaerke = 0;
        for (Spieler s : spielerListe) {
            gesamtHeimStaerke = gesamtHeimStaerke + s.getStaerke();
        }

        gesamtHeimStaerke = gesamtHeimStaerke + torwart.getStaerke();

        gesamtHeimStaerke = gesamtHeimStaerke / spielerListe.size();

        return gesamtHeimStaerke;
    }

    public int getGesamtGastMotivation() {
        int gesamtGastMotivation = 0;
        for (Spieler s : spielerListe) {
            gesamtGastMotivation = gesamtGastMotivation + s.getMotivation();
        }

        gesamtGastMotivation = gesamtGastMotivation + torwart.getMotivation();

        gesamtGastMotivation = gesamtGastMotivation / spielerListe.size();

        return gesamtGastMotivation;
    }

    public int getGesamtGastStaerke() {
        int gesamtGastStaerke = 0;
        for (Spieler s : spielerListe) {
            gesamtGastStaerke = gesamtGastStaerke + s.getStaerke();
        }

        gesamtGastStaerke = gesamtGastStaerke + torwart.getStaerke();

        gesamtGastStaerke = gesamtGastStaerke / spielerListe.size();

        return gesamtGastStaerke;
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


