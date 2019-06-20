package _05_vault;

public class JamesBond {
	int TryCrackCode(Vault j) {
		int i = 0;
		while(i < 1000001) {
			i++;
			if(j.tryCode(i)) {				
				break;
			}
			
		}
		return i;
		
	}
	public static void main(String[] args) {
		JamesBond bond = new JamesBond();
		System.out.print(bond.TryCrackCode(new Vault()));
		
	}

}
