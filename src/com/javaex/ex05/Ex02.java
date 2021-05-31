package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] n = new int[6]; //갯수
		/*
		n[0] =  (int)(Math.random()*45)+1;
		n[1] =  (int)(Math.random()*45)+1;
		n[2] =  (int)(Math.random()*45)+1;
		n[3] =  (int)(Math.random()*45)+1;
		n[4] =  (int)(Math.random()*45)+1;
		n[5] =  (int)(Math.random()*45)+1;
		*/
		
		for(int i=0; i<6; i++) {
			n[i] = (int)(Math.random()*45)+1;
		}
		
		
		/*
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		System.out.println(n[5]);
		*/
		
		for(int i=0; i<6; i++) {
			System.out.println(n[i]);
		}
		
	}

}
