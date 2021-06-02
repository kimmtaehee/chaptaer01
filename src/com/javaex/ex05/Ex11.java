package com.javaex.ex05;
//java Ex11.java -> Ex11.class
//java Ex11 (Ex11.class)

//java Ex11
//java Ex11 i am kim tae hee
	
//java ->String[] args = new String[5];
public class Ex11 {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		if(args.length>0) {
			if(args.equals("-vesion")) { // Ex11 - vesion
				System.out.println("Ex11 버전 : 3.4343");
			}else if(args[0].equals("-help")){ // Ex11-help
				System.out.println("지금부터 도움말 어쩌구저쩌구");
				System.out.println("[-vesion] : 버전정보를 확인할수있습니다");
				System.out.println("[-help] : 도움말을 볼 수 있습니다");
			}else { //Ex11 i am kim tae hee
				for(int i=0; i<args.length; i++) {
					System.out.println(args[i]);
				}
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
