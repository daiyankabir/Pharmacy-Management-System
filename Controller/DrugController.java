package Controller;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import Model.*;
import java.sql.SQLException;

public class DrugController extends DatabaseController
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DrugController()
	{
		
    }
    public void addDrug(Drug d)
    {
        String query="INSERT INTO `drug` (`Drug_Id`, `Drug_Name`, `Medical_Name`, `Price`, `Description`, `Company_Id`) VALUES ('"+d.getDrugId()+"', '"+d.getDrugName()+"', '"+d.getMedicalName()+"', '"+d.getPrice()+"', '"+d.getDescription()+"', '"+d.getCompanyId()+"')";
        try
        {
			st.executeUpdate(query);
			
		}catch (SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
    }
    public void removeByDrugName(String s)
    {
        String query="DELETE FROM drug WHERE Drug_Name='"+s+"'";
        try
		{
			st.executeUpdate(query);
			
		}catch (SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
    }
    
    

	
}