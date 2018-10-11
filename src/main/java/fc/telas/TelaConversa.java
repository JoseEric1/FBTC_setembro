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

public class TelaConversa extends Container {
	private ScrollContainer sc;
	private Container ct, ct1,ct2,ct3;
	private Edit ed;
	private Button bt1, user1, user2,bt2;
	private Image img;
	private Label lb;

	private final static int dp = (int) Settings.screenDensity;

	public TelaConversa() {
		setBackColor(0xEEEEEE);
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

					img = new Image("img/ftR7.png").smoothScaledFixedAspectRatio(40 * dp, true);

				} catch (Exception ee) {
				}

				ct = new Container() {
					public void initUI() {
						setBackColor(0xDDDDDD);

						ct1 = new Container() {
							public void initUI() {
								setBackColor(0xFFFFFF);
								lb = new Label("Online now");
								add(lb, LEFT + 5, CENTER);
							}
						};
						add(ct1, LEFT, TOP + 2, PARENTSIZE, PREFERRED + 8);

						ct1 = new Container() {
							public void initUI() {
								setBackColor(0xFFFFFF);
								user1 = new Button("user1", img, BOTTOM, 0);
								user1.setBorder(BORDER_NONE);
								user1.transparentBackground = true;
								add(user1, LEFT + 30, CENTER, PARENTSIZE+15, PARENTSIZE+90);

								try {

									img = new Image("img/ftR3.3.png").smoothScaledFixedAspectRatio(40 * dp, true);

								} catch (Exception ee) {
								}

								user2 = new Button("user2", img, BOTTOM, 0);
								user2.setBorder(BORDER_NONE);
								user2.transparentBackground = true;
								add(user2, AFTER + 30, SAME, SAME, SAME);
							}
						};
						add(ct1, LEFT, AFTER + 5, PARENTSIZE, PARENTSIZE+80);
					}
				};
				add(ct, LEFT, AFTER+5, PARENTSIZE, PARENTSIZE+20);
				
				

				ct = new Container() {
					public void initUI() {
						setBackColor(0xDDDDDD);

						try {
							img = new Image("img/ftR7.png").smoothScaledFixedAspectRatio(60 * dp, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Larissa Goes                               \nLast message sent                    ",img,RIGHT,50);
						bt2.setBackColor(0xFFFFFF);
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);

					}
				};
				add(ct, LEFT, AFTER + 20, PARENTSIZE, PARENTSIZE + 15);

				Container linha = new Container();
				linha.setBackColor(0xDDDDDD);
				add(linha, LEFT, AFTER, PARENTSIZE, 1);
				
				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftR2.2.png").smoothScaledFixedAspectRatio(60 * dp, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Loiane Garcia                              \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);

					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);

				linha = new Container();
				linha.setBackColor(0xDDDDDD);
				add(linha, LEFT, AFTER, PARENTSIZE, 1);
				
				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftR2.3.png").smoothScaledFixedAspectRatio(60 * dp, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Gabriela Santos                          \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);

					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);
				
				linha = new Container();
				linha.setBackColor(0xDDDDDD);
				add(linha, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftR2.4.png").smoothScaledFixedAspectRatio(60 * dp, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Marcos Pasquin                         \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);

					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);
				
				linha = new Container();
				linha.setBackColor(0xDDDDDD);
				add(linha, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftR2.5.png").smoothScaledFixedAspectRatio(60 * dp, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Marcos Antonio                          \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);

					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);
				
				linha = new Container();
				linha.setBackColor(0xDDDDDD);
				add(linha, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftR2.6.png").smoothScaledFixedAspectRatio(60 * dp, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Pedro Pascoa                              \nLast message sent                    ",img,RIGHT,50);
						bt2.transparentBackground = true;
						bt2.setBorder(BORDER_NONE);
						add(bt2, LEFT, TOP, PARENTSIZE, PARENTSIZE);

					}
				};
				add(ct, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 15);
				
				linha = new Container();
				linha.setBackColor(0xDDDDDD);
				add(linha, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);

						try {
							img = new Image("img/ftR2.7.png").smoothScaledFixedAspectRatio(60 * dp, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt2 = new Button("Luiza Alves                                  \nLast message sent                    ",img,RIGHT,50);
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
