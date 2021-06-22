import com.sun.org.apache.bcel.internal.generic.SWITCH;
/**
 * Начинаем писать калькулятор 13.06.2021
 *@author Волкова Александра
 * @param sl1 первое вводимое число
 * @param sl2  второе вводимое число
 * @param zn вводим знак
 * @return res результат операции над введенными числами
 */
import java.util.Scanner;

public class base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВеди 2 числа:");
        double sl1 = scanner.nextDouble();
        double sl2 = scanner.nextDouble();
        System.out.println("ВВеди знак:");
        Scanner scanner1 = new Scanner(System.in);
        String zn = scanner1.nextLine();

        double res ;
        String err = null;
        switch (zn) {
            case "/":
                res = sl1/sl2;
                System.out.printf("Результат = %.4f", res);
            break;
            case "*":
                res = sl1*sl2;
                System.out.printf("Результат = %.4f", res);
                break;
            case "-":
                res = sl1-sl2;
                System.out.printf("Результат = %.4f", res);
                break;
            case "+":
                res = sl1+sl2;
                System.out.printf("Результат = %.4f", res);
                break;
            default: err = "Не балуйся!\nВводи нормально!";
                System.out.println(err);
        }


    }
}
