/*
 * 작성일 : 2024년, 5월, 21일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 상속과 한정자
 */

class A {
	public int aa = 1; // 멤버 변수, 모두 접근 가능
}

class B extends A {
	private int bb = 2; // 멤버 변수, B이외는 접근 불가능
	
	public int bb() { // 메소드, 모두 접근 가능
		return bb; // 이 메소드를 이용하여 외부에서는 접근이 불가능한 bb를 사용할 수 있음
	}
	// 이 클래스에는 aa, bb, bb()가 있음
}

class C extends B {
	// 이 클래스에는 aa, bb, bb()가 있음
	int cc = 3; // 한정자가 없으면 같은 패키지 내에서만 사용가능
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		C objC = new C(); // 객체 생성
		System.out.println("cc의 값은 : " + objC.cc); // 3
		// System.out.println("bb의 값은 : " + objC.bb); // 오류 발생. bb는 private로 선언되어 있음
		System.out.println("bb의 값은 : " + objC.bb()); // 메소드로 접근하여 bb값 출력. 2
		System.out.println("aa의 값은 : " + objC.aa); // 1
	}

}
