public class Fm6{

	public static void main(String  arg[])
	{
		int n=1;
		System.out.println("press 1 for sunday");
		System.out.println("press 2 for monday");
		System.out.println("press 3 for tuseday");
		System.out.println("press 4 for wensesday");
		System.out.println("press 5 for thuseay");
		System.out.println("press 6 for frieday");
		System.out.println("press 7 for saterday");
		
		switch(n)
		{
			case 1: 
				System.out.println("sunday");
				break;

			case 2:
				System.out.println("monday");
				break;

			case 3:
				System.out.println("thuseay");
				break;

			case 4:
				System.out.println("wensesday");
				break;

			case 5:
				System.out.println("thuseay");
				break;

			case 6:
				System.out.println("frieday");
				break;

			case 7:
				System.out.println("saterday");
				break;
				
			default :
				System.out.println("plzz enter valid number!!");
		}
		
	}
}