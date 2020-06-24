import java.awt.*;
import javax.swing.JFrame;

public class Screen {
	private GraphicsDevice vc;  // Video Card - Screen
	
	public Screen() {
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		vc = env.getDefaultScreenDevice();
	}
	
	public void setFullScreen(DisplayMode dm, JFrame window) {
		
		/*	DisplayMode contains four parameters - 
		 *  one for x resolution
		 *  one for y resolution
		 *  one for bit depth to show how many colors you can store  
		 *  one for refresh rate - to know how many times you monitor should refresh. 
		 */
		window.setUndecorated(true); // Undecorated means to create a window without title bar or menu or scroll bars etc.,
		window.setResizable(false);
		vc.setFullScreenWindow(window); 
		if(dm!=null && vc.isDisplayChangeSupported()) {
			try {
				vc.setDisplayMode(dm);
			}
			catch(Exception e) {
				
			}
		}
	}
	
   public Window getFullScreenWindow() {
	   return(vc.getFullScreenWindow());
   }

   public void restoreScreen() {
	   Window w = vc.getFullScreenWindow();
	   if(w!=null) {
		   w.dispose();
	   }
	   vc.setFullScreenWindow(null);
   }
}
