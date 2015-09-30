package marshmallows.view;

import javax.swing.JOptionPane;

public class MonsterDisplay
{
	
	public String displayInfo(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	public void diplayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
