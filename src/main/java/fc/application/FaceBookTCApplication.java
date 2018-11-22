package fc.application;

import fc.main.FaceBookTC;
import totalcross.TotalCrossApplication;

public class FaceBookTCApplication {
	public static void main(String[] args) {
		TotalCrossApplication.run(FaceBookTC.class, 
				"/r", 
				"placeholder",
				 "/scr",
			     "360x640",
			     "/fontsize",
			     "24",
			     "/fingertouch"
			     );
	}
}
