
public class Control {
	public View view = null;
	
	public Control()
	{

		view = new View(this);
	}
	
	/**
	 * Show GUI
	 */
	public void start()
	{
		view.drawWindow(); 
	}

}
