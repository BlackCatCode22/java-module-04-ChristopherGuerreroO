package Zoo;

public class Tiger extends Animal {
    private String region;

    public Tiger(String name, int age, String region) {
        super(name, age, "Tiger");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
