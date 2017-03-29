package chapter3;

import java.util.Scanner;

public class GetGCD {

	public static void main(String[] args) {
		try{
			Scanner scanner = new Scanner(System.in);
			int num1 = Integer.parseInt(scanner.next());
			int num2 = Integer.parseInt(scanner.next());
			
			System.out.println(GCD(num1,num2));
			
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
	}
	
	static int GCD(int x, int y){
		if( x%y == 0 ){
			return y;
		}else{
			return GCD(y, x%y);
		}
	}

}
