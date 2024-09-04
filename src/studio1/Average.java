package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double average, half;
		Scanner in = new Scanner(System.in);
		System.out.println("integer 1:");
		double s1 = in.nextDouble();
		System.out.println("integer 2:");
		double s2 = in.nextDouble();
		average = ((s1 + s2) * 0.5);
		System.out.println("average is " + average);
		
		
		

	}

}
