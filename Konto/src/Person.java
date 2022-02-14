public abstract class Person {

    public String vorname;
    public String nachname;
    public Adresse adresse;

    @Override
    public String toString() {
        return "Person" + "\nvorname: " + vorname + "\nnachname: " + nachname + "\nadresse: " + adresse;
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

}
