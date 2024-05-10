/*
 * 작성일 : 2024년, 5월, 10일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 */
class Box5 {
	int width;
	int height;
	int depth;
	
	public Box5() { // 매개 변수가 없는 생성자
		width = 1;
		height = 1;
		depth = 1;
	}
	
	public Box5(int w) { // 매개 변수가 1개인 생성자
		width = w;
		height = 1;
		depth = 1;
	}
	
	public Box5(int w, int h) { // 매개 변수가 2개인 생성자
		width = w;
		height = h;
		depth = 1;
	}
	
	public Box5(int w, int h, int d) { // 매개 변수가 3개인 생성자
		width = w;
		height = h;
		depth = d;
	}
}

public class BoxOverloading01 {

	public static void main(String[] args) {
		Box5 mybox1 = new Box5();
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(매개 변수 없음) : " + vol);
		
		Box5 mybox2 = new Box5(1);
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("박스의 부피(매개 변수 1개) : " + vol);
		
		Box5 mybox3 = new Box5(1, 1);
		vol = mybox3.width * mybox3.height * mybox3.depth;
		System.out.println("박스의 부피(매개 변수 2개) : " + vol);
		
		Box5 mybox4 = new Box5(1, 1, 1);
		vol = mybox4.width * mybox4.height * mybox4.depth;
		System.out.println("박스의 부피(매개 변수 3개) : " + vol);
	}

}
