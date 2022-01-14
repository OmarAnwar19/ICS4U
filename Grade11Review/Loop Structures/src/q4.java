import javax.swing.JOptionPane;

public class q4 {

	public static int intTotal;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bolOrder = true;
				
		do {
			
			int intConfirm;
			
			intConfirm = JOptionPane.showConfirmDialog(null, "Would you like to order dinner?");
			
			if (intConfirm == JOptionPane.YES_OPTION) {
				
				boolean bolConfirm = true;
				
				do {
				
				int intItems, intPrice;
				String strItems, strPrice;
				
				try { 
				
				strItems = JOptionPane.showInputDialog(null, "How many items would you like to order?", "DIGITALDINNER", JOptionPane.QUESTION_MESSAGE);
						
				intItems = Integer.parseInt(strItems);
				
				for (int i=0; i<=intItems; i++) {
					
					strPrice = JOptionPane.showInputDialog(null, "Enter price of item: ($)", "DIGITALDINNER", JOptionPane.QUESTION_MESSAGE);

					intPrice = Integer.parseInt(strPrice);
					
					intTotal += intPrice;
					
				}
				
				bolConfirm = false;
				
				} catch (Exception ex) {
					
					JOptionPane.showMessageDialog(null, "Please enter a valid input. ", "DIGITALDINNER", JOptionPane.ERROR_MESSAGE);
					
				}
								
				} while (bolConfirm == true); 
				
				bolOrder = false;
				
			} else if (intConfirm == JOptionPane.NO_OPTION) {
				
				JOptionPane.showMessageDialog(null, "Exiting program.", "DIGITALDINNER", JOptionPane.WARNING_MESSAGE);
				
				bolOrder = false;
				
				System.exit(0);
				
				
			} else if (intConfirm == JOptionPane.CANCEL_OPTION) {
				
				JOptionPane.showMessageDialog(null, "Exiting program.", "DIGITALDINNER", JOptionPane.WARNING_MESSAGE);
				
				bolOrder = false;
				
				System.exit(0);
			}
			
		} while (bolOrder == true);

		JOptionPane.showMessageDialog(null, "Meal Total: " + intTotal + "$.", "DIGITALDINNER", JOptionPane.WARNING_MESSAGE);
		
	}
	
}
