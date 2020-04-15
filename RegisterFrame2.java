package mp2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
@SuppressWarnings("serial")
public class RegisterFrame2  extends JFrame {
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l9;
	JTextField tf2,tf3,tf4,tf5,tf6;
	JPasswordField pf1,pf2;
	JButton b1,b2;
	Rconnect1 rc;
	String cname,uname,mail,contact,loc,pwd,pwd2;
	
	RegisterFrame2()
	{
		super("Admin Registeration");
		
	}
	
	public void initrf2(Signup s)
	{
		l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        pf1 = new JPasswordField();
        pf2 = new JPasswordField();
        b1 = new JButton();
        b2 = new JButton();
        l9 = new JLabel();
        
        

        l1.setFont(new Font("Times New Roman", 1, 14)); 
        l1.setText("Re-Type Password");
        add(l1);
        l1.setBounds(20, 340, 120, 30);

        l2.setFont(new Font("Times New Roman", 1, 14)); 
        l2.setText("Company Name");
        add(l2);
        l2.setBounds(20, 30, 130, 30);

        l3.setFont(new Font("Times New Roman", 1, 14)); 
        l3.setText("Username");
        add(l3);
        l3.setBounds(20, 80, 90, 30);

        l4.setFont(new Font("Times New Roman", 1, 14)); 
        l4.setText("E-Mail Id");
        add(l4);
        l4.setBounds(20, 130, 90, 30);

        l5.setFont(new Font("Times New Roman", 1, 14)); 
        l5.setText("Contact");
        add(l5);
        l5.setBounds(20, 190, 100, 30);

        l6.setFont(new Font("Times New Roman", 1, 14)); 
        l6.setText("Location");
        add(l6);
        l6.setBounds(20, 240, 90, 30);

        l7.setFont(new Font("Times New Roman", 1, 14)); 
        l7.setText("Password");
        add(l7);
        l7.setBounds(20, 290, 90, 30);

        add(tf2);
        tf2.setBounds(190, 30, 230, 30);
        add(tf3);
        tf3.setBounds(190, 80, 230, 30);
        add(tf4);
        tf4.setBounds(190, 130, 230, 30);
        add(tf5);
        tf5.setBounds(190, 190, 230, 30);
        add(tf6);
        tf6.setBounds(190, 240, 230, 30);
        add(pf1);
        pf1.setBounds(190, 340, 230, 30);
        add(pf2);
        pf2.setBounds(190, 290, 230, 30);

        b1.setFont(new Font("Times New Roman", 1, 18)); 
        b1.setForeground(new Color(0, 0, 204));
        b1.setBackground(new Color(255, 255, 255));
        b1.setText("Register");
        rc = new Rconnect1();
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	
            	cname = tf2.getText();
            	uname = tf3.getText();
            	mail = tf4.getText();
            	contact = tf5.getText();
            	loc = tf6.getText();
            	pwd = new String(pf1.getPassword());
            	pwd2 =  new String(pf2.getPassword());
            	if (pwd.equals(pwd2))
            	{
            		try {  rc.rconnect(uname,cname,mail,contact,loc,pwd); } catch (Exception e) {	}
            		setVisible(false);
            		s.setVisible(true);
            	}
            	else
            	{
            		JOptionPane.showMessageDialog(null,"Check the Password");
            	}
            	
            }
        });
        add(b1);
        b1.setBounds(170, 410, 110, 30);
        
        b2.setFont(new Font("Times New Roman", 1, 18)); 
        b2.setForeground(new Color(255, 255, 255));
        b2.setBackground(new Color(255, 0, 51));
        b2.setText("Cancel");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	setVisible(false);
        		s.setVisible(true);
            }
        });
        add(b2);
        b2.setBounds(300, 410, 110, 30);
        
        tf2.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		tf3.requestFocus();
            	}
            }
        });
        tf3.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		tf4.requestFocus();
            	}
            }
        });
        tf4.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		tf5.requestFocus();
            	}
            }
        });
        tf5.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		tf6.requestFocus();
            	}
            }
        });
        tf6.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		pf2.requestFocus();
            	}
            }
        });
        pf2.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		pf1.requestFocus();
            	}
            }
        });
         
        l9.setIcon(new ImageIcon("C:\\Users\\santh\\Downloads\\bgg2.jpg")); 
        add(l9);
        l9.setBounds(0, -40, 970, 710);
        
        setLayout(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
        setSize(794,511);
        setResizable(false);
        setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		
	
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		
		
		
	}

}

class Rconnect1
{
	Connection con;
	PreparedStatement ps ;
	Statement st;
	//RegisterFrame rf;
	public void rconnect(String uname,String name,String mail,String pn,String address,String pwd) throws Exception
	{
		//    rf = new RegisterFrame();
		    
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System","Santhosh2001");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from admintable");
			
			Boolean ch = false;
			
			while(rs.next())
			{
				if(uname.equals(rs.getString(1)))
				{
					ch = true;
				}
			}
			System.out.println(ch);
			
			if(ch)
			{
				JOptionPane.showMessageDialog(null,"Username Already Exists!");
			}
			
			else
			{
				System.out.println(uname+" "+name+" "+mail+" "+pn+" "+address+" "+pwd);
				ps = con.prepareStatement("INSERT INTO admintable VALUES (?,?,?,?,?,?)");
				ps.setString(1,uname);
				ps.setString(2,name);
				ps.setString(3,mail);
				ps.setString(4,pn);
				ps.setString(5,address);
				ps.setString(6,pwd);
				int s = ps.executeUpdate();
				JOptionPane.showMessageDialog(null,s+ " Successfully Registered!");
				
				con.commit();
				con.close();
			}
			
	}
}    