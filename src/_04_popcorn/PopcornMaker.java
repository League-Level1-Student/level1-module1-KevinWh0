package _04_popcorn;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		//JFrame frame = new JFrame();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setVisible(true);
		int i = 0;
		String FL = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		String Time = JOptionPane.showInputDialog("How long should we cook the popcorn?");
		int TimeC = Integer.parseInt(Time);
		try {
			Popcorn popcorn = new Popcorn(FL);
			Microwave microW = new Microwave();
			microW.setTime(TimeC);
			microW.putInMicrowave(popcorn);
			//microW.startMicrowave();
			while(i<21) {
				i++;
				popcorn.applyHeat();
			}
			popcorn.eat();
		
		}catch(Exception e){
			System.err.println(e);
		}
		

		
	}
}
