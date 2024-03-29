/* 작성일 : 2024년, 3월, 29일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 두 정수를 입력받아 두 수가 모두 짝수이면 더한 결과를 출력하고,
 * 		 그렇지 않고 두 수중 하나라도 홀수이면
 * 		 몇 번째 입력한 수를 짝수로 입력해야하는지 출력하시오.
 * 
 * [문제분석]
 * 		짝수는 2로 나눈 나머지가 0인 수
 * 		홀수는 2로 나눈 나머지가 0이 아닌 수(나머지가 1)
 * 		경우의 수는 4개
 * 		- 첫 번쨰 수가 짝수, 두 번쨰 수가 짝수 (두 수를 더한 값 출력)
 * 		- 첫 번쨰 수가 홀수, 두 번쨰 수가 짝수 (첫 번째 수를 짝수로 변경하세요. 출력)
 * 		- 첫 번쨰 수가 짝수, 두 번쨰 수가 홀수 (두 번째 수를 짝수로 변경하세요. 출력)
 * 		- 첫 번쨰 수가 홀수, 두 번쨰 수가 짝수 (두 수 모두 짝수로 변경하세요. 출력)
 * 
 * [알고리즘]
 * 		1. 두 정수를 입력 받는다.
 * 		2. 만약 두 개의 정수 모두 홀수이면
 * 			2-1. 두 수 모두 짝수로 변경해야 합니다.
 * 		3. 첫 번째 정수가 홀수이면
 * 			3-1. 첫 번째 수를 짝수로 변경해야 합니다.
 * 		4. 두 번째 정수가 홀수이면
 * 			4-1. 두 번째 수를 짝수로 변경해야 합니다.
 * 		5. 아니면.. 나머지는..
 * 			5-1. 두 수를 더한 값 출력
 */

import java.util.Scanner;

public class SelectiveTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("첫 번쨰 정수 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번쨰 정수 입력 : ");
		int num2 = stdIn.nextInt();
		
		switch ((num1%2)+(num2%2)) {
		case 0:
			System.out.println("두 정수의 합 : " + (num1+num2));
			break;
		case 1:
			if(num2%2==0) {
				System.out.println("첫 번째 정수를 짝수로 변경해야합니다");
			}
			else {
				System.out.println("두 번째 정수를 짝수로 변경해야합니다");
			}
			break;
		default:
			System.out.println("두 정수 모두 짝수로 변경해야합니다.");
		}
	}
}
