/*
 * 작성일 : 2024년, 4월, 5일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 알고싶은 단을 입력 받아 구구단을 출력하시오.
 * 
 * 문제분석 : 단은 2부터 9까지
 * 			곱하는 수는 1부터(초기값) 9까지(조건식) 1씩 증가(증감식)한다.
 * 			곱셈의 결과는 단 * 수 이다.
 * 			곱셈의 과정이 하나씩 출력되어야 한다.
 * 		
 * 알고리즘 : 
 * 		1. 단은 1부터 9까지 반복한다.
 * 			1-1. 곱하는 수는 1부터 9까지 반복한다.
 * 				1-1-1. 구구단을 출력
 * 
 */

public class NestedLoopTest1 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9 ; i++) {
			System.out.printf("=== %d 단 ===\n", i);
			for (int j = 1; j <= 9 ; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
	}

}
