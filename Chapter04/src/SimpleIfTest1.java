/*
 * 작성일 : 2024년, 3월, 19일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 단순 if문 실습
 * 		 하나의 정수를 입력 받아 음수인지 확인하는 프로그램
 * 
 * 문제분석 : 음수는 0보다 작은 수
 * 			정수를 입력 받아 0보다 작은지 비교, 판단.
 *
 * 알고리즘 : 1. 정수를 입력받는다
 * 			2. 입력 받은 정수가 0보다 작은지 판단
 * 				2-1. 0보다 작으면 해당 정수는 음수입니다. 출력
 */

import java.util.Scanner;

public class SimpleIfTest1 {

	public static void main(String[] args) {
		// 1. Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		// 2. 음수인지 판단.
		// 만약에 변수에 저장된 값(입력 받은 값)이 0보다 작으면?
		if(num < 0) {
			System.out.println(num + "은(는) 음수입니다.");
		} // if 종료 시점
		
		// 조건과 상관없이 무조건 출력되는 문장
		System.out.println("프로그램 종료.");
	}

}
