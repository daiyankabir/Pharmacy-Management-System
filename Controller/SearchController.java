package Controller;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import Model.*;
import View.*;

public class SearchController extends DatabaseController
{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public SearchController()
	{
		
	}

	public ArrayList<Drug> listDrug(String valTosearch, String text)
		{
			ArrayList<Drug> drugList=new ArrayList<Drug>();
			
			try {
				if(text=="Trade Name")
				{
					String searchQuery="select * from drug,company,inventory where drug.Drug_Id=inventory.Drug_Id and drug.Company_Id=company.Company_Id and Drug_Name like '%"+valTosearch+"%'";
					rs= st.executeQuery(searchQuery);
				}
				else if(text=="Generic Name")
				{
					String searchQuery="select * from drug,company,inventory where drug.Drug_Id=inventory.Drug_Id and drug.Company_Id=company.Company_Id and Medical_Name like '%"+valTosearch+"%'";
					rs= st.executeQuery(searchQuery);
				}
				else if(text=="Company")
				{
					String searchQuery="select * from drug,company,inventory where drug.Drug_Id=inventory.Drug_Id and drug.Company_Id=company.Company_Id and Company_Name like '%"+valTosearch+"%'";
					rs= st.executeQuery(searchQuery);
				}
				Drug item;

				while(rs.next())
				{
					item=new Drug
					(
						rs.getInt("Drug_Id"),
						rs.getString("Drug_Name"),
						rs.getString("Medical_Name"),
						rs.getInt("Price")
					);
					item.createCompany
					(
						rs.getInt("Company_Id"),
						rs.getString("Company_Name"),
						rs.getString("Email"),
						rs.getString("Contact_No"),
						rs.getString("Branch"),
						rs.getString("Address")
					);
					item.createInventory
					(
						rs.getInt("Inventory_Id"),
						rs.getInt("quantity")
					);
					drugList.add(item);
				}
			} catch (Exception ex) {
				System.out.println("Error: "+ex);
				
			}
			return drugList;
		}
}