package _05_vault;

import java.util.Random;

public class Vault {
	private int Code = new Random().nextInt(1000000);
	
	
	public boolean tryCode(int CodeGuess) {
		if(CodeGuess == Code) {
			return true;
		}else {
			return false;
		}
	}
	
}
