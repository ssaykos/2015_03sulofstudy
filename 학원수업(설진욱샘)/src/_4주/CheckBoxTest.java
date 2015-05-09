package _4주;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class CheckBoxTestSub extends JFrame implements ItemListener{
	private static final long serialVersionUID = 1L;

	//첨부된 파일은 c:\\images 폴더에 복사
	//여러번 반복 되는 코드는 상수(final) 형태로 만들어 사용하라
	private final String ImageLocation = "c:\\images\\" ; //이미지 파일의 경로
	private final String FileExtension = ".gif" ; //이미지 파일의 확장자 
	
	//과일을 보이거나 숨기기 위한 체크 박스
	JCheckBox[] chkFruit = new JCheckBox[3];
	//fruits 배열 : 파일 이름를 저장하고 있는 문자열 배열
	String[] fruits = { "apple", "grape", "orange" }; 
	//pictureLabel : 실제 그림이 들어가는 레이블
	JLabel[] pictureLabel = new JLabel[3];
	//iconlists : 그림을 넣을 아이콘
	ImageIcon[] iconlists = new ImageIcon[3];
	//noimage : 체크 박스가 off 되었을 때 보여질 기본 이미지
	ImageIcon noimage = new ImageIcon(ImageLocation + "nfmage.jpg" ) ;
	//chkPanel : 가장 왼쪽에 놓여지는 판넬(체크 박스 3개가 놓여 지는 곳)
	JPanel chkPanel = new JPanel(new GridLayout(3, 1));
	
	@Override
	public void itemStateChanged(ItemEvent event) {
		Object who = event.getSource() ;
		for (int i = 0; i < 3; i++) {
			if (who == chkFruit[i]) {
				//ItemEvent.DESELECTED : 체크 항목이 off 되어 있다는 것을 설명하는 상수 
				if (event.getStateChange() == ItemEvent.DESELECTED){
					pictureLabel[i].setIcon( noimage );					
				}else{ //해당 체크 박스가 체크되면
					//인덱스에 해당하는 이미지를 표시한다.
					pictureLabel[i].setIcon(iconlists[i]);
				}
			}
		}
	}
	private void compose() {			
		//컨테이너는 전체 1행 4열의 그리드 레이 아웃이다
		super.setLayout( new GridLayout( 1, 4 ) ) ;
		
		for (int i = 0; i < chkFruit.length; i++) {
			//체크 박스 객체 생성 : 배열에 담아 두었던 레이블을 입력한다.
			chkFruit[i] = new JCheckBox( fruits[i] ) ;
			chkPanel.add( chkFruit[i] ) ; //판넬에 체크 박스 항목 추가
			chkFruit[i].addItemListener( this ) ; //체크시 이벤트에 반응하도록 설정 
		}		
		for (int i = 0; i < iconlists.length; i++) {
			//해당 인덱스에 대한 이미지 아이콘 지정
			iconlists[i] = new ImageIcon(ImageLocation + fruits[i] +  FileExtension ) ;
		}			
		super.add( chkPanel ) ;
		for (int i = 0; i < pictureLabel.length; i++) {
			//pictureLabel[i : 라벨 객체 생성
			pictureLabel[i] = new JLabel( fruits[i] + FileExtension );
			//모든 라벨에 noimage 아이콘을 설정한다.
			pictureLabel[i].setIcon( noimage );
			super.add( pictureLabel[i] ) ;
		}
	}	
	public CheckBoxTestSub(String title) {
		super.setTitle(title) ;
		
		this.compose();
		this.setevent() ;
		
		super.setBounds(300, 300, 600, 210) ;
		super.setVisible( true ) ;
	}
	private void setevent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ; 		
	}	
}
public class CheckBoxTest {
	public static void main(String[] args) {
		CheckBoxTestSub ex = new CheckBoxTestSub("체크 박스 데모");
	}
}