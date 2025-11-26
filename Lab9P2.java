import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9P2 extends JFrame {
    Lab9P2() {
        super("JTable Demo");
        String[] heading = {"Name", "Course", "RollNo"};
        String[][] data = {
            {"DELL", "CSE", "0123"},
            {"BELL", "CSD", "01234"},
            {"CELL", "CSM", "012345"},
        };
        JTable jt = new JTable(data, heading);
        JScrollPane sp = new JScrollPane(jt);
        add(sp); 
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String... args) {
        new Lab9P2();
    }
}
