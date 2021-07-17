
import java.util.*;

class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // put your code here

        int ip1 = sc.nextInt();
        int ip2 = sc.nextInt();

        int[][] numArray = new int[ip1][ip2];

        for (int i = 0 ; i < numArray.length; i++) {

            for( int j = 0; j < numArray[i].length; j++) {

                numArray[i][j] = sc.nextInt();
            }
        }


//        for (int i = 0 ; i < numArray.length; i++) {
//
//            for( int j = 0; j < numArray[i].length; j++) {
//
//                System.out.print(numArray[i][j]+" ");
//            }
//            System.out.println();
//        }

        int c1 = sc.nextInt();

        int c2 = sc.nextInt();

        Swapcolumn(c1,c2,numArray);

        for (int i = 0 ; i < numArray.length; i++) {

            for( int j = 0; j < numArray[i].length; j++) {

                System.out.print(numArray[i][j]+" ");
            }
            System.out.println();
        }



    }

    public static void Swapcolumn(int c1, int c2, int[][]Arr) {

        for(int i=0 ; i < Arr.length; i++) {

            int temp = Arr[i][c1];
            Arr[i][c1] = Arr[i][c2];
            Arr[i][c2] = temp;
        }

    }
}