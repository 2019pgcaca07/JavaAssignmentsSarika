package com.assignment.day1;
import java.util.Scanner;
public class PrintStarPattern {

	public static void main(String[] args) {
	     System.out.println("enter n:");
	     Scanner sc  = new Scanner(System.in);
	     int n = sc.nextInt();
	     for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=i;j++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }

	}

}
