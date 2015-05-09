package _2주;

public class _8일차_4Account02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_8일차_4Account01 soo;
		soo=new _8일차_4Account01();
		
		//Account soo= new Account();
	
		/*
		Account hee;
		hee=new Account();
		*/
		_8일차_4Account01 hee=new _8일차_4Account01();
		/*
		_8일차_4Account01 hong=new _8일차_4Account01();
		
		hong=soo;
		*/
		soo.Bankname="KB";
		soo.Name="김철수";
		soo.Number=1234;
		soo.Balance=123000;
		
		hee.Bankname="KB";
		hee.Name="박영희";
		hee.Number=2345;
		hee.Balance=2345000;
		
		soo.Display();
		//hong.Display();
		hee.Display();
	}

}
