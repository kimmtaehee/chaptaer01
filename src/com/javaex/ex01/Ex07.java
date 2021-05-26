package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {

        double v01 = 5/4;//int=int/int
        System.out.println(v01);//결과 int->double 형변환     

        double v02 = (double)5 / 4 ; 
        System.out.println(v02);   

        double v03 = 5 / (double)4 ;  
        System.out.println(v03);     

        double v04 = (double)5 / (double)4 ;  
        System.out.println(v04);    

        int v05 = (int)1.3 + (int)1.8 ;  
        System.out.println(v05);    
        
        int v06 = (int)(1.3+1.8);
        System.out.println(v06);
    }

}
