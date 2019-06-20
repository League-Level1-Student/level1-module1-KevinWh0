package _02_cat;

public class Runner {
	public static void main(String[] args) {
		int i = 0;
		Cat cat = new Cat("Cat");
		cat.meow();
		cat.printName();
		//cat.kill();
		while(i<9) {
			i++;
			cat.kill();
		}
	}
}
