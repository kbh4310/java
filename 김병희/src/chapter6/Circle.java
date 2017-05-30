package chapter6;

public class Circle {

	int x,y,radius;
	
	public Circle(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public boolean equals(Circle circle){
		if(circle.radius == this.radius){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Circle a = new Circle(1, 2, 5);
		Circle b = new Circle(6, 6, 5);
		
		if(a.equals(b)){
			System.out.println("두개의 객체는 동일하다.");
		}else{
			System.out.println("두개의 객체는 다르다.");
		}
	}

}
