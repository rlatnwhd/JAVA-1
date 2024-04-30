/*
 * 작성일 : 2024년, 4월, 23일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 사용자로부터 정수를 입력받아 수에 해당하는 도형의 넓이를 출력하는 프로그램
 * 
 * 문제분석 : 사용자로부터 수를 입력받아 그 수에 해당하는 도형의 넓이를 계산한다.
 * 			변의 길이 혹은 반지름의 길이는 사용자로부터 정수로 입력받는다.
 * 			무한 반복을 사용하여 사용자로부터 0을 입력받기 전까지는 무한반복하게 시킨다.
 * 			1을 입력받으면 원의 넓이 (반지름 * 3.14)
 * 			2을 입력받으면 삼각형의 넓이 (밑변 * 높이 / 2.0)
 * 			3을 입력받으면 정사각형의 넓이 (한 변의 길이 * 한 변의 길이)
 * 			4를 입력받으면 자신의 학과 학번 이름이 출력
 * 			0을 입력받으면 프로그램 종료
 * 			그 외는 잘못된 입력 이라고 출력되게 한다.
 * 			switch case문 사용.
 * 			
 * 
 * 알고리즘 : 1. 변수 초기화
 * 			2. 무한 반복하면서
 * 				2-1. 사용자로부터 정수를 입력받는다.
 * 				2-2. 만약 입력받은 수가 0이면
 * 					2-2-1). 프로그램 종료 -> break;
 * 				2-3. switch 입력받은 수에 대하여
 * 					2-3-1). 만약 1이면?
 * 						-> 사용자로부터 반지름을 입력받는다.
 * 						-> 원의 넓이를 구하여 출력한다.
 * 					2-3-2). 만약 2이면?
 * 						-> 사용자로부터 밑변을 입력받는다.
 * 						-> 사용자로부터 높이을 입력받는다.
 * 						-> 삼각형의 넓이를 구하여 출력한다.
 * 					2-3-3). 만약 3이면?
 * 						-> 사용자로부터 한 변의 길이를 입력받는다.
 * 						-> 정사각형의 넓이를 구하여 출력한다.
 * 					2-3-3). 만약 4이면?
 * 						-> 본인의 학과 학번 이름을 출력한다.
 * 					2-3-4). 그 외라면?
 * 						-> 잘못된 입력입니다. 출력
 * 
 */

import java.util.Scanner;

public class Java_Middle01 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		int num = 0, num1, num2; // 변수는 사용할 때마다 초기화 되므로 2개만 있어도 충분하다
		while(true) { // 무한 반복
			System.out.print("정수 입력 : ");
			num = stdIn.nextInt();
			if (num == 0) { // 0을 입력받으면
				System.out.println("프로그램을 종료합니다.");
				break; // 프로그램 종료
			}
			switch(num) { // switch 입력받은 수(num)에 대하여
			case 1:
				System.out.println("원의 넓이를 구합니다.");
				System.out.print("반지름 입력 : ");
				num1 = stdIn.nextInt();
				System.out.println("원의 넓이 : " + (num1*3.14)); // (반지름 * 3.14)
				break; // 다른 case문이 실행되지 않도록 break를 반드시 넣어준다
			case 2:
				System.out.println("삼각형의 넓이를 구합니다.");
				System.out.print("밑변 입력 : ");
				num1 = stdIn.nextInt();
				System.out.print("높이 입력 : ");
				num2 = stdIn.nextInt();
				System.out.println("삼각형의 넓이 : " + (num1*num2/2.0)); // (밑변 * 높이 / 2.0)
				break;
			case 3:
				System.out.println("정사각형의 넓이를 구합니다.");
				System.out.print("한 변의 길이 입력 : ");
				num1 = stdIn.nextInt();
				System.out.println("정사각형의 넓이 : " + (num1*num1)); // (한 변의 길이 * 한 변의 길이)
				break;
			case 4:
				System.out.println("학과 : 컴퓨터공학부"); // 본인 학과 학번 이름 출력
				System.out.println("학번 : 202395007");
				System.out.println("이름 : 김수종");
				break;
			default: // 그 외는 잘못된 입력 출력
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}

}