package rainmaker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RainLoop implements ActionListener{

	private RainPanel rainPanel;
	
	public RainLoop(RainPanel rainPanel) {
		this.rainPanel = rainPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.rainPanel.performLoop();
		
	}
	
}
