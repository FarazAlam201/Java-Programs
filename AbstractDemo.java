// Faraz Alam (13948)

abstract class A {
abstract void callme();
void callmetoo() {
System.out.println("This is a concrete method.");
}
}
class B extends A {
void callme() {
System.out.println("B's implementation of callme.");
}
}
class C extends A{

	
	void callme() {
		System.out.println("This is the callme implementation from class C");
		
	}
	
}
class AbstractDemo {
public static void main(String args[]) {
B b = new B();
b.callme();
b.callmetoo();
C c=new C();
c.callme();
c.callmetoo();
}
}
