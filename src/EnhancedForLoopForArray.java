public class EnhancedForLoopForArray {
    public static void main(String[] args) {
        int num[] = {1, 3, 4, 5};

        //     for (int i = 0; i < 4; i++)
        //   {
        //System.out.println(num[i]);
        //  }

        for (int k : num) {
            System.out.println(k);

            //Alternate method to the above i.e Using Enhanced Loop
        }
             // FOR 2D ARRAYS
        int d[][] = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 5, 7, 9},
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + d[i][j]);
            }
            System.out.println();

            // OR USING ENHANCED LOOP

            for (int k[] : d) {
                for (int l : k) {
                    System.out.print("" + l);
                }
                System.out.println();
            }
        }

    }

}