package _4��;

public class _17����_01myException01 {

	private static void first(String string){
		second(string);
	}
	private static void second(String string){
		int x=Integer.parseInt(string);
	}
	
	public static void main(String[] args) {
		int x= 3, y=0;
		int[]arr={10,20,30};
		try{
			first("aa");
			arr[3]=50;//�迭��� �ε�������
			System.out.println(x/y);//0���� ������ ����
						
			System.out.println("���� �߻��� ���� ���� �ȵ�");
			
		}catch(ArithmeticException e){
			System.out.println("0���� ������ ���� �߻� ��ġ�ٶ�");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭 �ε��� ���� �߻�");
		}catch(NumberFormatException e){
			System.out.println("���������׸񿹿ܹ߻�");
			//System.out.println("���ڿ�:"+e.toString());
			//System.out.println("�޼���:"+e.getMessage());
			//e.printStackTrace();
		}catch(Exception e){
			System.out.println("������ �׸� ���� �߻�");
		}finally{
			System.out.println("���ܹ߻� ���ο� ������� ����Ǵ� finally�ڵ�");
		}
	}
}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at _4_��._17����_01myException01.main(_17����_01myException01.java:8)

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
//at _4_��._17����_01myException01.main(_17����_01myException01.java:9)
