package _4주;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class SwingYesNoSub extends JFrame implements ActionListener,ItemListener{
	
	private JButton binyes,binno;
	private JTextArea jta;
	private JCheckBox chkbox;
	
	private BorderLayout bl;
	private GridLayout gi;
	private JPanel pNorth;
	
	private void setevent(){
		binyes.addActionListener(this);
		binno.addActionListener(this);
		chkbox.addItemListener(this);
		//이벤트 객체 등록
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object who=e.getSource();
		if(who == chkbox){
			binno.setEnabled(chkbox.isSelected());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object who = e.getSource();
		if(who == binyes){
			//jta.setText("[예]버튼을 클릭하셨습니다.");//오버라이딩 이다.. 하지만 잘 쓰지 않는다. 어펜드 를 쓰자
			jta.append("[예]버튼을 클릭하셨습니다.\n");
		}else if (who ==binno){
			//jta.setText("[아니오]버튼을 클릭하셨습니다.");
			jta.append("[아니오]버튼을 클릭하셨습니다.\n");
		}//버튼 눌렀을때의 이벤트 작성
	}
	
	public SwingYesNoSub(String title){
		int f_width=400;// 프레임의 넓이
		int f_height=300;// 프레임의 높이
		
		
		super.setTitle(title);
		super.setVisible(true);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int)(screen.getWidth()/2-f_width/2), (int)(screen.getHeight()/2-f_height/2), f_width, f_height);
		
		
		/*setSize(f_width,f_height);//프레임 크기를 위의 값에서 가져와 설정
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		//프레임이 윈도우에 표시될때 위치를 세팅하기 위해 현재 모니터의 해상도 값을 받아오기.
		
		int f_xpos=(int)(screen.getWidth()/2-f_width/2);
		int f_ypos=(int)(screen.getHeight()/2-f_height/2);
		
		setLocation(f_xpos, f_ypos);*/
		
		this.compose();
		this.setevent();
		
		super.setVisible(true);
	}

	private void compose() {
		binyes = new JButton("[예]");
		binno = new JButton("[아니오]");
		jta= new JTextArea();
		chkbox = new JCheckBox("[아니오]를 활성화 시킵니다.");
		
		bl= new BorderLayout();
		
		gi = new GridLayout(1,2);//그리드 레이아웃 1행2열 객체생성
		
		pNorth= new JPanel();
		
		pNorth.setLayout(gi);
		super.setLayout(bl);
		
		pNorth.add(binyes);
		pNorth.add(binno);
		
		super.add(pNorth, BorderLayout.NORTH);
		
		super.add(jta, BorderLayout.CENTER);
		super.add(chkbox, BorderLayout.SOUTH);
		
		binno.setEnabled(false);
	}

}

public class _19일차2시간부터20일차_SwingYesNo {

	public static void main(String[] args) {
		new SwingYesNoSub("스윙연습");
	}

}
