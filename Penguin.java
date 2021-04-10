
public class Penguin extends Bird implements Swimmable{

	static int count;

	public void fly(){}

	public void swim(){
		System.out.println("Penguin is swimming");
	}

	public void eat(){
		System.out.println("Penguin is eating fish");
	}

	public void incrementCount(){
		count++;
	}

	public void decrementCount(){
		count--;
	}

	public int getCount(){
		return count;
	}
}
