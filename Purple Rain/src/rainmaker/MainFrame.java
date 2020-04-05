package rainmaker;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public MainFrame() {
		initLayout();
	}

	private void initLayout() {
		
		add(new RainPanel());

		setTitle(Constants.TITLE);
		pack();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
