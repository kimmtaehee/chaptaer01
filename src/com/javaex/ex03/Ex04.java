package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
	
		
				
		int time = sc.nextInt(); // 
		int wage = 10000;
		int night = 12000;
		
		if(time<8) {
			
			System.out.println("임금은 " + time * wage  +" 원 입니다");
		}
		
		else {
			
			System.out.println("임금은 " + time * night +" 원 입니다");
		}
		
		sc.close();

	}

}
