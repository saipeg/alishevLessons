public class MltidimensionalArrays {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};      // one-dimensional array
        System.out.println(numbers[1]); // line array

        /** theory
         * 1, 2, 3, 4, 5, 0, -1, -2
         *
         * 156
         * 376   example: number 7 reference [1][1]
         * 268
         */

        int[][] matrice = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        System.out.println(matrice[2][2]); // for select number 9:
                                            //number string(0-1-2) and number column
        System.out.println(matrice[1][0]);

        int[][] matrice2 = {{1, 2, 3, 4, 5},
                           {4},
                           {7, 8}};
        System.out.println(matrice2[0][4]);

        int[] number1 = new int[5];
        String[][] strings = new String[2][3];
        strings[0][1] = "Привет";
        System.out.println(strings[0][1]);

        //array in monitor bellow:
        int[][] matrice3 = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        for(int i = 0; i < matrice3.length; i++) {  //cycle for string
            for(int j = 0; j < matrice3[i].length; j++) {  //cycle for column
                System.out.print(matrice3[i][j] + " ");
            }
            System.out.println();
        }


    }

}
