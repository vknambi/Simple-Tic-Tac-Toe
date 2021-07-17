import java.util.*;

public class Main
{
    
    public static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		int size = sc.nextInt();
		
		int[] numArray = new int[size];
		
		for (int i = 0; i < numArray.length ; i++) {
		    
		    numArray[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		
		int count = 0;
		
        for (int i = 0; i < numArray.length ; i++) {
		    
		    if (numArray[i] == n) {
		        count++;
		    }
		}
		
		System.out.println(count);
	}
}
