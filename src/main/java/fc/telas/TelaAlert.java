package fc.telas;

import totalcross.io.IOException;
import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class TelaAlert extends Container {
	private ScrollContainer sc;
	private Container ct;
	private Image img1,img2;
	private Button bt;
	private final static int dp = 100;

	public TelaAlert() {
		setBackColor(0xAAAAAA);
	}

	public void initUI() {
		sc = new ScrollContainer() {
			public void initUI() {
				ct = new Container() {
					public void initUI() {

						setBackColor(0xDDDDDD);
						Button bt = new Button("Mark all as read");
						bt.setBorder(BORDER_NONE);
						bt.setBackForeColors(0xFFFFFF, 0x27408B);
						Font ft = Font.getFont(true, Font.NORMAL_SIZE + 1);
						bt.setFont(ft);
						add(bt, CENTER, CENTER, PARENTSIZE + 90, PARENTSIZE + 70);
					}
				};
				add(ct, LEFT, TOP, FILL, PARENTSIZE + 8);

				try{
					img2 = new Image("img/fb_icon.png").smoothScaledFixedAspectRatio(fmH-8, true);
					
				}catch(Exception ee){
					ee.printStackTrace();
				}
				
				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/persO7.jpg").smoothScaledFixedAspectRatio(fmH*3, true);
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Angela Ketty's birthday was     \nyesterday                                      ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Tue at 12:42 pm",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				Container linha = new Container();
				linha.setBackColor(Color.DARK);
				add(linha, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/persO8.jpg").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Sandra Bullock added a new    \nphoto                                              ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Tue at 11:42 pm",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				Container linha2 = new Container();
				linha2.setBackColor(Color.DARK);
				add(linha2, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/persO9.jpg").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Mariana Silva Shared the          \npublication of Series Fans        ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Tue at 10:42 pm",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				Container linha3 = new Container();
				linha3.setBackColor(Color.DARK);
				add(linha3, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/persO10.jpg").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Maria Carla commented in the \npublication of Marcos Costa    ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Tue at 08:42 pm",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				Container linha4 = new Container();
				linha4.setBackColor(Color.DARK);
				add(linha4, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/persO11.jpg").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Clarisse Stein added a new      \nphoto                                             ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Tue at 05:42 pm",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				Container linha5 = new Container();
				linha5.setBackColor(Color.DARK);
				add(linha5, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/persO12.jpg").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Marcos Costa added a new      \nphoto                                             ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Tue at 03:42 pm",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				Container linha6 = new Container();
				linha6.setBackColor(Color.DARK);
				add(linha6, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/persO13.jpg").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Iris Estevam's birthday was     \nyesterday                                      ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Tue at 10:42 am",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				Container linha7 = new Container();
				linha7.setBackColor(Color.DARK);
				add(linha7, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/persO14.jpg").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Fabiano Lopes shared the        \npublication of Series Fans        ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Tue at 08:42 am",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				Container linha8 = new Container();
				linha8.setBackColor(Color.DARK);
				add(linha8, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/pagO2.jpg").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Fans of Games made a               \npublication                                    ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Tue at 06:42 am",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				linha8 = new Container();
				linha8.setBackColor(Color.DARK);
				add(linha8, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/pagO3.png").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Fans of Series made a                \npublication                                    ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Mon at 08:42 pm",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				linha8 = new Container();
				linha8.setBackColor(Color.DARK);
				add(linha8, LEFT, AFTER, PARENTSIZE, 1);
				ct = new Container() {
					public void initUI() {
						setBackColor(0XF5F5F5);

						try {
							img1 = new Image("img/pagO1.jpg").smoothScaledFixedAspectRatio(fmH*3, true);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						bt = new Button("Fans of League of Leagends     \nmade a publication                     ",img1,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, TOP, PARENTSIZE, PARENTSIZE+75);
						
						bt = new Button("Mon at 05:42 pm",img2,RIGHT,50);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, LEFT, AFTER, PARENTSIZE, PARENTSIZE+25);
					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 15);

				linha8 = new Container();
				linha8.setBackColor(Color.DARK);
				add(linha8, LEFT, AFTER, PARENTSIZE, 1);

			}
		};
		add(sc, LEFT, TOP, FILL, FILL);

	}
}
