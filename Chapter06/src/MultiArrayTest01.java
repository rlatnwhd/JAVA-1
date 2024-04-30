/*
 * 작성일 : 2024년, 4월, 30일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 2차원 배열을 생성하고, 랜덤수를 배열의 초기값으로 설정한다 
 */

import java.util.Arrays;
import java.util.Random;

public class MultiArrayTest01 {

	public static void main(String[] args) {
		// 2차원 배열 생성
		// 행, 열
		int[][] num = new int[4][4];
		int sum;
		
		// 랜덤으로 값 초기화를 위해 랜덤 객체 생성
		Random rand = new Random();
		
		// 2차원 배열에 값을 저장
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				num[i][j] = rand.nextInt(10);
		
		System.out.println("2차원 배열의 내용을 반복문을 사용하여 출력");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++)
				System.out.print(num[i][j] + " ");
			System.out.println();
			
		}
		
		System.out.println("\n2차원 배열의 내용을 문자열로 출력");
		System.out.println(Arrays.deepToString(num));
		
		
		/*
		 0번 줄의 0, 1, 2, 3칸의 합을 계산한다.
		 1번 줄의 0, 1, 2, 3칸의 합을 계산한다.
		 2번 줄의 0, 1, 2, 3칸의 합을 계산한다.
	  	 3번 줄의 0, 1, 2, 3칸의 합을 계산한다.
		 줄을 기준으로 각 칸의 합을 계산하고, 각 줄에 합을 출력한다.
		 한 줄의 합이 계산되어 출력되면 다음 줄의 합을 계산하기 위해
		 sum = 0으로 다시 초기화 시킨다.
		*/
		System.out.println("\n각 줄의 칸의 값들을 합하여 출력");	
		for(int i = 0; i < num.length; i++) { // 배열의 길이까지(행의 길이 까지)
			sum = 0; // 합계 초기화
			for(int j = 0; j < num[i].length; j++) // 배열의 길이까지(길의 길이 까지)
				sum += num[i][j]; // 합계 누적
			System.out.printf("%d번째 줄의 합 : %d\n", i, sum);
		}
	}
}
