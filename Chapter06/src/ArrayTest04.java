/*
 * 작성일 : 2024년, 4월, 19일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 배열의 복사
 * 
 * 		 배열의 복사는 값이 복사되는 것이 아닌 주소를 복사한다.
 * 		 배열을 복사하면 같은 주소를 가리키게 된다.
 */

import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		int num1[] = {10, 20, 30};
		int num2[] = {40, 50, 60};
		System.out.println("num1에 저장된 값 : " + Arrays.toString(num1));
		// Arrays.toString 배열의 내용을 문자열의 형태로 반환하는 메소드
		// 배열의 내용을 쉽게 확인하고 디버깅하는데 사용
		// 출력 결과 -> [10, 20, 30]
		System.out.println("num2에 저장된 값 : " + Arrays.toString(num2));
		
		System.out.println("----------------------------------");
		
		// 배열명을 이용하여 배열 복사
		// 같은 주소를 가리킨다. 주소가 복사된다.
		num2 = num1;
		System.out.println("num1에 저장된 값 : " + Arrays.toString(num1));
		System.out.println("num2에 저장된 값 : " + Arrays.toString(num2));
		
		System.out.println("----------------------------------");
		
		num2[2] = 200; // num[2]의 값을 200으로 변경
		System.out.println("num2[2] = 200");
		System.out.println("num1에 저장된 값 : " + Arrays.toString(num1));
		System.out.println("num2에 저장된 값 : " + Arrays.toString(num2));
		// 같은 주소를 가리키기 때문에 num1[2]와 num2[2]의 요소 모두 200이 된다.
		
		System.out.println("----------------------------------");
		
		int num3[] = {100, 200, 300};
		int num4[] = {400, 500, 600};
		System.out.println("num3에 저장된 값 : " + Arrays.toString(num3));
		System.out.println("num4에 저장된 값 : " + Arrays.toString(num4));
		
		System.out.println("----------------------------------");
		
		// 배열에 값 복사
		for(int i=0; i<num3.length; i++) { num4[i] = num3[i]; } // 배열의 값을 각각 저장
		System.out.println("num3에 저장된 값 : " + Arrays.toString(num3));
		System.out.println("num4에 저장된 값 : " + Arrays.toString(num4));
		
		System.out.println("----------------------------------");
		
		num4[2] = 999; // num4[2]의 값을 999로 변경
		System.out.println("num4[2] = 999");
		System.out.println("num3에 저장된 값 : " + Arrays.toString(num3));
		System.out.println("num4에 저장된 값 : " + Arrays.toString(num4));
		
	}

}
