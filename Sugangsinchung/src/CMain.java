import java.io.IOException;
import java.util.Scanner;



public class CMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		CGwamok gwamok = new CGwamok();
		CGangjwa gangjwa = new CGangjwa();
		
		System.out.println("���� ��ȣ�� ������ �ֽʽÿ�.");
		System.in.read();
		
		
		String choose;
		System.out.println("���¸� �����Ͻðڽ��ϱ�? Y/N");
		choose = scan.next();
		if(choose == "Y"){
			System.out.println("00���� ���¸� �����մϴ�. ������ �Է����ּ���.");
			gangjwa.input();
		}else{
			
			System.out.println("���� ������ �����մϴ�.");
		}
		
		System.out.println("������ �����Ͻðڽ��ϱ�? Y/N");
		choose = scan.next();
		if(choose == "Y"){
		
		System.out.println("������ ���� ���°� �����Ǿ����ϴ�.");
		gangjwa.output();
		}else{
			System.out.println("���� ������ �����մϴ�.");
		}	
	}
	
	
}

