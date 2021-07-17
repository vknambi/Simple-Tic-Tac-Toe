package tictactoe;

import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static char[][] output = new char[3][3];


    //-------------------------------------MAIN METHOD ---------------------------------------//
    public static void main(String[] args) {

        for( int i =0 ; i < output.length; i++ ) {

            for( int j = 0 ; j < output[i].length ; j++) {

                output[i][j] = '_';
            }
        }

        printOutput();

        int turn = 1;

        char ch;

        do{
            ch = turn % 2 == 0 ? 'O' : 'X';
            NewEntry(ch);
            printOutput();
            turn++;
        }while(!Who_Wins('X') && !Who_Wins('O') && turn <= 9);
        FinalEnd();

    }

    //----------------------------------------------------------------------------------------------//


    //---------------------------------METHOD WHO_WINS -------------------------------------------//

    public static boolean Who_Wins(char alphabet){

        int total = alphabet == 'X' ? 264 : 237;

        for(int i = 0 ; i < 3 ; i++) {

            if(output[i][0] + output[i][1] + output[i][2] == total || output[0][i] + output[1][i] + output[2][i] == total) {

                return true;
            }
        }

        if(output[0][0] + output[1][1]  + output[2][2] == total || output[0][2] + output[1][1]  + output[2][0] == total) {

            return true;
        }

        return false;
    }
//--------------------------------------------------------------------------------------------------//



    //+++++++++++++++++++++++++++++++++++++++++++METHOD NEW_ENTRY +++++++++++++++++++++++++++++++++//

    public static void NewEntry(char current) {

    boolean value1 = false;

    do {

        System.out.print("Enter the coordinates: ");
        String input = sc.nextLine();

        try {

            String[] pieces = input.split(" ");
            int first = Integer.parseInt(pieces[0]);
            int second = Integer.parseInt(pieces[1]);

            if (first <= 3 && second <= 3) {

                if (output[first - 1][second - 1] == '_') {
                    output[first - 1][second - 1] = current;
                    value1 = true;

                } else {

                    System.out.println("This cell is occupied! Choose another one!");
                }

            } else {
                System.out.println("Coordinates should be from 1 to 3!");
            }

        }catch (NumberFormatException e) {
            System.out.println("You should enter numbers!");
            continue;
        }

    }while(!value1);



    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//



    //************************************ METHOD SKIPPED COUNT **********************************//

    public static void skippedCount() {

        int count = 0;

        for(int i = 0 ; i < 3; i++) {

            for(int j = 0 ; j < 3 ; j++) {

                if(output[i][j] == '_') {

                    count ++;
                }
            }
        }
    }
    //********************************************************************************************//



    //_______________________________________________ Method printOutput _______________________________________________//


        public static void printOutput() {
            System.out.println("---------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(output[i][j] == '_' ? "  " : output[i][j] + " ");
                }
                System.out.print("|\n");
            }
            System.out.println("---------");
        }


    //****************************************************************************************************************//


    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% METHOD FINAL_END %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//

    public static void FinalEnd(){

//        if (isWon('X') && isWon('O') || (skippedCount() >= 3 && !isWon('X') && !isWon('O') && str.charAt(8) != '_')) {
//            System.out.println("Impossible");
//        }
        if (Who_Wins('X')) {
            System.out.println("X wins");
        } else if (Who_Wins('O')) {
            System.out.println("O wins");
        } else {
            System.out.println("Draw");
        }
    }
}



