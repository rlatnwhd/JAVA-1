/*
 * 작성일 : 2024년, 3월, 19일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 다중 if문 실습
 * 		 하나의 정수를 입력 받아 음수인지 양수인지 0인지 확인하는 프로그램
 * 
 * 문제분석 : 음수는 0보다 작은 수
 * 			양수는 0보다 큰 수
 * 			둘 다 아닌 0
 * 			정수를 입력 받아 0보다 큰지 작은지 비교, 판단.
 *
 * 알고리즘 : 1. 정수를 입력받는다
 * 			2. 입력 받은 정수가 0보다 작은지 판단
 * 				2-1. 0보다 작으면 해당 정수는 음수입니다. 출력
 * 			3. 입력 받은 정수가 0보다 큰 지 판단
 * 				3-1. 0보다 크면 해당 정수는 양수입니다. 출력
 * 			4. 아니면(나머지는..)
 * 				4-1. 0이면 해당 정수는 0입니다. 출력
 */

import java.util.Scanner;

public class MultiIfTest1 {

	public static void main(String[] args) {
		// 1. Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		// ★ 만약 정수가 0보다 작으면? 크면? 그것도 아니면?
		
		// 2. 입력 받은 정수가 0보다 작은지 판단
		if(num < 0) {
			System.out.println(num + "은(는) 음수입니다.");
		} // if 종료 시점
		else if (num > 0) { // 3. 입력 받은 정수가 0보다 큰지 판단
			System.out.println(num + "은(는) 양수입니다.");
		} // else if 종료 시점
		else { // 4. 아니면(나머지는..)
			System.out.println(num + "은(는) 양수입니다.");
		} // else 종료 시점
		
		// 조건과 상관없이 무조건 출력되는 문장
		System.out.println("프로그램 종료.");
	}
}