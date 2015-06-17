import java.util.Scanner;


public class LimCalc {

	public static void main(String[] args){
		System.out.println("Please enter your equation in form" + " "
				+ "ax^5+bx^4+cx^3+dx^2+ex+f");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your equation " + " "
				+ "starting with ax^5 and then working to f" + " " + "Lastly enter the number of which your equation will be approaching");
		
		double a,b,c,d,e,f;
		int x;
		a = sc.nextDouble();
		b= sc.nextDouble();
	    c= sc.nextDouble();
	    d= sc.nextDouble();
	    e= sc.nextDouble();
	    f= sc.nextDouble();
	    x= sc.nextInt();
		
	    System.out.println("This is your limit as x approaches from both sides");
		
	    System.out.println(Limit(a,b,c,d,e,f,x));
		
				
		
	}
	
	public static double Limit(double a, double b, 
			double c, double d, double e, double f, int x){
				
		double result = 0;
		double convergenceValue1 = 
				(a * Math.pow((x-(10E-6)), 5.0)) +	
				(b * Math.pow((x-(10E-6)), 4.0)) + 
				(c * Math.pow((x-(10E-6)), 3.0)) +	
				(d * Math.pow((x-(10E-6)), 2.0)) + 
				(e *(x-(10E-6))) +	
				(f 
				);
		double convergenceValue2 = 
				(a * Math.pow((x+(10E-6)), 5.0)) +	
				(b * Math.pow((x+(10E-6)), 4.0)) + 
				(c * Math.pow((x+(10E-6)), 3.0)) +	
				(d * Math.pow((x+(10E-6)), 2.0)) + 
				(e *(x+(10E-6))) +	
				(f 
				);
		
		
		double convergenceValue3 = 
				(a * Math.pow((x-(10E-8)), 5.0)) +	
				(b * Math.pow((x-(10E-8)), 4.0)) + 
				(c * Math.pow((x-(10E-8)), 3.0)) +	
				(d * Math.pow((x-(10E-8)), 2.0)) + 
				(e *(x-(10E-8))) +	
				(f 
				);
		double convergenceValue4 = 
				(a * Math.pow((x+(10E-8)), 5.0)) +	
				(b * Math.pow((x+(10E-8)), 4.0)) + 
				(c * Math.pow((x+(10E-8)), 3.0)) +	
				(d * Math.pow((x+(10E-8)), 2.0)) + 
				(e *(x+(10E-6))) +	
				(f 
				);
		
		double absCV = Math.abs((convergenceValue1) - (convergenceValue2));
		
		double absCV2 = Math.abs((convergenceValue3) - (convergenceValue4));
		
		if(absCV < absCV2){
			System.out.println("Limit Does not Exist");
		}
		else
			result = (convergenceValue3  + convergenceValue4) / 2;
		
		
		return result;
		
	}
}
