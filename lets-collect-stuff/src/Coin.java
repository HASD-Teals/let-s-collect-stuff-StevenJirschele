public class Coin {
    // Add collectable properties here
    private String color;
    private String material;
    private String person;
    private double value;
    // Add collectable constructors here
    public Coin() {
        this.color = "";
        this.material = "";
        this.person = "";
        this.value = 0;
    }
    // Add collectable accessors and mutators here
    public Coin(String color, String material, String person, double value) {
    this.color = color;
    this.material = material;
    this.person = person;
    this.value = value;
    }
    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }
    public String getPerson() {
        return person;
    }
    public double getValue() {
        return value;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setPerson(String person) {
        this.person = person;
    }
    public void setValue(double value) {
        this.value = value;
    }
    // Add any methods here
    public String toString() {
        return this.color + " " + this.material + " " + this.person + " " + this.value + "\n";
    }
    public boolean isEqual(Coin otherCoin) {
        if(this.value == otherCoin.value) {
            return true;
        }
        else {
            return false;
        }
    }
}