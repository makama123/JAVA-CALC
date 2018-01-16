import javax.swing.*;
public class Main {
    public static void main(String[] args) {
    	GraphicalUserInterface g = new GraphicalUserInterface();
    	g.setSize(250, 400);
    	g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	g.setVisible(true);
    	g.setResizable(false);
    }
}