package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("-----------------------");

		int[] arrB = new int[3]; // int[] arrB = arrA; 비교
		
		//값복사
		for(int i=0; i<arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		//arrA출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("-----------------------");
		//arrB출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("-----------------------");
		
		//arrA[1] 6->100변경    arrA만 변경되고 arrB는 변경안되는거 확인
		arrA[1] = 100;
		
		//arrA출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("-----------------------");
		//arrB출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrB[i]);
		}
		
	}

}
