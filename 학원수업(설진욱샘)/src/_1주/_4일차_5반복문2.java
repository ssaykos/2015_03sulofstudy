package _1ÁÖ;

public class _4ÀÏÂ÷_5¹İº¹¹®2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int odd=0,even=0;
		System.out.println("-------for¹®----");
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
		System.out.println("Â¦¼ö:"+even);
		System.out.println("È¦¼ö:"+odd);
		
		
		System.out.println("----while¹®----");
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
		System.out.println("Â¦¼ö:"+even);
		System.out.println("È¦¼ö:"+odd);
	}

}
