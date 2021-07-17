import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int input = scanner.nextInt();

        boolean value = scanner.nextBoolean();

        if( input >= 10 && input <= 20 && value == false) {

            System.out.println("true");

        } else if( input >= 15 && input <= 25 && value == true ) {

            System.out.println("true");
        } else {

            System.out.println("false");

        }
    }
}