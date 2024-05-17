/*
 * 작성일 : 2024년, 5월, 17일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
class Box11 {
	// 객체 변수
	// private 로 선언되었지만 클래스 내에서는 사용 가능
	private int ivol;
	private double dvol;
	
	public Box11(int w, int h, int d) {
		volume(w, h, d);
	}
	
	public Box11(double w, double h, double d) {
		volume(w, h, d);
	}
	
	private void volume(int w, int h, int d) {
		ivol = w * h * d;
	}
	
	private void volume(double w, double h, double d) {
		dvol = w * h * d;
	}
	
	public int get_ivol() { // 메소드
		return ivol;
	}
	
	public double get_dvol() { // 메소드
		return dvol;
	}
}

public class Box11Test01 {

	public static void main(String[] args) {
		// 객체 생성. 매개 변수가 정수 3개인 생성자가 호출
		Box11 mybox1 = new Box11(10, 20, 30);
		System.out.println("박스의 부피(정수 매개 변수) : " + mybox1.get_ivol());
		
		mybox1 = new Box11(10.5, 20.5, 30.5);
		System.out.println("박스의 부피(실수 매개 변수) : " + mybox1.get_dvol());
		
		mybox1 = new Box11(10, 20, 30.5);
		System.out.println("박스의 부피(정수 매개 변수) : " + mybox1.get_dvol());
	}

}