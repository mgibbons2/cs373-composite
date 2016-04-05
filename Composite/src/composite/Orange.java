package composite;

//Simple fruit with its own specific implementation of the eat method
public class Orange implements Fruits {
	public void eat(String meal){
		System.out.println("I am eating an Orange " + meal + ".");
	}
}
