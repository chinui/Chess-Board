import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


public class DisplayTheBoard
{
	String board;

	public DisplayTheBoard(String board)
	{
		// TODO Auto-generated constructor stub
		//Set the title of the window
		JFrame frame = new JFrame("Chess Board"); 
		
		//Set the content of the window
		JLabel label = new JLabel(board);
		
		//Set the scrollbar
		JScrollPane panel = new JScrollPane(label);
		frame.setContentPane(panel);
		
		//Display the window
		frame.pack();
	    frame.setVisible(true);
	}	
}
