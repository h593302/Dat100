package test1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Oppgave5 {

	public static void main(String[] args) {
	
		int n = parseInt(showInputDialog("Write in yout value"));
		int answer = 1;
		
			if (n >= 0) { 
				for (int i = 1; i <= n; i++) { 
					answer = answer * i;
			}
				showMessageDialog(null, answer);
				}
					else {
						showMessageDialog(null, "Your input can not be a negative number");
					}
	}
}
