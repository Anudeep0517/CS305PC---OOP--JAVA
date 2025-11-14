import java.awt.event.*;
import java.awt.*;
class Lab7P1{
	public static void main(String...args){
        	Frame f = new Frame();
		TextField tf = new TextField(100);
		Button b = new Button("Click");
		b.setSize(20,50);
		Label l = new Label();
		int a[] = {1};
		l.setPreferredSize(new Dimension(20,40));
		f.setSize(400,400);
		f.setVisible(true);
		f.add(tf);
		f.add(b);
		f.add(l);
		FlowLayout fl = new FlowLayout();
		f.setLayout((fl));
		b.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
				l.setText(tf.getText());
				System.out.println("The text is"+ " " +tf.getText()+ a[0]);
				a[0]++;	
			}
		}
		);
	}	
} 
