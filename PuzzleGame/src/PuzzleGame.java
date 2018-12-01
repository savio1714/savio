

import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
public class PuzzleGame extends JFrame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next; 
Integer count=0;

PuzzleGame(){  
super("Puzzle Game ");  
 b1=new JButton("1");  
 b2=new JButton(" ");  
 b3=new JButton("3");  
 b4=new JButton("4");  
 b5=new JButton("5");  
 b6=new JButton("6");  
 b7=new JButton("7");  
 b8=new JButton("8");  
 b9=new JButton("2");  
 next=new JButton("next");  
  
b1.setBounds(15,35,55,45);  
b2.setBounds(75,35,55,45);  
b3.setBounds(135,35,55,45);  
b4.setBounds(15,85,55,45);  
b5.setBounds(75,85,55,45);  
b6.setBounds(135,85,55,45);  
b7.setBounds(15,135,55,45);  
b8.setBounds(75,135,55,45);  
b9.setBounds(135,135,55,45);  
next.setBounds(60,200,90,50);  
    
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(next);

b1.addActionListener(this);  
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this);  
b6.addActionListener(this);  
b7.addActionListener(this);  
b8.addActionListener(this);  
b9.addActionListener(this);  
 


JLabel countLabel = new JLabel("Counting moves");
countLabel.setBounds(223, 81, 120, 14);

b1.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  
	  count++;
	  countLabel.setText(count.toString());
	  
  }
});

b2.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  count++;
	  countLabel.setText(count.toString());
	  
  }
});
b3.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  count++;
	  countLabel.setText(count.toString());
	  
  }
});
b4.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  count++;
	  countLabel.setText(count.toString());
	  
  }
});
b5.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  count++;
	  countLabel.setText(count.toString());
	  
  }
});
b6.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  count++;
	  countLabel.setText(count.toString());
	  
  }
});
b7.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  count++;
	  countLabel.setText(count.toString());
	  
  }
});
b8.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  count++;
	  countLabel.setText(count.toString());
	  
  }
});
b9.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  count++;
	  countLabel.setText(count.toString());
	  
  }
});

next.addActionListener(this); 
  
next.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
	  count=0;
	  countLabel.setText(count.toString());
	  
  }
});
setSize(355,350);
next.setBackground(Color.DARK_GRAY);  
next.setForeground(Color.green);  
getContentPane().setLayout(null);  
getContentPane().add(countLabel);  
setVisible(true);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}//end of constructor  
  
	public void actionPerformed(ActionEvent e){  
	if(e.getSource()==next){  
		String s1=b4.getLabel();  
		b4.setLabel(b9.getLabel());  
		b9.setLabel(s1);  
		s1=b1.getLabel();  
		b1.setLabel(b5.getLabel());  
		b5.setLabel(s1);  
		s1=b2.getLabel();  
		b2.setLabel(b7.getLabel());  
		b7.setLabel(s1);  
	}  
	
	if(e.getSource()==b1){  
		String s1=b1.getLabel();  
		if(b2.getLabel().equals(" ")){ b2.setLabel(s1); b1.setLabel(" ");}  
			else if(b4.getLabel().equals(" ")){ b4.setLabel(s1); b1.setLabel(" ");}  
	 }//end of if  
	  
	if(e.getSource()==b3){  
		String s1=b3.getLabel();  
		if(b2.getLabel().equals(" ")){ b2.setLabel(s1); b3.setLabel(" ");}  
			else if(b6.getLabel().equals(" ")){ b6.setLabel(s1); b3.setLabel(" ");}  
	 }//end of if  
	  
	if(e.getSource()==b2){  
		String s1=b2.getLabel();  
		if(b1.getLabel().equals(" ")){ b1.setLabel(s1); b2.setLabel(" ");}  
			else if(b3.getLabel().equals(" ")){ b3.setLabel(s1); b2.setLabel(" ");}  
				else if(b5.getLabel().equals(" ")){ b5.setLabel(s1); b2.setLabel(" ");}  
	 }//end of if  
	  
	if(e.getSource()==b4){  
		String s1=b4.getLabel();  
		if(b1.getLabel().equals(" ")){ b1.setLabel(s1); b4.setLabel(" ");}  
			else if(b7.getLabel().equals(" ")){ b7.setLabel(s1); b4.setLabel(" ");}  
				else if(b5.getLabel().equals(" ")){ b5.setLabel(s1); b4.setLabel(" ");}  
	 }//end of if  
	  
	if(e.getSource()==b5){  
		String s1=b5.getLabel();  
		if(b2.getLabel().equals(" ")){ b2.setLabel(s1); b5.setLabel(" ");}  
			else if(b4.getLabel().equals(" ")){ b4.setLabel(s1); b5.setLabel(" ");}  
				else if(b6.getLabel().equals(" ")){ b6.setLabel(s1); b5.setLabel(" ");}  
					else if(b8.getLabel().equals(" ")){ b8.setLabel(s1); b5.setLabel(" ");}  
	 }//end of if  
	  
	if(e.getSource()==b6){  
	  
		String s1=b6.getLabel();  
		if(b9.getLabel().equals(" ")){ b9.setLabel(s1); b6.setLabel(" ");}  
			else if(b3.getLabel().equals(" ")){ b3.setLabel(s1); b6.setLabel(" ");}  
				else if(b5.getLabel().equals(" ")){ b5.setLabel(s1); b6.setLabel(" ");}  
	  
	 }//end of if  
	  
	if(e.getSource()==b7){  
		String s1=b7.getLabel();  
			if(b4.getLabel().equals(" ")){ b4.setLabel(s1); b7.setLabel(" ");}  
				else if(b8.getLabel().equals(" ")){ b8.setLabel(s1); b7.setLabel(" ");}  
	  
	 }//end of if  
	  
	if(e.getSource()==b8){  
		String s1=b8.getLabel();  
		if(b7.getLabel().equals(" ")){ b7.setLabel(s1); b8.setLabel(" ");}  
			else if(b9.getLabel().equals(" ")){ b9.setLabel(s1); b8.setLabel(" ");}  
				else if(b5.getLabel().equals(" ")){ b5.setLabel(s1); b8.setLabel(" ");}  
	  
	 }//end of if  
	  
	if(e.getSource()==b9){  
		String s1=b9.getLabel();  
		if(b6.getLabel().equals(" ")){ b6.setLabel(s1); b9.setLabel(" ");}  
			else if(b8.getLabel().equals(" ")){ b8.setLabel(s1); b9.setLabel(" ");}  
	  
	if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()  .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")  
	&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()  .equals("8")&&b9.getLabel().equals(" ")){   
	JOptionPane.showMessageDialog(PuzzleGame.this,"!!!Congratulations you won!!!"+" \n Solved within "+count +" Moves");  
	
	 
		}  
	}//end of if  
  
}//end of actionPerformed  
   
  
}