/*
 * 작성일 : 2024년, 3월, 15일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 변수와 자료형
 */
public class VarDatatype {

	public static void main(String[] args) {
		// 상수 선언
		final int MAX = 100;
		final double PI = 3.14;
		
		// PI = 3.141592; 오류 발생! 상수로 선언된 값은 변경할 수 없다.
		
		int r = 5; // 정수
		double pi = 3.141592; // 실수
		String name = "김수종"; // 문자열
		char boold = 'O'; // 문자
		// char boold2 = 'AB'; 오류 발생! 문자는 1byte
		
		// 원주율 출력
		System.out.println("원주율은 " + PI + "입니다.");
		System.out.println("원주율은 " + pi + "입니다.");
		
		// 원의 넓이 출력 (일반 출력)
		System.out.println("반지름이 " + r + "인 원의 넓이는 " + PI*(r*r) + "입니다.");
		System.out.printf("반지름이 %d인 원의 넓이는 %g입니다.\n", r, PI*(r*r)); // 포맷 가능
		
		// 원의 넓이 출력 (변수 이용)
		// 원의 넓이 계산 후 변수에 저장
		double area = r * r * PI;
		
		// 변수를 이용하여 출력
		System.out.println("반지름이 " + r + "인 원의 넓이는 " + area + "입니다.");
		System.out.printf("반지름이 %d인 원의 넓이는 %.1f입니다.", r, area); // 포맷 가능
		
		
	}

}
