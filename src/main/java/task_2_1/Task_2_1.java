package task_2_1;

import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();

        System.out.println("Сумма двух чисел: " + sumTwoNumbers(num1, num2));
        System.out.println("Произведение двух чисел: " + productTwoNumbers(num1, num2));
        System.out.println("Остаток от деления двух чисел: " + remainderTwoNumbers(num1, num2));

    }

    public static int sumTwoNumbers(int a, int b) {
        return a+b;
    }

    public static int productTwoNumbers(int a, int b) {
        return a*b;
    }

    public static int remainderTwoNumbers(int a, int b) {
        return a%b;
    }
}
