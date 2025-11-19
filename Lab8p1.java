import java.awt.event.*;
import java.awt.*;
class Lab8p1{
	public static void main(String...args){
		Frame f = new Frame();
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
            		@Override
            		public void windowClosing(WindowEvent e){
               		System.out.println("Window is closing...");
			System.exit(0);
			}
		}
		);
	}
}