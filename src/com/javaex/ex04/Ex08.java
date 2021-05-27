package com.javaex.ex04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		

		int a = 1;
		
		while(true) {
			
			if(a%6==0 && a%14==0) {
				System.out.println(a);
				break;
				}
			a++;
			}

		sc.close();
	}

}
