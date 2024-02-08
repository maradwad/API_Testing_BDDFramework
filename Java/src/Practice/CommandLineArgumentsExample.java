package Practice;

public class CommandLineArgumentsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>0)
		{
			System.out.println("Command Line Arguments provided: ");
			for(int i=0;i<args.length;i++)
			{
				System.out.println("args"+i);
			}
		}
		else
		{
			System.out.println("No Command line arguments provided");
		}
	}

}
