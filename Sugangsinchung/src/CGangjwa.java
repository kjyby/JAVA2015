import java.io.IOException;
import java.util.Scanner;


public class CGangjwa {
	private String gwamokNumber; //���񿡼� �޾ƿ� ��
	CGwamok gwamok = new CGwamok();
	private String gangjwaNumber;
	public String getGwamokNumber() {return gwamokNumber;}
	public void setGwamokNumber(String gwamokNumber) {this.gwamokNumber = gwamokNumber;}
	public String getGangjwaNumber() {
		return gangjwaNumber;
	}
	public void setGangjwaNumber(String gangjwaNumber) {
		this.gangjwaNumber = gangjwaNumber;
	}
	public String getGyosuName() {
		return gyosuName;
	}
	public void setGyosuName(String gyosuName) {
		this.gyosuName = gyosuName;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	private String gyosuName;
	private String studentNumber;
	private String time;
	private String room;
	
	public void input() throws IOException{
		Scanner scan = new Scanner(System.in);
		gangjwaNumber = scan.nextLine();
		gyosuName = scan.nextLine();
		studentNumber = scan.nextLine();
		time = scan.nextLine();
		room = scan.nextLine();
		
	}
	public void output(){
		System.out.println("���¹�ȣ : " +gangjwaNumber);
		System.out.println("���� �̸� : " +gyosuName);
		System.out.println("�л� �� : " +studentNumber);
		System.out.println("���ǽð� : " +time);
		System.out.println("���ǽ� : " +room);
	}
}
