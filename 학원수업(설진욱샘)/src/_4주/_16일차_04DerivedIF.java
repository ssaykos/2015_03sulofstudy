package _4��;
interface Player{ 
	public void fast();
	public void reverse();
} 

interface ExtPlayer extends Player{  
	public void slow();
	
}

class DvdPlayer implements ExtPlayer{  
	
	@Override
	public void fast() {
		System.out.println("dvd���� ����");
	}

	@Override
	public void reverse() {
		System.out.println("dvd���ٷ� ����");
	}

	@Override
	public void slow() {
		System.out.println("dvdõõ�� ����");
	}
}

class Mp3Player implements Player{

	@Override
	public void fast() {
		System.out.println("mp3��������");
	}

	@Override
	public void reverse() {		
		System.out.println("mp3���ٷΰ���");
	}	
	
}

public class _16����_04DerivedIF {

	public static void main(String[] args) {
		DvdPlayer mydvd = new DvdPlayer() ;
		mydvd.fast(); 
		mydvd.reverse();
		mydvd.slow(); 

		Mp3Player mp3 = new Mp3Player() ;
		mp3.fast(); 
		mp3.reverse();	
		
		//�������̽��� ���� ����ȯ
		Player[] myplayer = new Player[2] ;
		myplayer[0] = new DvdPlayer();
		myplayer[1] = new Mp3Player();		
	}

}
/*
Dvd ���� ���
Dvd ���ٷ� ���
Dvd õõ�� ���
Mp3 ���� ���
Mp3 ���ٷ� ���
*/