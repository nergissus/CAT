import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class View extends JPanel{
	JFrame frame;
	Control control;
	JLabel emptyLabel;
    
	public View(Control control) 
	{		
		this.control = control;
		frame = new JFrame("CAT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
        
		frame.setSize(1024, 768);
		frame.add(this);
		//this.setLayout(null);
	}
	/*
    private void createAndShowFrame() {
        //Create and set up the window.
        JFrame frame = new JFrame("CAT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    */
	
	public void drawWindow() { 
		JButton loadButton = new JButton("LOAD EXCEL FILE...");
		JButton closeButton = new JButton("CLOSE");

		frame.add(loadButton);
		frame.add(closeButton);
		loadButton.setBounds(250, 340, 200, 30);
		closeButton.setBounds(600, 340, 100, 30);
        //Display the window.
        //frame.pack();
        frame.setVisible(true);
        
		loadButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("LOAD Button clicked.");
			}
		});
		
		closeButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("CLOSE Button clicked.");
			}
		});
	}
	

}
