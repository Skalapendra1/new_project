package present;

public class candy extends box {
    private String type;

    public candy(String name, Double price, Double weight, String type) {
        super(name, price, weight);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Кофеты [" + super.toString()+" вид='" + type + "']";
    }
}



