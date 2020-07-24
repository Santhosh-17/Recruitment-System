package mp2;
import java.sql.*;
public class Connect {
	
	public boolean sconnect(String tname, String s1,String s2) throws Exception
	{
		String table;
		Boolean b = false;
		String temp,temp1;
		if(tname.equals("USER"))
		{
			table = "usertable";
		}
		else
		{
			table = "admintable";
		}
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System","Santhosh22");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from "+ table);
		System.out.println(s1+" "+s2);
		while(rs.next())
		{
			temp = ""+rs.getString(1);
			temp1 = ""+rs.getString(6);
			System.out.println(s1+" ## "+temp+" ## "+s2+" ## "+temp1);
			if(s1.equals(temp) && s2.equals(temp1))
			{
				b = true;
				break;
			}
		}
		con.commit();
		con.close();
		return b;
	}

}
