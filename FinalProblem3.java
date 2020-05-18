import java.util.Random;

public class FinalProblem3 {
	
	public static double RandomNorm (double mean, double sd) {
		Random r = new Random();
		double val = (r.nextGaussian() * sd + mean);
		return val;
	}
	
	

	static double x;
	
	public static void Days60(double t1){
		
		
			
		for(int a = 1; a < 60; a++) {
			
			if(a == 1) {
				System.out.print("Stock at Day: " + 1 + " is " + 24600);
				
				x = t1;
			}
			else
			System.out.printf("Stock at Day: " + a + " is " + "%.0f",x);
			System.out.println("");
			//System.out.print(x);
			x = x * (1 + RandomNorm(0.005,0.015));
		}
	}
	public static void Days190(double t1){
		
		
			
		for(int a = 60; a < 251; a++) {
			
			if(a == 1) {
				System.out.println("Stock at Day: " + 60 + " is " + 24600);
				x = t1;
			}
			else
			System.out.printf("Stock at Day: " + a + " is " + "%.0f",x);
			System.out.println("");
			//System.out.print(x);
			x = x * (1 + RandomNorm(0.010,0.013));
		}
	}
		
	
	
	public static void main( String args[] ) {
		
		Days60(24600);
		Days190(x);
			
		}
		
	
}