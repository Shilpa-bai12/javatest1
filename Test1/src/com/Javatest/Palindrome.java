package com.Javatest;
import  java.util.*;

public class Palindrome {
	public static void palindrome(int n) {
		int temp=n;int rem=0;int rev=0;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		
		if(rev==temp) {
			System.out.println("The number is palindrome");
		}
		else {System.out.println("The number is not a palindrome");}
	} 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 4 digit number");
		int num=sc.nextInt();
		palindrome(num);

	}

}
