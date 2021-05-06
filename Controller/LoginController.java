package Controller;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import Model.*;
import View.*;

public class LoginController extends DatabaseController
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public LoginController()
	{
		try
		{
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
			st= con.createStatement();
			JOptionPane.showMessageDialog(null,"Connection Successful");
		}catch(Exception ex)
		{
			System.out.println("Error: "+ex);
		}
	}
	public int validity(User user)
	{
		String query = "select Password from user where User_Name='"+user.getUserName()+"'";
		try
		{
			rs = st.executeQuery(query);
			while(rs.next())
			{
				if(rs.getString("Password").equals(user.getPassword()))
				{
					return 1;
				}
			}
		}catch(Exception ex)
		{
			System.out.println("Error: "+ex);
		}
		return 0;	
	}
	public void register(User user)
	{
		String query = "INSERT INTO user(User_Name, Password, Email, Contact_No, Address)" + "VALUES ('"+user.getUserName()+"', '"+user.getPassword()+"', '"+user.getEmail()+"', '"+user.getContactNo()+"', '"+user.getAddress()+"')";
		try
		{
			st.executeUpdate(query);
			
		}catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

}