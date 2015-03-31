import java.io.IOException;
import java.util.Scanner;



public class CMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		CGwamok gwamok = new CGwamok();
		CGangjwa gangjwa = new CGangjwa();
		
		System.out.println("과목 번호를 선택해 주십시오.");
		System.in.read();
		
		
		String choose;
		System.out.println("강좌를 생성하시겠습니까? Y/N");
		choose = scan.next();
		if(choose == "Y"){
			System.out.println("00과목 강좌를 생성합니다. 정보를 입력해주세요.");
			gangjwa.input();
		}else{
			
			System.out.println("강좌 생성을 종료합니다.");
		}
		
		System.out.println("정말로 생성하시겠습니까? Y/N");
		choose = scan.next();
		if(choose == "Y"){
		
		System.out.println("다음과 같은 강좌가 생성되었습니다.");
		gangjwa.output();
		}else{
			System.out.println("강좌 생성을 종료합니다.");
		}	
	}
	
	
}

