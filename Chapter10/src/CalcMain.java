/*
 * 작성일 : 2024년, 5월, 28일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */

import java.util.Scanner;

class Calculater {
	int num1; // 멤버 변수
	int num2;
	char oper;
	private int result; // 결과값은 private로 선언
	
	public Calculater(int num1, char oper, int num2) {
		this.num1 = num1; // this를 이용하여 이름이 같은 멤버변수와 매개변수를 구분
		this.oper = oper;
		this.num2 = num2;
		calculation(num1, oper, num2); 
	}
	
	private void calculation(int num1, char oper, int num2) { // 입력 받은 값으로 연산을 하는 메소드
		switch(oper) { // switch case문으로 연산자 구분
			case '+' :
				result = num1 + num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
		}
	}
	
	public int resultPrint() { // private으로 선언된 결과를 출력하기 위한 메소드
		return result;
	}
}

public class CalcMain {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // Scanner 객체 생성
		
		System.out.print("사칙연산을 입력하세요. 공백으로 구분 (ex : 3 + 2) : ");
		int num1 = stdIn.nextInt(); // 숫자 입력받기
		char oper = stdIn.next().charAt(0); // 연산자를 입력 받기위해 문자 하나만 골라 받음
		int num2 = stdIn.nextInt();
		
		Calculater cal = new Calculater(num1, oper, num2); // 인스턴스 생성
		System.out.println(num1 + " " + oper + " " + num2 + " = " + cal.resultPrint());
		// 결과를 받아 출력
		
	}

}
