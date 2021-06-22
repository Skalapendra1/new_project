package present;

public class donut extends box{
    private String size;

    public donut(String name, Double price, Double weight, String size) {
        super(name, price, weight);
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Пончик [" + super.toString()+ " размер='" + size  + "']";
    }
}
