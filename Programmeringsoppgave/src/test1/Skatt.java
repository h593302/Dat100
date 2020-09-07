package test1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Skatt {

	public static void main(String[] args) {
		
		int userGrossPay = parseInt(showInputDialog("Skriv inn inntektene dine"));
		String TaxTxt = ("og dette er mengden du må betale i skatt ");
		
		if (userGrossPay <= 180800)
			showMessageDialog(null, "Du trenger ikke skatte :)");
		
		
			else { if (userGrossPay <= 254500) { 
				double taxLvl = (userGrossPay*1.90) / 100; 
				showMessageDialog(null, "Du er på skattenivå 1, "+ TaxTxt + taxLvl );
			}	
			else if (userGrossPay <= 639750) {
				double taxLvl = (userGrossPay * 4.2) / 100;
				showMessageDialog(null,"Du er på skattenivå 2, " + TaxTxt + taxLvl );
			}
			else if (userGrossPay <=999550) {
				double taxLvl = (userGrossPay * 13.2) / 100;
				showMessageDialog(null,"Du er på skattenivå 3, " + TaxTxt + taxLvl );
			}
			else if (userGrossPay >=999551) {
				double taxLvl = (userGrossPay *16.2) / 100;
				showMessageDialog(null,"Du er på skattenivå 4, " + TaxTxt + taxLvl);
			}
		}
	}
}
