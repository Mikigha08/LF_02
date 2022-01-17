public class Apfel extends Obst {

    private boolean wurm;

    public Apfel() {
        super("Apfel");
    }

    public String toString() {
        return super.toString() + "\nWurm:\t\t" + isWurm();
    }

    public boolean isWurm() {
        return wurm;
    }

    public void setWurm(boolean wurm) {
        this.wurm = wurm;
    }

}
