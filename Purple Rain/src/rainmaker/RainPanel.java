package rainmaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

public class RainPanel extends JPanel {

	private Timer timer;
	private int yValue = 0;
	private int randX;

	public RainPanel() {
		initVariables();
		initLayout();
	}

	private void initVariables() {
		this.timer = new Timer(Constants.SPEED, new RainLoop(this));
		this.timer.start();
		setNewRandomX();
	}

	private void setNewRandomX() {
		randX = (int) (Math.random() * Constants.WIDTH);
	}

	private void initLayout() {
		setPreferredSize(new Dimension(Constants.WIDTH, Constants.HEIGHT));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// set the color to blue and apply the change
		g.setColor(Color.PINK);
		g.setPaintMode();

		// increment y to make the line go lower
		yValue += 4;
		// draw a line from the top 30 pixels down

		g.drawLine(randX, yValue, randX, yValue + 30);
		if (yValue >= Constants.HEIGHT)
			yValue = 0;

	}

	public void performLoop() {
		update();
		repaint();
	}

	private void update() {
		// this.rainDrop.move();
	}
}
