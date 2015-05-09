package _1주;

public class _4일차_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total=0;
		int i;
		
		System.out.println("while문");
		System.out.println("total값\ti값");
		System.out.println("------------");
		
		i=0;
		while(i<=10)
		{
			if(i==0)
			{
				System.out.print(""+total+"\t");
				i++;
				System.out.println(""+i);		
			}
			if(i!=0)
			{
				System.out.print(""+total+"+"+i+"\t");
				total=total+i;
				i++;
				System.out.println(""+i);
			}
		}
		System.out.println("총total값="+total+"\n\n");
		
		
		System.out.println("for문");
		System.out.println("total값\ti값");
		System.out.println("------------");
		
		for(i=0;i<=10;i++)
		{
			if(i==0)
			{
				System.out.print(""+total+"\t");
				
				System.out.println(""+i);		
			}
			if(i!=0)
			{
				System.out.print(""+total+"+"+i+"\t");
				total=total+i;
				System.out.println(""+i);
			}
		}
		System.out.println("총total값="+total+"\n\n");

		System.out.println("while문");
		total=0;
		i=1;
		while(i<101)
		{
			if(i==1)
			{				
				total+=i;
				System.out.print(""+i);
				i+=3;
			}
			else
			{
				total+=i;
				System.out.print("+"+i);
				i+=3;
			}
		}
		System.out.println("="+total+"\n");
		
		System.out.println("for문");
		total=0;
		for(i=1;i<101;i+=3)
		{
			if(i==1)
			{				
				total+=i;
				System.out.print(""+i);
			}
			else
			{
				total+=i;
				System.out.print("+"+i);
			}
		}
		System.out.println("="+total+"\n");
		
		System.out.println("while문");
		total=0;
		i=97;
		while(i>1)
		{
			if(i==97)
			{
				total+=i;
				System.out.print(""+i);
				i-=5;
			}
			else
			{
				total+=i;
				System.out.print("+"+i);
				i-=5;
			}
		}
		System.out.println("="+total+"\n");
		
		System.out.println("for문");
		total=0;
		for(i=97;i>1;i-=5)
		{
			if(i==97)
			{
				total+=i;
				System.out.print(""+i);
			}
			else
			{
				total+=i;
				System.out.print("+"+i);
			}
		}
		System.out.println("="+total+"\n");
		
		System.out.println("while문");
		total=0;
		i=1;
		while(i<100)
		{
			if(i==1)
			{
				total+=(i*i);
				System.out.print(""+i+"*"+i);
				i+=5;
			}
			else
			{
				total+=(i*i);
				System.out.print("  +  "+i+"*"+i);
				i+=5;
			}
		}
		System.out.println("="+total+"\n");
			
		System.out.println("for문");
		total=0;
		for(i=1;i<100;i+=5)
		{
			if(i==1)
			{
				total+=(i*i);
				System.out.print(""+i+"*"+i);
			}
			else
			{
				total+=(i*i);
				System.out.print("  +  "+i+"*"+i);
			}
		}
		System.out.println("="+total+"\n");
	}

}
