
public class Duck extends Bird implements Swimmable{

	static int count;

	public void fly()	{}

	public void swim(){
		System.out.println("Duck is swimming");
	}

	public void eat(){
		System.out.println("Duck is eating fish");
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
