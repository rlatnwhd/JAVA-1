/*
 * 작성일 : 2024년, 3월, 22일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 내포된 if문 실습
 * 		 점수는 0~100점 사이 입니다.
 * 		 점수 범위를 벗어나면 "잘못된 점수입니다." 출력하세요.
 * 
 * 문제분석 : 입력 받은 점수가 0~100점 사이인가?
 * 			점수가 0~100점 사이가 아니면?
 * 			90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 *			60점 이상이면 D학점
 *			60점 미만이면 F학점
 *			점수는 정수로 입력 받는다.
 *
 * 알고리즘 : 1. 정수(점수)를 입력받는다
 * 			2. if 점수의 범위가 0~100 사이인가?
 * 				1) 점수가 90점 이상인가?
 * 					1)-1. A학점입니다. 출력
 * 				2) 아니면(else) 점수가 80점 이상인가?
 * 					2)-1. B학점입니다. 출력
 * 				3) 아니면(else) 점수가 70점 이상인가?
 * 					3)-1. C학점입니다. 출력
 * 				4) 아니면(else) 점수가 60점 이상인가?
 * 					4)-1. D학점입니다. 출력
 * 				5) 아니면(나머지는..)
 * 					5)-1. F학점입니다. 출력
 * 
 * 			3. else 아니면?
 * 				1) 잘못된 점수입니다. 출력
 * 			
 */

import java.util.Scanner;

public class NextedIfCTest1 {

	public static void main(String[] args) {
		// 1. Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = stdIn.nextInt(); // 점수 입력받기
		
		if(score <= 100 && score >= 0) { // 2. 점수가 0~100점 사이인가?
			if(score >= 90) { // 1)-1. 해당 정수가 90점 이상인가?
				System.out.println("A학점입니다.");
			}
			else if(score >= 80) { // 2)-1. 아니면 해당 정수가 80점 이상인가?
				System.out.println("B학점입니다.");
			}
			else if(score >= 70) { // 3)-1. 아니면 해당 정수가 70점 이상인가?
				System.out.println("C학점입니다.");
			}
			else if(score >= 60) { // 4)-1. 아니면 해당 정수가 60점 이상인가?
				System.out.println("D학점입니다.");
			}
			else if(score >= 0) { // 5)-1. 아니면 해당 점수가 60점 미만인가?
				System.out.println("F학점입니다.");
			}
			else { // 6)-1. 아니면.. 나머지는..
				System.out.println("잘못된 입력입니다.");
			}
		}
		else { // 3. 아니면.. 나머지는..
			System.out.println("잘못된 점수입니다.");
		}
	}

}
