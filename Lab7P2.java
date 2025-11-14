import java.awt.event.*;
import java.awt.*;
class Lab7P2 implements ActionListener{
	  	Frame f = new Frame();
		TextField tf = new TextField(100);
		Button b = new Button("Click");
		Label l = new Label();
		int a = 1;
	Lab7P2(){
		l.setPreferredSize(new Dimension(20,40));
		f.setSize(400,400);
		f.setVisible(true);
		f.add(tf);
		f.add(b);
		f.add(l);
		FlowLayout fl = new FlowLayout();
		f.setLayout((fl));
		b.addActionListener(this);
	}
	public static void main(String...args){
		Lab7P2 lb = new Lab7P2();
	}
	public void actionPerformed(ActionEvent ae){
			l.setText(tf.getText());
			System.out.println("The text is"+tf.getText()+ a);	
			a++;
	}
	
} 

       	