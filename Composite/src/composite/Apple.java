package composite;

//Simple type of fruit that has its own eat method
public class Apple implements Fruits{
	public void eat(String meal){
		System.out.println("I am eating an Apple " + meal + ".");
	}
}
