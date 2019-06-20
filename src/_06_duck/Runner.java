package _06_duck;

public class Runner {
	public static void main(String[] args) {
		Fish fish = new Fish("Tacos", 66);
		Duck daffy = new Duck("donuts",5);
		daffy.quack();
		fish.swim();
		
	}
}
