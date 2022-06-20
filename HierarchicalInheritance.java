abstract class Vehicle {
	int no_of_wheels;
	int no_of_seats;
	String classname;
	abstract void showVehicle();
}

class Car extends Vehicle{

	Car(){
		no_of_wheels=4;
		no_of_seats=5;
		classname="Class Car";
	}
	void showVehicle() {
		System.out.println(classname+" :-");
		System.out.println("Number of wheels : "+no_of_wheels);
		System.out.println("Number of seats : "+no_of_seats);
		
	}
	
}
class Motorcycle extends Vehicle{

	Motorcycle(){
		no_of_wheels=2;
		no_of_seats=2;
		classname="Class Motorcycle";
	}
	void showVehicle() {
		System.out.println(classname+" :-");
		System.out.println("Number of wheels : "+no_of_wheels);
		System.out.println("Number of seats : "+no_of_seats);
		
	}
	
}
public class HierarchicalInheritanceEx {

	public static void main(String[] args) {
		Car car=new Car();
		Motorcycle bike=new Motorcycle();
		car.showVehicle();
		bike.showVehicle();
	}

}
