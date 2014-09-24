
public class CreateTheBoard
{
	private int dim;
	private String oddRow;
	private String evenRow;
	private String board;

	public CreateTheBoard(int pDim)
	{
		dim = pDim;
		initRow();
	}

	private void initRow()
	{
		// TODO Auto-generated method stub
		//For deleting the "null"
		oddRow = "";
		
		for (int i = 0; i<dim; i++)
		{
			//if i is odd, i%2 = 1
			//if i is even, i%2 = 0
			oddRow = oddRow + i%2;	
		}
		//Place the EOL
		oddRow = oddRow + "<br>";
		
		//Replace the 0 at the end of the even row
		evenRow = oddRow.substring(1, 80) + "0<br>";
		stickTheRow();
	}
	
	private void stickTheRow()
	{
		//For deleting the "null"
		board = "<html>";
		// TODO Auto-generated method stub
		//Create the board
		for (int i = 0; i<dim; i++)
		{
			if(i%2 == 0)
				board = board + evenRow;
			else
				board = board + oddRow;
		}
		
		board = board + "</html>";
		
	}

	public String getBoard()
	{
		return board;
	}
}
