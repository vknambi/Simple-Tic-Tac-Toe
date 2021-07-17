import java.util.*;

public class Main
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ip = sc.nextInt();

        int[] numArray = new int[ip];

        int counter = 0;

        for(int i= 0 ; i < ip ; i++ ){

            numArray[i] = sc.nextInt();
        }

        for(int i = 0; i < numArray.length -2; i++ ){

            if(numArray[i] +1==numArray[i+1] && numArray[i] +2 == numArray[i+2]){

                counter++;
            }


        }

        System.out.print(counter);
    }
}