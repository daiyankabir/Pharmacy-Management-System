package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Controller.*;
import Model.*;

public class SearchGUI extends JFrame
{
	private Container c;
	private ImageIcon icon;
	private JPanel panel1, panel2;
	private JTable table;
	private String searchString;
	JComboBox typeList;
	public SearchGUI()
	{
		super("Search");
		this.setBounds(0,0,1600,900);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//icon
		icon = new ImageIcon("icon.png");
		this.setIconImage(icon.getImage());
		
		c = this.getContentPane();
		c.setLayout(null);
		
		//background
		icon = new ImageIcon("background.jpg");
		JLabel background = new JLabel("",icon,JLabel.CENTER);
		background.setBounds(0,0,1600,900);
		
		//panel1
		panel1 = new JPanel();
		panel1.setBounds(0,0,1600,900);
		panel1.add(background);
		
		//panel2
		panel2 = new JPanel();
		panel2.setBounds(50,150,940,600);
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		
		//font
		Font f1 =new Font("Arial",Font.BOLD,50);
		Font f2 =new Font("Arial",Font.BOLD,20);
		
		//Label
		JLabel header= new JLabel("Search");
		header.setBounds(100,50,400,50);
		header.setFont(f1);
		header.setForeground(Color.white);
		
		//textField
		JTextField tf1= new JTextField();
		tf1.setBounds(170,50,600,50);
		tf1.setFont(f2);
		
		//table
		table = new JTable();
		table.setEnabled(false);
		
		//combobox
		String[] type = {"Trade Name","Generic Name","Company"};
		typeList = new JComboBox(type);
		typeList.setBounds(50,50,120,50);
		
		//button
		JButton button1 = new JButton();
		icon = new ImageIcon("searchicon.png");
		button1.setIcon(icon);
		button1.setBounds(800,50,50,50);
		JButton button2 = new JButton();
		icon = new ImageIcon("back.png");
		button2.setIcon(icon);
		button2.setBounds(50,50,50,50);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{ 
				searchString=tf1.getText();
				findDrugs(searchString);
				//table.setModel(model);
			}
		});
		
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				dispose();
				HomeGUI s = new HomeGUI();
				s.setVisible(true);
			}
		});
		
		//ScrollPanel
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(50,120,800,400);
		
		panel2.add(typeList);
		panel2.add(tf1);
		panel2.add(button1);
		panel2.add(scroll);
		c.add(panel2);
		c.add(header);
		c.add(button2);
		c.add(panel1);
		
		
	}
	public void findDrugs(String searchString)
	{
		SearchController db=new SearchController();
		String combotext = (String)typeList.getSelectedItem();
		ArrayList<Drug> drugs=db.listDrug(searchString,combotext); 
		DefaultTableModel model=new DefaultTableModel();
		model.setColumnIdentifiers(new Object[]{"Trade Name", "Generic Name", "Company Name", "Quantity", "Per Price"});
		Object[] row =new Object[5];
		for(int i=0;i<drugs.size();i++)
		{
			row[0]=drugs.get(i).getDrugName();
			row[1]=drugs.get(i).getMedicalName();
			row[2]=drugs.get(i).company.getCompanyName();
			row[3]=drugs.get(i).inventory.getQuantity();
			row[4]=drugs.get(i).getPrice();	
			model.addRow(row);
		}
		table.setModel(model);
			
	}
}