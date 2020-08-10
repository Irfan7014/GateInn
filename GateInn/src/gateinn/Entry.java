package gateinn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Entry implements ActionListener
{
    JFrame jf;
    JLabel lblimage,lbltitle,lblwatchman,lblgate,lblname,lblpurpose,lblflat,lblvehicle,lblphone,lbldate,lblentrytime,lblexittime;
    JTextField twatchman,tgate,tname,tpurpose,tflat,tvehicle,tphone,tdate,tentrytime,texittime;
    JButton bdone,bcancel,bback,baddexittime,brefresh;
    Entry(String watchman,String gatename)
    {
        //Frame Details
        jf=new JFrame("ADD ENTRIES");
        jf.setDefaultCloseOperation(WindowConstants. EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.setLocation(20,20);
        jf.setSize(550,700);
        
        //Label and TextField Details
        //Title
        lbltitle = new JLabel("ENTER VISITOR DETAILS");
        lbltitle.setBounds(63,30,400,50);
        lbltitle.setFont(new Font("serif",Font.ITALIC,36));
        lbltitle.setForeground(Color.BLUE);
        jf.add(lbltitle);
        
        //1.Watchman
        lblwatchman = new JLabel("Watchman Attended:- ");
        lblwatchman.setBounds(30,100,200,30);
        lblwatchman.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lblwatchman.setForeground(Color.BLACK);
        jf.add(lblwatchman);
        
        twatchman=new JTextField();
        twatchman.setBounds(240,100,240,30);
        twatchman.setFont(new Font("serif",Font.PLAIN,18));
        twatchman.setForeground(Color.BLACK);
        twatchman.setText(watchman);
        twatchman.setEditable(false);
        jf.add(twatchman);
        
        //2.Gate
        lblgate = new JLabel("Gate:- ");
        lblgate.setBounds(30,150,190,30);
        lblgate.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lblgate.setForeground(Color.BLACK);
        jf.add(lblgate);
        
        tgate=new JTextField();
        tgate.setBounds(240,150,240,30);
        tgate.setFont(new Font("serif",Font.PLAIN,18));
        tgate.setForeground(Color.BLACK);
        tgate.setText(gatename);
        tgate.setEditable(false);
        jf.add(tgate);
         
        //3.Name of Visitor
        lblname = new JLabel("Name Of Visitor:- ");
        lblname.setBounds(30,200,190,30);
        lblname.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lblname.setForeground(Color.BLACK);
        jf.add(lblname);
        
        tname=new JTextField();
        tname.setBounds(240,200,240,30);
        tname.setFont(new Font("serif",Font.PLAIN,18));
        tname.setForeground(Color.BLACK);
        jf.add(tname);
        
        //4.Purpose Of Visit
        lblpurpose = new JLabel("Purpose Of Visit:- ");
        lblpurpose.setBounds(30,250,190,30);
        lblpurpose.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lblpurpose.setForeground(Color.BLACK);
        jf.add(lblpurpose);
        
        tpurpose=new JTextField();
        tpurpose.setBounds(240,250,240,30);
        tpurpose.setFont(new Font("serif",Font.PLAIN,18));
        tpurpose.setForeground(Color.BLACK);
        jf.add(tpurpose);
        
        //5.Flat
        lblflat = new JLabel("Flat No.:- ");
        lblflat.setBounds(30,300,190,30);
        lblflat.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lblflat.setForeground(Color.BLACK);
        jf.add(lblflat);
        
        tflat=new JTextField();
        tflat.setBounds(240,300,240,30);
        tflat.setFont(new Font("serif",Font.PLAIN,18));
        tflat.setForeground(Color.BLACK);
        jf.add(tflat);
        
        //6.Vehicle if brought
        lblvehicle = new JLabel("Vehicle(if applicable):- ");
        lblvehicle.setBounds(30,350,200,30);
        lblvehicle.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lblvehicle.setForeground(Color.BLACK);
        jf.add(lblvehicle);
        
        tvehicle=new JTextField();
        tvehicle.setBounds(240,350,240,30);
        tvehicle.setFont(new Font("serif",Font.PLAIN,18));
        tvehicle.setForeground(Color.BLACK);
        tvehicle.setText("N.A.");
        jf.add(tvehicle);
        
        //7.Phone No. of Visitor
        lblphone = new JLabel("Phone No. Of Visitor:- ");
        lblphone.setBounds(30,400,200,30);
        lblphone.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lblphone.setForeground(Color.BLACK);
        jf.add(lblphone);
        
        tphone=new JTextField();
        tphone.setBounds(240,400,240,30);
        tphone.setFont(new Font("serif",Font.PLAIN,18));
        tphone.setForeground(Color.BLACK);
        jf.add(tphone);
        
        //8.Date
        lbldate = new JLabel("Date:- ");
        lbldate.setBounds(30,450,190,30);
        lbldate.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lbldate.setForeground(Color.BLACK);
        jf.add(lbldate);
        
        tdate=new JTextField();
        tdate.setBounds(240,450,240,30);
        tdate.setFont(new Font("serif",Font.PLAIN,18));
        tdate.setForeground(Color.BLACK);
        jf.add(tdate);
        
        //9.Entry Time
        lblentrytime = new JLabel("Entry Time:- ");
        lblentrytime.setBounds(30,500,190,30);
        lblentrytime.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lblentrytime.setForeground(Color.BLACK);
        jf.add(lblentrytime);
        
        tentrytime=new JTextField();
        tentrytime.setBounds(240,500,240,30);
        tentrytime.setFont(new Font("serif",Font.PLAIN,18));
        tentrytime.setForeground(Color.BLACK);
        jf.add(tentrytime);
        
        //10.Exit Time
        lblexittime = new JLabel("Exit Time:- ");
        lblexittime.setBounds(30,550,190,30);
        lblexittime.setFont(new Font("Times_New_Roman",Font.PLAIN,20));
        lblexittime.setForeground(Color.BLACK);
        jf.add(lblexittime);
        
        texittime=new JTextField();
        texittime.setBounds(240,550,240,30);
        texittime.setFont(new Font("serif",Font.PLAIN,18));
        texittime.setForeground(Color.BLACK);
        texittime.setText("");
        jf.add(texittime);
        
        //Button Details
        bdone=new JButton("DONE");
        bdone.setBounds(15,600,100,40);
        bdone.setFont(new Font("Times_New_Roman",Font.PLAIN,18));
        bdone.setForeground(Color.WHITE);
        bdone.setBackground(Color.BLACK);
        jf.add(bdone);
        
        bcancel=new JButton("CANCEL");
        bcancel.setBounds(125,600,110,40);
        bcancel.setFont(new Font("Times_New_Roman",Font.PLAIN,18));
        bcancel.setForeground(Color.WHITE);
        bcancel.setBackground(Color.BLACK);
        jf.add(bcancel);    
        
        bback=new JButton("BACK");
        bback.setBounds(245,600,100,40);
        bback.setFont(new Font("Times_New_Roman",Font.PLAIN,18));
        bback.setForeground(Color.WHITE);
        bback.setBackground(Color.BLACK);
        jf.add(bback);
        
        baddexittime=new JButton("ADD EXIT TIME");
        baddexittime.setBounds(355,600,165,40);
        baddexittime.setFont(new Font("Times_New_Roman",Font.PLAIN,18));
        baddexittime.setForeground(Color.WHITE);
        baddexittime.setBackground(Color.BLACK);
        jf.add(baddexittime);
        
        brefresh=new JButton();
        Icon i=new ImageIcon("src\\gateinn\\images\\reload.png");
        brefresh.setIcon(i);
        brefresh.setBounds(10,10,30,30);
        jf.add(brefresh);
        
        bdone.addActionListener(this);
        bcancel.addActionListener(this);
        bback.addActionListener(this);
        baddexittime.addActionListener(this);
        brefresh.addActionListener(this);
        
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bdone)
        {
            try
            {
                Databaseconn c=new Databaseconn();
                String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,q;
                s1=tname.getText();
                s2=tpurpose.getText();
                s3=tphone.getText();
                s4=tflat.getText();
                s5=tdate.getText();
                s6=tentrytime.getText();
                s7=texittime.getText();
                s8=twatchman.getText();
                s9=tgate.getText();
                s10=tvehicle.getText();
                q="insert into Entries (Name, Purpose, Phone, Flat, Date, Entry_Time, Exit_Time, Watchman_Present, Gate, Vehicle_Num) values ('"+s1+"',"+"'"+s2+"',"+"'"+s3+"',"+"'"+s4+"',"+"'"+s5+"',"+"'"+s6+"',"+"'"+s7+"',"+"'"+s8+"',"+"'"+s9+"',"+"'"+s10+"')";
                
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Details Successfully Added");
                jf.dispose();
                Entry e=new Entry(s8,s9);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }            
        }
        if(ae.getSource()==bback)
        {
            jf.dispose();
            Select s=new Select();
        }
        if(ae.getSource()==bcancel)
        {
            jf.dispose();
        }
        if(ae.getSource()==baddexittime)
        {
            jf.dispose();
            AddExitTime aet=new AddExitTime();
        }
        if(ae.getSource()==brefresh)
        {
            String w=twatchman.getText();
            String g=tgate.getText();
            jf.dispose();
            Entry e=new Entry(w,g);
        }
    }
    public static void main(String args[])
    {
        Entry e=new Entry("NONE","MAIN GATE");
    }
}
