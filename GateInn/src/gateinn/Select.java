package gateinn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Select implements ActionListener
{
    JFrame jf;
    JLabel lblgate,lblname;
    JTextField tname;
    JComboBox gatenum;
    JButton bconfirm,bcancel,bview;
    String gate[]={"MAIN GATE","BACK GATE"};
    Select()
    {
        //Frame details
        jf=new JFrame("ENTER DETAILS");
        jf.setDefaultCloseOperation(WindowConstants. EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setLocation(30,30);
        jf.setSize(500,250);
        
        //Label Details
        lblgate=new JLabel("ENTER GATE NUMBER: ");
        lblgate.setBounds(20,50,235,30);
        lblgate.setFont(new Font("serif",Font.BOLD,20));
        lblgate.setForeground(Color.BLACK);
        jf.add(lblgate);
        
        lblname=new JLabel("ENTER NAME: ");
        lblname.setBounds(20,100,150,30);
        lblname.setFont(new Font("serif",Font.BOLD,20));
        lblname.setForeground(Color.BLACK);
        jf.add(lblname);
        jf.setVisible(true);
        
        //TextField Details
        tname=new JTextField();
        tname.setBounds(170,100,240,30);
        tname.setFont(new Font("serif",Font.PLAIN,18));
        tname.setForeground(Color.BLACK);
        jf.add(tname);
        
        //DropDown Box Details
        gatenum=new JComboBox(gate);
        gatenum.setBounds(260,50,150,30);
        gatenum.setFont(new Font("serif",Font.PLAIN,18));
        gatenum.setBackground(Color.WHITE);
        gatenum.setForeground(Color.BLACK);
        gatenum.setSelectedItem(0);
        jf.add(gatenum);
        
        gatenum.setVisible(true);
        tname.setVisible(true);
        
        //Button Details
        bconfirm=new JButton("CONFIRM");
        bconfirm.setBounds(25,150,120,30);
        bconfirm.setBackground(Color.BLACK);
        bconfirm.setForeground(Color.WHITE);
        bconfirm.setFont(new Font("Times_New_Roman",Font.PLAIN,18));
        jf.add(bconfirm);
        
        bcancel=new JButton("CANCEL");
        bcancel.setBounds(185,150,120,30);
        bcancel.setBackground(Color.BLACK);
        bcancel.setForeground(Color.WHITE);
        bcancel.setFont(new Font("Times_New_Roman",Font.PLAIN,18));
        jf.add(bcancel);
        
        bview=new JButton("VIEW");
        bview.setBounds(345,150,120,30);
        bview.setBackground(Color.BLACK);
        bview.setForeground(Color.WHITE);
        bview.setFont(new Font("Times_New_Roman",Font.PLAIN,18));
        jf.add(bview);
        
        bcancel.addActionListener(this);
        bconfirm.addActionListener(this);
        bview.addActionListener(this);
        
        jf.setVisible(true);      
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bcancel)
        {
            jf.dispose();
        }
        if(ae.getSource()==bconfirm)
        {
            jf.dispose();
            String name=tname.getText();
            String gatename=gatenum.getSelectedItem().toString();
            Entry e=new Entry(name,gatename);
        }
        if(ae.getSource()==bview)
        {
            jf.dispose();
            View v=new View();
        }
    }
    public static void main(String args[])
    {
        Select s=new Select();
    }
}
