package gateinn;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
class ViewName implements ActionListener
{
    JFrame jf,frame;
    JLabel lbltitle,lblname;
    JTextField tname;
    JButton bsearch,bback,bdone;
    JTable table;
    int k=0;
    String column_names[]={"Name","Purpose","Phone","Flat","Date","Entry_Time","Exit Time","Watchman_Present","Gate","Vehicle_Num"};
    ViewName()
    {
        //Frame details
        jf=new JFrame("VIEW DETAILS");
        jf.setDefaultCloseOperation(WindowConstants. EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setLocation(20,20);
        jf.setSize(650,300);
        
        //Title
        lbltitle = new JLabel("VIEW DETAILS BY NAME");
        lbltitle.setBounds(5,5,500,50);
        lbltitle.setFont(new Font("serif",Font.ITALIC,42));
        lbltitle.setForeground(Color.ORANGE);
        jf.add(lbltitle);
        
        //Date Input
        lblname = new JLabel("ENTER NAME:-");
        lblname.setBounds(20,65,180,30);
        lblname.setFont(new Font("serif",Font.BOLD,24));
        lblname.setForeground(Color.BLACK);
        jf.add(lblname);
        
        tname=new JTextField();
        tname.setBounds(220,65,180,30);
        tname.setFont(new Font("serif",Font.PLAIN,18));
        tname.setForeground(Color.BLACK);
        jf.add(tname);
        
        
        //Search and Cancel Button
        bsearch=new JButton("SEARCH");
        bsearch.setBounds(410,65,110,30);
        bsearch.setFont(new Font("Times_New_Roman",Font.PLAIN,18));
        bsearch.setForeground(Color.WHITE);
        bsearch.setBackground(Color.BLACK);
        jf.add(bsearch);
        
        bback=new JButton("BACK");
        bback.setBounds(530,65,100,30);
        bback.setFont(new Font("Times_New_Roman",Font.PLAIN,18));
        bback.setForeground(Color.WHITE);
        bback.setBackground(Color.BLACK);
        jf.add(bback); 
        
        bsearch.addActionListener(this);
        bback.addActionListener(this);
        
        jf.setVisible(true);
    }
    public void showTable()
    {
        String name="",pur="",ph="",flat="",date="",entry="",exit="",watchman="",gate="",vehicle="";
        frame = new JFrame("Database Search Result");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column_names);
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        try {
            Databaseconn c=new Databaseconn();
            ResultSet rs = c.s.executeQuery("select * from entries where Name='"+tname.getText()+"';");
            while(rs.next()) 
            {
                name = rs.getString("Name");
                pur = rs.getString("Purpose");
                ph = rs.getString("Phone");
                flat = rs.getString("Flat");
                date = rs.getString("Date");
                entry = rs.getString("Entry_Time");
                exit = rs.getString("Exit_Time");
                watchman = rs.getString("Watchman_Present");
                gate = rs.getString("Gate");
                vehicle = rs.getString("Vehicle_Num");
                model.addRow(new Object[]{name,pur,ph,flat,date,entry,exit,watchman,gate,vehicle});
                k++;
            }
            if(k!=0)
            {
                frame.add(scroll);
                frame.setResizable(false);
                frame.setSize(1160,350);    
                frame.setVisible(true);
            }
            if(k==0)
            {
                jf.dispose();
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bback)
        {
            jf.dispose();
            View v=new View();
        }
        if(ae.getSource()==bsearch)
        {
            jf.dispose();
            ViewName vd=new ViewName();
            showTable();
        }
    }
    public static void main(String args[])
    {
        ViewName vd=new ViewName();
    }
}