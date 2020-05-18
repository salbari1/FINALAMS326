import java.io.*; 
public class FinalProblem2 
	
	
{ 
	double dydx(double x, double y) 
	{ 
		double e = 2.7182;
		return Math.pow(e,-1 * dydx(x,y))- Math.pow(x,3)-Math.pow(y,3); 
	} 
	
	// Finds value of y for a given x using step size h 
	// and initial value y0 at x0. 
	double rungeKutta(double x0, double y0, double x, double h) 
	{ 
		FinalProblem2 d1 = new FinalProblem2(); 
		// Count number of iterations using step size or 
		// step height h 
		int n = (int)((x - x0) / h); 

		double k1, k2, k3, k4; 

		// Iterate for number of iterations 
		double y = y0; 
		for (int i = 1; i <= n; i++) 
		{ 
			// Apply Runge Kutta Formulas to find 
			// next value of y 
			k1 = h * (d1.dydx(x0, y)); 
			k2 = h * (d1.dydx(x0 + 0.5 * h, y + 0.5 * k1)); 
			k3 = h * (d1.dydx(x0 + 0.5 * h, y + 0.5 * k2)); 
			k4 = h * (d1.dydx(x0 + h, y + k3)); 

			// Update next value of y 
			y = y + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4); 
			
			// Update next value of x 
			x0 = x0 + h; 
		} 
		return y; 
	} 
	
	public static void main(String args[]) 
	{ 
		FinalProblem2 d2 = new FinalProblem2(); 
		for (double a = 0; a<1; a= a+0.01) {
		double x0 = 0;
		double y = 1;
		double x = a;
		double h = 0.01; 
		System.out.print("\nThe value of y at x at y(");
		System.out.printf("%.2f %n ",a);
		System.out.print(d2.rungeKutta(x0, y, x, h)); 
		System.out.println("");
		}

	} 
} 


