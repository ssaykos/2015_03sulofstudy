package _4��;

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
		//�̺�Ʈ ��ü ���
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
			//jta.setText("[��]��ư�� Ŭ���ϼ̽��ϴ�.");//�������̵� �̴�.. ������ �� ���� �ʴ´�. ����� �� ����
			jta.append("[��]��ư�� Ŭ���ϼ̽��ϴ�.\n");
		}else if (who ==binno){
			//jta.setText("[�ƴϿ�]��ư�� Ŭ���ϼ̽��ϴ�.");
			jta.append("[�ƴϿ�]��ư�� Ŭ���ϼ̽��ϴ�.\n");
		}//��ư ���������� �̺�Ʈ �ۼ�
	}
	
	public SwingYesNoSub(String title){
		int f_width=400;// �������� ����
		int f_height=300;// �������� ����
		
		
		super.setTitle(title);
		super.setVisible(true);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int)(screen.getWidth()/2-f_width/2), (int)(screen.getHeight()/2-f_height/2), f_width, f_height);
		
		
		/*setSize(f_width,f_height);//������ ũ�⸦ ���� ������ ������ ����
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		//�������� �����쿡 ǥ�õɶ� ��ġ�� �����ϱ� ���� ���� ������� �ػ� ���� �޾ƿ���.
		
		int f_xpos=(int)(screen.getWidth()/2-f_width/2);
		int f_ypos=(int)(screen.getHeight()/2-f_height/2);
		
		setLocation(f_xpos, f_ypos);*/
		
		this.compose();
		this.setevent();
		
		super.setVisible(true);
	}

	private void compose() {
		binyes = new JButton("[��]");
		binno = new JButton("[�ƴϿ�]");
		jta= new JTextArea();
		chkbox = new JCheckBox("[�ƴϿ�]�� Ȱ��ȭ ��ŵ�ϴ�.");
		
		bl= new BorderLayout();
		
		gi = new GridLayout(1,2);//�׸��� ���̾ƿ� 1��2�� ��ü����
		
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

public class _19����2�ð�����20����_SwingYesNo {

	public static void main(String[] args) {
		new SwingYesNoSub("��������");
	}

}
