package fc.telas;

import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.TabbedContainer;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;

public class TelaMensagens extends Container {

	private TabbedContainer tc;
	private Container ct;
	private Button men, gru, pes;
	private Image img1, img2, img3;

	public TelaMensagens() {
		setBackColor(0x323232);
	}

	public void initUI() {

		String[] telas = {"","",""};

		ct = new Container() {
			public void initUI() {

				try {
					img1 = new Image("img/menss.png").getSmoothScaledInstance(fmH, fmH);
					img1.applyColor2(0x3e628c);

					img2 = new Image("img/onli.png").getSmoothScaledInstance(fmH, fmH);
					img2.applyColor2(0x3e628c);

					img3 = new Image("img/grup.png").getSmoothScaledInstance(fmH, fmH);
					img3.applyColor2(0x3e628c);

					setBackColor(0xAAAAAA);
					men = new Button("");
					men.setImage(img1);
					men.setBackColor(0xFFFFFF);
					men.setBorder(BORDER_NONE);
					add(men, LEFT, TOP, PARENTSIZE + 34, PARENTSIZE);

					gru = new Button("");
					gru.setImage(img3);
					gru.setBackColor(0xFFFFFF);
					gru.setBorder(BORDER_NONE);
					add(gru, AFTER + 5, TOP, PARENTSIZE + 34, PARENTSIZE);

					pes = new Button("Pess");
					pes.setImage(img2);
					pes.setBackColor(0xFFFFFF);
					pes.setBorder(BORDER_NONE);
					add(pes, AFTER + 5, TOP, PARENTSIZE + 34, PARENTSIZE);

				} catch (Exception ee) {
				}
			}
		};
		add(ct, LEFT, TOP, PARENTSIZE, DP+35);
		
		tc = new TabbedContainer(telas);
		tc.allSameWidth = true;
		tc.setType(TabbedContainer.TABS_NONE);
		tc.transparentBackground = false;
		tc.activeTabBackColor = Color.BLUE;
		tc.setForeColor(Color.BLUE);
		add(tc, LEFT, AFTER, FILL, FILL);
		tc.setContainer(0, new TelaConversa());
		tc.setContainer(1, new TelaGrupos());
		tc.setContainer(2, new TelaUsersOnline());
		tc.pressedColor = Color.BLUE;
	}

	public void onEvent(Event e) {
		switch (e.type) {
		case ControlEvent.PRESSED:
			if (e.target == men) {
				men.transparentBackground = false;
				pes.setBackColor(0xFFFFFF);
				gru.setBackColor(0xFFFFFF);
				men.setBackColor(0xFFFFFF);

				tc.setActiveTab(0);
			}
			if (e.target == gru) {
				gru.transparentBackground = false;
				pes.setBackColor(0xFFFFFF);
				gru.setBackColor(0xFFFFFF);
				men.setBackColor(0xFFFFFF);

				tc.setActiveTab(1);
			}
			if (e.target == pes) {
				pes.transparentBackground = false;
				pes.setBackColor(0xFFFFFF);
				gru.setBackColor(0xFFFFFF);
				men.setBackColor(0xFFFFFF);

				tc.setActiveTab(2);
			}
		}
	}
}
