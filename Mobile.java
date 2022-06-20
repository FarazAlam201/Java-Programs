class Specs{
	String ram,rom,launch_date,version;
	Specs(){
		ram="8gb";
		rom="128gb";
		launch_date="5June,2022";
		version="11.9";
	}
	
	Specs(String ram,String rom, String launch_date,String version )	{
		this.ram=ram;
		this.rom=rom;
		this.launch_date=launch_date;
		this.version=version;
	}
	void Display() {
		System.out.println("RAM : "+ram +"ROM : "+rom +" Launch Date : "+launch_date+" Android Version"+version);
	}
}
public class Mobile{
	public static void main(String[]args) {
		Specs spec= new Specs();
		spec.Display();
		Specs spec1= new Specs("4gb","64gb","1June,2022","10.0");
		spec1.Display();
		Specs spec2= new Specs("3gb","32gb","4June,2022","9");
		spec2.Display();
	}
}