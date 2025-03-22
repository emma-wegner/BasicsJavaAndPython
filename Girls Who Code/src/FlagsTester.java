import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FlagsTester {
	 JOptionPane.showMessageDialog(null, "What Country is this?", "Trivia",JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
	if(answer.equalsIgnoreCase("Malala")||answer.equalsIgnoreCase("Malala Yousafzai")||answer.equalsIgnoreCase("Yousafzai"))
	    JOptionPane.showMessageDialog(null, "Yes! "+TriviaProgram.getAnswers().get(0),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
	else
		JOptionPane.showMessageDialog(null, TriviaProgram.getAnswers().get(0),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
	
}
