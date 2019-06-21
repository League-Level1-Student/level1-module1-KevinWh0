package _07_binary_converter;

import javax.swing.JOptionPane;

	

	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

	public class Binary implements MouseListener{
		JFrame frame = new JFrame();
		JTextField binary = new JTextField(15);
		JLabel text = new JLabel();

		public void run() {
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel = new JPanel();
			frame.add(panel);
			//String Binary = JOptionPane.showInputDialog("Inset binary to convert:");
			panel.add(binary);
			
			JButton button = new JButton("Convert!");
			button.addMouseListener(this);
			panel.add(button);
			
			panel.add(text);
			frame.pack();
			
			
			//bin.convert(input);
		}
		String convert(String input) {
		    if(input.length() != 8){
		        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		        return "-";
		    }
		    String binary = "[0-1]+";//must contain numbers in the given range
		    if (!input.matches(binary)) {
		        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
		        return "-";   
		    }
		    try {
		        int asciiValue = Integer.parseInt(input, 2);
		        char theLetter = (char) asciiValue;
		        return "" + theLetter;
		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		        return "-";
		    }
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			text.setText(convert(binary.getText()));
			frame.pack();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}


