package _1주;

public class _5일차_1DoubleFor2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int total=0;
		
		//이중
		for(int i=1;i<3;i++)
		{
			for(int j=5;j<8;j++)
			{
				System.out.print(""+total);
				total+=i+j;
				System.out.println("+"+i+"+"+j+"="+total);
				
			}
		}
		System.out.println("총합:");
	}

}
