package com.Javatest;

public class Rotation {
	public static void rotate(int arr[])
	{ int rot=1;
	  while(rot>0) { for( int i=0;i<=rot;i++) {
		  rotate(arr);
	  }
		  
	  }
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		rotate(arr);

	}

}
