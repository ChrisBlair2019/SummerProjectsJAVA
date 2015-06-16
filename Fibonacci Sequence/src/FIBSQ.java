import java.util.ArrayList;
import java.util.Scanner;


public class FIBSQ {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What Fibonacci Number would you like to calculate?");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci Number" + " " + n 
			+	" " + "is" + " " + FibCalc(n) );
	}
	
	public static int FibCalc(int n){
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(0,0);
		fib.add(1, 1);
		for(int index = 0; index <= n; index++){
			fib.add(
					(fib.get(index)+fib.get(index + 1))
					);
		}
		return fib.get(n);
		
	}
	
	public static int fibRCalc(int n){
		if(n == 0)
			return 0;
		
		else if(n==1)
			return 1;
		
		else
			return fibRCalc(n-1) + fibRCalc(n-2);
		
		
	}
}
