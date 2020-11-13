package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자2개를 입력해주세요");
	
	System.out.print("숫자1: ");
	
	int no1 = sc.nextInt();
	
	System.out.print("숫자2: ");
	
	int no2 = sc.nextInt();
	
	if(no1 > no2) {System.out.println("큰수: " + no1 + "     작은수: " + no2 + "입니다."); }
	else if(no1 < no2) {System.out.println("큰수: " + no2 + "     작은수: " + no1 + "입니다."); }
	else {System.out.println("큰수: " + no1 + "     작은수: " + no2 + "입니다."); }
	
	
	
	sc.close();

	}

}
