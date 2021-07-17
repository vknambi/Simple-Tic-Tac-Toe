import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int[] numArray = new int[input];

        for( int i =0 ; i < numArray.length; i++ ) {

            numArray[i] = scanner.nextInt();
        }

        int temp = numArray[input - 1];

        for(int i = numArray.length - 1; i > 0 ; i--) {

            numArray[i] = numArray[i - 1];
        }


        numArray[0] = temp;

        for( int i =0 ; i < numArray.length; i++ ) {

            System.out.print(numArray[i]+ " ");
        }
    }
}