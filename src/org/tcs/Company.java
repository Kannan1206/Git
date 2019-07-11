package org.tcs;

import java.util.Scanner;

public class Company {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name");
	String name = sc.nextLine();
	System.out.println(name);
	System.out.println("Enter the city");
	String city = sc.next();
	System.out.println(city);
	System.out.println("Enter the regno");
	int regNo = sc.nextInt();
	System.out.println(regNo);
	System.out.println("Enter the salary");
	float salary = sc.nextFloat();
	System.out.println(salary);
	System.out.println("Enter the mobno");
	long mobNo = sc.nextLong();
	System.out.println(mobNo);
	}
}
