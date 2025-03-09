package Zoo;

public class Bear extends Animal {
    private String type;

    public Bear(String name, int age, String type) {
        super(name, age, "Bear");
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
