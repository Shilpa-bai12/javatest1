package com.Javatest;

public class ArmStrong {
	public static void armStrong(int num) {
		int rem=0;int n1=num;int result=0;
		while(num>0) {
			rem=num%10;
			result=result+rem*rem*rem;
			num=num/10;
			
		} 
		if(n1==result) {
			System.out.println("The given number is armstrong");
		}
		else {
			System.out.println("The given number is not armstrong");
		}
	}
  
	public static void main(String[] args) {
		armStrong(153);
		
	}

}
