/*
 * 작성일 : 2024년, 4월, 23일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 사용자로부터 정수를 입력받아 1부터 입력받은 수까지의 각 수의 약수를 출력하고 소수인지 아닌지 출력하는 프로그램
 * 
 * 문제분석 : 사용자로부터 정수를 입력받아 1부터 입력받은 수까지 반복한다.
 * 			그리고 각 수마다 약수를 구하여 출력하게 한다.
 * 			약수는 어떤 수를 나누어 떨어지게 하는 수 이다.
 * 			(ex -> 6의 약수 : 1 2 3 6)
 * 			또한 해당 수의 약수 개수를 확인하여 2개이면 소수라고 출력하게 한다.
 * 			(ex -> 5의 약수 : 1 5 소수이다)
 * 			이중반복문을 사용하여 약수를 구하면서 동시에 카운트를 하여 소우인지 아닌지를 판별한다.
 * 
 * 알고리즘 : 1. 변수를 초기화한다.
 * 			2. 사용자로부터 정수를 입력받는다.
 * 			3. 1부터 입력받은 수까지 1씩 증가하며 반복
 * 				3-1. 카운트 변수를 반복할 떄마다 초기화 시킨다.
 * 				3-2. 1부터 첫번째 반복문의 변수만큼 1씩 증가하며 반복하면서
 * 					3-2-1). 첫번째 반복문의 변수를 두번째 반복문의 변수로 나누었을 때 나누어 떨어지면?
 * 						-> 두번째 반복문의 현재 변수 값을 출력
 * 						-> 카운트를 1 증가시킴
 * 					3-2-2). 만약 카운트가 2라면?
 * 						-> 소수이다 출력
 * 					3-2-3) 줄바꿈
 */

import java.util.Scanner;

public class Java_Middle03 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		int i, j;
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		for(i = 1; i <= num; i++) { // 1부터 입력받은 수까지 1씩 증가하며 반복
			int count = 0; // 카운트 변수를 반복할 떄마다 초기화 시킨다.
			System.out.print(i + "의 약수 : ");
			for(j = 1; j <= i; j++) { // 1부터 첫번째 반복문의 변수만큼 1씩 증가하며 반복하면서
				if(i%j==0) {
					System.out.print(j + " ");
					count++;
				}
			}
			if(count == 2) {
				System.out.print("소수이다");
			}
			System.out.println();
		}
	}

}
