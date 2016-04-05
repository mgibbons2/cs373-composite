package composite;

//Simple type of fruit that Implements its own eat method
public class Banana implements Fruits {
	public void eat(String meal){
		System.out.println("I am eating a banana " + meal + ".");
	}
}
