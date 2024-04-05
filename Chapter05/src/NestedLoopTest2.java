/*
 * 작성일 : 2024년, 4월, 5일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 정수를 입력받아 삼각형를 만드시오.
 * 
 * 문제분석 : 정수를 입력 받는다.
 * 			정수만큼 반복하여 한 줄 씩 쌓아간다.
 * 			한 줄이 끝날 때 마다 별이 하나씩 증가시킨다.
 * 			예) 정수 3 ->
 * 				★
 * 				★ ★
 * 				★ ★ ★
 * 		
 * 알고리즘 : 
 * 		1. 정수를 입력받는다.
 * 		2. 입력 받은 정수만큼 반복한다.
 * 			2-1. 2번 변수 만큼 반복한다.
 * 				2-1-1). 별을 출력한다.
 * 			2-2. 한 줄 띄우기
 */

import java.util.Scanner;

public class NestedLoopTest2 {
	
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = stdIn.nextInt();
		
		System.out.println("중첩 반복문 사용");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		
		System.out.println("\n중첩 반복문 사용 X");
		String star = "★ ";
		for (int i = 0; i < num; i++) {
			System.out.println(star);
			star = star + "★ ";
		}
	}
}
