package _3��;

public class _14����_02RefCasting {

	public static void main(String[] args) {
		String str = new String("���ѹα�") ;
		Integer x = new Integer( 5 ) ;
		Book2 java = new Book2("�ڹ� P/G", 10000, "itBank") ;
		//      ����üor ��������or �ν��Ͻ�����
		print (100);
		
		Display( str ) ; //Object obj=new String("���ѹα�");
		Display( x ) ;  //Object obj=new Integer(5);
		Display( java ) ; //Object obj=new Book2("�ڹ� P/G", 10000, "itBank");
	}
	private static void print(int i) {
		System.out.println(i);
	}
	static void Display(Object obj){
		if(obj instanceof Book2){
			Book2 mybook=(Book2)obj;
			System.out.println(mybook.toString());
		}else if(obj instanceof Integer){
			int myint=(int)obj;
			System.out.println(myint);
		}else if(obj instanceof String){
			String mystr =(String)obj;
			System.out.println(mystr);
		}
	}
}
	class Book2{
		private String name ;
		private double price ;
		private String education ;
		
		public Book2(String name, double price, String education) {
			this.name = name;
			this.price = price;
			this.education = education;
		}
		@Override
		public String toString() {
			return "����:"+name+"\n�ܰ�:"+price+"\n���ǻ�:"+education;
		}
	}
	
	