/*
 * 작성일 : 2024년, 4월, 30일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : PlusMinus 클래스 생성
 * 		 더하기, 빼기를 계산하는 기능
 */

public class PlusMinus {
	// 속성 정의 (즉, 클래스의 변수)
	int plus, minus;
	
	// 기능(메소드) 정의
	// plus 기능
	// 두 개의 정수형 값을 전달받아 합계를 구한 값을 돌려준다.
	public String plus(int x, int y) {
		// 여기서 plus는 메소드 이름이다. int plus(속성 변수)와는 다름
		// return(반환값)에 따라 자료형이 정해진다. (현재 문자열(String)반환)
		// this =  클래스의 변수를 가리킨다. (매개변수와 이름이 같을 때 혼동 방지)
		this.plus = x + y;
		return "두 수의 합은 " + plus; 
	}
	
	public String minus(int x, int y) {
		this.minus = x - y;
		return "두 수의 차는 " + minus;
	}
}
