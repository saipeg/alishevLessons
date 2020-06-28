/* Theory
        int number = 10; //bellow is a primitive type
        char character = 'a';

        String s = "Hello"; // Reference type
        String s1 = new String("Hello"); //String - ready class

        System.out.println(numbers[0]); // 0 1 2 3 4
 */

public class Arrays {

    public static void main(String[] args) {

        int number = 10;                // [10]
        int[] numbers = new int[5];     // numbers -> [array] reference type

                // umbers[0] = 10;
                // numbers[1] = 20; initialization arrays or right bellow>
        for(int i = 0; i < numbers.length; i++) {   //arrays.lenght - длина массива
            numbers[i] = i*10;  //initialization elements arrays
            System.out.println(numbers[i]);
        }

        int[] numbers1 = {1, 2, 3};

        for(int i = 0; i < numbers1.length; i++) {

            System.out.println(numbers1[i]);

        }

    }
}
