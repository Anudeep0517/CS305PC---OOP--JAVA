
import java.awt.*;
import java.awt.event.*;


public class Lab8p2 extends Frame implements ActionListener {
    Label label;
    Lab8p2(){
        super("MenuBar");
        addWindowListener( new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose();
            }
        } );
        MenuBar mb=new MenuBar();
        setMenuBar(mb);
        setLayout(new BorderLayout());
        String[] menus={"File","Edit","Help"};
        String[][] mi={ {"save","open","close"}, {"cut","copy","paste"}, {"About","Update","Licenses"} };
        int x = 0, y = 0;
        for(String s:menus){
            y = 0;
            Menu m=new Menu(s);
            for(int i = 0;i < 3;i++){
                MenuItem mmi = new MenuItem(mi[x][y]);
                mmi.addActionListener(this);
                m.add(mmi);
                y++;
            }
            x++;
            mb.add(m);
        }
        label = new Label("", Label.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        add(label, BorderLayout.CENTER);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String...args){
        Lab8p2 p=new Lab8p2();
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        String mstr = ae.getActionCommand();
        label.setText("You clicked: " + mstr);
    }
}


