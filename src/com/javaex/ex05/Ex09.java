package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {

		//배열 같음 판단
		int [] arrA = new int[3];
		arrA[0] = 10;
		arrA[1] = 20;
		arrA[2] = 30;
		
		int[] arrB = new int[3];
		arrB[0] = 10;
		arrB[1] = 70;
		arrB[2] = 30;
		
		//배열A 배열B 같은지 판단 -> 배열의 갯수, 값이 순서가 같아야한다
		
		if(arrA.length == arrB.length) {//배열의 갯수가 같다
			//첫번재부터 값 비교
			
			for(int i=0; i<arrA.length; i++) {
			
				if(arrA[i] != arrB[i]) {
					System.out.println( i + "번째 값이 다릅니다.");
				}
			}
		}else {//배열의 크기가 다르다
			System.out.println("배열의 크기가 다릅니다");
		}
		
		
		
		
		
	
		}
		
	}
