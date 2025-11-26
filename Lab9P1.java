import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9P1 extends JFrame{
    Lab9P1(){
        super("Tabbed Pane Demo");
        JTabbedPane jtp = new JTabbedPane(3);
	jtp.addTab("Tab1" ,new Label("Tabbed Pane 1"));
        jtp.addTab("Tab2" ,new Label("Tabbed Pane 2"));
	jtp.addTab("Tab3" ,new Label("Tabbed Pane 3")); 
	add(jtp); 
	jtp.setTabPlacement(JTabbedPane.TOP);      
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String...args){
        new Lab9P1();
    }
}
