package composite;

public class Main {

	public static void main(String[] args) {
		Fruits banana = new Banana();
		Fruits apple = new Apple();
		Fruits orange = new Orange();
		
		FruitBasket myBasket = new FruitBasket();
		
		myBasket.add(banana);
		myBasket.add(apple);
		myBasket.add(orange);
		
		myBasket.eat("pie");
		myBasket.eat("smoothie");

	}

}
