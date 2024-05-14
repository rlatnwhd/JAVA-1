/*
 * 작성일 : 2024년, 5월, 14일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
class Box9 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	
	public Box9(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		
		// 메소드 호출
		volume(); // private 이여도 같은 클래스 내에서 생성자가 호출 가능
	}
	
	// 메소드
	private void volume() {
		// vol은 private로 선언된 객체변수지만 내부에서는 사용 가능
		vol = width * height * depth;
	}
	
	public int getvolume() {
		return vol;
	}
}

public class Box9Test01 {

	public static void main(String[] args) {
		Box9 mybox1 = new Box9(10, 20, 30);
		
		// private로 선언되어 객체 변수 변경 불가능
		// mybox1.width = 20;
		
		// private로 선언된 메소드는 객체로 바로 접근 불가능
		// int vol1 = mybox1.volume();
		
		System.out.println("박스의 부피 : " + mybox1.getvolume());
	}

}
