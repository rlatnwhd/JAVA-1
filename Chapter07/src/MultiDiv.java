/*
 * 작성일 : 2024년, 4월, 30일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : MultiDiv 클래스 생성
 * 		 곱하기, 나누기 계산하는 기능이 있다.
 * 		 그리고 더하기, 빼기 기능도 있다.
 */

// PlusMinus 로부터 상속 (extends 사용)
public class MultiDiv extends PlusMinus {
	// 기능(변수) 정의
	int multi;
	double div;
	
	// multi 기능(메소드) 정의
	public String multi(int x, int y) {
		this.multi = x * y;
		return "두 수의 곱은 " + multi;
	}
	
	// div 기능(메소드) 정의
	// private -> 접근 금지 (캡슐화)
	private String div(int x, int y) {
		this.div = x / (double)y;
		return "두 수를 나눈 값은 " + div;
	}
	
	
}
