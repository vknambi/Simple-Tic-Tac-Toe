import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum < 1000 && sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }
        System.out.println(sum >= 1000 ? sum - 1000 : sum);
    }
}