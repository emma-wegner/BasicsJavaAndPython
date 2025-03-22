import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TriviaProgramTester 
{

	public static void main(String[] args) 
	{
			
			
			//1
		TriviaProgram.setMyIcon(new ImageIcon("/Users/ewegner22/eclipse-workspace/Ap Comp Sci/Malala 2.jpg"));
			String answer = JOptionPane.showInputDialog(TriviaProgram.getQuestions().get(0));
			if(answer.equalsIgnoreCase("Malala")||answer.equalsIgnoreCase("Malala Yousafzai")||answer.equalsIgnoreCase("Yousafzai"))
			    JOptionPane.showMessageDialog(null, "Yes! "+TriviaProgram.getAnswers().get(0),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
			else
				JOptionPane.showMessageDialog(null, TriviaProgram.getAnswers().get(0),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
			
			//2
			TriviaProgram.setMyIcon(new ImageIcon("/Users/ewegner22/eclipse-workspace/Ap Comp Sci/Education.jpg"));
			String answer2 = JOptionPane.showInputDialog(TriviaProgram.getQuestions().get(1));
				if(answer2.equalsIgnoreCase(TriviaProgram.getAnswers().get(1)))

				    JOptionPane.showMessageDialog(null,"Yes! "+ TriviaProgram.getAnswers().get(1),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
				else
				JOptionPane.showMessageDialog(null, TriviaProgram.getAnswers().get(1),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
				
			//3
				    TriviaProgram.setMyIcon(new ImageIcon("/Users/ewegner22/eclipse-workspace/Ap Comp Sci/flag-of-south-sudan.jpg"));
				    String answer3 = JOptionPane.showInputDialog(TriviaProgram.getQuestions().get(2));
					   if(answer3.equalsIgnoreCase("South Sudan"))
						
					    JOptionPane.showMessageDialog(null, "Yes! "+TriviaProgram.getAnswers().get(2),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
					    else
					    {
					    	 JOptionPane.showMessageDialog(null, TriviaProgram.getAnswers().get(2),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
							   
					    }
		    //4
			TriviaProgram.setMyIcon(new ImageIcon("/Users/ewegner22/eclipse-workspace/Ap Comp Sci/School2.jpeg"));		    
			String answer4 = JOptionPane.showInputDialog(TriviaProgram.getQuestions().get(3));
						if(answer4.equalsIgnoreCase("263 million")||answer4.equalsIgnoreCase("263000000")||answer4.equalsIgnoreCase("263,000,000"))
							 JOptionPane.showMessageDialog(null,"Yes! "+ TriviaProgram.getAnswers().get(3),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
						else
						{
							JOptionPane.showMessageDialog(null, TriviaProgram.getAnswers().get(3),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
							
						}
		    //5
							 TriviaProgram.setMyIcon(new ImageIcon("/Users/ewegner22/eclipse-workspace/Ap Comp Sci/world-map-with-continents.jpg"));
						    String answer5 = JOptionPane.showInputDialog(TriviaProgram.getQuestions().get(4));
							 if(answer5.equalsIgnoreCase("Africa and Asia"))
								 JOptionPane.showMessageDialog(null, "Yes! "+TriviaProgram.getAnswers().get(4),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
							 else
							 {
								 JOptionPane.showMessageDialog(null, TriviaProgram.getAnswers().get(4),"Trivia", JOptionPane.INFORMATION_MESSAGE, TriviaProgram.getMyIcon());
									 
							 }
			}

}