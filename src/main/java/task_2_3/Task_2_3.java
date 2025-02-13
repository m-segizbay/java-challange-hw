package task_2_3;

public class Task_2_3 {
    public static void main(String[] args) {
        //rainPerson(10);
        //amoeba(24);
        //System.out.println(calculate(1));
        //multiplication(4,3);
        //inchToCentimeter();
        //evenNumbers();
        //oddNumbers();
        //summAllNumbers();
    }

    public static void trainPerson(int firstDay){
        double totalResult = 0.0;
        double result = firstDay;
        for (int i = 1; i <= 7; i++) {
            totalResult += result;
            System.out.printf("День: %d - Дистанция: %.2f км\n", i, result);
            result = result * 1.1;
        }

        System.out.println("Сумма дистанций пробежки за неделю - " + String.format("%.2f", totalResult) + " км");
    }

    public static void amoeba(int hour){
        int sum = 1;
        for (int i = 0; i < hour; i += 3) {
            sum *= 2;
        }

        System.out.println("Количество амеб за " + hour + " часов, составляет " + sum);
    }

    public static int calculate(int n){
        if (n == 256){
            return n;
        }
        return n + calculate(n*2);
    }

    public static void multiplication(int a, int b){
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }

        System.out.println("Сумма без *: " + sum);
    }

    public static void inchToCentimeter(){
        System.out.println("Дюйм   |      Сантиметр");
        System.out.println("------------------------");
        for (int i = 1; i <= 20 ; i++) {
            double centimeters = i * 2.54;
            System.out.printf("%6d | %12.2f\n", i, centimeters);
        }
    }

    public static void evenNumbers(){
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void oddNumbers(){
        for (int i = 1; i <= 99 ; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void summAllNumbers(){
        int sumEven = 0;
        int sumOdd = 0;
        int sumAll = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                sumEven += i;
            } else {
                sumOdd += i;
            }
            sumAll += i;
        }

        System.out.println("Сумма четных: " + sumEven);
        System.out.println("Сумма нечетных: " + sumOdd);
        System.out.println("Сумма всех: " + sumAll);
    }
}
