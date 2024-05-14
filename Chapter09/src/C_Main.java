/*
 * 작성일 : 2024년, 5월, 14일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
public class C_Main {
	int count = 10; // 객체 변수
	static int num = 20; // 클래스 변수
	
	// 메소드 선언
	public int sum (int x, int y) {
		return x + y;
	}
	
	// 클래스 메소드 선언
	static int mul(int x, int y) {
		return x * y;
	}
	
	// 메인 메소드 - 클래스 매소드
	public static void main(String[] args) {
		int same; // 메인 메소드에서 선언한 지역 변수
		
		// 반드시 클래스 변수와 지역 변수만 사용 가능
		// same = count; // count는 객체 변수여서 오류 발생
		
		same = num;
		System.out.println("num = " + same);
		
		// 클래스 메소드가 아니여서 오류 발생
		// same = sum(5, 5); // 호출 불가능
		
		same = mul(5, 5);
		System.out.println("mul = "+ same);
	}

}
