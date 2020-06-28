import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи возраст");

        int age = scanner.nextInt(); // May be here string variable, example: String age = scanner.nextLine();"

        switch(age) {

            case 0 :

                System.out.println("ты родился");
                break;

            case 7 :

                System.out.println("ты пошел в школу");
                break;

            case 18 :

                System.out.println("ты закончил школу");
                break;

            default:
                System.out.println("ни одно из предыдуших условий не подошло");

        }

/* below is a bad version operator "if"
        if(age == 10) {

            System.out.println("ты учишься в школе");

        } else if(age == 18) {
            System.out.println("ты закончил школу");
        } else {

            System.out.println("ты хер с горы");
        }
end bad variant "if", next good version  */

    }

}
