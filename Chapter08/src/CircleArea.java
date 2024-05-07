/*
 * 작성일 : 2024년, 5월, 7일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 원의 넓이를 구하기 위한 프로그램을 작성하시오 
 * 		 원의 특성를 나타내는 클래스 (SimpleCircle)을 정의하시오.
 * 		 클래스 변수 PI를 이용하여 원의 넓이를 구하는 프로그램을 완성하시오.(PI는 상수이다)
 * 
 * 문제분석 : 원의 특성인 원주율 3.14를 선언하는 클래스 작성
 * 			원주율(3.14)은 클래스 변수로 선언(종단 변수로 선언)
 * 			반지름과 원주율을 가지고 원의 넓이를 계산
 * 			반지름은 입력받음
 * 
 * 알고리즘 : 1. 클래스 선언 - SimpleCircle
 * 				1-1. 원주율 변수 PI 선언(클래스 종단 변수로 선언)
 * 
 * 			2. 메인 메소드 작업
 * 				2-1. 사용자로부터 반지름을 입력받음
 * 				2-2. 원의 넓이를 구함 (반지름 X 반지름 X 원주율)
 * 				2-3. PI는 객체를 통해서 클래스 변수에 접근 가능하지만
 * 					 클래스 변수로 선언된 변수는 클래스명으로 접근
 */

import java.util.Scanner;

class SimpleCircle {
	final static double PI = 3.14;
	// 클래스 변수는 static 으로 정의
}

public class CircleArea {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 반지름 입력 받기
		System.out.print("반지름을 입력하세요 : ");
		int r = stdIn.nextInt();
		
		// 2. 원의 넓이 구하기
		double area = r * r * SimpleCircle.PI;
		
		// 3. 출력
		System.out.printf("반지름이 %d인 원의 넓이 : %.2f", r, area);
	}

}
