/*
 * 작성일 : 2024년, 4월, 12일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 1부터 입력받은 수까지 합계를 구하는 프로그램
 * 
 * 문제분석 : 초기값 : 1
 * 			조건식 : 입력받은 수
 * 			증감식 : 1씩 증가
 * 			하면서 1부터 입력받은 수까지의 합계를 구하는데
 * 			무한반복을 사용하여 프로그램을 작성
 * 			(while(true) 혹은 for(;;)을 사용하여 무한반복 진행)
 * 
 * 알고리즘 : 1. 숫자(정수)를 입력받는다.
 * 			2. 초기값 num = 1, 합계 누적 변수 sum = 0을 초기화 시킨다.
 * 			3. 무한반복(for(;;))을 하면서
 * 				3-1. sum=sum+num 합계를 누적시킨다.
 * 				3-2. num을 1증가
 * 				3-3. 만약 num이 입력받은 수 보다 크면?
 *					3-3-1). break -> 반복문을 벗어난다.
 *			4. 합계를 출력한다.
 */

import java.util.Scanner;

public class BreakTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		// 1. 숫자(정수)를 입력받는다.
		int end = stdIn.nextInt();
		// 2. 초기값 num = 1, 합계 누적 변수 sum = 0을 초기화 시킨다.
		int num = 1, sum = 0;
		// 3. 무한반복(for(;;))을 하면서
		for(;;) {
			// 3-1. sum=sum+num 합계를 누적시킨다.
			sum+=num;
			// 3-2. num을 1증가
			num++;
			// 3-3. 만약 num이 입력받은 수 보다 크면?
			if (num > end) // 조건식과 증감식의 위치에 다라 값이 달라질 수 있다.
				// 3-3-1). break -> 반복문을 벗어난다.
				break;
		}
		System.out.printf("1부터 %d까지의 합계는 %d입니다.", end, sum);
	}
}
