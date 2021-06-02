package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		//int numA = 3;
		//int numB = numA;
		
		
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("-----------------------");
		
		int[] arrB = arrA;
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		//arrA[1] 6 -> 100 변경했을 경우 b에도 100으로 나오는가
		//arrA[1] 변경확인 arrB[1] 동일하게 변경확인
		
		System.out.println("-----------------------");
		
		arrA[1] = 100;
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("-----------------------");
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		
		
		
	}

}
