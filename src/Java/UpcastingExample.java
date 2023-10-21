package Java;

public class UpcastingExample {
	public static void main(String[] args) {
		Parent p1 = (Parent) new Child();
		Parent p2 = (Parent) new Child();
		
		// here code compile but it it will give runtime exception which is CCE 
		 
		//Object obj = new Object();
		//StringBuffer str = (StringBuffer)obj;
		p1.PrintData();
		p2.PrintData();
	}
}

class Child extends Parent {
	public void PrintData() {
		System.out.println("Method of Parent Class");
	}
}

class Parent {
	public void PrintData() {
		System.out.println("Method of Parent Class");
	}
}
