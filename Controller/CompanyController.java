package Controller;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import Model.*;
import java.sql.SQLException;

public class CompanyController extends DatabaseController
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public CompanyController() 
	{
		
    }
    
    public void addCompany(Company c)
    {
        String query="INSERT INTO `company` (`Company_Id`, `Company_Name`, `Email`, `Contact_No`, `Branch`, `Address`, `Description`) VALUES ('"+c.getCompanyId()+"', '"+c.getCompanyName()+"', '"+c.getEmail()+"', '"+c.getContactNo()+"', '"+c.getBranch()+"', '"+c.getAddress()+"', '"+c.getDescription()+"')";
        try
		{
			st.executeUpdate(query);
			
		}catch (SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
    }
    public void removeCompanyByName(String s)
    {
        String query="DELETE FROM company WHERE Company_Name='"+s+"'";
        try
		{
			st.executeUpdate(query);
			
		}catch (SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
    }

	
}