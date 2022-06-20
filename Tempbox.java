class Box{
	double width,height,depth;
	Box(){
		width=6;
		height=8;
		depth=4;
	}
	Box(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	void get_volume() {
		double vol= width*height*depth;
		System.out.println("The Volume is : "+vol);

	}
	double get_area() {
		return width*height;
	}
}
public class Tempbox {
	public static void main(String[]args) {
		Box mybox1= new Box(10,3.8,6);
		mybox1.get_volume();
		double get_area=mybox1.get_area();
		System.out.println(get_area);
	}

}
