package Java;

//dawncasting is not possible in java eplicitly but it is possible explicitly
public class DawnCasting {
		public static void main(String[] args) {
				Parent01 p = new Child01();
				p.name="Wasim";
				
				// performing downcasting implicitly
				//Child01 c = new Parent01();
				
				//Performing downcasting explicitly
				Child01 c = (Child01)p;
				c.age=18;
				System.out.println(c.name);
				System.out.println(c.age);
				c.showMassege();
		}
}
class Parent01{
	String name;
	public void showMassege() {
		System.out.println("Parent method is called");
	}
}
//child class
class Child01 extends Parent01{
	int age;
	public void showMassege() {
		System.out.println("Child method is called");
		
	}
}