package fc.model;

import totalcross.io.IOException;
import totalcross.ui.ImageControl;
import totalcross.ui.event.DragEvent;
import totalcross.ui.event.PenEvent;
import totalcross.ui.event.PenListener;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Images {
	
	public static ImageControl createImageControl(String s) throws IOException, ImageException{
		ImageControl ic = new ImageControl(new Image(s));
		
		ic.addPenListener(
				new PenListener() {

			          
			          public void penUp(PenEvent e) {}

			          
			          public void penDragStart(DragEvent e) {
			            // TODO Auto-generated method stub

			          }

			          
			          public void penDragEnd(DragEvent e) {
			            // TODO Auto-generated method stub

			          }

			          
			          public void penDrag(DragEvent e) {
			            // TODO Auto-generated method stub

			          }

			          
			          public void penDown(PenEvent e) {
			           
			          }
			        });
		
		ic.transparentBackground = true;
//	    ic.centerImage = true;
	    ic.scaleToFit = true;
	    ic.hwScale = true;
	    return ic;
		
		
	}
	
	
	public static ImageControl createImageControlColors(String s, int color) throws IOException, ImageException{
		Image img = new Image(s);
		img.applyColor2(color);
		ImageControl ic = new ImageControl(img);
		
		ic.addPenListener(
				new PenListener() {

			          
			          public void penUp(PenEvent e) {}

			          
			          public void penDragStart(DragEvent e) {
			            // TODO Auto-generated method stub

			          }

			          
			          public void penDragEnd(DragEvent e) {
			            // TODO Auto-generated method stub

			          }

			          
			          public void penDrag(DragEvent e) {
			            // TODO Auto-generated method stub

			          }

			          
			          public void penDown(PenEvent e) {
			           
			          }
			        });
		
		ic.transparentBackground = true;
//	    ic.centerImage = true;
	    ic.scaleToFit = true;
	    ic.hwScale = true;
	    return ic;
		
		
	}
}
