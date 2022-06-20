class Info{
	// Parameterized constructor
	String name, gender, city;
	int reg_id, contact_num;
	Info(String n,String g, String c, int r, int cn ){
		name=n;
		gender=g;
		city=c;
		reg_id=r;
		contact_num=cn;
	}
	void display() {
		System.out.println(name+" "+gender+" "+" "+city+" "+reg_id+" "+contact_num);
	}
}

public class Information {

	public static void main(String[] args) {
	Info e1=new Info("Faraz Alam","Male","Karachi",13948,03444712354);
	e1.display();
	Info e2=new Info("Moiz","Male","Karachi",13942,031234567);
	e2.display();

	}

}
