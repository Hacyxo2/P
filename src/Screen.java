import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Screen extends Canvas implements KeyListener {

	private int x1 = 0;
	private int y1= 0;
	private int x2 = 740;
	private int y2 = 520;
	private int x3 = 40;
	private int y3 = 0;
	
	
	private BufferedImage image;
	private BufferedImage image1;
	private static final long serialVersionUID = 1L;
	
	public Screen() {
		try {
			image = ImageIO.read(new File("src/car.png"));
			image1 = ImageIO.read(new File("src/car1.png"));
			
			addKeyListener(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(image, x1, y1, this);
		g.drawImage(image, x3, y3, this);
		g.drawImage(image1, x2, y2, this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int gap = 10;
		switch(e.getKeyCode())
		{
		//1p
		case KeyEvent.VK_UP:
			y1 -= gap;
			y3 -= gap;
			break;
		case KeyEvent.VK_DOWN:
			y1 += gap;
			y3 += gap;
			break;
		case KeyEvent.VK_LEFT:
			x1 -= gap;
			x3 -= gap;
			break;
		case KeyEvent.VK_RIGHT:
			x1 += gap;
			x3 += gap;
			break;
		//2p
		case 87:
			y2 -= gap;
			break;
		case 83:
			y2 += gap;
			break;
		case 65:
			x2 -= gap;
			break;
		case 68:
			x2 += gap;
			break;
		}
		System.out.println(x1+", "+y1);
		repaint();
	}
	
	

}
