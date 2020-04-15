package mp2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class MiniRegister extends JFrame {
	
	MiniRegister()
	{
		super("To Register for?");
		
	}
	JButton b1,b2;
	RegisterFrame2 rf2;
	RegisterFrame rf;
	public void initmr(Signup s)
	{
		
		b1 = new JButton();
        b2 = new JButton();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        b1.setBackground(new Color(0, 0, 255));
        b1.setFont(new Font("Times New Roman", 1, 14)); 
        b1.setForeground(new Color(255, 255, 255));
        b1.setText("To Hire");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	rf2 = new RegisterFrame2();
                rf2.initrf2(s);
                s.setVisible(false);
                dispose();
            }
        });
        getContentPane().add(b1);
        b1.setBounds(40, 40, 116, 35);

        b2.setBackground(new Color(0, 0, 255));
        b2.setFont(new Font("Times New Roman", 1, 14)); 
        b2.setForeground(new Color(255, 255, 255));
        b2.setText("To Work");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	rf = new RegisterFrame();
                rf.initrf(s);
                s.setVisible(false);
                dispose();
            }
        });
        add(b2);
        b2.setBounds(180, 40, 116, 35);
        
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        setResizable(false);
        setSize(373,148);
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
	}

}
