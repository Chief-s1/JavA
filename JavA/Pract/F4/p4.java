import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class A extends JFrame implements ActionListener{


JTextField t1,t2,t3;


	A(){
				 	setLayout(new FlowLayout());
	 	JLabel l1= new JLabel("Number 1:");
		 t1 = new JTextField(20);
     
     	JLabel l2= new JLabel("Number 2:");
		 t2 = new JTextField(20);

		JButton b2=new JButton("Add");
		JButton b3=new JButton("Sub");
		JButton b4=new JButton("Div");

		JButton b1=new JButton("Submit");
		 t3=new JTextField(20);
		add(l1);
		add(t1); 
		add(l2);
		add(t2);
		add (b2);
		add(b3);
		add(b1);
		add(t3);
		add (b4);


         b3.addActionListener(this);
          		
         b4.addActionListener(this);
          		
         b1.addActionListener(this);

         b2.addActionListener(this);
         
          		}
	public void actionPerformed(ActionEvent e){
		int res=0;
		String s=e.getActionCommand();
		if(s.equals("Submit")){
			System.exit(0);
		}
		if(s.equals("Add")){
			res = ( Integer.parseInt(t1.getText()) ) + ( Integer.parseInt(t2.getText()) );
		}
     	if(s.equals("Sub")){
		res = ( Integer.parseInt(t1.getText()) ) - ( Integer.parseInt(t2.getText()) );

     	}
   
     	        if(s.equals("Div")){
     	        	if(Integer.parseInt(t2.getText())==0)
     	        	{
     	        		t3.setText("Cannot Divide by 0");
     	        	}
     	        	else{
     	        		res = ( Integer.parseInt(t1.getText()) ) / ( Integer.parseInt(t2.getText()) );

     	        	}

     	        }
     	             	        	  t3.setText(Integer.toString(res));


		}

	
	public static void main(String args[]){

		A a= new A();
		a.setSize(500,600);
		a.setVisible(true);
	}
} 