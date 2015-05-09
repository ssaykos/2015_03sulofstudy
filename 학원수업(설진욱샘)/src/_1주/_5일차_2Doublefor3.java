package _1주;

public class _5일차_2Doublefor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total=0;
		
		for(int i=1;i<4;i+=2)
		{
			for(int k=2;k<6;k+=3)
			{
				total+=2*i+k;
			}
		}
		System.out.println("총합:"+total);

	}

}
