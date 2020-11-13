package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		
		System.out.print("기호: ");
		
		String cal = sc.nextLine();
		
		System.out.print("숫자1: ");
		
		int no1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		
		int no2 = sc.nextInt();
		
		switch (cal)
		{case "+":
			System.out.println("결과는: " + (no1 + no2));
			break;
			
		case "-":
			System.out.println("결과는: " + (no1 - no2));
			break;
			
		case "*":
		System.out.println("결과는: " + (no1 * no2));
		break;
		
		case "/":
			if(no2==0) {System.out.println("계산할 수 없습니다.");}
		System.out.println("결과는: " + (no1 / no2));
		
		break;

		default:			System.out.println("계산할 수 없는 기호입니다.");
		
		
		}
	
		
		
		
		
		
		sc.close();
		
		

	}
}

