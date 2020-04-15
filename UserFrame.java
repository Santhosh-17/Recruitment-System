package mp2;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
@SuppressWarnings("serial")
public class UserFrame extends JFrame {

	JLabel l1;
	JTabbedPane t1;
	JPanel p1,p2;
	UserFrame()
	{
		super("Recruitment System");
		initm();
	}
	
	public void initm()
	{
		setLayout(null);
		t1 = new JTabbedPane();
		p1 = new JPanel();
		p2 = new JPanel();
		l1 = new JLabel(" Welcome");
		l1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 0, 204));
        add(l1);
        l1.setBounds(0, 0, 170, 40);
  

        p1.setLayout(null);
        t1.addTab("User Profile", p1);
        t1.addTab("Update", p2);

        add(t1);
        t1.setBounds(0, 41, 800, 500);
        
        String[][] val ={ {"NAME","TONY"},{"E-MAIL","tony@stark.com"},{"Phone No","9879879879"},{"Address","Los Angeles"}};
		String[] col = {"",""};
		JTable jt = new JTable(val,col);
		JScrollPane sp = new JScrollPane(jt);
		sp.setBounds(50, 30, 452, 402);
		jt.setModel(new DefaultTableModel(val,col)
		{
	         public boolean isCellEditable(int row, int col) {
	              return false;
	         }
	     });
		p1.add(sp);
		jt.setRowHeight(30);
		
		
		setVisible(true);
        setSize(794,511);
	
		sp.getColumnHeader().setVisible(false);
		
		
		
		
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new UserFrame();
		
	}

}

class Connectuser
{
	Connection con;
	Statement st;
	ResultSet rs;
	public void connect() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System","Santhosh2001");
		st = con.createStatement();
		rs = st.executeQuery("select * from register");
		
	}
}