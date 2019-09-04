// Nadia Beidas
// This program allows a user to create a story


import java.awt.BorderLayout; //Import statements
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Story { //Story class
	private String findStory;

	public String getFindStory() {
		return findStory;
	}

	public void setFindStory(String findStory) {
		this.findStory = findStory;
	}
	
	public Story() { //constructor
		setFindStory(findStory);
	}
	
	@Override
	public String toString() {
		return String.format("Story = %s", findStory);
	}	
}

class WelcomeStoryPanel extends JPanel {
private String welcome; //Welcome message
	
	
	public String getWelcome() { //get function
		return welcome;
	}

	public void setWelcome(String welcome) { //set function
		this.welcome = welcome;
	}
	
	public void paintComponent(Graphics g) { //Graphics 
	     super.paintComponent(g);
	     g.setFont(new Font("Blackadder ITC", Font.BOLD, 30));
	     g.drawString(welcome, 10, 70);
	     setBackground(Color.PINK); //Turns panel pink
	    }
	
	public WelcomeStoryPanel() {
		welcome = "Escape to the world of imagination . . . Your adventure awaits!"; //Welcome message with font and size
		setPreferredSize(new Dimension(300, 82));
	}	
}

class StoryPanel extends JPanel {
	
	@Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    setBackground(Color.red);
	}
	
}

class StoryFrame extends JFrame {
	
	public StoryFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Close //EXIT //HIDE
	    setBounds(200,200,800,800); //Boundaries
	    setTitle("Create An Adventure"); //Title 
	    Container c = getContentPane();
	    c.setLayout(new BorderLayout()); //BorderLayout
	    //StoryPanel panSouth = new StoryPanel();
	    JPanel panSouth = new JPanel();
	    panSouth.setLayout(new BorderLayout());
	    panSouth.setPreferredSize(new Dimension(100,100));
	    JPanel panCenter = new JPanel();
	    panCenter.setLayout(new GridLayout(10,1));
	    panCenter.setPreferredSize(new Dimension(600,600));
	    //StoryPanel panCenter = newStoryPanel();
	    JPanel panNorth = new JPanel();
	    panNorth.setLayout(new BorderLayout());
	    panNorth.setPreferredSize(new Dimension(100,100));
	    WelcomeStoryPanel span = new WelcomeStoryPanel(); 
	    panNorth.add(span,BorderLayout.NORTH);
	    
	    
	    //g.setColor(Color.red);
	    	
	    // StoryFrame.setBackground(Color.red);
	    //this.setBackground(Color.RED);
	    //getContentPane().setBackground( Color.PINK );
	    //c=getContentPane();
	    //c.setLayout(null);
	    //c.setBackground(Color.RED);
	    //getContentPane().setBackground(Color.yellow);
	    //getContentPane().s
	    this.getContentPane().setBackground(Color.YELLOW);
	   
	    
	 
	    JRadioButton over = new JRadioButton("Are you over 12?"); //Asks the user if the user is over 12
	    over.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("You are over 12");
	    	}

	    });
	    
	    JRadioButton under = new JRadioButton("Are you under 12?"); //Asks the user if the user is under 12
	    under.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("You are under 12");
	    	}
	    });
	    
	    ButtonGroup bg = new ButtonGroup();
	    bg.add(over);
	    bg.add(under);
	    panCenter.add(over);
	    panCenter.add(under);
	    c.add(panNorth,BorderLayout.NORTH);
	    c.add(panCenter,BorderLayout.CENTER);
	    c.add(panSouth,BorderLayout.SOUTH);
	    
	    JButton btnNext = new JButton("Next"); 
	    panCenter.add(btnNext);
	    /*
	    btnNext.addActionListener(this);
	    panCenter.add(btnNext);
	        
	    btnNext.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (under.isSelected()) {
	    			
	    		}
	    	}
	    }
	    */
	}
	    
	    
}



public class CreateAStory {

	public static void main(String[] args) {
		StoryFrame sf = new StoryFrame();
		sf.setVisible(true);
		//sf.getContentPane().setBackground(new Color (255, 255, 200));
		
		sf.getContentPane().setBackground(Color.YELLOW);
	}

}
