package mp2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Signup extends JFrame {
	
	JLabel l1 ,l2,l3,l4,l5;
	JRadioButton rb1,rb2;
	JButton b1,b2,b3;
	JTextField tf1,tf2;
	JPanel p2;
	JPasswordField pf1;
	ButtonGroup bg;
	Connect c;
	MiniRegister mf;
	Signup()
	{
		super("Welcome");
		initc();
		setLocationRelativeTo(null);
	}
	
	public void initc()
	{
		l1 = new JLabel();
		bg = new ButtonGroup();
        p2 = new JPanel();
        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        tf1 = new JTextField();
        pf1 = new JPasswordField();
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        l1.setFont(new Font("Times New Roman", 1, 18));  
      //  l1.setForeground(new Color(0, 0, 204));
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setText("RECRUITMENT SYSTEM");
        add(l1);
        l1.setBounds(0, 4, 790, 73);

        p2.setLayout(null);

        bg.add(rb1);
        bg.add(rb2);
        rb1.setText("USER");
        rb1.setForeground(new Color(255, 255, 255));
        rb1.setFont(new Font("Times New Roman", 0, 12));
        rb1.setSelected(true);
        p2.add(rb1);
        rb1.setBounds(280, 40, 60, 23);

        rb2.setText("ADMIN");
        rb2.setForeground(new Color(255, 255, 255));
        rb2.setFont(new Font("Times New Roman", 0, 12));
        p2.add(rb2);
        rb2.setBounds(280, 70, 80, 23);

      
        p2.add(l2);
        l2.setBounds(170, 20, 95, 95);
        l2.setIcon(new ImageIcon("C:\\Users\\santh\\Downloads\\nc.png"));  
        
       

        l3.setFont(new Font("Times New Roman", 1, 14));  
        l3.setForeground(new Color(255, 255, 255));
        l3.setText("PASSWORD");
        p2.add(l3);
        l3.setBounds(170, 200, 120, 30);

        l4.setFont(new Font("Times New Roman", 1, 14)); 
        l4.setForeground(new Color(255, 255, 255));
        l4.setText("USERNAME");
        p2.add(l4);
        l4.setBounds(170, 140, 120, 30);

        tf1.setText("");
        p2.add(tf1);
        tf1.setBounds(280, 140, 160, 30);

        pf1.setText("");
        p2.add(pf1);
        pf1.setBounds(280, 200, 160, 30);

        b1.setFont(new Font("Times New Roman", 1, 14));  
        b1.setText("REGISTER");
        b1.setForeground(new Color(0, 0, 204));
        b1.setBackground(new Color(255, 255, 255));
        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	doit();
            	
            }
        });
        p2.add(b1);
        b1.setBounds(280, 350, 110, 30);

        b2.setFont(new Font("Times New Roman", 1, 14));  
        b2.setText("SUBMIT");
        b2.setBackground(new Color(255, 255, 255));
        
        l1.setBackground(new Color(255, 255, 255));
        l1.setForeground(new Color(0, 0, 204));
        l1.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l1.setOpaque(true);
        

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setForeground(new java.awt.Color(255, 255, 255));
       
        getContentPane().setBackground(Color.BLACK);
        
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Boolean b = false;
            	c = new Connect();
                String s1,s2;
                s1 = tf1.getText();
                s2 = new String( pf1.getPassword());
                System.out.println(s1);
                System.out.println(s2);
            	if  (rb1.isSelected())
            	{
            		String temp = rb1.getText();
            		System.out.println(temp);
            		try { b =  c.sconnect(temp,s1 , s2); } catch (Exception e) {	}
            	}
            	else
            	{
            		String temp = rb2.getText();
            		System.out.println(temp);
            		try { b =  c.sconnect(temp,s1 , s2); } catch (Exception e) {	}
            	}
            	 
                if(b)
                {   
                	tf1.setText("");
                	pf1.setText("");
                	JOptionPane.showMessageDialog(null,"Login Success!");
                	
                }
                else
                {
                	tf1.setText("");
                	pf1.setText("");
                	JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                }
               
            }
        });
        p2.add(b2);
        b2.setBounds(230, 300, 100, 30);

        b3.setFont(new Font("Times New Roman", 1, 14));
        b3.setForeground(new Color(255, 255, 255));
        b3.setBackground(new Color(255, 0, 51));
        b3.setText("CANCEL");
        p2.add(b3);
        b3.setBounds(340, 300, 110, 30);

        
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	System.exit(0);        	
            }
        });
        
        add(p2);
        p2.setBounds(0, 80, 790, 410);
        
        
        l5.setIcon(new ImageIcon("C:\\Users\\santh\\Downloads\\bgg2.jpg"));
        p2.add(l5);
        l5.setBounds(0, -10, 790, 430);
        
        tf1.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		pf1.requestFocus();
            	}
            }
        });
        pf1.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		b2.requestFocus();
            	}
            }
        });
        b2.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		b3.requestFocus();
            	}
            }
        });
        b3.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER)
            	{
            		b1.requestFocus();
            	}
            }
        });
        
        setVisible(true);
        setSize(794,511);
        setResizable(false);
	}

	void doit()
	{
		mf = new MiniRegister(); 
        mf.initmr(this);
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		new Signup();
		
	}

}
