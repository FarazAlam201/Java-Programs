
// FARAZ ALAM (13948)

package lab8;

interface Crawble{
	void crawl();
}

interface Moveable{
	void move();
}

class animal implements Crawble, Moveable{
	public void crawl() {
		System.out.println("Animal can Crawl.");
	}
	public void move() {
		System.out.println("Animal can Move.");
	}
}

public class AnAnimal {
	public static void main(String []args) {
		animal a = new animal();
		a.crawl();
		a.move();
	}
}

