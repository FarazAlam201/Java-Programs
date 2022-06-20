
class Constructor {
	//Non Parameterized constructor
	String name, gender, city;
	int reg_id, age;
	Constructor(){
		name="Osama";
		gender="Male";
		city="Karachi";
		reg_id=1445;
		age=19;		
	}
	void get() {
		System.out.println(name+" "+gender+" "+city+" "+reg_id+" "+age);
	}
}
public class Cons{
	public static void main(String[] args) {
   Constructor Student = new Constructor();
   Student.get();

	}

}
