import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int summ9 = 0;
        int summ99 = 0;
        int summlimit = 0;
        System.out.printf("Введите 20 чисел : ");

        for (int count = 0; count != 20; count++) {
            int num = scanner.nextInt();
            if ((num > 0) && (num < 10) || (num == 0) )
                summ9++;
            else if (num < 100)
                summ99++;
            else
                summlimit++;
        }
        System.out.println("Вы ввели 20 значений! Посчитаем результат");

        System.out.println("Сумма чисел  от 0 до 9 = " + summ9);
        System.out.println("Сумма чисел от 10 до 99 = " + summ99);
        System.out.println("Сумма чисел не в пределах = " + summlimit);
    }
}
