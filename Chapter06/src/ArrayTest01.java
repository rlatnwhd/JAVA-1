/*
 * 작성일 : 2024년, 4월, 16일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 1차원 배열을 생성하고, 묵시적 초기값을 출력한다.
 * 		 그리고 시용자로부터 값을 입력 받아 배열에 저장하고, 합과 평균을 출력하시오.
 */

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		int sum = 0, i;
		double avg;
		// 배열 생성
		int num[] = new int[5];
		// 배열의 길이 출력
		System.out.println("배열의 길이 : " + num.length);
		
		// 배열에 저장된 초기값 출력
		System.out.println("\n배열에 저장된 초기값");
		for(i = 0; i < num.length; i++) {
			System.out.printf("num[%d] = %d\n",i,num[i]);
		}
		
		// 사용자로부터 값을 입력받는다.
		System.out.println("\n사용자로부터 값을 입력받아 배열에 저장");
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		for(i = 0; i < num.length; i++) {
			System.out.print(i + "번지 값을 입력하세요 : ");
			num[i] = stdIn.nextInt();
			sum+=num[i]; // 합계 누적
		}
		
		// 배열에 저장돤 값 출력
		System.out.println("\n배열에 저장돤 값 출력");
		for(i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}
		
		// 배열에 저장된 값들의 합계와 평균 출력
		System.out.println("\n배열에 저장된 값들의 합계와 평균 출력");
		System.out.println("합계 : " + sum + "\n평균 : " + (double)sum/num.length);
	}

}
