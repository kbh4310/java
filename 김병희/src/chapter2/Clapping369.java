package chapter2;
import java.util.Scanner;


public class Clapping369 {

	public static void main(String[] args) {
		int stack = 0;
		boolean flag = true;

		System.out.println("1 ~ 99 사이의 정수를 입력 해주세요");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();

		if(number.length() > 2){
			System.out.println("1 ~ 99 사이의 정수만 입력하세요");
		}else{

			char[] select_Num = number.toCharArray();
			for(int i = 0; i < number.length(); i++){
				if((int)select_Num[i]/10 != 0){
					flag = false;
				}
				if((int)select_Num[i]%3 == 0){
					stack++;
				}
			}
			
			if(flag){
				switch (stack) {
				case 0:
					System.out.println("박수");
					break;
				case 1:
					System.out.println("박수짝");
					break;
				case 2:
					System.out.println("박수짝짝");
					break;
				}
			}else{
				System.out.println("숫자를 입력 해주세요");
			}
		}


	}

}
