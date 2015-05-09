package _1주;

public class _3일차_1CondOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//하드코딩: 변수에 값을 지정하지 않고 , 직접 코딩하는 기법
		int result=3>2?5:3;
		System.out.println("result:"+result);//5
		
		int x=3,y=8,z=4;
		int max=3>y?x:y;
		max=max>z?max:z;
		System.out.println("max:"+max);//8
		
		//조건 연산자를 이용 최소 값 구하기
		int min=x<y?x:y;
		min=min<z?min:z;
		System.out.println("min:"+min);//3

	}

}
