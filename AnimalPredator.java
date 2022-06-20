import java.util.ArrayList;

// Animal.java

package Lab8;
interface Animal
{
public void move();
}
interface Predator
{
public void hunt();
}


// Fox.java


class Fox implements Animal, Predator
{
private String fur;
public void move()
{
    System.out.println("Fox is moving!");
}
public void hunt()
{
    System.out.println("Fox is hunting!");
}

}


// Wolf.java

class Wolf implements Animal, Predator
{
private int length;
public void move()
{
    System.out.println("Wolf is moving!");
}
public void hunt()
{
    System.out.println("Wolf is hunting!");
}
}

//AnimalPredator.java
class AnimalPredators
{
	public static void main(String[] args) {
	    ArrayList<Animal> animals=new ArrayList<Animal>();
	    animals.add(new Wolf());
	    animals.add(new Fox());
	    animals.add(new Fox());
	    for(Animal animal: animals)
	    animal.move();
	    ArrayList<Predator> predators=new ArrayList<Predator>();
	    predators.add(new Wolf());
	    predators.add(new Fox());
	    predators.add(new Fox());
	    for(int i=0; i<predators.size(); i++)
	    predators.get(i).hunt();