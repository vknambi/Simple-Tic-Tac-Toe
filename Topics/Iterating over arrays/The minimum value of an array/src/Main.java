import java.util.*;


public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ip = sc.nextInt();
		
		int[] numArr = new int[ip];
		
		for (int i =0 ; i < ip ; i++) {
		    
		    numArr[i] = sc.nextInt();
		}
		
		int min = numArr[0];
		
	    for (int i =0 ; i < ip ; i++) {
		    
		    if(numArr[i] < min) {
		        
		        min = numArr[i];
		    }
		}
		
		System.out.println(min);
	}
}
