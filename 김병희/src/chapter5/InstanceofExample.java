package chapter5;

class Researcher extends Student{

}

class Professor extends Researcher{

}

public class InstanceofExample {

	public static void instanceOf(Person person){
		if(person instanceof Student){
			System.out.println("Student Ÿ��");
		}
		if(person instanceof Researcher){
			System.out.println("Researcher Ÿ��");
		}
		if(person instanceof Professor){
			System.out.println("Professor Ÿ��");
		}
	}

	public static void main(String[] args) {
		Person jee = new Student();
		Person kim = new Professor();
		Person lee = new Researcher();
		
		instanceOf(jee);
		instanceOf(kim);
		instanceOf(lee);

	}

}
