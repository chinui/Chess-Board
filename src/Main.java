
public class Main
{
	public static void main(String[] args)
	{
		int dim = 80;
		
		// TODO Auto-generated method stub
		CreateTheBoard createTheBoard = new CreateTheBoard(dim);
		new DisplayTheBoard(createTheBoard.getBoard());
	}

}
