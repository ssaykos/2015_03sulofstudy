package _3��;

class Groups{   // class Groups ��� ���� Ŭ������ extends Object ��� ������ ����Ŭ�����̱⵵ �� ���� ����� �ִ�. 
	private String name;
	private String sing;
	public Groups(String name, String sing){
		this.name=name;
		this.sing=sing;
	}
	@Override
		public boolean equals(Object obj) {
		//����ȯ ���� ���� �ٽ� �ڵ� ����
		Groups sosy2=(Groups)obj;
		boolean bool = this.name.equals(sosy2.name)&&this.sing.equals(sosy2.sing);
		return bool;
		}
	
	@Override
		public String toString() {
			return "�̸�:"+this.name+"\n�뷡:"+this.sing+"\n";
		}
}
class Sosy extends Groups{
	public Sosy(String name, String sing){
		super(name,sing);
	}
	public String toString() {
		return "������"+super.toString();
	}
}
class Exid extends Groups{
	public Exid(String name, String sing){
		super(name,sing);
	}
	@Override
	public String toString() {
		return "ȣȣȣ"+super.toString();
	}
	
}
public class _14����_00ObjectExam2 {

	public static void main(String[] args) {
		Sosy sosy=new Sosy("�ҳ�ô�","Gee");
		Sosy sosy2=new Sosy("�ҳ�ô�","Gee");
		
		if(sosy.equals(sosy2)){
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		
		Exid exid=new Exid("exit","���Ʒ�");//�Ͻ������� tostring �޼ҵ� ���̵�
		
		System.out.println(sosy);
		System.out.println(exid.toString());
	}

}

/*
 * Object �ֻ��� Ŭ���� 		�ִ�
 * Groups(���� �׸��� ����)	�ִ�
 * sosy(����)				����->�ִ�
 * Exid(����)				����
 */
