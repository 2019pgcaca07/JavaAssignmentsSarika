package com.assignment.day1;
import java.util.Scanner;
public class TotalExpenseForEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter branding expenses");
		int be = sc.nextInt();
		System.out.println("enter travelling expenses");
		int te = sc.nextInt();
		System.out.println("enter food expenses");
		int fe = sc.nextInt();
		System.out.println("enter logistic expenses");
		int le = sc.nextInt();
		
		double total = be+te+fe+le;
		System.out.println("Branding expenses percentage:"+(be*100)/total+"%");
		System.out.println("Travelling expenses percentage:"+(te*100)/total+"%");
		System.out.println("Food expenses percentage:"+(fe*100)/total+"%");
		System.out.println("Logistic expenses percentage:"+(le*100)/total+"%");
		

	}

}
