package com.hard;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.Timer;

import com.easy.School;
import com.myproject.UI.Level;


import crossService.CrossService;
import crossbean.CrossBean;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Footwear {
	private JFrame frame;
	private JTextField txtS;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtT;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtL;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField txtE;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField txtO_1;
	private JTextField txtO;
	private JTextField txtF;
	private JTextField txtW;
	private JTextField txtE_1;
	private JTextField txtA;
	private JTextField txtR;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField txtS_1;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField txtB;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField txtA_1;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField txtL_1;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField txtN;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField txtL_2;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField txtE_2;
	private JTextField textField_56;
	private JButton button;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	int wrong=0;
	int j=0;
	double score=480;
    Thread ProgressUpdate=new Thread()
    {
      public void run()
      {
    	  int time=480;//1 min=60 seconds
    	  for(int i=0;i<=time;i++)
    	  {
    		try {
    			  Thread.sleep(1000);//Thread is made to sleep for 1 sec
    		}catch(Exception ex){}
    		progressBar.setValue(100*i/480);
    		score=score-0.2;
    		
    		if(progressBar.getValue()==100)
    		{
    		  JOptionPane.showMessageDialog(null,"....Times UP!..."+"Your Score is"+score);
    		  frame.dispose();
    		}
    	  }
      }
    };
    private JProgressBar progressBar;
    private JTextField username;
    private JProgressBar progressBar_1;
    private JLabel lblTimesRunning;
    private JLabel lblHint;
    private JLabel label_9;
    private JLabel lblNewLabel;
    private JLabel label_10;
    private JLabel label_11;
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Footwear window = new Footwear();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Footwear() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(143, 188, 143));
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		ProgressUpdate.start();
		
		txtS = new JTextField();
		txtS.setEditable(false);
		txtS.setBackground(new Color(230, 230, 250));
		txtS.setText(" S");
		txtS.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS.setColumns(10);
		txtS.setBounds(507, 13, 42, 42);
		frame.getContentPane().add(txtS);
		
		textField_1 = new JTextField();
		textField_1.setDocument(new JTextFieldCharLimits(1));
		textField_1.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(507, 55, 42, 42);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setDocument(new JTextFieldCharLimits(1));
		textField_2.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(507, 97, 42, 42);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setDocument(new JTextFieldCharLimits(1));
		textField_3.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(507, 139, 42, 42);
		frame.getContentPane().add(textField_3);
		
		txtT = new JTextField();
		txtT.setEditable(false);
		txtT.setText(" T");
		txtT.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtT.setColumns(10);
		txtT.setBounds(507, 180, 42, 42);
		frame.getContentPane().add(txtT);
		
		textField_5 = new JTextField();
		textField_5.setDocument(new JTextFieldCharLimits(1));
		textField_5.setFont(new Font("Dialog", Font.ITALIC, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(507, 222, 42, 42);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setDocument(new JTextFieldCharLimits(1));
		textField_6.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(466, 55, 42, 42);
		frame.getContentPane().add(textField_6);
		
		txtL = new JTextField();
		txtL.setEditable(false);
		txtL.setText(" L");
		txtL.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL.setBackground(new Color(230, 230, 250));
		txtL.setColumns(10);
		txtL.setBounds(424, 55, 42, 42);
		frame.getContentPane().add(txtL);
		
		textField_8 = new JTextField();
		textField_8.setDocument(new JTextFieldCharLimits(1));
		textField_8.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(383, 56, 42, 42);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setDocument(new JTextFieldCharLimits(1));
		textField_9.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(548, 55, 42, 42);
		frame.getContentPane().add(textField_9);
		
		txtE = new JTextField();
		txtE.setEditable(false);
		txtE.setBackground(new Color(230, 230, 250));
		txtE.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE.setText(" E");
		txtE.setColumns(10);
		txtE.setBounds(590, 55, 42, 42);
		frame.getContentPane().add(txtE);
		
		textField_11 = new JTextField();
		textField_11.setDocument(new JTextFieldCharLimits(1));
		textField_11.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(632, 55, 42, 42);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setDocument(new JTextFieldCharLimits(1));
		textField_12.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(673, 55, 42, 42);
		frame.getContentPane().add(textField_12);
		
		txtO_1 = new JTextField();
		txtO_1.setEditable(false);
		txtO_1.setText(" O");
		txtO_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO_1.setColumns(10);
		txtO_1.setBounds(466, 180, 42, 42);
		frame.getContentPane().add(txtO_1);
		
		txtO = new JTextField();
		txtO.setEditable(false);
		txtO.setText(" O");
		txtO.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtO.setColumns(10);
		txtO.setBounds(424, 180, 42, 42);
		frame.getContentPane().add(txtO);
		
		txtF = new JTextField();
		txtF.setEditable(false);
		txtF.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtF.setText(" F");
		txtF.setColumns(10);
		txtF.setBounds(383, 180, 42, 42);
		frame.getContentPane().add(txtF);
		
		txtW = new JTextField();
		txtW.setEditable(false);
		txtW.setText(" W");
		txtW.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtW.setColumns(10);
		txtW.setBounds(548, 180, 42, 42);
		frame.getContentPane().add(txtW);
		
		txtE_1 = new JTextField();
		txtE_1.setEditable(false);
		txtE_1.setText(" E");
		txtE_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE_1.setColumns(10);
		txtE_1.setBounds(590, 181, 42, 42);
		frame.getContentPane().add(txtE_1);
		
		txtA = new JTextField();
		txtA.setEditable(false);
		txtA.setText(" A");
		txtA.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA.setColumns(10);
		txtA.setBounds(632, 180, 42, 42);
		frame.getContentPane().add(txtA);
		
		txtR = new JTextField();
		txtR.setEditable(false);
		txtR.setText(" R");
		txtR.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtR.setColumns(10);
		txtR.setBounds(673, 180, 42, 42);
		frame.getContentPane().add(txtR);
		
		textField_20 = new JTextField();
		textField_20.setDocument(new JTextFieldCharLimits(1));
		textField_20.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_20.setColumns(10);
		textField_20.setBounds(424, 139, 42, 42);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setDocument(new JTextFieldCharLimits(1));
		textField_21.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_21.setColumns(10);
		textField_21.setBounds(424, 222, 42, 42);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setDocument(new JTextFieldCharLimits(1));
		textField_22.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_22.setColumns(10);
		textField_22.setBounds(424, 264, 42, 42);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setDocument(new JTextFieldCharLimits(1));
		textField_23.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_23.setColumns(10);
		textField_23.setBounds(424, 306, 42, 42);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setDocument(new JTextFieldCharLimits(1));
		textField_24.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_24.setColumns(10);
		textField_24.setBounds(424, 348, 42, 42);
		frame.getContentPane().add(textField_24);
		
		txtS_1 = new JTextField();
		txtS_1.setEditable(false);
		txtS_1.setText(" S");
		txtS_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtS_1.setColumns(10);
		txtS_1.setBounds(424, 389, 42, 42);
		frame.getContentPane().add(txtS_1);
		
		textField_26 = new JTextField();
		textField_26.setDocument(new JTextFieldCharLimits(1));
		textField_26.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_26.setColumns(10);
		textField_26.setBounds(383, 389, 42, 42);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setDocument(new JTextFieldCharLimits(1));
		textField_27.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_27.setColumns(10);
		textField_27.setBounds(341, 389, 42, 42);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setDocument(new JTextFieldCharLimits(1));
		textField_28.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_28.setColumns(10);
		textField_28.setBounds(299, 389, 42, 42);
		frame.getContentPane().add(textField_28);
		
		txtB = new JTextField();
		txtB.setEditable(false);
		txtB.setText(" B");
		txtB.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtB.setColumns(10);
		txtB.setBounds(258, 389, 42, 42);
		frame.getContentPane().add(txtB);
		
		textField_30 = new JTextField();
		textField_30.setDocument(new JTextFieldCharLimits(1));
		textField_30.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_30.setColumns(10);
		textField_30.setBounds(299, 348, 42, 42);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setDocument(new JTextFieldCharLimits(1));
		textField_31.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_31.setColumns(10);
		textField_31.setBounds(299, 428, 42, 42);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setDocument(new JTextFieldCharLimits(1));
		textField_32.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_32.setColumns(10);
		textField_32.setBounds(299, 469, 42, 42);
		frame.getContentPane().add(textField_32);
		
		txtA_1 = new JTextField();
		txtA_1.setEditable(false);
		txtA_1.setText(" A");
		txtA_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtA_1.setColumns(10);
		txtA_1.setBounds(299, 510, 42, 42);
		frame.getContentPane().add(txtA_1);
		
		textField_34 = new JTextField();
		textField_34.setDocument(new JTextFieldCharLimits(1));
		textField_34.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_34.setColumns(10);
		textField_34.setBounds(299, 552, 42, 42);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setDocument(new JTextFieldCharLimits(1));
		textField_35.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_35.setColumns(10);
		textField_35.setBounds(258, 510, 42, 42);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setDocument(new JTextFieldCharLimits(1));
		textField_36.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_36.setColumns(10);
		textField_36.setBounds(341, 510, 42, 42);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setDocument(new JTextFieldCharLimits(1));
		textField_37.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_37.setColumns(10);
		textField_37.setBounds(383, 510, 42, 42);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setDocument(new JTextFieldCharLimits(1));
		textField_38.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_38.setColumns(10);
		textField_38.setBounds(424, 510, 42, 42);
		frame.getContentPane().add(textField_38);
		
		txtL_1 = new JTextField();
		txtL_1.setEditable(false);
		txtL_1.setText(" L");
		txtL_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL_1.setColumns(10);
		txtL_1.setBounds(466, 510, 42, 42);
		frame.getContentPane().add(txtL_1);
		
		textField_40 = new JTextField();
		textField_40.setDocument(new JTextFieldCharLimits(1));
		textField_40.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_40.setColumns(10);
		textField_40.setBounds(673, 222, 42, 42);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setDocument(new JTextFieldCharLimits(1));
		textField_41.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_41.setColumns(10);
		textField_41.setBounds(673, 264, 42, 42);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setDocument(new JTextFieldCharLimits(1));
		textField_42.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_42.setColumns(10);
		textField_42.setBounds(673, 306, 42, 42);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setDocument(new JTextFieldCharLimits(1));
		textField_43.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_43.setColumns(10);
		textField_43.setBounds(673, 348, 42, 42);
		frame.getContentPane().add(textField_43);
		
		txtN = new JTextField();
		txtN.setEditable(false);
		txtN.setText(" N");
		txtN.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtN.setColumns(10);
		txtN.setBounds(673, 389, 42, 42);
		frame.getContentPane().add(txtN);
		
		textField_45 = new JTextField();
		textField_45.setDocument(new JTextFieldCharLimits(1));
		textField_45.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_45.setColumns(10);
		textField_45.setBounds(673, 428, 42, 42);
		frame.getContentPane().add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setDocument(new JTextFieldCharLimits(1));
		textField_46.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_46.setColumns(10);
		textField_46.setBounds(632, 390, 42, 42);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setDocument(new JTextFieldCharLimits(1));
		textField_47.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_47.setColumns(10);
		textField_47.setBounds(590, 390, 42, 42);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setDocument(new JTextFieldCharLimits(1));
		textField_48.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_48.setColumns(10);
		textField_48.setBounds(713, 390, 42, 42);
		frame.getContentPane().add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setDocument(new JTextFieldCharLimits(1));
		textField_49.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_49.setColumns(10);
		textField_49.setBounds(755, 390, 42, 42);
		frame.getContentPane().add(textField_49);
		
		txtL_2 = new JTextField();
		txtL_2.setEditable(false);
		txtL_2.setText(" L");
		txtL_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtL_2.setColumns(10);
		txtL_2.setBounds(797, 389, 42, 42);
		frame.getContentPane().add(txtL_2);
		
		textField_51 = new JTextField();
		textField_51.setDocument(new JTextFieldCharLimits(1));
		textField_51.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_51.setColumns(10);
		textField_51.setBounds(797, 348, 42, 42);
		frame.getContentPane().add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setDocument(new JTextFieldCharLimits(1));
		textField_52.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_52.setColumns(10);
		textField_52.setBounds(797, 428, 42, 42);
		frame.getContentPane().add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setDocument(new JTextFieldCharLimits(1));
		textField_53.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_53.setColumns(10);
		textField_53.setBounds(797, 469, 42, 42);
		frame.getContentPane().add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setDocument(new JTextFieldCharLimits(1));
		textField_54.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_54.setColumns(10);
		textField_54.setBounds(797, 511, 42, 42);
		frame.getContentPane().add(textField_54);
		
		txtE_2 = new JTextField();
		txtE_2.setEditable(false);
		txtE_2.setText(" E");
		txtE_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		txtE_2.setColumns(10);
		txtE_2.setBounds(797, 551, 42, 42);
		frame.getContentPane().add(txtE_2);
		
		textField_56 = new JTextField();
		textField_56.setDocument(new JTextFieldCharLimits(1));
		textField_56.setFont(new Font("Dialog", Font.BOLD, 24));
		textField_56.setColumns(10);
		textField_56.setBounds(797, 592, 42, 42);
		frame.getContentPane().add(textField_56);
		
		button = new JButton("FINISH");
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(139, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String f1="S"+textField_1.getText()+textField_2.getText()+textField_3.getText()+"T"+textField_5.getText();
				String f2=textField_8.getText()+"L"+textField_6.getText()+textField_1.getText()+textField_9.getText()+"E"+textField_11.getText()+textField_12.getText();
				String f3=textField_20.getText()+"O"+textField_21.getText()+textField_22.getText()+textField_23.getText()+textField_24.getText()+"S";
				String f4="R"+textField_40.getText()+textField_41.getText()+textField_42.getText()+textField_43.getText()+"N"+textField_45.getText();
				String f5=textField_30.getText()+textField_28.getText()+textField_31.getText()+textField_32.getText()+"A"+textField_34.getText();
				String f6="B"+textField_28.getText()+textField_27.getText()+textField_26.getText()+"S";
				String f7=textField_47.getText()+textField_46.getText()+"N"+textField_48.getText()+textField_49.getText()+"L";
				String f8=textField_51.getText()+"L"+textField_52.getText()+textField_53.getText()+textField_54.getText()+"E"+textField_56.getText();
				String f9=textField_35.getText()+"A"+textField_36.getText()+textField_37.getText()+textField_38.getText()+"L";
				
						
				if (f1.equals("SPORTS")&&f2.equals("SLIPPERS")&&f3.equals("LOAFERS")&&f4.equals("RUNNING")&&f5.equals("FORMAL")&&f6.equals("BOOTS")&&f7.equals("SANDAL")&&f8.equals("FLOATER")&&f9.equals("CASUAL"))
				{
					
					int id=(int)score/3;
					 ProgressUpdate.stop();
					 JOptionPane.showMessageDialog(null,"Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\nPls enter your username");
						
						String uname = JOptionPane.showInputDialog(frame, "Congratulations. You've completed the puzzle!"+"\nYour Score is "+(int)score/3+"\n\n Enter username:");

						 System.out.println(uname);
						 String upass = JOptionPane.showInputDialog(frame, "Enter password:");
						 System.out.println(upass);
						 
						 CrossService cs=new CrossService();
							cs.hard(id,uname,upass);
						
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Wrong Answers!");
					if(!f1.equals("SPORTS")){
						textField_1.setText(null) ;textField_2.setText(null) ;textField_3.setText(null);textField_5.setText(null);
					}
					if(!f2.equals("SLIPPERS"))
					{
						textField_8.setText(null); textField_6.setText(null); textField_1.setText(null); textField_9.setText(null);textField_11.setText(null); textField_12.setText(null);             
					}
					if(!f3.equals("LOAFERS")){
						textField_20.setText(null);textField_21.setText(null);textField_22.setText(null);textField_23.setText(null);textField_24.setText(null);
					}
					if(!f4.equals("RUNNING")){
						textField_40.setText(null);textField_41.setText(null);textField_42.setText(null);textField_43.setText(null);textField_45.setText(null);
					}
					if(!f5.equals("FORMAL")){
						textField_30.setText(null);textField_28.setText(null);textField_31.setText(null);textField_32.setText(null);textField_34.setText(null);
					}
					if(!f6.equals("BOOTS")){
						textField_28.setText(null);textField_27.setText(null);textField_26.setText(null);
					}
					if(!f7.equals("SANDAL")){
						textField_47.setText(null);textField_46.setText(null);textField_48.setText(null);textField_49.setText(null);
					}
					if(!f8.equals("FLOATER")){
						textField_51.setText(null);textField_52.setText(null);textField_53.setText(null);textField_54.setText(null);textField_56.setText(null);
					}
					if(!f9.equals("CASUAL")){
						textField_35.setText(null);textField_36.setText(null);textField_37.setText(null);textField_38.setText(null);
					}
					wrong++;
				}
			
				
				
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(75, 759, 179, 42);
		frame.getContentPane().add(button);
		
		label = new JLabel("1");
		label.setBounds(488, 13, 15, 16);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("2");
		label_1.setBounds(356, 68, 15, 16);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3");
		label_2.setBounds(406, 134, 15, 16);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("4");
		label_3.setBounds(640, 152, 15, 16);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("5");
		label_4.setBounds(316, 319, 15, 16);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("6");
		label_5.setBounds(239, 389, 15, 16);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("7");
		label_6.setBounds(563, 403, 15, 16);
		frame.getContentPane().add(label_6);
		
		label_7 = new JLabel("8");
		label_7.setBounds(773, 338, 24, 23);
		frame.getContentPane().add(label_7);
		
		label_8 = new JLabel("9");
		label_8.setBounds(239, 524, 15, 16);
		frame.getContentPane().add(label_8);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(73, 708, 766, 14);
		frame.getContentPane().add(progressBar);
		
		lblTimesRunning = new JLabel("Time's Running........ ");
		lblTimesRunning.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTimesRunning.setBounds(73, 660, 165, 35);
		frame.getContentPane().add(lblTimesRunning);
		
		lblHint = new JLabel("HINT");
		lblHint.setFont(new Font("Myanmar Text", Font.BOLD, 13));
		lblHint.setBounds(424, 769, 42, 38);
		frame.getContentPane().add(lblHint);
		
		label_9 = new JLabel("");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(j>=3)
				{
				    lblHint.setVisible(false);
					label_9.setVisible(false);
				}
				else
				{
					j++;
		        int TIME_VISIBLE=2000;
				JLabel label = new JLabel( new ImageIcon(Footwear.class.getResource("/images/solutions/Footwear.png")) );
				//JOptionPane.showMessageDialog(null, label, null, JOptionPane.PLAIN_MESSAGE, null);
				JOptionPane pane = new JOptionPane(label,
				          JOptionPane.INFORMATION_MESSAGE);
				      JDialog dialog = pane.createDialog(null, "Title");
				      dialog.setModal(false);
				      dialog.setVisible(true);

				      new Timer(TIME_VISIBLE, new ActionListener() {
				        @Override
				        public void actionPerformed(ActionEvent e) {
				          dialog.setVisible(false);
				        }
				      }).start();
				      score=score-30;
				      
				}
			}
		});
		label_9.setIcon(new ImageIcon(Footwear.class.getResource("/others/light-bulb.png")));
		label_9.setBounds(466, 746, 64, 66);
		frame.getContentPane().add(label_9);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Footwear.class.getResource("/images/questions/footwear.PNG")));
		lblNewLabel.setBounds(853, 72, 608, 651);
		frame.getContentPane().add(lblNewLabel);
		
		label_10 = new JLabel("HINT: You will be showed hint for only 2 seconds.    You can use hint 3 times only and each time 10 points will be deducted.");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_10.setBounds(73, 850, 1131, 16);
		frame.getContentPane().add(label_10);
		
		label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Level lv=new Level();
				lv.main(null);
			}
		});
		label_11.setIcon(new ImageIcon(Footwear.class.getResource("/others/if_Previous_2_372909.png")));
		label_11.setBounds(12, 13, 71, 71);
		frame.getContentPane().add(label_11);
		frame.setBounds(100, 100, 1531, 1069);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
