/*
 * 작성일 : 2024년, 3월, 15일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 3항 연산자
 * 		 정수를 입력 받아 짝수인지 확인하는 프로그램
 * 알고리즘 : 1. 정수를 입력 받는다.
 * 			2. 짝수인지 확인
 */

import java.util.Scanner;

public class TernaryOpTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = stdIn.nextInt();
		
		boolean result; // true, false
		result = (num % 2 == 0) ? true : false;
		
		System.out.print(num + "은(는) 짝수입니까? : ");
		System.out.println(result);

	}

}
