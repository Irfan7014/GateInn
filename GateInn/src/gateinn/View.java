package gateinn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class View implements ActionListener{
   
    JFrame jf;
    JLabel lblimage,lbltitle;
    JButton bname,bphone,bdate,bcancel;
    View()
    {
        //Frame details
        jf=new JFrame("VIEW DETAILS");
        jf.setDefaultCloseOperation(WindowConstants. EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setLocation(30,30);
        jf.setSize(700,500);
        
        //Background Image
        lblimage= new JLabel();
        lblimage.setBounds(0,0,700,500);
        lblimage.setLayout(null);
        ImageIcon i = new ImageIcon("src\\gateinn\\images\\details.jpg");
        lblimage.setIcon(i);
        jf.add(lblimage);
        
        //Title
        lbltitle = new JLabel("VIEW DETAILS");
        lbltitle.setBounds(5,5,400,50);
        lbltitle.setFont(new Font("serif",Font.ITALIC,36));
        lbltitle.setForeground(Color.ORANGE);
        lblimage.add(lbltitle);
        
        //Adding Buttons
        //1.Name button
        bname=new JButton("VIEW BY NAME");
        bname.setBounds(450,80,200,40);
        bname.setFont(new Font("Times_New_Roman",Font.BOLD,16));
        bname.setForeground(Color.BLACK);
        bname.setBackground(Color.LIGHT_GRAY);
        lblimage.add(bname);
        
        //2.Phone Button
        bphone=new JButton("VIEW BY PHONE NO.");
        bphone.setBounds(450,140,200,40);
        bphone.setFont(new Font("Times_New_Roman",Font.BOLD,16));
        bphone.setForeground(Color.BLACK);
        bphone.setBackground(Color.LIGHT_GRAY);
        lblimage.add(bphone);
        
        //3.View Button
        bdate=new JButton("VIEW BY DATE");
        bdate.setBounds(450,200,200,40);
        bdate.setFont(new Font("Times_New_Roman",Font.BOLD,16));
        bdate.setForeground(Color.BLACK);
        bdate.setBackground(Color.LIGHT_GRAY);
        lblimage.add(bdate);
        
        //4.Cancel button
        bcancel=new JButton("CANCEL");
        bcancel.setBounds(450,260,200,40);
        bcancel.setFont(new Font("Times_New_Roman",Font.BOLD,16));
        bcancel.setForeground(Color.BLACK);
        bcancel.setBackground(Color.LIGHT_GRAY);
        lblimage.add(bcancel);
        
        //Add Action Listeners to buttons
        bdate.addActionListener(this);
        bphone.addActionListener(this);
        bname.addActionListener(this);
        bcancel.addActionListener(this);
        
        jf.setVisible(true);
        
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bname)
        {
            jf.dispose();
            ViewName vn=new ViewName();
        }
        if(ae.getSource()==bdate)
        {
            jf.dispose();
            ViewDate vd=new ViewDate();
        }
        if(ae.getSource()==bphone)
        {
            jf.dispose();
            ViewPhone vp=new ViewPhone();
        }
        if(ae.getSource()==bcancel)
        {
            jf.dispose();
        }
    }
    public static void main(String args[])
    {
        View v=new View();
    }
}