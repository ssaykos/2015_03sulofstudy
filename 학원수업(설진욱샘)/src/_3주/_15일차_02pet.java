package _3주;
import java.util.Scanner;

class Pet{	
	private String name ; //동물 이름
	private String masterName ; //주인 이름	
	
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
		System.out.println("저의 이름은 "+this.name+"입니다.");
		System.out.println("주인은 악덕한 "+this.masterName+"이에요. KIN凸");
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
		System.out.println("내 이름은 "+super.getName()+"이다");
		System.out.println("주인은 "+super.getMasterName()+"인디 개짜증");
	}
}
public class _15일차_02pet {
	public static void main(String[] args) {
		Pet[] myPetList = 
			{
				new Pet("짱가", "강호동"),
				new RobotPet("아이 로봇", "김영진")
			};
		
		for (int i = 0; i < myPetList.length; i++) {
			myPetList[i].introduce(); 
		}
		
		Pet polypet = null ;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Pet(1), RobotPet(2) 중 하나 입력 하세요 : ");
		int item = scan.nextInt() ;
		
		if ( item == 1 ) {
			polypet = new Pet("바보", "맹구") ;
		} else {
			polypet = new RobotPet("마징가", "배철수") ;
		}
		
		polypet.introduce();
		scan.close();
	}
}