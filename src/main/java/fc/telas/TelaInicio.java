package fc.telas;

import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.TabbedContainer;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class TelaInicio extends Container {

	private TabbedContainer tc;
	private Container TitleBar;
	private Button Post, Cont, Mens, Alert, Pesq, Menu;
	private Image imgP, imgC, imgM, imgA, imgPes, imgMenu;

	public TelaInicio() {
		setBackColor(0xAAAAAA);
	}

	public void initUI() {


		TitleBar = new Container() {
			public void initUI() {
				setBackColor(0x3e628c);
				try {
					imgP = new Image("img/posts.png").getSmoothScaledInstance(fmH, fmH);

					imgC = new Image("img/cont2.png").getSmoothScaledInstance(fmH, fmH);

					imgM = new Image("img/mn.png").getSmoothScaledInstance(fmH, fmH);

					imgA = new Image("img/notif1.png").getSmoothScaledInstance(fmH, fmH);

					imgPes = new Image("img/psq.png").getSmoothScaledInstance(fmH, fmH);

					imgMenu = new Image("img/menu.png").getSmoothScaledInstance(fmH, fmH);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Post = new Button("Post");
				Post.transparentBackground = true;
				Post.setImage(imgP);
				Post.setBorder(BORDER_NONE);
				add(Post, LEFT, TOP, DP+60, FILL);

				Cont = new Button("Cont");
				Cont.transparentBackground = true;
				Cont.setImage(imgC);
				Cont.setBorder(BORDER_NONE);
				add(Cont, AFTER, TOP, SAME, FILL);

				Mens = new Button("Mens");
				Mens.transparentBackground = true;
				Mens.setImage(imgM);
				Mens.setBorder(BORDER_NONE);
				add(Mens, AFTER, TOP, SAME, FILL);

				Alert = new Button("Alert");
				Alert.transparentBackground = true;
				Alert.setImage(imgA);
				Alert.setBorder(BORDER_NONE);
				add(Alert, AFTER, TOP, SAME, FILL);

				Pesq = new Button("Pesq");
				Pesq.transparentBackground = true;
				Pesq.setImage(imgPes);
				Pesq.setBorder(BORDER_NONE);
				add(Pesq, AFTER, TOP, SAME, FILL);

				Menu = new Button("Menu");
				Menu.transparentBackground = true;
				Menu.setImage(imgMenu);
				Menu.setBorder(BORDER_NONE);
				add(Menu, AFTER, TOP, SAME, FILL);

			}
		};

		add(TitleBar, LEFT, TOP, FILL, DP+45);
		
		
		try {
			
			String[] telas = {"1","2","3","4","5","6"};
			
			tc = new TabbedContainer(telas);
			tc.setType(TabbedContainer.TABS_NONE);
			tc.setBackColor(0x3e628c);
			tc.allSameWidth = true;
			tc.setBackColor(0x3e628c);
			tc.activeTabBackColor = 0x3e628c;
			add(tc, LEFT,AFTER, FILL, FILL);
			
			tc.setContainer(0, new TelaPost());
			tc.setContainer(1, new TelaContatos());
			tc.setContainer(2, new TelaMensagens());
			tc.setContainer(3, new TelaAlert());
			tc.setContainer(4, new TelaPesquisa());
			tc.setContainer(5, new TelaMenu());

		} catch (Exception ee) {
			ee.printStackTrace();
		}

	}

	public void onEvent(Event e) {
		switch (e.type) {
		case ControlEvent.PRESSED:
			if (e.target == Post) {
				Post.transparentBackground = false;
				Post.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Mens.transparentBackground = true;
				Alert.transparentBackground = true;
				Pesq.transparentBackground = true;
				Menu.transparentBackground = true;
				tc.setActiveTab(0);
			}
			if (e.target == Cont) {
				Cont.transparentBackground = false;
				Cont.setBackColor(0x233c6e);
				Post.transparentBackground = true;
				Mens.transparentBackground = true;
				Alert.transparentBackground = true;
				Pesq.transparentBackground = true;
				Menu.transparentBackground = true;
				tc.setActiveTab(1);
			}
			if (e.target == Mens) {
				Mens.transparentBackground = false;
				Mens.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Post.transparentBackground = true;
				Alert.transparentBackground = true;
				Pesq.transparentBackground = true;
				Menu.transparentBackground = true;
				tc.setActiveTab(2);
			}
			if (e.target == Alert) {
				Alert.transparentBackground = false;
				Alert.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Mens.transparentBackground = true;
				Post.transparentBackground = true;
				Pesq.transparentBackground = true;
				Menu.transparentBackground = true;
				tc.setActiveTab(3);
			}
			if (e.target == Pesq) {
				Pesq.transparentBackground = false;
				Pesq.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Mens.transparentBackground = true;
				Alert.transparentBackground = true;
				Post.transparentBackground = true;
				Menu.transparentBackground = true;
				tc.setActiveTab(4);
			}
			if (e.target == Menu) {
				Menu.transparentBackground = false;
				Menu.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Mens.transparentBackground = true;
				Alert.transparentBackground = true;
				Pesq.transparentBackground = true;
				Post.transparentBackground = true;
				tc.setActiveTab(5);
			}
		}
		
		if(tc == e.target && tc.focusTraversable){
			switch(tc.getActiveTab()){
			case 0:
				Post.transparentBackground = false;
				Post.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Mens.transparentBackground = true;
				Alert.transparentBackground = true;
				Pesq.transparentBackground = true;
				Menu.transparentBackground = true;
				break;
			
			case 1:
				Cont.transparentBackground = false;
				Cont.setBackColor(0x233c6e);
				Post.transparentBackground = true;
				Mens.transparentBackground = true;
				Alert.transparentBackground = true;
				Pesq.transparentBackground = true;
				Menu.transparentBackground = true;
				break;
				
			case 2:
				Mens.transparentBackground = false;
				Mens.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Post.transparentBackground = true;
				Alert.transparentBackground = true;
				Pesq.transparentBackground = true;
				Menu.transparentBackground = true;
				break;
				
			case 3:
				Alert.transparentBackground = false;
				Alert.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Mens.transparentBackground = true;
				Post.transparentBackground = true;
				Pesq.transparentBackground = true;
				Menu.transparentBackground = true;
				break;
				
			case 4:
				Pesq.transparentBackground = false;
				Pesq.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Mens.transparentBackground = true;
				Alert.transparentBackground = true;
				Post.transparentBackground = true;
				Menu.transparentBackground = true;
				break;
				
			case 5:
				Menu.transparentBackground = false;
				Menu.setBackColor(0x233c6e);
				Cont.transparentBackground = true;
				Mens.transparentBackground = true;
				Alert.transparentBackground = true;
				Pesq.transparentBackground = true;
				Post.transparentBackground = true;
				break;
				
			}
			
		}
	}
}
