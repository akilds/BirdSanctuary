
import java.util.ArrayList;
import java.util.*;

public class BirdSanctuary {

	private Set<Bird> birdList = new HashSet<>();

	static BirdSanctuary instance;

	private BirdSanctuary() {}

	static synchronized  BirdSanctuary getInstance(){
		if(instance == null){
			instance = new BirdSanctuary();
		}
		return instance;
	}

	public void addBird(Bird bird){
		birdList.add(bird);
		bird.incrementCount();
	}

	public void removeBird(Bird bird) {
		birdList.remove(bird);
		bird.decrementCount();
	}

	public void printFlyable(){
		for(Bird bird : birdList){
			if(bird instanceof Flyable){
				((Flyable) bird).fly();
			}
		}
	}

	public void printSwimmable(){
		for(Bird bird : birdList){
			if(bird instanceof Swimmable){
				((Swimmable) bird).swim();
			}
		}
	}

   public void printEatable(){
    	for(Bird bird : birdList){
		   bird.eat();
		}
    }

}

