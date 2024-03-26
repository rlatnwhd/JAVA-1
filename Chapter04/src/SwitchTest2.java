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
 * 			문자열(January ~ December)이다.
 * 			잘못 입력하면? -> 해당 월은 없습니다.
 * 			
 * 			Switch ~ case 문 사용
 * 			
 *
 * 알고리즘 : 1. 문자열(월) 입력받기
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

public class SwitchTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("월 입력(Jnuary ~ December) : ");
		String month = stdIn.next();
		String MtoS;
		
		switch(month) { // 문자열 수식
		case "January" : case "February" : case "December" :
			MtoS = "겨울입니다.";
			break;
		case "March" : case "April" : case "May" :
			MtoS = "봄입니다.";
			break;
		case "June" : case "July" : case "August" :
			MtoS = "여름입니다.";
			break;
		case "September" :
			System.out.println("멋진 9월과");
		case "October" :
			System.out.println("아름다운 10월과");
		case "November" :
			System.out.println("낙엽의 11월은");
			MtoS = "가을입니다.";
			break;
		default :
			MtoS = "1~12월을 벗어난 달입니다.";
			break;
		}
		System.out.println(MtoS);
	}

}
