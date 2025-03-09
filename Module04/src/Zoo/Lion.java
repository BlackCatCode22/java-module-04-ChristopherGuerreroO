package Zoo;

public class Lion extends Animal {
    private String maneColor;

    public Lion(String name, int age, String maneColor) {
        super(name, age, "Lion");
        this.maneColor = maneColor;
    }

    // Getter and setter for maneColor
    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }
}
