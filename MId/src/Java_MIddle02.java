/*
 * 작성일 : 2024년, 4월, 23일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 사용자로부터 정수 10개를 입력받아 짝수의 개수와 짝수의 힙계를 출력하는 프로그램
 * 
 * 문제분석 : 사용자로부터 정수 10개를 입력받아 배열에 저장한다.
 * 			짝수는 2로 나누어 떨어지는 수이다.
 * 			배열의 요소마다 확인하여 2로 나누어 떨어진다면 카운트를 1 증가시키고 합계에 누적시킨다.
 * 
 * 알고리즘 : 1. 배열 생성(10개)
 * 			2. 변수 초기화
 * 			3. 0부터 배열의 길이만큼 1씩 증가하며 반복
 * 				3-1. 사용자로부터 정수를 입력받는다.
 * 				3-2. 입력받는 정수가 짝수라면?
 * 					3-2-1) 합계를 누적시킨다.
 * 					3-2-2) 카운트를 1 증가시킨다.
 *			4. 짝수의 개수를 출력시킨다.
 *			5. 짝수의 합계를 출력시킨다.
 */

import java.util.Scanner;

public class Java_MIddle02 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		int[] num202395007 = new int[10]; // 배열 초기화
		int count=0, sum=0;
		for(int i = 0; i < num202395007.length; i++) { // 0부터 배열의 길이만큼 1씩 증가하며 반복
			System.out.print((i+1) + "번째 정수 입력 : ");
			num202395007[i] = stdIn.nextInt();
			if (num202395007[i]%2==0) { // 입력받는 동시에 짝수인지 아닌지 판별
				sum+=num202395007[i]; 
				count++;
			}
		}
		System.out.println("짝수의 개수 : " + count);
		System.out.println("짝수의 합 : " + sum);
	}

}
