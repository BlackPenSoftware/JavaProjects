package CalculatorCore;

import java.awt.Dimension;

import javax.swing.JButton;

public class ButtonCore {


	public ButtonCore(String ButtonName, int XSize, int YSize, int XPos, int YPos, int FrameID, boolean IsVisible) {
		
		JButton MainButton = new JButton(ButtonName);
		
		MainButton.setPreferredSize((new Dimension(XSize, YSize)));
		
		MainButton.setVisible(IsVisible);
		
		if(FrameID == ViewCore.FrameIDOut){
			
			ViewCore.MainPanel.add(MainButton);
			
		}
		
		MainButton.setPreferredSize(new Dimension(XSize, YSize));
		//MainButton
		
	}
	
}
