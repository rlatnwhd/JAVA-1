/*
 * 작성일 : 2024년, 4월, 30일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 메인 메소드가 있는 클래스
 * 		 클래스로부터 객체를 생성하여 계산 결과를 출력한다.
 */

public class Calculator {

	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성
		PlusMinus pm = new PlusMinus();
		MultiDiv md = new MultiDiv();
		
		// 변수 선언
		String sum, cha, mul, div;
		
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
		
		// div 메소드
		// 접근 제한자 private 때문에 접근 금지됨 -> 오류 발생
		div = md.div(5, 2);
		System.out.println(div);
	}

}
