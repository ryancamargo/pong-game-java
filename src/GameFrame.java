import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{

	GamePanel panel;
	ImageIcon image = new ImageIcon("ping-pong.png");
	
	GameFrame(){
		
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();  // the window frame will adjust to fit the size of the game panel
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setIconImage(image.getImage());
	}
}
