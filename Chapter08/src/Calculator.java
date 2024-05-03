/*
 * 작성일 : 2024년, 5월, 3일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 클래스 모음
 * 		 main 메소드가 있는 클래스에만 public을 붙힌다,
 *       다른 클래스에는 붙히지 않는다.
 */

class PlusMinus {
	// 속성 정의 (즉, 클래스의 변수)
	int plus, minus;
	
	// 기능(메소드) 정의
	// plus 기능
	// 두 개의 정수형 값을 전달받아 합계를 구한 값을 돌려준다.
	public String plus(int x, int y) {
		// 여기서 plus는 메소드 이름이다. int plus(속성 변수)와는 다름
		// return(반환값)에 따라 자료형이 정해진다. (현재 문자열(String)반환)
		// this =  클래스의 변수를 가리킨다. (매개변수와 이름이 같을 때 혼동 방지)
		this.plus = x + y;
		return "두 수의 합은 " + plus; 
	}
	
	public String minus(int x, int y) {
		this.minus = x - y;
		return "두 수의 차는 " + minus;
	}
}

// 곱하기 나누기 클래스 생성
// 더하기, 빼기, 곱하기, 나누기 기능을 다 가지고 있다.
// 상속 -> extends
class MultiDiv extends PlusMinus {
	
	// 기능(변수) 정의
	int multi;
	double div;
	
	// multi 기능(메소드) 정의
	public String multi(int x, int y) {
		this.multi = x * y;
		return "두 수의 곱은 " + multi;
	}
	
	// div 기능(메소드) 정의
	// private -> 접근 금지 (캡슐화)
	private String div(int x, int y) {
		this.div = x / (double)y;
		return "두 수를 나눈 값은 " + div;
	}
	
	
}

// main 메소드가 있는 클래스에만 public을 붙힌다.
public class Calculator {

	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성
		PlusMinus pm = new PlusMinus();
		// MultiDiv 클래스로부터 객체 생성
		MultiDiv md = new MultiDiv();
		
		// 변수 선언
		String sum, cha, mul;
		
		// pm 객체를 통해 PlusMinus 클래스에 있는 메소드 호출
		// plus 메소드
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// minus 메소드
		cha = pm.minus(10, 20);
		System.out.println(cha);
		
		// md 객체를 통해 MultiDiv 클래스에 있는 메소드 호출
		// multi 메소드
		mul = md.multi(10, 20);
		System.out.println(mul);
		
		// md 객체를 통해 더하기 결과 출력
		// 상속받아 사용하기에 plus 메소드 접근 가능
		// 메시지가 요구하는 메소드가 자신의 클래스에 없으면
		// 상위 클래스에서 메소드를 찾음
		sum = md.plus(10, 20); // 값을 보내는 것을 메시지(message) 라고함
		System.out.println(sum);
		
		// String = div 메소드
		// 접근 제한자 private 때문에 접근 금지됨 -> 오류 발생
		// div = md.div(5, 2);
		// System.out.println(div);
	}

}
