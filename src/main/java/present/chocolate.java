package present;

public class chocolate extends box{
    private String color;

    public chocolate(String name, Double price, Double weight,String color) {
        super(name, price, weight);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Шоколадка [" + super.toString()+" цвет= '" + color + "']";
    }
}
