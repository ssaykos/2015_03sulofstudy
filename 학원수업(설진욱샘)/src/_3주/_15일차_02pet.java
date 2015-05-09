package _3��;
import java.util.Scanner;

class Pet{	
	private String name ; //���� �̸�
	private String masterName ; //���� �̸�	
	
	public Pet() { }

	public Pet(String string, String string2) {
		this.name=string;
		this.masterName=string2;
	}
	
	public String getName() {
		return name;
	}

	public String getMasterName() {
		return masterName;
	}

	public void introduce() {
		System.out.println("���� �̸��� "+this.name+"�Դϴ�.");
		System.out.println("������ �Ǵ��� "+this.masterName+"�̿���. KIN��");
	}
}
class RobotPet extends Pet{
	public RobotPet(){
		super();
	}

	public RobotPet(String string, String string2) {
		super(string, string2);
	}

	@Override
	public void introduce() {
		System.out.println("�� �̸��� "+super.getName()+"�̴�");
		System.out.println("������ "+super.getMasterName()+"�ε� ��¥��");
	}
}
public class _15����_02pet {
	public static void main(String[] args) {
		Pet[] myPetList = 
			{
				new Pet("¯��", "��ȣ��"),
				new RobotPet("���� �κ�", "�迵��")
			};
		
		for (int i = 0; i < myPetList.length; i++) {
			myPetList[i].introduce(); 
		}
		
		Pet polypet = null ;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Pet(1), RobotPet(2) �� �ϳ� �Է� �ϼ��� : ");
		int item = scan.nextInt() ;
		
		if ( item == 1 ) {
			polypet = new Pet("�ٺ�", "�ͱ�") ;
		} else {
			polypet = new RobotPet("��¡��", "��ö��") ;
		}
		
		polypet.introduce();
		scan.close();
	}
}