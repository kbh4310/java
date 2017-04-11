package chapter4;

public class Rectangle {
	int x1, y1, x2, y2;
	int x_length, y_length;
	
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1, 1, 2, 3);
		
		r.show();
		s.show();
		
		System.out.println(s.square());
		
		r.set(-2, 2, -1, 4);
		r.show();
		
		System.out.println(r.square());
		
		if(r.equals(s)){
			System.out.println("두 사각형은 같습니다.");
		}
		
	}
	
	public Rectangle(){
		
	}
	
	public Rectangle(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	void set(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	int square(){
		int square;
		if( x1 > x2 ){
			x_length = x1 - x2;
		}else{
			x_length = x2 - x1;
		}
		
		if( y1 > y2 ){
			y_length = y1 - y2;
		}else{
			y_length = y2 - y1;
		}
		
		if(x_length < 0) x_length = -x_length;
		if(y_length < 0) y_length = -y_length;
		
		square = x_length * y_length;
		if(square < 0) square = -square;
		
		return square;
	}
	
	void show(){
		 
		System.out.println("넓이는 " + square() + "밑변의 길이는 " + x_length + "높이는 " + y_length);
	}
	
	boolean equals(Rectangle r){
		return true;
	}
}
