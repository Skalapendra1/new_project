package Calculator;

import Calculator.operations.*;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("ВВеди два числа:");

            Scanner scanner=new Scanner(System.in);
            double sl1 = scanner.nextDouble();
            double sl2 = scanner.nextDouble();

        System.out.println("ВВеди знак:");
        Scanner scanner3 = new Scanner(System.in);
        String zn = scanner3.nextLine();

        Operations addition = new Addition();
        Operations subtraction = new Subtraction();
        Operations multiplication = new Multiplication();
        Operations division = new Division();

        switch (zn) {
            case "/": {
                try {
                    division.showOperations(sl1, sl2, zn);
                } catch (DivisionByZero e) {
                    System.out.println("Нельзя делить на ноль!" + e);
                }

                break;}
                case "*":
                    multiplication.showOperations(sl1, sl2, zn);
                    break;
                case "-":
                    subtraction.showOperations(sl1, sl2, zn);
                    break;
                case "+":
                    addition.showOperations(sl1, sl2, zn);
                    break;
                default:
                    System.out.println("Не балуйся!\nВводи нормально!");
            }
        }

    }
