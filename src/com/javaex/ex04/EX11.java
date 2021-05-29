package com.javaex.ex04;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		/*
		System.out.println("숫자를 입력하세요.[0이면 종료]");

		int n;
		int sum = 0;
		
		n = sc.nextInt();
		sum = sum + n;
				System.out.println("합계 : " + sum);
		
		while( n!=0) {
			n = sc.nextInt();
			sum = sum + n;
					System.out.println("합계 : " + sum);
		}
		System.out.println("종료");
		*/
		
		/*
		System.out.println("숫자를 입력하세요.[0이면 종료]");

		int n;
		int sum = 0;
		
		
		do {
			n = sc.nextInt();
			sum = sum + n;
					System.out.println("합계 : " + sum);
		}
		while(n !=0 );
		
		System.out.println("종료");
		*/
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");

		int n;
		int sum = 0;
		
		while(true) {
			n = sc.nextInt();
			sum = sum + n;
				System.out.println("합계 : " + sum);
			if(n == 0) {
				break;
			}
		}
		
		System.out.println("종료");
		
		sc.close();
	}

}
