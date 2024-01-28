import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Node extends JButton implements ActionListener
{
	Node parent;
	//GCOST THE DISTANCE BETWEEN THE CURRENT NODE AND THE START NODE
	//HCOST THE DISTANCE FROM THE CURRENT NODE TO THE GOAL NODE  
	//FCOST THE TOTAL COST(G+H) OF THE NODE, "SUM"
	int col, row, gCost, hCost, fCost;
	boolean start, goal, solid, open, checked;
	
	public Node(int col, int row)
	{
		this.col = col;
		this.row = row;
		
		setBackground(Color.white);
		setForeground(Color.black);
		addActionListener(this);
	}
	public void setAsStart()
	{
		setBackground(Color.blue);
		setForeground(Color.white);
		setText("Start");
		start = true;
	}
	public void setAsGoal()
	{
		setBackground(Color.yellow);
		setForeground(Color.black);
		setText("Goal");
		goal = true;
	}
	public void setAsSolid()
	{
		setBackground(Color.black);
		setForeground(Color.black);
		solid = true;
	}
	public void setAsOpen()
	{
		open = true;
	}
	public void setAsChecked()
	{
		if(start == false && goal == false)
		{
			setBackground(Color.orange);
			setForeground(Color.black);
		}
		checked = true;
	}
	public void setAsPath()
	{
		setBackground(Color.green);
		setForeground(Color.black);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		setBackground(Color.orange);
		
	}

}
