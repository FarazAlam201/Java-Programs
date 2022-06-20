class Animal{
	void eat() {
		System.out.println("Eating...");
	}
class Dog extends Animal{
	void eat() {
		System.out.println("Eating bread");
	}
	void bark() {
		System.out.println("Barking...");
	}
}
}
super.eat();

}
}
public class TestSuper2 {
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.work();
	}

}
