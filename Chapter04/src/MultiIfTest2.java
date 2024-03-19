/*
 * 작성일 : 2024년, 3월, 19일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 이중 if문 실습
 * 		 하나의 정수를 입력 받아 음수인지 양수인지 확인하는 프로그램
 * 
 * 문제분석 : 90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 *			60점 이상이면 D학점
 *			60점 미만이면 F학점
 *			점수는 정수로 입력 받는다
 *
 * 알고리즘 : 1. 정수(점수)를 입력받는다
 * 			2. 점수가 90점 이상인가?
 * 				2-1. A학점입니다. 출력
 * 			3. 아니면(else) 점수가 80점 이상인가?
 * 				2-1. B학점입니다. 출력
 * 			4. 아니면(else) 점수가 70점 이상인가?
 * 				2-1. C학점입니다. 출력
 * 			5. 아니면(else) 점수가 60점 이상인가?
 * 				2-1. D학점입니다. 출력
 * 			6. 아니면(나머지는..)
 * 				2-1. F학점입니다. 출력
 */

import java.util.Scanner;

public class MultiIfTest2 {

	public static void main(String[] args) {
		// 1. Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = stdIn.nextInt();
		
		if(score >= 90) { // 2. 해당 정수가 90점 이상인가?
			System.out.println("A학점입니다.");
		}
		else if(score >= 80) { // 3. 아니면 해당 정수가 80점 이상인가?
			System.out.println("B학점입니다.");
		}
		else if(score >= 70) { // 4. 아니면 해당 정수가 70점 이상인가?
			System.out.println("C학점입니다.");
		}
		else if(score >= 60) { // 5. 아니면 해당 정수가 60점 이상인가?
			System.out.println("D학점입니다.");
		}
		else { // 6. 아니면(나머지는..)
			System.out.println("F학점입니다.");
		}
	}

}
