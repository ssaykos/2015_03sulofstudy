package _3��;
import java.util.Scanner;
public class _11����_04Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FruitSub obj=new FruitSub();
	}

}
class FruitSub{
	private String item;
	private int et;
	private int pay;
	private double discount=0.0;
	private double amount;
	
	public FruitSub(){
		InputData();
		Compute();
		Display();
	}
	public void InputData(){
		Scanner scan=new Scanner(System.in);
		System.out.println("ǰ��:");
		this.item=scan.nextLine();
		System.out.println("����:");
		this.et=scan.nextInt();
		System.out.println("�ܰ�:");
		this.pay=scan.nextInt();
		
	}
	public void Compute()
	{
		this.amount=this.et*this.pay;
		if(this.item.equals("�ٳ���")&&this.amount>=10000.0){
			this.amount=this.amount*(1-0.08);
		}else if(this.item.equals("�ٳ���")&&this.amount<10000.0){
			this.amount=this.amount*(1-0.03);
		}else if(this.amount>=10000.0){
			this.amount=this.amount*(1-0.05);
		}else{}
	}
	public void Display()
	{
		System.out.println("ǰ��:"+this.item);
		System.out.println("����:"+this.et);
		System.out.println("�ݾ�:"+this.amount);
	}
}
