/*
 * 작성일 : 2024년, 4월, 12일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 점수를 입력 받아 합계와 평균을 출력하라
 * 		 음수가 입력되면 점수 입력이 종료된다.
 * 		 100점 초과의 점수는 계산에 포함되지 않는다.
 * 
 * 문제분석 : 합계를 누적할 변수를 초기화 시킨다.
 * 			반복 횟수를 저장시킬 변수를 초기화 시킨다.
 * 			무한 반복하여 점수를 입력 받는다.
 * 			입력 받은 점수를 이용하여 합계를 계산하여 누적시킨다.
 * 			100점 초과의 점수를 입력 받으면
 * 			합계 누적을 시키지 않고 반복문의 처음으로 되돌아 간다.
 * 			만약 음수를 입력 받으면 반복문을 종료시킨다.
 * 
 * 알고리즘 : 1. 합계를 저장할 변수 초기화 sum = 0, 반복 횟수 변수 초기화 i = 0
 * 			2. 무한 반복을 하면서
 * 				2-1. 점수(정수)를 입력받는다. 변수 : score
 * 				2-2. 만약 100점 초과면?
 * 					2-2-1). continue 반복문의 처음으로 되돌아 간다.
 * 				2-3. 만약 음수이면?
 * 					2-3-1). break 무한 반복문을 벗어난다.
 * 				2-4. 합계를 누적시킨다. sum+=score
 * 				2-5. 반복 횟수를 1 증가 시킨다.
 * 			3. 점수의 합계와 평균 출력
 * 				
 * 			
 */

import java.util.Scanner;

public class ContinueBreak1 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		// 1. 합계를 저장할 변수 초기화 sum = 0, 반복 횟수 변수 초기화 i = 0
		int sum = 0, i = 0;
		// 2. 무한 반복을 하면서
		for(;;) {
			System.out.print("점수를 입력하세요. : ");
			// 2-1. 점수(정수)를 입력받는다. 변수 : score
			int score = stdIn.nextInt();
			// 2-2. 만약 100점 초과면?
			if (score > 100) {
				// 2-2-1). continue 반복문의 처음으로 되돌아 간다.
				System.out.println("1부터 100까지의 점수만 입력하세요.");
				continue;
			}
			// 2-3. 만약 음수이면?
			if (score < 0)
				// 2-3-1). break 무한 반복문을 벗어난다.
				break;
			// 2-4. 합계를 누적시킨다. sum+=score
			sum+=score;
			// 2-5. 반복 횟수를 1 증가 시킨다.
			i++;
		}
		// 3. 점수의 합계와 평균 출력
		System.out.printf("합계 : %d\n평균 : %.2f", sum, (double)sum/i);
	}

}
