package chapter3;

import java.util.Scanner;

public class GetAlphabet {
	public static void main(String[] args){
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",	"t", "u", "v", "w", "x", "y", "z"};
		int get_length = 0;
		System.out.print("���ĺ� �� ���ڸ� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		String get_key = scanner.next();
		for(int i = 0; i < alphabet.length; i++){
			if(alphabet[i].equals(get_key)){
				get_length = i;
			}
		}
		for(int i = get_length; i >= 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print(alphabet[j]);
			}
			System.out.println();
		}
	}
}
