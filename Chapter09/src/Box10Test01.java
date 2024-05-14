/*
 * 작성일 : 2024년, 5월, 14일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
class Box10 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	private long idNum;
	
	// 클래스 변수, static으로 정의
	private static long boxID = 0;
	
	// 생성자
	public Box10(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		idNum = ++boxID;
		
		volume();
	}
	
	// 리턴 값이 없는 메소드
	private void volume() {
		vol = width * height * depth;
	}
	
	// 문자열 리턴 값이 있는 메소드
	public String getvolume() {
		return idNum + "번 박스의 부피 : " + vol;
	}
	
	// 클래스 메소드애는 클래스 변수와 지역 변수만 사용 가능하다
	public static long getCCurrentID() {
		// return idNum; // 객체 변수를 사용하면 오류 발생
		return boxID; // 클래스 변수를 사용
	}
}

public class Box10Test01 {

	public static void main(String[] args) {
		Box10 mybox1; // 객체 선언
		
		// 반복하면서 객체 생성하고 생성자 호출
		for(int i = 1; i <= 5; i++) {
			mybox1 = new Box10(i, i+1, i+2);
			System.out.println(mybox1.getvolume());
		}
		
		// 클래스 메소드는 클래스명으로 접근
		System.out.println("마지막 생성된 박스 번호 : " + Box10.getCCurrentID() + "번");
		
		// 클래스 변수는 클래스명으로 접근
		// private으로 선언되어 접근이 불가능
		// System.out.println(Box10.boxID);
	}

}
