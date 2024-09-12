import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        int summ9 = 0;
        int summ99 = 0;
        int summlimit = 0;
        System.out.printf("Введите количество повторений =  ");
        int max = scanner.nextInt();
        System.out.printf("Введите "+ max " чисел : ");
        for (int count = 0; count != max; count++) {
            int num = scanner.nextInt();
            if ((num > 0) && (num < 10) || (num == 0) )
                summ9++;
            if (10<=x && x <= 99)
                    summ99++;
            if (x<0 || x>99)
                summlimit++;
        }
        System.out.println("Вы ввели 20 значений! Посчитаем результат");

        System.out.println("Сумма чисел  от 0 до 9 = " + summ9);
        System.out.println("Сумма чисел от 10 до 99 = " + summ99);
        System.out.println("Сумма чисел не в пределах = " + summlimit);
        */
        System.out.println("ведите минимальное число в колоде: ");
        int p = scanner.nextInt();
        System.out.println("ведите максимальное число в колоде: ");
        int k = scanner.nextInt();

        List<Integer> resultList = new ArrayList<>();

        int currentNum = p;
        while (currentNum !=k) {
            resultList.add(currentNum);
            currentNum++;
        }
        resultList.add(k);

        System.out.println("колличеством колод  карт в них соответственно: " + resultList);
        int counter =0;

        for (int i = 0; i < resultList.size(); i++) {
            int currentElement = resultList.get(i);
            while (currentElement != 2)
                if(currentElement % 2 == 0) {
                    currentElement = currentElement / 2;
                    counter++;}
                else  {
                    currentElement = currentElement * 3 + 1;
                    counter++;

                }
        }
        System.out.println("колличество ходов: " + counter);
    }
}
