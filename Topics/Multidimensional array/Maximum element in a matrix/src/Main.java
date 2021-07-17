
import java.util.*;

class Main {

    public static Scanner sc = new Scanner(System.in);

    static int rowindex = Integer.MIN_VALUE, colindex = Integer.MIN_VALUE;

    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        // put your code here

        int ip1 = sc.nextInt();

        int ip2 = sc.nextInt();

        int[][] numArray = new int[ip1][ip2];

        for (int i = 0 ; i < numArray.length; i++) {

            for ( int j = 0 ; j < numArray[i].length; j++) {

                numArray[i][j] = sc.nextInt();
            }
        }

//        for (int i = 0 ; i < numArray.length; i++) {
//
//            for ( int j = 0 ; j < numArray[i].length; j++) {
//
//                System.out.print(numArray[i][j] + " ");
//            }
//            System.out.println();
//        }


        for (int i = 0 ; i < numArray.length; i++) {

            for ( int j = 0 ; j < numArray[i].length; j++) {

                if(numArray[i][j] > max) {

                    max = numArray[i][j];
                    rowindex = i;
                    colindex = j;

                }


            }
        }


        System.out.print(rowindex + " " + colindex);














    }
}