package Dday;

import java.util.*;


public class main {

	public static void main(String[] args) {
		int year, month, day, hour, minute, seconds;
		int d_year, d_month, d_day, d_hour, d_minute, d_seconds;
		Calendar now = Calendar.getInstance();
		int time = 60;
		System.out.println(now);
		
		
		Scanner scanner = new Scanner(System.in).useDelimiter("\\s|-|:");
		
		try{
			year = Integer.parseInt(scanner.next());	// - now.get(now.YEAR);
			month = Integer.parseInt(scanner.next()); 	//- now.get(now.MONTH) + 1;
			day = Integer.parseInt(scanner.next());		// - now.get(now.DAY_OF_MONTH);
			hour = Integer.parseInt(scanner.next()); 	// - now.get(now.HOUR_OF_DAY);
			minute = Integer.parseInt(scanner.next());	// - now.get(now.MINUTE);
			seconds = Integer.parseInt(scanner.next());	// - now.get(now.SECOND);
			
			if(year - now.get(now.YEAR) == 0){
				if( month - now.get(now.MONTH) + 1 == 0 ){
					if( day - now.get(now.DAY_OF_MONTH) == 0 ){
						if( hour - now.get(now.HOUR_OF_DAY) == 0 ){
							if( minute - now.get(now.MINUTE) == 0 ){
								
							}else{
								d_minute = minute - now.get(now.MINUTE);
								System.out.println("현재 남은 시간 " + minute +"분");
							}
						}else{
							d_hour = hour - now.get(now.HOUR_OF_DAY);
							System.out.println("현재 남은 시간 " + d_hour +"시간");
						}
					}else{
						d_day = day - now.get(now.DAY_OF_MONTH);
						System.out.println("현재 남은 시간 " + d_day +"일");	
					}
				}else if( month - now.get(now.MONTH) + 1 == 1 ){
					switch( now.get(now.MONTH) ){
						case 1: case 3: case 5: case 7: case 8: case 10: case 12:
							d_day = 31 - day + now.get(now.DAY_OF_MONTH);
							break;
						case 2:
							if( year%4 == 0 ){
								if( year%100 == 0 ){
									if( year%400 == 0 ){
										d_day = 29 - day + now.get(now.DAY_OF_MONTH);
									}else{
										d_day = 28 - day + now.get(now.DAY_OF_MONTH);
									}
								}else{
									d_day = 29 - day + now.get(now.DAY_OF_MONTH);
								}
							}else{
								d_day = 28 - day + now.get(now.DAY_OF_MONTH);	
							}
							break;
						default:
							d_day = 30 - day + now.get(now.DAY_OF_MONTH);
							break;
					}
					if( d_day >= 30 ){
						System.out.println("현재 남은 시간 1달");
					}else{
						System.out.println("현재 남은 시간 " + d_day +"일");	
					}
				}else{
					d_month = month - now.get(now.MONTH) + 1;
					System.out.println("현재 남은 시간 " + d_month +"달");
				}
			}else if( month - now.get(now.MONTH) + 1 < 0 ){
				d_month = -(month - now.get(now.MONTH)) + 1;
				System.out.println("현재 남은 시간 " + d_month +"달");
			}else{
				d_year = year - now.get(now.YEAR);
				System.out.println("현재 남은 시간 " + d_year +"년");
			}
			
		}catch (NumberFormatException | StringIndexOutOfBoundsException e) {
			System.out.println("yyyy-mm-dd HH:MM:SS 형식에 맞게 입력하세요");
		}
	}

}
