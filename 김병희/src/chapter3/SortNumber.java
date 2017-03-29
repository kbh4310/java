package chapter3;

import java.util.Scanner;

public class SortNumber {
	public static void main(String[] args){
		int number[] = new int[10];
		int swap;
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < number.length; i++){
			number[i] = scanner.nextInt();			
		}
		
		for(int i = 0; i < number.length; i++){
			for(int j = i; j < number.length; j++){
				if(number[i]  < number[j]){
					swap = number[i];
					number[i] = number[j];
					number[j] = swap;
				}
			}
			System.out.println(number[i]);
		}
	}
}
