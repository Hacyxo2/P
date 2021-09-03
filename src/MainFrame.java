import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainFrame()
	{
		setTitle("Play Car");
		setSize(800, 600);
		setPreferredSize(getPreferredSize());
		setVisible(true);
		
		add(new Screen());
		
		validate();
	}
}
