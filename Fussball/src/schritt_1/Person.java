package schritt_1;

public abstract class Person {

    private String name;
    private int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "\nName: " + getName() + "\nAlter: " + getAlter();
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

}
