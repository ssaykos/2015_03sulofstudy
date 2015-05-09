package _4주;
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
		System.out.println("dvd빨리 감기");
	}

	@Override
	public void reverse() {
		System.out.println("dvd꺼꾸로 감기");
	}

	@Override
	public void slow() {
		System.out.println("dvd천천히 감기");
	}
}

class Mp3Player implements Player{

	@Override
	public void fast() {
		System.out.println("mp3빨리감기");
	}

	@Override
	public void reverse() {		
		System.out.println("mp3꺼꾸로감기");
	}	
	
}

public class _16일차_04DerivedIF {

	public static void main(String[] args) {
		DvdPlayer mydvd = new DvdPlayer() ;
		mydvd.fast(); 
		mydvd.reverse();
		mydvd.slow(); 

		Mp3Player mp3 = new Mp3Player() ;
		mp3.fast(); 
		mp3.reverse();	
		
		//인터페이스에 의한 형변환
		Player[] myplayer = new Player[2] ;
		myplayer[0] = new DvdPlayer();
		myplayer[1] = new Mp3Player();		
	}

}
/*
Dvd 빨리 재생
Dvd 꺼꾸로 재생
Dvd 천천히 재생
Mp3 빨리 재생
Mp3 꺼꾸로 재생
*/