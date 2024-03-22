/*
 * 작성일 : 2024년, 3월, 22일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 조건식 연습.
 * 		 3, 4, 5월 => 봄
 * 		 6, 7, 8월 => 여름
 * 		 9, 10, 11월 => 가을
 * 	     12, 1, 2월 => 겨울
 * 
 * 문제분석 : 입력 받아야 할 값은
 * 			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12이다.
 * 			0이거나 13을 입력하면? -> 해당 월은 없습니다.
 * 			
 * 			다중 if? 내포된 if?
 *
 * 알고리즘 : 1. 정수(월) 입력받기
 * 			2. 만약 
 * 			
 */

import java.util.Scanner;

public class ComConditionTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("월 입력(1~12) : ");
		int month = stdIn.nextInt();
		
		if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울입니다.");
		}
		else if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄입니다.");
		}
		else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름입니다.");
		}
		else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을입니다.");
		}
		else {
			System.out.println("해당 월은 없습니다.");
		}
	}

}
