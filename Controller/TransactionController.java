package Controller;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import Model.*;
import View.*;
import java.sql.SQLException;

public class TransactionController extends DatabaseController
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	public Drug d;
	
	public TransactionController() 
	{
		
	}	    	
	
	public Drug searchPrice(String drug)
	{
		String query = "Select Price from drug where Drug_Name='"+drug+"'";
		try
		{
			rs = st.executeQuery(query);
			while(rs.next())
			{
				d = new Drug
				(
					rs.getInt("Drug_Id"),
					rs.getString("Drug_Name"),
					rs.getString("Medical_Name"),
					rs.getInt("Price")
				);
			}
			return d;
		}catch (SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		return null;
	}
}
    