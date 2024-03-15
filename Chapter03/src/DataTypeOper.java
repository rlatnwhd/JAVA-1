/*
 * 작성일 : 2024년, 3월, 15일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 연산과 자료형
 * 		 두 개의 정수를 입력 받아 평균을 계산하는 프로그램
 * 알고리즘 : 1. 두 정수를 입력 받는다.
 * 			2. 평균을 계산한다.
 * 			3. 평균을 출력한다.
 */

import java.util.Scanner;

public class DataTypeOper {

	public static void main(String[] args) {
		// 두 개의 정수를 입력 받는다.
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번쨰 정수를 입력하세요. : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번쨰 정수를 입력하세요. : ");
		int num2 = stdIn.nextInt();
		
		// 연산을 정수로만 했기 때문에 소수점 이하는 버려져 실수로는 표현이 되지만 소수점 이하는 버려져서 0으로 표시됨
		double avg1 = (num1 +  num2) / 2;
		System.out.println("(실수 미포함)두 정수 " + num1 + "와(과) " + num2 + "의 평균은 " + avg1 + "입니다.");
		
		// 연산이 실수가 포함되어 있기 때문에 값도 실수로 계산되어 출력됨
		double avg2 = (num1 +  num2) / 2.0;
		System.out.println("(실수 포함)두 정수 " + num1 + "와(과) " + num2 + "의 평균은 " + avg2 + "입니다.");
	}

}
