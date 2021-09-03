import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Screen extends Canvas implements KeyListener {
	
	Car car[] = new Car[3];
	private static final long serialVersionUID = 1L;
	
	public Screen() {
		car[0] = new Car(0, 0, "src/car1.png");
		car[1] = new Car(0, 50, "src/car.png");
		car[2] = new Car(300, 500,"src/car2.png");
		addKeyListener(this);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(car[0].image, car[0].x, car[0].y, this);
		g.drawImage(car[1].image, car[1].x, car[1].y, this);
		g.drawImage(car[2].image, car[2].x, car[2].y, this);
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
		case 87: //UP
			car[0].y -= gap;
			car[1].y -= gap;
			break;
		case 83: //DOWN
			car[0].y += gap;
			car[1].y += gap;
			break;
		case 65: //LEFT
			car[0].x -= gap;
			car[1].x -= gap;
			break;
		case 68:  //RIGHT
			car[0].x += gap;
			car[1].x += gap;
			break;
		//2p		
		case KeyEvent.VK_UP:
			car[2].y -= gap;
			break;
		case KeyEvent.VK_DOWN:
			car[2].y += gap;
			break;
		case KeyEvent.VK_LEFT:
			car[2].x -= gap;
			break;
		case KeyEvent.VK_RIGHT:
			car[2].x += gap;
			break;
		}
		System.out.println("1P"+car[0].x+", "+"1P"+car[0].y+"\t"
		+"2P"+car[2].x+", "+"2P"+car[2].y);
		repaint();
	}
}

	


