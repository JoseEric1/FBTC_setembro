package fc.telas;

import totalcross.io.IOException;
import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class TelaGrupos extends Container {
	private ScrollContainer sc;
	private Container ct, ct2,ct3;
	private Edit ed;
	private Button bt1, bt2;
	private Image img;
	private Label lb;

	private final static int dp = (int) Settings.screenDensity;

	public TelaGrupos() {
		setBackColor(0xDDDDDD);
	}

	public void initUI() {

		sc = new ScrollContainer() {
			public void initUI() {
				setBackColor(0xDDDDDD);
				ct = new Container() {

					public void initUI() {

						setBackColor(0xDDDDDD);

						ct3 = new Container(){
							public void initUI(){
								setBackColor(0xDDDDDD);


								ct2 = new Container(){
									public void initUI(){
										setBackColor(0xFFFFFF);
										ed = new Edit();
										ed.setText("Pesquisar...");
										ed.setBackForeColors(0XFFFFFF, Color.BLACK);
										add(ed, LEFT + 10, CENTER, PARENTSIZE+93, PREFERRED);

									}
								};

								add(ct2,LEFT,CENTER,PARENTSIZE+90,PARENTSIZE);

								try {

									img = new Image("img/psq.png").smoothScaledFixedAspectRatio(25 * dp, true);
									img.applyColor2(Color.BLACK);
									bt1 = new Button("");
									bt1.setBackColor(Color.WHITE);
									bt1.setBorder(BORDER_NONE);
									bt1.setImage(img);
									add(bt1, AFTER + 5, SAME, PARENTSIZE+10, SAME);

								} catch (Exception ee) {

								}
							}
						};
						add(ct3,CENTER,CENTER,PARENTSIZE+90,PARENTSIZE+70);
					}
				};
				add(ct, LEFT, TOP, PARENTSIZE, PARENTSIZE+8);
				
				try {

					img = new Image("img/ftG.jpg").smoothScaledFixedAspectRatio(55 * dp, true);
					img.applyColor2(0xAAAAAA);

				} catch (Exception ee) {
				}

				ct = new Container() {
					public void initUI() {

						setBackColor(0xFFFFFF);
						lb = new Label("Group conversations");
						add(lb, LEFT + 5, CENTER);
					}
				};
				add(ct, LEFT, AFTER+5, PARENTSIZE, PARENTSIZE + 6);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftG.jpg").smoothScaledFixedAspectRatio(55 * dp, true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Group 1                                         \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);
					
					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftG.jpg").smoothScaledFixedAspectRatio(55 * dp, true);
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Group 2                                         \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);
					
					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);
				
				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftG.jpg").smoothScaledFixedAspectRatio(55 * dp, true);
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Group 3                                         \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);
					
					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftG.jpg").smoothScaledFixedAspectRatio(55 * dp, true);
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Group 4                                         \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);
					
					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftG.jpg").smoothScaledFixedAspectRatio(55 * dp, true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Group 5                                         \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);
					
					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftG.jpg").smoothScaledFixedAspectRatio(55 * dp, true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Group 6                                         \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);
					
					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);
				
				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftG.jpg").smoothScaledFixedAspectRatio(55 * dp, true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Group 7                                         \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);
					
					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);
				
				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftG.jpg").smoothScaledFixedAspectRatio(55 * dp, true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Group 8                                         \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);
					
					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);
			}
		};
		add(sc, LEFT, TOP, FILL, FILL);
	}
	
	public void onEvent(Event e){
		if(e.type == ControlEvent.FOCUS_IN){
			if(e.target == ed){
				ed.setText("");
			}
		}
		if(e.type == ControlEvent.FOCUS_OUT){
			if(e.target == ed){
				ed.setText("Pesquisar...");
			}
		}
	}
}
