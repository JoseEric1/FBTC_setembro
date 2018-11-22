package fc.main;

import fc.telas.TelaInicio;
import totalcross.sys.Settings;
import totalcross.ui.MainWindow;

public class FaceBookTC extends MainWindow {

	public FaceBookTC() {
		setBackColor(0xEEEEEE);
		setUIStyle(Settings.Material);
		Settings.uiAdjustmentsBasedOnFontHeight = true;
	}

	public void initUI() {
		add(new TelaInicio(), LEFT, TOP, FILL, FILL);

	}
}
