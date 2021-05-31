package com.javaex.ex05;

public class Ex06 {
	
	public static void main(String[] args) {
		
		int[] inArray = new int[3];
		
		inArray[0]=11;
		inArray[1]=3;
		//inArray[2]=78; //값을 넣지않은 경우 정수형->0으로 표기된다.
		
		System.out.println("--------------------");
		System.out.println(inArray.length);
		System.out.println("--------------------");
		
		for(int i=0; i<inArray.length; i++) {
			System.out.println(inArray[i]);
		}
		
		System.out.println("--------------------");
		
		//ArrayIndexOutOfBoundsException -> 없는 방 사용할때
		for(int i=0; i<inArray.length; i++) {
			System.out.println(inArray[i]);
		}
	}
}
