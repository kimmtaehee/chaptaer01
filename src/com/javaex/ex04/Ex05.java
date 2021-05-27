package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int a=2; a<10; a++ )
		{		
			for( int b=1; b<10; b++  ) {
				
				System.out.println( a + "*" + b + "=" + a*b );
				
			}
			
			System.out.println("\n");
		}
		
		sc.close();

	}

}
