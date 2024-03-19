/*
 * 작성일 : 2024년, 3월, 19일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 이중 if문 실습
 * 		 하나의 정수를 입력 받아 짝수인지 홀수인지 확인하는 프로그램
 * 
 * 문제분석 : 짝수 -> 2로 나눈 나머지가 0
 * 			홀수 -> 2로 나눈 나머지가 1 (0이 아니다)
 * 			(if)짝수 아니면 (else)홀수
 *
 * 알고리즘 : 1. 정수를 입력받는다
 * 			2. 입력 받은 정수가 짝수인지 판단
 * 				2-1. 해당 정수는 짝수입니다. 출력
 * 			3. 아니면
 * 				3-1. 해당 정수는 홀수입니다. 출력
 */

import java.util.Scanner;

public class DoubleIfTest2 {

	public static void main(String[] args) {
		// 1. Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		// 2. 입력받은 정수가 짝수인지 판단
		if(num % 2 == 0) {
			// 2-1. 해당 정수는 짝수입니다.
			System.out.println(num + "은(는) 짝수입니다.");
		} // if 종료 시점
		else { // 3. 아니면
			// 3-1. 해당 정수는 홀수입니다.
			System.out.println(num + "은(는) 홀수입니다.");
		} // else 종료 시점
	}

}