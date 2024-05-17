/*
 * 작성일 : 2024년, 5월, 17일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : 사용자로부터 값을 입력 받아 그 입력 값의 개수에 따라 도형의 넓이, 부피를 구하는 프로그램
 *       입력 값이 한 개이면 원의 넓이, 입력 값이 두 개이면 사각형의 넓이,
 *       입력 값이 세 개이면 육면체 부피를 계산합니다.
 *       넓이, 부피 계산하는 부분은 메소드 오버로딩으로 작성하시오.
 *       사용자가 엔터키를 누르면 입력을 종료하고,
 *       종료전에 입력한 숫자의 개수에 따라 도형의 결과 값을 출력합니다.
 */

import java.util.Scanner;

class Overload {
	private double vol;
	
	public Overload() {
		
	}
	
	public Overload(int w) {
		vol = volume(w);
	}
	
	public Overload(int w, int h) {
		vol = volume(w, h);
	}
	
	public Overload(int w, int h, int d) {
		vol = volume(w, h, d);
	}
	
	private double volume(int w) {
		return w * w * Math.PI;
	}
	
	private int volume(int w, int h) {
		return w * h;
	}
	
	private int volume(int w, int h, int d) {
		return w * h * d;
	}
	
	public void get_vol() {
		System.out.printf("넓이 : %.2f\n", vol);
	}
}
public class OverloadTest1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Overload ov = new Overload();
		while(true) {
			System.out.print("정수를 입력하세요.(최대 3개, 띄어쓰기로 구분) : ");
			String input = scanner.nextLine().trim();
			if (input.isEmpty()) { break; }
			String[] shape_len = input.split("\\s+");
			switch(shape_len.length) {
				case 1:
					ov = new Overload(Integer.valueOf(shape_len[0]));
					ov.get_vol();
					break;
				case 2:
					ov = new Overload(Integer.valueOf(shape_len[0]), Integer.valueOf(shape_len[1]));
					ov.get_vol();
					break;
				case 3:
					ov = new Overload(Integer.valueOf(shape_len[0]), Integer.valueOf(shape_len[1]), Integer.valueOf(shape_len[2]));
					ov.get_vol();
					break;
				default :
					System.out.println("정수가 너무 많습니다.");
			}
		}
	}

	private static void Overload(String string) {
		// TODO Auto-generated method stub
		
	}

}
