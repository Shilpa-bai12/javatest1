package com.Javatest;
import java.util.*;

public class Factorial {
	public static int factorial(int num) {
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {

int result=factorial(5);
System.out.print("Result="+result);

	}

}
