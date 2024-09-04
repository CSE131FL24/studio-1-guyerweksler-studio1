package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What year is it?");
		int s1 = in.nextInt();
		boolean LeapYear = true;
		LeapYear = (((s1 % 4) == 0) && ((s1 % 100) != 0)) || ((s1 % 400) == 0);
		System.out.println("This year is a Leap Year: " + LeapYear);
	}

}
