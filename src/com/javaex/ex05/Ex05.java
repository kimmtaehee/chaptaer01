package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// 세부문법
		
		/*
		int[] inArray = new int[3];
		
		inArray[0]=11;
		inArray[1]=3;
		inArray[2]=78;
		*/
		
		//int[] inArray = new int[] {11, 3, 78}; // new int[3]-> 이렇게 사용x
		int[] inArray = new int[] {11, 3, 78}; // 추천하지않음
		
		for(int i=0; i<inArray.length; i++) {
			System.out.println(inArray[i]);
		}
		
	}

}
