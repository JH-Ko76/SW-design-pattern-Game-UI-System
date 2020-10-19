package Sw_project;

import java.awt.Color;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;






public class Main_Starcraft  {


	
	public static void main(String[] args) throws CloneNotSupportedException {
		Frame f = new Frame();	
		//������ ����
     	}
	}

class Frame extends JFrame {
	JButton Unitbtn1, Unitbtn2, Unitbtn3, Unitbtn4;
	JButton Movebtn, Attackbtn, Skillbtn, Stopbtn;
	JButton UpDamagebtn , UpArmorbtn, UpRange ;
	JLabel label1, label2 , label3 ,label4 ,label5;
	JPanel panel, panel2 , panel3 ,panel1;
	JLabel en,vec;
	JPanel eng,vect ;
	JPanel marin, firebat, ghost, medic;
	JLabel marin1, firebat1 , ghost1 ,medic1; 
	ImageIcon Barracks , Engineering , Vector, marineim ,firebatim ,ghostim ,medicim ;
	TextArea text;
	

public Frame() {
	setTitle("�����������̽� ���α׷�");
	setLayout(null);
	

	//���̾ƿ� ��ġ ����
	Barracks = new ImageIcon("C:\\Game\\Barrack.png");
	panel = new JPanel();
	panel.setLocation(10, 10);
	panel.setBackground(Color.WHITE);
	panel.setSize(100,100);
	add(panel);
	Image im = Barracks.getImage(); 
	Image im1 = im.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	ImageIcon icon1 = new ImageIcon(im1);
	JLabel	label1 = new JLabel(icon1);
	panel.add(label1);
	
	panel1= new JPanel();
	panel1.setLocation(10,110);
	panel1.setBackground(Color.WHITE);
	panel1.setSize(100,30);
	add(panel1);

	
	
	panel2 = new JPanel();
	panel2.setLocation(130,110);
	panel2.setBackground(Color.WHITE);
	panel2.setSize(100,30);
	add(panel2);
	
	eng = new JPanel();
	eng.setSize(100,100);
	eng.setLocation(130,10);
	add(eng);
	Engineering  = new ImageIcon("C:\\Game\\Vector.Png");
	Image im3= Engineering.getImage(); 
	Image im2 = im3.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	ImageIcon icon2 = new ImageIcon(im2);
	JLabel	en = new JLabel(icon2);
	eng.add(en);
	
	panel3 = new JPanel();
	panel3.setLocation(250, 110);
	panel3.setBackground(Color.WHITE);
	panel3.setSize(100,30);
	add(panel3);
	
	vect = new JPanel();
	vect.setSize(100,100);
	vect.setLocation(250,10);
	add(vect);
	Vector  = new ImageIcon("C:\\Game\\Engineering.png");
	Image im4= Vector.getImage(); 
	Image im5 = im4.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	ImageIcon icon3 = new ImageIcon(im5);
	JLabel	vec = new JLabel(icon3);
	vect.add(vec);
	

    //�ȳ�


	label5 = new JLabel("���� ����");
	label5.setSize(100,30);
	panel1.add(label5);
	
	label2 = new JLabel("���� ��ư");
	label2.setSize(100,30);
	panel2.add(label2);
	
	
	label3 = new JLabel("���׷��̵�");
	label3.setSize(100,30);
	panel3.add(label3);
		

	
	
	
	//��������/�����ư ������Ÿ�� ���ϻ�� 
	 
	 
	 marineim = new ImageIcon("C:\\Game\\Marin.png");
	 firebatim = new ImageIcon("C:\\Game\\FireBat.png");
	 ghostim = new ImageIcon("C:\\Game\\Ghost.png");
	 medicim = new ImageIcon("C:\\Game\\Medic.png");
	 
	   Image marineim1= marineim.getImage(); 
	   Image firebatim1= firebatim.getImage(); 
	   Image ghostim1= ghostim.getImage(); 
	   Image medicim1= medicim.getImage(); 
	
		

	   Image Redimage = marineim1.getScaledInstance(40,40,Image.SCALE_DEFAULT);
	   Image Blueimage = firebatim1.getScaledInstance(40,40,Image.SCALE_DEFAULT);
	   Image Whiteimage = ghostim1.getScaledInstance(40,40,Image.SCALE_DEFAULT);
	   Image Powerimage = medicim1.getScaledInstance(40,40,Image.SCALE_DEFAULT);
	
	   ImageIcon redicon = new ImageIcon(Redimage);
	   ImageIcon blueicon = new ImageIcon(Blueimage);
	   ImageIcon whiteicon= new ImageIcon(Whiteimage);
	   ImageIcon powericon= new ImageIcon(Powerimage);

	   Unitbtn1 = new JButton(redicon);
	   Unitbtn2 = new JButton(blueicon);
	   Unitbtn3 = new JButton(whiteicon);
	   Unitbtn4 = new JButton(powericon);
  
	 
	
	   JPanel UnitPr = new JPanel();
	   UnitPr.setLocation(10, 150);
	   UnitPr.setSize(100,400);
	   add(UnitPr);
	

	    

	 
	 //�긴������ (��ü ����)
	 Bridge_Code code = new Bridge_Code(new Bridge_FUN());
		  
	 //����  ������Ÿ�� ���ϻ��;
	 Unitbtn1.setLocation(10,150);
	 Unitbtn1.setSize(100,30);
     // ���� ��ü ��������	 
	 Prototype_BarracksUnit marine = new Prototype_BarracksUnit();
	 //name , weapon �ν��Ͻ� ���
	 marine.setName("�غ�");
	 marine.setWeapon("����");
	 Unitbtn1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent Unit1) {
	    	 System.out.println("��������:" +marine.getName()+"\n");
	    	 System.out.println("��빫��:" +marine.getWeapon()+"\n");
	    	 code.Stimpack();
	    }
	 });
     // ���̾�� ��ü ��������	 
	 Unitbtn2.setLocation(10,180);
	 Unitbtn2.setSize(100,30);
	 Prototype_BarracksUnit firebat = new Prototype_BarracksUnit();
	 firebat.setName("ȭ����纴");
	 firebat.setWeapon("ȭ������");
	 Unitbtn2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent Unit1) {
		    	 System.out.println("��������:" +firebat.getName()+"\n");
		    	 System.out.println("��빫��:" +firebat.getWeapon()+"\n");
		    	code.Stimpack();
		    }
		 });
	 // ��Ʈ ��ü ��������
	 Unitbtn3.setLocation(10, 210);
	 Unitbtn3.setSize(100,30);
	 Prototype_BarracksUnit ghost = new Prototype_BarracksUnit();
	 ghost.setName("����");
	 ghost.setWeapon("��ź ����");
	 Unitbtn3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent Unit1) {
		   	 System.out.println("��������:" +ghost.getName()+"\n");
	    	 System.out.println("��빫��:" +ghost.getWeapon()+"\n");
			    code.Ghost_LockDown();
			    code.Nuclear_Strike();
			    code.Cloaking();

		    }
		 });
	 // �޵� ��ü ��������
	 Unitbtn4.setLocation(10, 240);
	 Unitbtn4.setSize(100,30);
	 Prototype_BarracksUnit medic = new Prototype_BarracksUnit();
	 medic.setName("�ǹ���");
	 medic.setWeapon("ġ���");
	 Unitbtn4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent Unit1) {
		   	 System.out.println("��������:" +medic.getName()+"\n");
		 	 System.out.println("��빫��:" +medic.getWeapon()+"\n");
		    }
		 });
		 
	 UnitPr.add(Unitbtn1);
	 UnitPr.add(Unitbtn2);
	 UnitPr.add(Unitbtn3);
	 UnitPr.add(Unitbtn4);
	 
	 

	//���� ��ư
	 Movebtn = new JButton("�̵�");
	 Attackbtn = new JButton("����");
	 Skillbtn = new JButton("��ų");
	 Stopbtn = new JButton("����");
	
	 //�������� ��ư
	 Movebtn.setLocation(130, 150);
	 Movebtn.setSize(100,30);
	 
	 Attackbtn.setLocation(130,180);
	 Attackbtn.setSize(100,30);
	 
	 Skillbtn.setLocation(130, 210);
	 Skillbtn.setSize(100,30);
	 
	 Stopbtn.setLocation(130, 240);
	 Stopbtn.setSize(100,30);
	 
	 add(Movebtn);
	 add(Attackbtn);
	 add(Skillbtn);
	 add(Stopbtn);
	    //���� ���� ��ü �������� 
	    UnitState control = new  UnitState();
	    State_Attack attack = new State_Attack();
	    State_Move Move = new State_Move();
	    State_skill skill = new State_skill();
	    State_stop stop = new State_stop();
	    State_Unable unable = new State_Unable();
	    
	
	    
	 
	    
	 // ���� ���� ��
	 Movebtn.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent Movebtn) {
	    	// ��Ʈ�� �޼ҵ� ȣ�� 
	  	    control.setState_control(Move);
	  	  control.KeyPush();
	    }
	 });

	 Attackbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent Attackbtn) {
		    	
		    	control.setState_control(attack);
		    	 control.KeyPush();
		    }
		 });

	 Skillbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent Skillbtn) {
		    	Object source = Skillbtn.getSource();
	
		 	    control.setState_control(skill);
		 	   control.KeyPush();
		    	
		    }
		 });

	 
	 Stopbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent Stopbtn) {
		        
			    control.setState_control(stop);
			    control.KeyPush();
		    }
		 });
	
	 
	//���׷��̵� �κ�  ���ڷ����� ���� ��ü ��������
	Decorator_Upgrade  Upgrade = new Decorator_Upgrade();
	//���� ����
	Decorator_Armor ArmorUp = new Decorator_Armor(Upgrade);
	//���ݷ� ����
	Decorator_Damage Damage = new Decorator_Damage(Upgrade);
	//��Ÿ� ����
	Decorator_Range RangeUp = new Decorator_Range(Upgrade);

    

	    
	 UpDamagebtn = new JButton("���ݷ�");
	 UpArmorbtn = new JButton("����");
	 UpRange = new JButton("��Ÿ�");
	
	
	 UpDamagebtn.setLocation(250, 150);
	 UpDamagebtn.setSize(100,30);
	 
	 UpArmorbtn.setLocation(250,180);
	 UpArmorbtn.setSize(100,30);
	 
	 UpRange.setLocation(250, 210);
	 UpRange.setSize(100,30);
	 

	 add(UpRange);
	 add(UpArmorbtn);
	 add(UpDamagebtn);
	   
	    UpDamagebtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent Damage1) {
		    	 int countmax= 1;
		    	if (countmax < 3) {
		    		countmax++;
			        //�޼ҵ� ȣ�� 
		    		System.out.println(Damage.getUpgrade());
		    	}else if (countmax > 3) {
		    	    control.KeyPush();
		    	    control.setState_control(unable);
		    	}   	
		    }
		 });

		
		 UpArmorbtn.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent ArmorUp1) {
			    	 int countmax= 1;
			    if (countmax < 3) {	
			    	countmax++;
			    	System.out.println(ArmorUp.getUpgrade());
			 	}else if (countmax > 3) {
		    	    control.KeyPush();
		    	    control.setState_control(unable);
		    	}   	
		    
			    }
			 });
	
		 UpRange.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent RangeUp1) {
			    	 int countmax= 1;
					    if (countmax < 3) {	
					    	countmax++;
					    	System.out.println(RangeUp.getUpgrade());
					 	}else if (countmax > 3) {
				    	    control.KeyPush();
				    	    control.setState_control(unable);
				    	}
			    }
			 });

			 
		 	setSize(400,500);
			setVisible(true);
  }	
}

	
	


	


    
