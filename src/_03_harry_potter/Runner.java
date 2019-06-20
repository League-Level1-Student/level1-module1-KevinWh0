package _03_harry_potter;

public class Runner {
	public static void main(String[] args) {
		HarryPotter Harry = new HarryPotter();
		Harry.makeInvisible(true);
		Harry.spyOnSnape();
		Harry.makeInvisible(false);
		Harry.castSpell("stupefy");
	}
}
