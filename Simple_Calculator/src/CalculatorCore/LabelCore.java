package CalculatorCore;

import javax.swing.JLabel;

public class LabelCore {

	public LabelCore(String LabelText, int XSize, int YSize, int XPos, int YPos, int FrameID, boolean IsVisible){
		
		JLabel CoreLabel = new JLabel(LabelText);
		
		CoreLabel.setVisible(IsVisible);
		
		CoreLabel.setBounds(XPos, YPos, XSize, YSize);
		
		if(FrameID == ViewCore.FrameIDOut){
			
			ViewCore.MainPanel.add(CoreLabel);
			
		}
		
	}
	
}
