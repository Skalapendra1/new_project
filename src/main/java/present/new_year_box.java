package present;
public class new_year_box {
    public static void main(String[] args) {
        candy candy = new candy("Маска", 15.0, 350.0, "шоколадная");
        chocolate choco = new chocolate("Аленка",70.0,100.0,"белый");
        donut donut = new donut("Тройная карамель",49.9,75.3, "L");
        box[] box = {candy,choco,donut};
        System.out.println("Общая цена подарка= "+(candy.getPrice()+choco.getPrice()+ donut.getPrice()));
        System.out.println("Общий вес подарка= "+(candy.getWeight()+choco.getWeight()+donut.getWeight()));

        for (int i=0;i<box.length;i++){
            System.out.println(box[i]);
        }
    }
}
