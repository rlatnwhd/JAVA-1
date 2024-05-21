/*
 * 작성일 : 2024년, 5월, 21일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 상속과 클래스
 */

class DA1 {
	public double d1;
	public DA1() { // DA1클래스의 묵시적 생성자
		System.out.println("클래스 DA1의 묵시적 생성자 수행");
		d1 = 10 * 10;
	}
}

class DA2 extends DA1 {
	public double d2; 
	public DA2() { // DA2클래스의 묵시적 생성자
		System.out.println("클래스 DA2의 묵시적 생성자 수행");
		d2 = 10 * 10 * 10;
	}
	// d2, DA2(), d1을 가지고 있음
	// 생성자는 상속되지 않음
}

class DA3 extends DA2 {
	public double d3; 
	public DA3() { // DA3클래스의 묵시적 생성자
		System.out.println("클래스 DA3의 묵시적 생성자 수행");
		d3 = 10 * 10 * 10 * 10;
	}
	// d3, DA3(), d2, d1을 가지고 있음
	// 생성자는 상속되지 않음
}

public class DefaultInheritanceTest1 {

	public static void main(String[] args) {
		DA3 da3 = new DA3(); // 객체 생성 => DA3의 묵시적 생성자 수행
		// 상위 클래스의 묵시적 생성자가 우선 수행
		
		System.out.println("--------------------------");
		DA2 da2 = new DA2();
		
		System.out.println("--------------------------");
		DA1 da1 = new DA1();
	}

}

// 상속관계에서 하위 클래스에서 묵시적 생성자가 있는 경우,
// 하위 클래스로부터 객체가 생성될 때 상위 클래스의 묵시적 생성자가 우선 수행

