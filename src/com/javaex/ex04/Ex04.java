package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for( int i=1; i<=10; i++) { 
			
			//이전까지의 합
			System.out.println(sum);
			sum = sum+i;
			
			//이번횟수까지의 합
			System.out.println( i + "까지의 정수의 합은 " + sum +" 입니다.");
		}
		
		
		
		sc.close();

	}

}
