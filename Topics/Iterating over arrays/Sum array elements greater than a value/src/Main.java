
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int ip = sc.nextInt();
	
	int[] oned = new int[ip];
	
	
	for (int i = 0; i < oned.length; i++) {
	    
	    oned[i] = sc.nextInt();
	    
	}
    
    int n = sc.nextInt();
	
	int sum = 0;
	
	for (int i = 0; i < oned.length; i++) {
	    
	    if(oned[i] > n) {
	        
	        sum = sum + oned[i];
	    }
	    
	}
	
	System.out.println(sum);
	
		
	}
}
