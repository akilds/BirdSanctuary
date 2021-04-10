
public class ToyDuck extends Bird implements Flyable, Swimmable{

  static int count;

  public void eat() {}

  public void swim() {
	  System.out.println("ToyDuck is Swimming");
  }

  public void fly() {
	  System.out.println("ToyBird is Flying");
  }

  public void incrementCount() {
	  count++;
  }

  public void decrementCount(){
		count--;
	}

  public int getCount() {
	  return count;
  }
}
