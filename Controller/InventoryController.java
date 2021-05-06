package Controller;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import Model.*;
import java.sql.SQLException;

public class InventoryController extends DatabaseController
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public InventoryController()
	{
		
    }

    public void addInventory(Inventory i)
    {
        String query="INSERT INTO `inventory` (`Inventory_Id`, `Quantity`, `Drug_Id`) VALUES ('"+i.getInventoryId()+"', '"+i.getQuantity()+"', '"+i.getDrugIdd()+"')";
        try
        {
			st.executeUpdate(query);
			
		}catch (SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
    }

   
    public void removeByInventoryId(int s)
    {
        String query="DELETE FROM inventory WHERE Inventory_Id='"+s+"'";
        try
		{
			st.executeUpdate(query);
			
		}catch (SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
    }
    
    

	
}