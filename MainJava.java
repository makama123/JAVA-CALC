import javax.swing.*;
public class MainJava {
	public static void main(String[] args) {
		GUI g = new GUI();
		g.setSize(250, 400);
		g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		g.setVisible(true);
		g.setResizable(false);
	}
}
