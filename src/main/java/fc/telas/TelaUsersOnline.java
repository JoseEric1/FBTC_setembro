package fc.telas;

import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.ScrollContainer;
import totalcross.ui.event.ControlEvent;
import totalcross.ui.event.Event;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;

public class TelaUsersOnline extends Container {
	private ScrollContainer sc;
	private Container ct,ct2,ct3;
	private Edit ed;
	private Button bt1;
	private Image img;

	private final static int dp = (int) Settings.screenDensity;

	public TelaUsersOnline() {
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

								add(ct2,LEFT,CENTER,PARENTSIZE+80,PARENTSIZE);

								try {

									img = new Image("img/psq.png").smoothScaledFixedAspectRatio(25 * dp, true);
									img.applyColor2(Color.BLACK);
									bt1 = new Button("");
									bt1.setBackColor(Color.WHITE);
									bt1.setBorder(BORDER_NONE);
									bt1.setImage(img);
									add(bt1, AFTER + 5, SAME, PARENTSIZE+10, SAME);
									
									
									img = new Image("img/bolaverde.png").smoothScaledFixedAspectRatio(10 * dp, true);
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


				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR2.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						
						setBackColor(0XFFFFFF);
						Button bt = new Button("Marcos Pasquin                        ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5, FILL, PARENTSIZE+11);

				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR1.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						
						setBackColor(0XFFFFFF);
						Button bt = new Button("Gabriela Santos                         ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);

				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR3.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						
						setBackColor(0XFFFFFF);
						Button bt = new Button("Joao Carlos                                 ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);

				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR4.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						
						setBackColor(0XFFFFFF);
						Button bt = new Button("Marcos Antonio                         ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);

				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR5.jpg").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						
						setBackColor(0XFFFFFF);
						Button bt = new Button("Cida dos Andes                          ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);

				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR6.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						
						setBackColor(0XFFFFFF);
						Button bt = new Button("Pedro Pascoa                             ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);

				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR7.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						
						setBackColor(0XFFFFFF);
						Button bt = new Button("Larissa Goes                              ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);

				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR9.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						
						setBackColor(0XFFFFFF);
						Button bt = new Button("Luiza Alves                                 ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);

				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR13.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						
						setBackColor(0XFFFFFF);
						Button bt = new Button("Loiane Garcia                            ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);

				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR16.jpg").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						setBackColor(0XFFFFFF);
						Button bt = new Button("Ingride Vieira                            ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);
				
				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR10.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						setBackColor(0XFFFFFF);
						Button bt = new Button("Maria das Graças                    ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);
				
				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR14.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						setBackColor(0XFFFFFF);
						Button bt = new Button("Vitoria Regia                            ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);
				
				ct = new Container() {
					public void initUI() {
						
						try {

							img = new Image("img/ftR8.png").smoothScaledFixedAspectRatio(50 * dp, true);
							

						} catch (Exception ee) {
						}
						setBackColor(0XFFFFFF);
						Button bt = new Button("Victor Inacio                            ",img,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, FILL, FILL);
					}
				};
				add(ct, LEFT, AFTER+5,SAME,SAME);
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
