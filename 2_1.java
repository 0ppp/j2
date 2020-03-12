import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class s2_1 extends JFrame implements ActionListener
{

 Integer buff[]= new Integer[10];
	
JMenuBar bar;
JMenu a,b;
JMenuItem m1,m2,m3,m4,m5;
JLabel l;
JTextField tf;
Random ran;

  public s2_1()
	{
	super("slip 2_1");
	setLayout(null);
ran= new Random();
bar= new JMenuBar();
	a=new JMenu("Operation");
	b=new JMenu("Sort");
	m1=new JMenuItem("Load");
	m2= new JMenuItem("Save");
	m3= new JMenuItem("Exit");
	m4= new JMenuItem("Ascending");
	m5= new JMenuItem("Descending");
	l= new JLabel("Numbers");
	tf= new JTextField(20);

	a.add(m1);
	a.add(m2);
	a.addSeparator();
	a.add(m3);

	b.add(m4);
	b.add(m5);
	setJMenuBar(bar);
	bar.add(a);
	bar.add(b);

	add(bar);

   l.setBounds(20,200,100,30);
   tf.setBounds(130,200,200,30);
add(l);
add(tf);

	m1.addActionListener(this);
	m2.addActionListener(this);
	m3.addActionListener(this);
	m4.addActionListener(this);
	m5.addActionListener(this);


	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(500,500);

	}

	public void actionPerformed(ActionEvent e)
	{
		  if(e.getSource()==m3)
		   {
		   	dispose();
		   	
		   }
		   else
		   	 if(e.getSource()==m1)
		   {
		   for(int i=0;i<10;i++)
		   {
		   	buff[i]= new Integer(ran.nextInt()%100);
		   	if(buff[i]%10==buff[i])
		   		buff[i]=buff[i]*10+buff[i];
		   }
		   	
		   	tf.setText(""+buff[0]+","+buff[1]+","+buff[2]+","+buff[3]+","+buff[4]+","+buff[5]+","+buff[6]+","+buff[7]+","+buff[8]+","+buff[9]);
		   }
		   else if(e.getSource()==m2)
		   {
		   	try{
		   	File f= new File("numbers.txt");
		   	RandomAccessFile raf= new RandomAccessFile(f,"rw");
		   	raf.writeBytes(""+""+buff[0]+","+buff[1]+","+buff[2]+","+buff[3]+","+buff[4]+","+buff[5]+","+buff[6]+","+buff[7]+","+buff[8]+","+buff[9]+"\n");
		   	}
		   	catch(IOException e1)
		   	{
		   	}
		   }
		    else if(e.getSource()==m4)
		   {
		   	for(int i=0;i<10;i++)
		   		for(int j=i;j<10;j++)
		   			if(buff[i]>buff[j])
		   			{
		   				int temp=buff[i];
		   				buff[i]=buff[j];
		   				buff[j]=temp;
		   				
		   			}
		   		tf.setText(""+buff[0]+","+buff[1]+","+buff[2]+","+buff[3]+","+buff[4]+","+buff[5]+","+buff[6]+","+buff[7]+","+buff[8]+","+buff[9]);
		  
		   	
		   }
		    else if(e.getSource()==m5)
		   {
		   	 	for(int i=0;i<10;i++)
		   		for(int j=i;j<10;j++)
		   			if(buff[i]<buff[j])
		   			{
		   				int temp=buff[i];
		   				buff[i]=buff[j];
		   				buff[j]=temp;
		   				
		   			}
		   		tf.setText(""+buff[0]+","+buff[1]+","+buff[2]+","+buff[3]+","+buff[4]+","+buff[5]+","+buff[6]+","+buff[7]+","+buff[8]+","+buff[9]);
		  
		   	
		   }

	}
	
	public static void main(String []args)
	{
	new s2_1();
	}
}


