/*
 * 작성일 : 2024년, 5월, 24일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 예약어 super
 */

class ST1a {
	public int x = 500;
	public int y = 1000;
}

class ST1b extends ST1a {
	public String x = "처음 시작하는 자바";
	public String xx = x + super.x; // 상위 클래스의 멤버변수 x에 값 넣기
	public String yy = y + " " + super.y; // 상위 클래스의 멤버변수 y에 값 넣기 / y == super.y
}
// x, xx, yy, 상속받은 y, 상위클래스는 ㅌ가 없다

public class SuperTest1 {

	public static void main(String[] args) {
	
		ST1b st2 = new ST1b();
		
		System.out.println("객체 sb2에 들어있는 x, y값 : " + st2.x +  st2.x);
		System.out.println("객체 sb2에 들어있는 xx값 : " + st2.xx);
		System.out.println("객체 sb2에 들어있는 yy값 : " + st2.yy);
	}
}