/*
 * 작성일 : 2024년, 3월, 26일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 조건식 연습
 * 		 숫자와 연산자를 입력 받아
 * 		 사칙 연산 프로그램을 작성하시오.
 * 		 입력 방식 : 3 + 4 (띄어쓰기로 구분)
 * 
 * [문제분석과 알고리즘]
 * 		숫자 연산자 숫자를 입력 받아
 * 		해당 연산자에 따른 결과 출력
 * 			
 */

import java.util.Scanner;

public class SwitchTest3 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("연산식 입력 (ex : 3 + 4): ");
		int num1 = stdIn.nextInt();
		/*
		* 사용자로부터 입력된 문자열에서 첫 번째 문자, 즉 연산자를 추출한다.
		* stdIn.next()는 문자열을 입력받는 메서드이다.
		* 입력된 문자열에서 첫번째 문자를 추출하기 위해서는 charAt(0)을 사용한다 .
		* 3 + 4와 같이 입력했을 때 '+' 연산자를 추출할 수 있다.
		*/
		char oper = stdIn.next().charAt(0);
		int num2 = stdIn.nextInt();
		
		switch(oper) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case '-' :
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case '*' :
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case '/' :
			if (num2==0) {
				System.out.println("해당 수로 나눌 수 없습니다.");
			}
			else {
				System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
			}
			break;
		default :
			System.out.println("잘못된 수식입니다.");
		}
	}

}
