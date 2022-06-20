class Animal{
	String color="White ";
}
class Dog extends Animal{
	String color = "Black";
	void print_clr() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class TestSuper1 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.print_clr();
	}

}
