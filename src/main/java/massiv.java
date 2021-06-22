import java.util.Random;

public class massiv {
    public static void main(String[] args) {
        int mas[] = new int[20];
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            mas[i] = rand.nextInt(20 + 1) - 10;
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(mas[i] + "   ");
        }
        int a = -10;
        int b = 10;
        int j = 0;
        int k = 0;
        for (int i = 0; i < 20; i++) {
            if ((mas[i] >= a) && (mas[i] < 0)) {
                a = mas[i];
                j = i;
            } else if ((mas[i] > 0) && (mas[i] <= b)) {
                b = mas[i];
                k = i;
            }
        }
        System.out.println("\nМаксимальное отрицательное --- " + a + " индекс " + j + "\nМинимальное положительное --- " + b + " индекс " + k);
        int tmp = mas[j];
        mas[j] = mas[k];
        mas[k] = tmp;
        System.out.println("\nНовый массив");
        for (int i = 0; i < 20; i++) {
            System.out.print(mas[i] + "   ");
        }
    }
}
