package _1��;

public class _4����_5�ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int odd=0,even=0;
		System.out.println("-------for��----");
		for(int i=1;i<11;i++)
		{
			if(i%2==0)
			{
				even+=i;
			}
			else
			{
				odd+=i;
			}
		}
		System.out.println("¦��:"+even);
		System.out.println("Ȧ��:"+odd);
		
		
		System.out.println("----while��----");
		int i=1;
		odd=0;
		even=0;
		while(i<11)
		{
			if(i%2==0)
			{
				even+=i;
				i++;
			}
			else
			{
				odd+=i;
				i++;
			}
		}
		System.out.println("¦��:"+even);
		System.out.println("Ȧ��:"+odd);
	}

}
