package schritt_1;

import schritt_1.Spieler;

public class Torwart extends Spieler {

    private int reaktion;

    public Torwart(String name, int alter, int staerke, int motivation,int reaktion) {

        super(name, alter, staerke, 0, motivation, 0);
        this.reaktion = reaktion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nReaktion: " + reaktion;
    }

    public int getReaktion() {
        return reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }

}


