package _4��;

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

	//÷�ε� ������ c:\\images ������ ����
	//������ �ݺ� �Ǵ� �ڵ�� ���(final) ���·� ����� ����϶�
	private final String ImageLocation = "c:\\images\\" ; //�̹��� ������ ���
	private final String FileExtension = ".gif" ; //�̹��� ������ Ȯ���� 
	
	//������ ���̰ų� ����� ���� üũ �ڽ�
	JCheckBox[] chkFruit = new JCheckBox[3];
	//fruits �迭 : ���� �̸��� �����ϰ� �ִ� ���ڿ� �迭
	String[] fruits = { "apple", "grape", "orange" }; 
	//pictureLabel : ���� �׸��� ���� ���̺�
	JLabel[] pictureLabel = new JLabel[3];
	//iconlists : �׸��� ���� ������
	ImageIcon[] iconlists = new ImageIcon[3];
	//noimage : üũ �ڽ��� off �Ǿ��� �� ������ �⺻ �̹���
	ImageIcon noimage = new ImageIcon(ImageLocation + "nfmage.jpg" ) ;
	//chkPanel : ���� ���ʿ� �������� �ǳ�(üũ �ڽ� 3���� ���� ���� ��)
	JPanel chkPanel = new JPanel(new GridLayout(3, 1));
	
	@Override
	public void itemStateChanged(ItemEvent event) {
		Object who = event.getSource() ;
		for (int i = 0; i < 3; i++) {
			if (who == chkFruit[i]) {
				//ItemEvent.DESELECTED : üũ �׸��� off �Ǿ� �ִٴ� ���� �����ϴ� ��� 
				if (event.getStateChange() == ItemEvent.DESELECTED){
					pictureLabel[i].setIcon( noimage );					
				}else{ //�ش� üũ �ڽ��� üũ�Ǹ�
					//�ε����� �ش��ϴ� �̹����� ǥ���Ѵ�.
					pictureLabel[i].setIcon(iconlists[i]);
				}
			}
		}
	}
	private void compose() {			
		//�����̳ʴ� ��ü 1�� 4���� �׸��� ���� �ƿ��̴�
		super.setLayout( new GridLayout( 1, 4 ) ) ;
		
		for (int i = 0; i < chkFruit.length; i++) {
			//üũ �ڽ� ��ü ���� : �迭�� ��� �ξ��� ���̺��� �Է��Ѵ�.
			chkFruit[i] = new JCheckBox( fruits[i] ) ;
			chkPanel.add( chkFruit[i] ) ; //�ǳڿ� üũ �ڽ� �׸� �߰�
			chkFruit[i].addItemListener( this ) ; //üũ�� �̺�Ʈ�� �����ϵ��� ���� 
		}		
		for (int i = 0; i < iconlists.length; i++) {
			//�ش� �ε����� ���� �̹��� ������ ����
			iconlists[i] = new ImageIcon(ImageLocation + fruits[i] +  FileExtension ) ;
		}			
		super.add( chkPanel ) ;
		for (int i = 0; i < pictureLabel.length; i++) {
			//pictureLabel[i : �� ��ü ����
			pictureLabel[i] = new JLabel( fruits[i] + FileExtension );
			//��� �󺧿� noimage �������� �����Ѵ�.
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
		CheckBoxTestSub ex = new CheckBoxTestSub("üũ �ڽ� ����");
	}
}