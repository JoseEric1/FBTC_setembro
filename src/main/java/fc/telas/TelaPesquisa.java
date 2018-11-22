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
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class TelaPesquisa extends Container {

	private ScrollContainer sc;
	private Edit ed;
	private Container ct, ct2,ct3;
	private Image img1,img;
	private Button bt1, bt2,bt;

	private final static int dp = (int) Settings.screenDensity;
	
	public TelaPesquisa() {
		setBackColor(0xAAAAAA);
	}

	public void initUI() {

		sc = new ScrollContainer(){
			public void initUI(){

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

		Container linha1 = new Container();
		linha1.setBackColor(0xDDDDDD);
		add(linha1, LEFT, AFTER, FILL, 1);

		ct = new Container() {
			public void initUI() {
				setBackColor(0xFFFFFF);
				Label lb = new Label("Pesquisas recentes");
				Font ft = Font.getFont(true, Font.NORMAL_SIZE + 1 / 2);
				lb.setFont(ft);
				lb.setBackForeColors(Color.WHITE, Color.BLACK);
				lb.transparentBackground = true;
				add(lb, LEFT + 50, CENTER);

				bt2 = new Button("Editar");
				bt2.transparentBackground = true;
				bt2.setBorder(BORDER_NONE);
				bt2.setForeColor(0x000000);
				add(bt2, RIGHT - 50, CENTER);
			}
		};
		add(ct, LEFT, AFTER, FILL, DP+45);

		Container linha = new Container();
		linha.setBackColor(0xDDDDDD);
		add(linha, LEFT, AFTER, FILL, 1);

		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO8.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Sandra Bullock                           ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		Container linha2 = new Container();
		linha2.setBackColor(0xDDDDDD);
		add(linha2, LEFT, AFTER, FILL, 1);

		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO7.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Angela Katty                                ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		Container linha3 = new Container();
		linha3.setBackColor(0xDDDDDD);
		add(linha3, LEFT, AFTER, FILL, 1);

		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/pagO1.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Fans de League of Legends     ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		Container linha4 = new Container();
		linha4.setBackColor(0xDDDDDD);
		add(linha4, LEFT, AFTER, FILL, 1);

		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO14.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Mario Carlos                                 ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		Container linha5 = new Container();
		linha5.setBackColor(0xDDDDDD);
		add(linha5, LEFT, AFTER, FILL, 1);

		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/pagO2.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Fans de Games                           ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		Container linha6 = new Container();
		linha6.setBackColor(0xDDDDDD);
		add(linha6, LEFT, AFTER, FILL, 1);

		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO10.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Maria Carla                                   ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		Container linha7 = new Container();
		linha7.setBackColor(0xDDDDDD);
		add(linha7, LEFT, AFTER, FILL, 1);

		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/pagO3.png").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Fans de Series                            ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		Container linha8 = new Container();
		linha8.setBackColor(0xDDDDDD);
		add(linha8, LEFT, AFTER, FILL, 1);
		
		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO15.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Nando Sousa                               ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		linha8 = new Container();
		linha8.setBackColor(0xDDDDDD);
		add(linha8, LEFT, AFTER, FILL, 1);
		
		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO12.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Marcos Costa                              ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		linha8 = new Container();
		linha8.setBackColor(0xDDDDDD);
		add(linha8, LEFT, AFTER, FILL, 1);
		
		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO3.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Rebeca Anderson                       ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		linha8 = new Container();
		linha8.setBackColor(0xDDDDDD);
		add(linha8, LEFT, AFTER, FILL, 1);
		
		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO2.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Roberto Costa                             ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		linha8 = new Container();
		linha8.setBackColor(0xDDDDDD);
		add(linha8, LEFT, AFTER, FILL, 1);
		
		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO4.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Ricardo Assunção                     ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		linha8 = new Container();
		linha8.setBackColor(0xDDDDDD);
		add(linha8, LEFT, AFTER, FILL, 1);
		
		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO6.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Nanda Meireles                          ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		linha8 = new Container();
		linha8.setBackColor(0xDDDDDD);
		add(linha8, LEFT, AFTER, FILL, 1);
		
		ct = new Container() {
			public void initUI() {
				setBackColor(0XF5F5F5);

				try {
					img1 = new Image("img/persO1.jpg").smoothScaledFixedAspectRatio(40 * dp, true);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bt = new Button("Rebeca Anderson                      ",img1,RIGHT,50);
				bt.transparentBackground = true;
				bt.setBorder(BORDER_NONE);
				add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE);
			}

		};
		add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 9);

		linha8 = new Container();
		linha8.setBackColor(0xDDDDDD);
		add(linha8, LEFT, AFTER, FILL, 1);
		
		}
	};
	add(sc,LEFT,AFTER+1,FILL,FILL);
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