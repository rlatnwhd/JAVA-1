/*
 * 작성일 : 2024년, 4월, 5일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 정수를 입력받아 그 수의 약수를 출력하시오.
 * 
 * 문제분석 : 약수란 어떤 정수가 있을 때 나누어 떨어지게 하는 수
 * 		    정수를 입력받는다.
 * 			수를 1부터 수를 입력받은 정수까지 반복하면서 수를 1씩 증가
 * 			입력 받은 정수를 수로 나누었을 때 나누어 떨어지면(나머지가 0이면) -> 약수
 * 		
 * 알고리즘 : 
 * 		1. 정수을 입력받는다.(정수)
 * 		2. 수를 2부터 수를 입력받은 정수 전까지 반복하면서 수를 1씩 증가한다.(초기값)(조건식)(증감식)
 * 			2-1. 만약 정수를 수로 나누었을 때 나머지가 0이면
 * 				2-1-1). 약수로 출력
 */

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("약수를 구할 정수를 입력하세요. : ");
		int num = stdIn.nextInt();
		
		System.out.printf("%d의 약수(for) : ", num);
		for (int i = 1; i <= num; i++) {
			if(num%i==0) System.out.print(i + " ");
		}
		
		System.out.printf("\n%d의 약수(while) : ", num);
		int i = 1;
		while (i <= num) {
			if(num%i==0) System.out.print(i + " ");
			i++;
		}
	}

}
