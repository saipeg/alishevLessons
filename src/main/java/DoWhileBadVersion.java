import java.util.Scanner;


public class DoWhileBadVersion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 5");
        int value = scanner.nextInt();

        while(value != 5) {

            System.out.println("Введи 5");
            value = scanner.nextInt();

        }

        System.out.println("Вы ввели 5");

    }

}
