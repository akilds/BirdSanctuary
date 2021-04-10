
public class Parrot extends Bird implements Flyable{

	static int count;

	public void fly(){
		System.out.println("Parrot is flying");
	}

	public void swim(){}

	public void eat(){
		System.out.println("Parrot is eating cookies");
	}

	public void incrementCount(){
		count++;
	}

	public void decrementCount(){
		count--;
	}

	public int getCount()	{
		return count;
	}
}
