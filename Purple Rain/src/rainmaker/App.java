package rainmaker;

import java.awt.EventQueue;

public class App {

	public static void main(String[] args) {
		
		EventQueue.invokeLater( () -> {
			new MainFrame();
		});
	}
}
