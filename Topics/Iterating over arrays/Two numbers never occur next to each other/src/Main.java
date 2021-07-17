
import java.util.*;

public class Main
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ip = sc.nextInt();

        if (ip < 1){
            System.out.println("no army");
        }else if (ip >= 1 && ip <= 19 ) {
            System.out.println("pack");
        }else if (ip >= 20 && ip <= 249 ){
            System.out.println("throng");
        }else if (ip >= 250 && ip <= 999){
            System.out.println("zounds");
        }else {
            System.out.println("legion");
        }

    }
}
