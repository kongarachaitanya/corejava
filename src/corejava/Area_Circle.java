package corejava;

import java.util.Scanner;

public class Area_Circle{

	public static void main(String[] args){

	int radius;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the radius of the circle:");
	radius=in.nextInt();

	//use Math.PI constant to get value of pi
	double area=Math.PI * radius * radius;

	System.out.println("Area of the circle is " + area);

	}

	}