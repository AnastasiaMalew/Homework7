import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        {
            System.out.println("Задание 1.");
            int money = 0;
            int month = 1;
            while (money < 2_459_000) {
                money = (int) ((money + 15000) * 1.01);
                month++;
            }
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей %n", month, money);
        }
        {
            System.out.println("Задание 2.");
            int i = 0;
            while (i < 10) {
                i++;
                System.out.print(i + " ");
            }
            System.out.println();
            for (; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
        {
            System.out.println("Задание 3.");
            int peopleAmount = 12_000_000;
            int increase;
            int descrease;
            for (int i = 1; i <= 10; i++) {
                increase = peopleAmount / 1000 * 17;
                descrease = peopleAmount / 1000 * 8;
                peopleAmount = peopleAmount + increase - descrease;
                System.out.printf("Год %s, численность населения состаляет %s%n", i, peopleAmount);
            }
        }
        {
            System.out.println("Задание 4.");
            double vasiaMoney = 15000;
            for (int i = 0; vasiaMoney < 12_000_000; i++) {
                vasiaMoney = (int) (vasiaMoney * 1.07);
                System.out.printf("За %s месяц Василий накопил %.2f%n", i, vasiaMoney);
            }
        }
        {
            System.out.println("Задание 5.");
            double vasiaMoney = 15000;
            for (int i = 0; vasiaMoney < 12_000_000; i++) {
                vasiaMoney = (int) (vasiaMoney * 1.07);
                if (i % 6 == 0) {
                    System.out.printf("За %s месяц Василий накопил %.2f%n", i, vasiaMoney);
                }
            }
        }
        {
            System.out.println("Задание 6.");
            double vasiaMoney = 15000;
            int nineYear = 9 * 12;
            for (int i = 0; i <= nineYear; i++) {
                vasiaMoney = (int) (vasiaMoney * 1.07);
                if (i % 6 == 0) {
                    System.out.printf("За %s месяц Василий накопил %.2f%n", i, vasiaMoney);
                }
            }
        }
        {
            System.out.println("Задание 7.");
            Scanner scanner = new Scanner(System.in);
            int firstFriday = 3;
            for (int i = firstFriday; i < 31; i += 7) {
                System.out.printf("Сегодня пятница %s число, необходимо подготоить отчет%n", i);
            }
        }
        {
            System.out.println("Задание 8.");
            int currentYear = 2024;
            int begin = currentYear - 200;
            int end = currentYear + 100;
            for (int i = 0; i < end; i +=79) {
                if (i >= begin) {
                    System.out.println(i);
                }
            }
        }
    }
}