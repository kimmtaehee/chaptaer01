package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
	
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본 &&
		System.out.println("&&연산자------------------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//논리 연산자 기본 ||
		System.out.println("||연산자------------------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//논리 연산자 응용
		System.out.println("논리 연산자 응용------------------");
		System.out.println((a>b)&&(a<b)); //(5>7) ->f (5<7)->t f&&t ->f
		System.out.println((a>b)&&(a>b)); //(5>7) ->f (5>7)->f f&&f ->f
		System.out.println((a>b)||(a<b)); //(5>7) ->f (5<7)->t f||t ->t
		System.out.println((a>b)||(a<b)&&(a<b)); //(5>7) ->f (5<7)->t f||t ->t (5<7)->t  t&&t->t
		System.out.println((a>b)&&(a<b)||(a<b)); //(5>7) ->f (5<7)->t f&&t ->f (5<7)->t f||t->t
		
		System.out.println((a>b)&&(a<b)&&(a<b)); //(5>7)->f (5<7)->t (5<7)->t t&&t&&t -> f
		
		System.out.println("논리 연산자 응용 !------------------");
		System.out.println((a<b)); //5<7 ->t
		System.out.println((a>b)&&(a>b)); //5>7->f 5>7->f f&&f -> f  
		System.out.println(!(a>b)&&(a>b)); // !(f) -> t
		
		System.out.println((a>b)&&!(a>b)); // f && (!f)-> f&&(t) ->f
		System.out.println(!(a>b)&&!(a>b)); // !f&&!f -> t&&t -> t
		
		
		
	}
}
