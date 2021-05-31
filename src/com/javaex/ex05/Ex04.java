package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		//방갯수가 변경될 때 주의// for문에서 개수 부분을 변경해줘야함 
		
		int[] n = new int[8]; //갯수 6 -> 8 
		
		//수동으로 해야함// 방이름+length = 한그룹
		for(int i=0; i<8; i++) {
			n[i] = (int)(Math.random()*45)+1;
		}
		
		System.out.println(n.length);
		System.out.println("--------------------");
		
		for(int i=0; i<8; i++) { //1<6  1<=6 6방은 없다 -> 예외발생
			System.out.println(n[i]);
		}
		
		System.out.println("--------------------");

		for(int i=0; i<6; i++) { // 방 갯수보다 작으면 그만큼 나오고 많으면 방갯수만큼만 나오고 나머지는 안나옴
			System.out.println(n[i]);
		}

		
	}

}
