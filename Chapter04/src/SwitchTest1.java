/*
 * 작성일 : 2024년, 3월, 26일
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
 * 			Switch ~ case 문 사용
 *
 * 알고리즘 : 1. 정수(월) 입력받기
 * 			2. 만약 3월, 4월, 5월이면
 * 				2-1. 봄입니다. 출력 	
 * 			3. 만약 6월, 7월, 8월이면
 * 				3-1. 여름입니다. 출력 
 *			4. 만약 9월, 10월, 11월이면
 * 				4-1. 가을입니다. 출력 
 * 			5. 만약 12월, 1월, 1=2월이면
 * 				5-1. 겨울입니다. 출력
 * 			6. 아니면.. 나머지는..
 * 				6-1. 해당 월은 없습니다. 출력	
 * 			
 */

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("월 입력(1~12) : ");
		int month = stdIn.nextInt();
		
		switch(month) { // 정수 수식
		// if (month == 3 || month == 4 || month == 5)
		case 3 : case 4 : case 5 :
			System.out.println("봄입니다.");
			break;
		// else if (month == 6 || month == 7 || month == 8)
		case 6 : case 7 : case 8 :
			System.out.println("여름입니다.");
			break;
		// else if (month == 9 || month == 10 || month == 11)
		case 9 : case 10 : case 11 :
			System.out.println("가을입니다.");
			break;
		// else if (month == 1 || month == 2 || month == 3)
		case 1 : case 2 : case 12 :
			System.out.println("겨울입니다.");
			break;
		// else
		default :
			System.out.println("해당 월은 없습니다.");
		}
	}

}
