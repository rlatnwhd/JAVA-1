/*
 * 작성일 : 2024년, 5월, 31일
 * 작성자 : 컴퓨터공학부 202395007 김수종
 * 설명 : student_class 클래스를 작성하세요.
 * 		 private String name
 * 		 private int studentId
 * 		 private double grade
 * 
 * 다음 요구 사항을 만족하는 생성자를 작성하세요.
 * 기본 생성자 : name을 "홍길동", studentId를 0, grade를 0.0으로 초기화합니다.
 * 매개변수가 있는 생성자 : 이름, 학생 ID, 학점을 입력받아 초기화합니다.
 * 
 * 메소드 : printStudentInfo() : 학생의 정보를 출력합니다.
 * 
 * --------------------------------------------------------------------
 * 
 * student 클래스
 * main 매소드 : student_class로 부터 객체 두 개 생성하고, 각각의 정보를 출력합니다.
 * 
 * [출력결과]
 * Name : 홍길동, Student ID : 0, 학점 : 0.0
 * Name : 김수종, Student ID : 202395007, 학점 : 4.2
 */

class student_class {
	 private String name; // 속성 - 매개변수
	 private int studentId;
	 private double grade;
	 
	 // 생성자 - 매개변수가 없는 묵시적 생성자 - 학생 정보 기본 세팅하는 기능
	 public student_class() {
		 name = "홍길동";
		 studentId = 0;
		 grade = 0.0;
	 }
	 
	// 생성자 - 매개변수가 있는 명시적 생성자
	 // 생성자 오버로딩 - 매개변수의 개수와 타입이 "무조건" 달라야함
	 // 학생 정보를 전달 받아 세팅하는 기능
	 public student_class(String name, int studentId, double grade) {
		 this.name = name;
		 this.studentId = studentId;
		 this.grade = grade;
	 }
	 
	 // 학생 정보 출력 메소드
	 public void printStudentInfo() {
		 System.out.println("Name : " + name + ", Student ID : " + studentId + ", 학점 : " + grade);
	 }
}

public class Student {

	public static void main(String[] args) {
		// 객체 생성
		// 매개변수가 없는 생성자 호출
		student_class s1 = new student_class();
		s1.printStudentInfo();
		
		// 내 정보를 가지고 생성자 호출
		student_class s2 = new student_class("김수종", 200395007, 4.2);
		s2.printStudentInfo();
	}

}
