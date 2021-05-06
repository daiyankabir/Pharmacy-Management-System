package Controller;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import Model.*;
import View.*;

public class DatabaseController
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DatabaseController()
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
}