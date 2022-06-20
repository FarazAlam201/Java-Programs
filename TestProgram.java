package Lab6;

 class Person {
	
	String name, address, phoneNumber, emailAddress;
	
	Person(String name, String address, String phoneNumber, String emailAddress){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public String toString() {
		return "Class: Person " + " : Name: " + name; 
	}	
}
 
 class Student extends Person{
	    final String status1 = "Freshman";
	    final String status2 = "Sophomore";
	    final String status3 = "Junior";
	    final String status4 = "Senior";
	    
	    Student(String name, String address, String phoneNumber, String emailAddress,String status) {
	    	super(name,address,phoneNumber,emailAddress);
	    }
	    public String toString() {
	        return "Class: Student " + " : Name: " + name;
	    }
}
 
 class Employee extends Person {
		String office;
		int salary;	
		String dateHired;
		
		Employee(String name, String address, String phoneNumber, String emailAddress, 
				String office, int salary, String dateHired) {		
			super(name, address, phoneNumber, emailAddress);
			this.office = office;
			this.salary = salary;
			this.dateHired = dateHired;				
		}	
		public String toString() {
			return "Class: Employee " + " : Name: " + name; 
		}
	}
 
 class Faculty extends Employee {
		String officeHours;
		String rank;
		Faculty(String name, String address, String phoneNumber, String emailAddress, String office,
		int salary,String dateHired, String officeHours, String rank) {
			super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
			this.officeHours = officeHours;
			this.rank = rank;
		}
		
		public String toString() {
			return "Class: Faculty " + " : Name: " + name; 
		}
	}
 
 class Staff extends Employee {
		String title;
		Staff(String name, String address, String phoneNumber, String emailAddress, String office,
				int salary,String dateHired, String title) {
			super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
			this.title = title;
		}
		public String toString() {
			return "Class: Staff " + " : Name: " + name; 
		}
   }
 
 public class TestProgram {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Person p = new Person("Faraz Alam", "Orangi Town", "03444712354","farazsid2001@gmail.com");
			System.out.println(p.toString());
		Student s = new Student("Arsalan", "Gulshan", "03421011", "arsalan@gmail.com", "Sophomore");
			System.out.println(s.toString());
		Employee e = new Employee("Asif", "Johar", "0342221", "asif@gmail.com", "Golden", 60000, "4th March");
			System.out.println(e.toString());
		Faculty f = new Faculty("Ali", "liaqtabad", "034653", "ali@gmail.com", "Pride", 70000, "10 April","9 hours", "Manager");
			System.out.println(f.toString());
		Staff st = new Staff("Daniyal", "Nazimabad", "034524", "Daniyal@gmail.com", "Palace", 43000, "9th jan", "Manager of Palace");
			System.out.println(st.toString());      
		}

	}
 