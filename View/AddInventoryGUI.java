package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Controller.*;
import Model.*;
 

public class AddInventoryGUI extends JFrame
{
    
    private Container c;
	private ImageIcon icon;
	private JPanel panel1, panel2;
	public AddInventoryGUI()
	{   
		super("ADD Inventory");
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
		panel2.setBounds(550,200,500,500);
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		
		//font
		Font f1 =new Font("Arial",Font.BOLD,30);
		Font f2 =new Font("Arial",Font.BOLD,20);
		
		//Label
		JLabel header= new JLabel("Add Inventory");
		header.setBounds(680,20,800,200);
		header.setFont(f1);
		header.setForeground(Color.white);
		
		JLabel label1= new JLabel("Invertory Id ");
		label1.setBounds(10,0,150,50);
		label1.setFont(f2);
		JLabel label2= new JLabel("Quantity");
		label2.setBounds(10,50,150,50);
		label2.setFont(f2);
		JLabel label3= new JLabel("Drugid");
		label3.setBounds(10,100,150,50);
		label3.setFont(f2);


        
		//textfield
		JTextField tf1= new JTextField();
		tf1.setBounds(150,0,300,50);
        tf1.setFont(f2);
        
        JTextField tf2= new JTextField();
		tf2.setBounds(150,50,300,50);
		tf2.setFont(f2);
		JTextField tf3= new JTextField();
		tf3.setBounds(150,100,300,50);
		tf3.setFont(f2);
        



        
        
		
		//button
		JButton button1 = new JButton("Add Inventory");
		button1.setBounds(200,350,120,50);
		JButton button2 = new JButton();
		icon = new ImageIcon("back.png");
		button2.setIcon(icon);
		button2.setBounds(50,50,50,50);
		
		panel2.add(label1);
		panel2.add(tf1);
		panel2.add(label2);
		panel2.add(tf2);
		panel2.add(label3);
		panel2.add(tf3);
		
        

        
        
		panel2.add(button1);
		c.add(button2);
		c.add(panel2);
		c.add(header);
		c.add(panel1);
		
		button1.addActionListener((ActionEvent a) -> {
                    if(tf1.getText().length()==0 || tf2.getText().length()==0 || tf3.getText().length()==0 )
                    {
                        JOptionPane.showMessageDialog(null,"Please fill all forms");
                    }
                    else
                    {
                        int i=Integer.parseInt(tf1.getText());
                        int j=Integer.parseInt(tf2.getText());
                        int k=Integer.parseInt(tf3.getText());
                        
                        Inventory inventory=new Inventory();
						inventory.setInventoryId(i);
						inventory.setQuantity(j);
						inventory.setDrugIdd(k);
						
                        InventoryController controller=new InventoryController();
                        controller.addInventory(inventory);
                        dispose();
						ManageGUI s = new ManageGUI();
						s.setVisible(true);
                    }
                });
		
		button2.addActionListener((ActionEvent a) -> {
                    dispose();
                    ManageGUI s = new ManageGUI();
                    s.setVisible(true);
                });
	}
}