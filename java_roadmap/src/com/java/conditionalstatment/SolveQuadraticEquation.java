package com.java.conditionalstatment;

public class SolveQuadraticEquation {
	private double[] solveQuadraticEquation(int a, int b, int c) {		
		double abc = Math.pow(b, 2) - (4*a*c);
		double sqrabc = Math.sqrt(Math.pow(b, 2) - (4*a*c));
		if(abc > 0.0) {
			double x1 = (-b + sqrabc)/2*a;
			double x2 = (-b - sqrabc)/2*a;
			return new double[] {abc, x1, x2};
		}
		else if(abc == 0.0){
			double x1 = (-b)/2*a;
			return new double[] {abc, x1};
		}
		else {
			
			return new double[] {abc, 0.0};
		}
		
	}
	
	public void printSolveQuadraticEquation(int a, int b, int c) {
		double x[] = this.solveQuadraticEquation(a, b, c);
		if(x[0] > 0.0) {
			System.out.println("x = "+ x[1] + " or x = " + x[2]);
		}
		else if(x[0] == 0.0){
			System.out.println("x = "+ x[1]);
		}
		else {
			System.out.println("No real roots");
		}
	}
}
