package task_2_2;

import java.util.Scanner;

public class Task_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dollars;

        do {
            System.out.println("Введите сумму в долларах для конвертаций: ");
            dollars = sc.nextInt();

            if (dollars < 0) {
                System.out.println("Сумма должна быть больше 0");
            }
        } while (dollars < 0);

        System.out.println("Выберите валюту для конертаций:\n1 - Евро \n2 - Фунт стерлингов\n3 - Иена\n4 - Швейцарский франк\n5 - Рубль\n6 - Тенге");

        int currencyId = sc.nextInt();

        switch (currencyId) {
            case 1:
                double eur = 0.96;
                System.out.println(dollars + "$ = " + dollars * eur + " EUR");
                break;
            case 2:
                double bp = 0.8;
                System.out.println(dollars + "$ = " + dollars * bp + "British Pound");
                break;
            case 3:
                double yen = 154.12;
                System.out.println(dollars + "$ = " + dollars * yen + "Yen");
                break;
            case 4:
                double sf = 0.91;
                System.out.println(dollars + "$ = " + dollars * sf + "Swiss franc");
                break;
            case 5:
                double runles = 90.70;
                System.out.println(dollars + "$ = " + dollars * runles + "Rubles");
                break;
            case 6:
                double tenge = 503.13;
                System.out.println(dollars + "$ = " + dollars * tenge + "Tenge");
                break;
            default:
                System.out.println("Неверный ID валюты");
        }
    }
}
