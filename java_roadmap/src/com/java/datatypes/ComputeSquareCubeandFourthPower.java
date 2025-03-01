package com.java.datatypes;

public class ComputeSquareCubeandFourthPower {
	private int num;
	private double[] computeSquareCubeandFourthPower(int num) {
		this.num = num;
		double sqr = Math.pow(this.num, 2);
		double cube = Math.pow(this.num, 3);
		double fourth = Math.pow(this.num, 4);
		
		return new double[] {sqr, cube, fourth};
	}
	
	public void printComputeSquareCubeandFourthPower(int num) {
		System.out.println("Square of " + num + " is " + String.format("%12.2f", this.computeSquareCubeandFourthPower(num)[0]) + " and the cube is "+ this.computeSquareCubeandFourthPower(num)[1] +" and fourth power is "+this.computeSquareCubeandFourthPower(num)[2] );
	}
}
