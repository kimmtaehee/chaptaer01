package com.javaex.ex01;

public class Ex02 {
	public static void main(String[] args) {
		
		//실수형 기본 사용방법
		double ver01 = 3.14;
		float ver02 = 3.14F; //float형은 항상 값에 F를 붙어야한다
		
		System.out.println(ver01);
		System.out.println(ver02);
		
		//double float의 값 정확도 표현비교
		double ver03 = 0.1234567890123456789;
		float ver04 = 0.1234567890123456789F;
		
		System.out.println(ver03);
		System.out.println(ver04);
		
	}
}
