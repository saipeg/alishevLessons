public class ArraysOfStrings {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "джава";

        System.out.println(strings[0]);
        System.out.println(strings[2]);
        System.out.println();

        for(int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();

        for(String string:strings) {    //type, variable name, array name
            System.out.println(string);
        }

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for(int x:numbers1) {   // x = 1; x =2; x = 3
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;  //32 bit memory
                    // String s;   memory for reference (s)
                    // String s = "sdasd"; //memory for object
        String s = null; //empty, space reference. s - address, null - home.
        System.out.println(s);


    }

}
