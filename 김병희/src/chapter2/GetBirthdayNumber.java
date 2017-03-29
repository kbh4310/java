package chapter2;
import java.util.Scanner;


public class GetBirthdayNumber {

	public static void main(String[] args) {
		System.out.println("주민번호 써주세요");
		Scanner scanner = new Scanner(System.in).useDelimiter("\\s|-");
		System.out.println("당신의 주민번호 앞자리는 " + scanner.next());
	}

}
