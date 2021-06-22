/**
 * @author Волкова Александра
 * @see #calculator() Выбор действия и выпонения действия над двумя введенными с клавиатуры числами.
 *  @param sl1 первое вводимое число
 *  @param sl2  второе вводимое число
 *  @param zn вводим знак
 *  @return res результат операции над введенными числами
 * @see #stroka() ввод чисел с клавиатуры и нахождение самого длинного. выводит кол-во символов самого длинного числа
 * @param d вводимое чило, обозначающее размерность массива String
 *  @param array[] массив слов
 *  @param slovo переменная в которую сохраняется каждый элемент массива array
 *  @param a длинна массива каждого слова
 *  @return b число символов в самом длинном слове из массива array
 */

import java.util.Scanner;

public class qqq {
    public static void main(String[] args) {
        System.out.println("Выбери функционал:\n 1 - калькулятор\n 2- найти самое длинное слово ");
        Scanner scanner1 = new Scanner(System.in);
        int k = scanner1.nextInt();
        switch (k) {
            case 1:calculator();
                break;
            case 2:stroka();
                break;
            default:System.out.println("Ну ничего! В другой раз!");
        }
    }

        public static Double calculator() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ВВеди два числа:");
            double sl1 = scanner.nextDouble();
            double sl2 = scanner.nextDouble();
            System.out.println("ВВеди знак:");
            Scanner scanner3 = new Scanner(System.in);
            String zn = scanner3.nextLine();

            double res=0;
            switch (zn) {
                case "/": res = sl1 / sl2;
                    break;
                case "*": res = sl1 * sl2;
                    break;
                case "-": res = sl1 - sl2;
                    break;
                case "+": res = sl1 + sl2;
                    break;
                default:
                    System.out.println("Не балуйся!\nВводи нормально!");
            }
            System.out.printf("Результат = %.4f", res);
            scanner.close();
            scanner3.close();
            return res;
        }

        public static int stroka () {
            System.out.println("Введи количество слов: ");
            Scanner scanner1 = new Scanner(System.in);
            int d = scanner1.nextInt();
            String[] array = new String[d];
            int b = 0;
            String slovo1 = null;
            System.out.println("Введи слова: ");
            for (int i = 0; i < array.length; i++) {
                Scanner scanner2 = new Scanner(System.in);
                String slovo = scanner2.nextLine();
                array[i] = slovo;
                int a = slovo.length();
                if (a >= b) {
                    b = a;
                    slovo1=slovo;
                }
            }
            System.out.println("В самом длинном слове "+slovo1+ " " +b+" символов");
            scanner1.close();
            return b;
        }
    }

