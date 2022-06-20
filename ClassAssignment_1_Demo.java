 class MyVehicle {
	int no_of_wheels, no_of_seats;
	String objname;
	MyVehicle(){
		System.out.println("Deafult Constructor");
	}
	MyVehicle(String objname,int no_of_wheels,int no_of_seats){
		this.objname=objname;
		this.no_of_wheels = no_of_wheels;
		this.no_of_seats = no_of_seats;
	}
	void showVehicle(){
		System.out.println(objname+" :");
		System.out.println("Number of wheels : "+no_of_wheels);
		System.out.println("Number of seats : "+no_of_seats);
	}

}
public class ClassAssignment_1_Demo {

	public static void main(String[] args) {
		MyVehicle Motorcycle =new MyVehicle("Motorcycle",2,2);
		MyVehicle Car =new MyVehicle("Car",4,5);
		Motorcycle.showVehicle();
		Car.showVehicle();
	}
}
