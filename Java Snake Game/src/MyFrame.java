import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
public class MyFrame extends JFrame implements KeyListener {
	//Attributes
	Rectangle r = new Rectangle (50, 50, 50, 50);
	public MyFrame() {
		this.setSize (800,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Snake Game");
		this.setVisible (true);
	}
	public void paint (Graphics g){
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillOval(400, 400, 50, 50);
		g.fillRect(r.getPosY(), r.getPosX(), r.getWidth(), r.getHeight());
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub 
		if (e.getKeyCode()== KeyEvent.VK_W) {
			//r.setPosY(r.getPosY() + 50);
			
		}
		if (e.getKeyCode()== KeyEvent.VK_A) {
			
		}
		if (e.getKeyCode()== KeyEvent.VK_S) {
			
		}
		if (e.getKeyCode()== KeyEvent.VK_D) {
			 
		}
		
		//repaint at the end of the keylistener so the screen always updates
		//repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}	
}
