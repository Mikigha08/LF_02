package schritt_1;

import java.util.ArrayList;

public class Programm{



    public static void main(String[] args) {

        System.out.println("===================");
        System.out.println("| Heim Mannschaft |");
        System.out.println("===================");

        System.out.print("Heim Trainer: ");

        Trainer heimTrainer = new Trainer("Gerret",46,7);

        System.out.println(heimTrainer);

        System.out.println("===================");

        System.out.print("Heim Torwart");

        Torwart heimTorwart = new Torwart("Manuel",23,9,2,10);

        System.out.println(heimTorwart);

        System.out.println("===================");
        System.out.print("Heim Spieler1: ");

        Spieler heimSpieler1 = new Spieler("Harald",21,8,7,9,23 );

        System.out.println(heimSpieler1);

        System.out.println();
        System.out.print("Heim Spieler2: ");

        Spieler heimSpieler2 = new Spieler("Marvin",25,7,7,7,10 );

        System.out.println(heimSpieler2);

        System.out.println();
        System.out.print("Heim Spieler3: ");

        Spieler heimSpieler3 = new Spieler("Marlon",27,6,5,6,13 );

        System.out.println(heimSpieler3);

        System.out.println();
        System.out.print("Heim Spieler4: ");

        Spieler heimSpieler4 = new Spieler("Alan",23,7,10,8,16 );

        System.out.println(heimSpieler4);

        System.out.println();
        System.out.print("Heim Spieler5: ");

        Spieler heimSpieler5 = new Spieler("Elias",25,8,7,9,11 );

        System.out.println(heimSpieler5);

        System.out.println();
        System.out.print("Heim Spieler6: ");

        Spieler heimSpieler6 = new Spieler("Joni",25,5,8,7,10 );

        System.out.println(heimSpieler6);

        System.out.println();
        System.out.print("Heim Spieler7: ");

        Spieler heimSpieler7 = new Spieler("Berkay",22,8,6,8,8 );

        System.out.println(heimSpieler7);

        System.out.println();
        System.out.print("Heim Spieler8: ");

        Spieler heimSpieler8 = new Spieler("Noah",27,8,9,5,18 );

        System.out.println(heimSpieler8);

        System.out.println();
        System.out.print("Heim Spieler9: ");

        Spieler heimSpieler9 = new Spieler("Lukas",26,5,7,8,14 );

        System.out.println(heimSpieler9);

        System.out.println();
        System.out.print("Heim Spieler10: ");

        Spieler heimSpieler10 = new Spieler("Mike",21,10,10,9,20 );

        System.out.println(heimSpieler10);

        System.out.println("===================");
        System.out.println();


        System.out.println("===================");
        System.out.println("| Gast Mannschaft |");
        System.out.println("===================");

        System.out.print("Gast Trainer1: ");

        Trainer gastTrainer = new Trainer("Gerret",46,7);

        System.out.println(gastTrainer);

        System.out.println("===================");

        System.out.print("Gast Torwart");

        Torwart gastTorwart = new Torwart("Manuel",23,9,2,10);

        System.out.println(gastTorwart);

        System.out.println("===================");
        System.out.print("Gast Spieler1: ");

        Spieler gastSpieler1 = new Spieler("Harald",21,8,7,9,23 );

        System.out.println(gastSpieler1);

        System.out.println();
        System.out.print("Gast Spieler2: ");

        Spieler gastSpieler2 = new Spieler("Marvin",25,7,7,7,10 );

        System.out.println(gastSpieler2);

        System.out.println();
        System.out.print("Gast Spieler3: ");

        Spieler gastSpieler3 = new Spieler("Marlon",27,6,5,6,13 );

        System.out.println(gastSpieler3);

        System.out.println();
        System.out.print("Gast Spieler4: ");

        Spieler gastSpieler4 = new Spieler("Alan",23,7,10,8,16 );

        System.out.println(gastSpieler4);

        System.out.println();
        System.out.print("Gast Spieler5: ");

        Spieler gastSpieler5 = new Spieler("Elias",25,8,7,9,11 );

        System.out.println(gastSpieler5);

        System.out.println();
        System.out.print("Gast Spieler6: ");

        Spieler gastSpieler6 = new Spieler("Joni",25,5,8,7,10 );

        System.out.println(gastSpieler6);

        System.out.println();
        System.out.print("Gast Spieler7: ");

        Spieler gastSpieler7 = new Spieler("Berkay",22,8,6,8,8 );

        System.out.println(gastSpieler7);

        System.out.println();
        System.out.print("Gast Spieler8: ");

        Spieler gastSpieler8 = new Spieler("Noah",27,8,9,5,18 );

        System.out.println(gastSpieler8);

        System.out.println();
        System.out.print("Gast Spieler9: ");

        Spieler gastSpieler9 = new Spieler("Lukas",26,5,7,8,14 );

        System.out.println(gastSpieler9);

        System.out.println();
        System.out.print("Gast Spieler10: ");

        Spieler gastSpieler10 = new Spieler("Mike",21,10,10,9,20 );

        System.out.println(gastSpieler10);

        System.out.println("===================");

        System.out.println();
        System.out.println();

        ArrayList<Spieler> spielerHeim = new ArrayList<>();
        spielerHeim.add(heimSpieler1);
        spielerHeim.add(heimSpieler2);
        spielerHeim.add(heimSpieler3);
        spielerHeim.add(heimSpieler4);
        spielerHeim.add(heimSpieler5);
        spielerHeim.add(heimSpieler6);
        spielerHeim.add(heimSpieler7);
        spielerHeim.add(heimSpieler8);
        spielerHeim.add(heimSpieler9);
        spielerHeim.add(heimSpieler10);


        Mannschaft heim = new Mannschaft("Heim", heimTrainer, heimTorwart, spielerHeim);




        //System.out.println(spielerHeim);


        ArrayList<Spieler> spielerGast = new ArrayList<>();

        spielerGast.add(gastSpieler1);
        spielerGast.add(gastSpieler2);
        spielerGast.add(gastSpieler3);
        spielerGast.add(gastSpieler4);
        spielerGast.add(gastSpieler5);
        spielerGast.add(gastSpieler6);
        spielerGast.add(gastSpieler7);
        spielerGast.add(gastSpieler8);
        spielerGast.add(gastSpieler9);
        spielerGast.add(gastSpieler10);

        Mannschaft gast = new Mannschaft("Gast", gastTrainer, gastTorwart, spielerGast);

        //System.out.println(spielerGast);

        Ergebnis ergebnis = new Ergebnis();
        ergebnis.ToreHeim();
        ergebnis.ToreGast();

        Spiel spiel = new Spiel(heim, gast, ergebnis);


        System.out.println(spiel);


    }
}
