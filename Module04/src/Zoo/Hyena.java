package Zoo;

public class Hyena extends Animal {
    private String characteristic;

    public Hyena(String name, int age, String characteristic) {
        super(name, age, "Hyena");
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
}
