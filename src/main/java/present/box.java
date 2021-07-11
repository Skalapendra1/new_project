package present;

public abstract class box {
    private String name;
    private Double price;
    private Double weight;

    public box(String name, Double price,Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Название= '" + name + "', цена= " + price + ", вес= " + weight;
    }
}