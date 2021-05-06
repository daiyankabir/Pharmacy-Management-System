package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Controller.*;
 

public class RemoveInventoryGUI extends JFrame
{
    
    private Container c;
	private ImageIcon icon;
	private JPanel panel1, panel2;
	public RemoveInventoryGUI()
	{   
		super("Remove Inventory");
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
		panel2.setBounds(50,150,600,250);
		panel2.setBackground(Color.white);
		panel2.setLayout(null);
		
		//font
		Font f1 =new Font("Arial",Font.BOLD,30);
		Font f2 =new Font("Arial",Font.BOLD,20);
		
		//Label
		JLabel header= new JLabel("Remove Inventory");
		header.setBounds(100,50,600,50);
		header.setFont(f1);
		header.setForeground(Color.white);
		
		
		JLabel label2= new JLabel("Inventory ID");
		label2.setBounds(10,50,150,50);
		label2.setFont(f2);



        
		//textfield
		
        JTextField tf2= new JTextField();
		tf2.setBounds(150,50,300,50);
		tf2.setFont(f2);
		



        
        
		
		//button
		JButton button1 = new JButton("Remove Inventory");
		button1.setBounds(200,120,150,80);
		JButton button2 = new JButton();
		icon = new ImageIcon("back.png");
		button2.setIcon(icon);
		button2.setBounds(50,50,50,50);
		
		panel2.add(label2);
		panel2.add(tf2);
		

        
        
		panel2.add(button1);
		c.add(button2);
		c.add(panel2);
		c.add(header);
		c.add(panel1);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
                InventoryController controller = new InventoryController();
                int i=Integer.parseInt(tf2.getText());
                controller.removeByInventoryId(i);
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