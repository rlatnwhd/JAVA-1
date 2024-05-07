/*
 * 작성일 : 2024년, 5월, 7일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 두 개의 정수를 입력받아 두 수 사이의 모든 합과 짝수의 합, 홀수의 합을 출력하시오
 * 		 합을 출력하는 부분은 Sum() 클래스로 작성
 * 		 Sum() 클래스는 멤버변수와 3개의 메소드로 구성
 * 		 각 메소드는 2개의 값을 전달 받아 합을 계산하고 그 값을 돌려줍니다.
 * 
 * 문제분석 : 3개의 메소드 - 전체 합계 계산, 짝수의 합, 홀수의 합
 * 			멤버 변수 - 합계를 저장하는 전역 변수(sum)(클래스 안에 메소드 밖에 선언)
 * 			각 메소드에 접근하여 합계를 계산하려면 반드시 객체를 생성해야 함
 * 			객체를 통해서 각 메소드에 접근 가능
 * 
 * 알고리즘 : 1. 클래스 선언 - Sum
 * 				1-1. 멤버 변수 sum 초기화
 * 				1-2. 전체 합계를 계산하는 메소드 선언 - (메소드 자료형은 정수(반환값에 따라 달라짐))
 * 					1-2-1) 매개변수를 전달 받아 전체 합계 계산
 * 					1-2-2) 합계 반환 - (반환값은 정수)
 * 				1-3. 짝수 합계를 계산하는 메소드 선언
 *					1-3-1) 매개변수를 전달 받아 짝수 합계 계산
 * 					1-3-2) 합계 반환
 * 				1-4. 홀수 합계를 계산하는 메소드 선언
 *					1-4-1) 매개변수를 전달 받아 홀수 합계 계산
 * 					1-4-2) 합계 반환
 * 
 * 			2. 메인 메소드 작업
 * 				2-1. 사용자로부터 두 개의 정수를 입력받음
 * 				2-2. Sum 클래스로부터 객체 생성
 * 				2-3. 객체를 통해 두 정수를 전달하여 계산된 합계를 출력한다.
 */

import java.util.Scanner;

class Sum {
	// 멤버 변수 선언 -> 속성
	private int sum;
	
	// 전체 합계를 계산하는 메소드
	public int AllSum(int num1, int num2) {
		sum = 0; // 합계 초기화
		for(int i = num1; i <= num2; i++) sum+=i; // 합계 계산
		return sum;
	}
	
	// 짝수 합계를 계산하는 메소드
	public int EvenSum(int num1, int num2) {
		sum = 0; // 합계 초기화
		for(int i = num1; i <= num2; i++) { // 합계 계산
			if(i%2==0) sum+=i; // 짝수일 때만
		}
		return sum;
	}
	
	// 홀수 합계를 계산하는 메소드
	public int OddSum(int num1, int num2) {
		sum = 0; // 합계 초기화
		for(int i = num1; i <= num2; i++) { // 합계 계산
			if(i%2!=0) sum+=i; // 홀수일 때만
		}
		return sum;
	}
}

public class SumTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		// Sum 클래스로부터 객체 생성
		Sum s = new Sum();
		
		// 두 개의 정수를 입력받기
		System.out.println("덧셈을 수행할 두 개의 정수를 입력(작은 수부터 빈칸으로 구분)");
		System.out.print("두 개의 정수를 입력하세요 : ");
		int num1 = stdIn.nextInt();
		int num2 = stdIn.nextInt();
		
		// 입력받은 값은 s 객체를 통해서 Sum 클래스의 AllSum()메소드로 전달
		System.out.println("전체 합계 : " + s.AllSum(num1, num2));
		
		// 입력받은 값은 s 객체를 통해서 Sum 클래스의 EvenSum()메소드로 전달
		System.out.println("짝수 합계 : " + s.EvenSum(num1, num2));
		
		// 입력받은 값은 s 객체를 통해서 Sum 클래스의 OddSum()메소드로 전달
		System.out.println("홀수 합계 : " + s.OddSum(num1, num2));
	}

}
