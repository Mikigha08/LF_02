package schritt_1;

public class Gameplay {

    private int mannschaftswert;


    public static void doThis() {

    }

  //public class Programm {

  //    public static void main() {

  //        Gameplay.doThis();

  //    }


  //}


    private static int ermittelMannschaftsWert(Mannschaft m) {
        int mannschaftswert = Math.max(m.getGesamtMotivation() * m.getGesamtStaerke() * m.getTrainer().getErfahrung(), 1);
        return mannschaftswert;
    }

    public static void spielen(Spiel spiel) {
        //...
            int mannschaftswertGast = ermittelMannschaftsWert(spiel.gast);
            int mannschaftswertHeim = ermittelMannschaftsWert(spiel.heim);
        //...
    }








}