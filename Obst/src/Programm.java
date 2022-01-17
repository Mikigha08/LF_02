public class Programm {

    public static void main(String[] args) {

        Apfel apfel = new Apfel();
        apfel.setFarbe("Rot");
        apfel.setGewicht(200);
        apfel.setReif(true);
        apfel.setWurm(false);

        System.out.println(apfel);

        System.out.println("======================");

        Banane banane = new Banane();
        banane.setFarbe("Gelb");
        banane.setGewicht(120);
        banane.setReif(true);
        banane.setKruemmung(30);

        System.out.println(banane);

        System.out.println("======================");

        Kirsche kirsche = new Kirsche();
        kirsche.setFarbe("Kirschrot");
        kirsche.setGewicht(7);
        kirsche.setReif(true);
        kirsche.setKerne(true);

        System.out.println(kirsche);

        System.out.println("======================");

    }
}


