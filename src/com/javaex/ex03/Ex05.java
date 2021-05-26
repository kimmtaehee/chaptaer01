package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int time = sc.nextInt();
		int wage = time*10000+(time-8)*5000;
		
		if(time<=8) {
			System.out.print("임금은 " + time * 10000 + " 원 입니다.");
		}
		else {
			System.out.print("임금은 " + wage + " 원 입니다.");
		}
		
		sc.close();

	}

}
