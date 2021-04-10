
public class Main {
	public static void main(String[] args){

		BirdSanctuary sanctuary = BirdSanctuary.getInstance();
		Duck duck = new Duck();
		Penguin penguin = new Penguin();
		Parrot parrot = new Parrot();
		Parrot parrot2 = new Parrot();
      ToyDuck toyDuck = new ToyDuck();

		sanctuary.addBird(duck);
		sanctuary.addBird(parrot);
		sanctuary.addBird(penguin);
		sanctuary.addBird(parrot2);
      sanctuary.addBird(toyDuck);

		sanctuary.printFlyable();
		sanctuary.printSwimmable();
      sanctuary.printEatable();

      sanctuary.removeBird(parrot2);

      System.out.println(duck.getCount());
      System.out.println(parrot.getCount());
      System.out.println(penguin.getCount());
      System.out.println(toyDuck.getCount());
	}
}
