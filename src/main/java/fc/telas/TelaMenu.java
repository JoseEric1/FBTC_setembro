package fc.telas;

import totalcross.io.IOException;
import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class TelaMenu extends Container {
	private ScrollContainer sc;
	private Container ct;
	private Image img1;
	private Button b;
	private final static int dp = (int) Settings.screenDensity;

	public TelaMenu() {
		setBackColor(0xFFFFFF);

	}

	public void initUI() {
		sc = new ScrollContainer(false, true) {
			public void initUI() {
				
				ct = new Container() {
					public void initUI() {
						
								try {
									img1 = new Image("img/ftR1.1.png").smoothScaledFixedAspectRatio(50 * dp, true);
									img1.applyColor2(0x9E9E9E);
									
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (ImageException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

						Button bt = new Button(img1);
						bt.setBorder(BORDER_NONE);
						add(bt,LEFT+5,CENTER,PARENTSIZE+20,PARENTSIZE+90);
						
						b = new Button("Your Name                             ");
						b.setBorder(BORDER_NONE);
						add(b, AFTER+5, SAME+5, PREFERRED, PARENTSIZE+40);

						b = new Button("View your profile                            ");
						b.setBorder(BORDER_NONE);
						b.setForeColor(0x757575);
						Font f4 = Font.getFont(true, Font.NORMAL_SIZE - 2);
						b.setFont(f4);
						add(b, SAME, AFTER, PREFERRED, PARENTSIZE+40);
					}
				};
				add(ct, LEFT, TOP, PARENTSIZE, PARENTSIZE+10);

				Container linha = new Container();
				linha.setBackColor(0xDDDDDD);
				add(linha, LEFT, AFTER, PARENTSIZE, 8);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/event.png").smoothScaledFixedAspectRatio(30 * dp, true);	
							img1.applyColor2(0xD50000);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Events                                                 ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE,PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, FILL, PARENTSIZE + 8);


				Container linha2 = new Container();
				linha2.setBackColor(0xDDDDDD);
				add(linha2, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/cont.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x2196F3);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Chat                                                     ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha3 = new Container();
				linha3.setBackColor(0xDDDDDD);
				add(linha3, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/galeria1.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0xEF6C00);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Photos                                                 ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha4 = new Container();
				linha4.setBackColor(0xDDDDDD);
				add(linha4, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/friends.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x64DD17);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Friends                                                ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha5 = new Container();
				linha5.setBackColor(0xDDDDDD);
				add(linha5, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/pag.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0xFFC107);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Pages                                                  ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha6 = new Container();
				linha6.setBackColor(0xDDDDDD);
				add(linha6, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/vid1.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x1565C0);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Videos                                                 ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha7 = new Container();
				linha7.setBackColor(0xDDDDDD);
				add(linha7, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/store.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x76FF03);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Marketplace                                        ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha8 = new Container();
				linha8.setBackColor(0xDDDDDD);
				add(linha8, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/work.png").smoothScaledFixedAspectRatio(30 * dp, true);;
							img1.applyColor2(0x69F0AE);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Employment                                       ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha9 = new Container();
				linha9.setBackColor(0xDDDDDD);
				add(linha9, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/dd1.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x1A237E);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Ad Manager                                        ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha10 = new Container();
				linha10.setBackColor(0xDDDDDD);
				add(linha10, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/group.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0xF44336);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Groups                                                ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha11 = new Container();
				linha11.setBackColor(0xDDDDDD);
				add(linha11, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/loc1.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x76FF03);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Local                                                   ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha12 = new Container();
				linha12.setBackColor(0xDDDDDD);
				add(linha12, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/save.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x1A237E);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Salved                                                 ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha13 = new Container();
				linha13.setBackColor(0xDDDDDD);
				add(linha13, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/today.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x1A237E);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Today                                                  ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha14 = new Container();
				linha14.setBackColor(0xDDDDDD);
				add(linha14, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/sear1.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x651FFF);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Search                                                 ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha15 = new Container();
				linha15.setBackColor(0xDDDDDD);
				add(linha15, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/post.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x1A237E);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("News Feed                                        ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha16 = new Container();
				linha16.setBackColor(0xDDDDDD);
				add(linha16, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/mnsg.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x00FF00);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Menssages                                         ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha17 = new Container();
				linha17.setBackColor(0xDDDDDD);
				add(linha17, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/notif1.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x555555);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Notifications                                    ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha18 = new Container();
				linha18.setBackColor(0xDDDDDD);
				add(linha18, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/addF2.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x01579B);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Friendship requests                          ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha19 = new Container();
				linha19.setBackColor(0xDDDDDD);
				add(linha19, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/post.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x1A237E);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("More recently                                   ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha20 = new Container();
				linha20.setBackColor(0xDDDDDD);
				add(linha20, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/conf.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x555555);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Settings                                              ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha21 = new Container();
				linha21.setBackColor(0xDDDDDD);
				add(linha21, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/priva.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x555555);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Privacy Shortcuts                              ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha22 = new Container();
				linha22.setBackColor(0xDDDDDD);
				add(linha22, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/trans.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x555555);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Language                                           ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha23 = new Container();
				linha23.setBackColor(0xDDDDDD);
				add(linha23, LEFT, AFTER, PARENTSIZE, 15);

				ct = new Container() {
					public void initUI() {
						setBackColor(0xEEEEEE);

						Label lb = new Label("My pages");
						// lb.setBorder(BORDER_NONE);
						add(lb, LEFT + 10, CENTER, PREFERRED, PREFERRED);
					}
				};
				add(ct, LEFT, AFTER, PARENTSIZE, PREFERRED + 10);

				Container linha24 = new Container();
				linha24.setBackColor(0xDDDDDD);
				add(linha24, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/morepage.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(0x000000);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Create a Page                                     ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha25 = new Container();
				linha25.setBackColor(0xDDDDDD);
				add(linha25, LEFT, AFTER, PARENTSIZE, 15);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/dd.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(Color.DARK);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Data usage                                        ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha26 = new Container();
				linha26.setBackColor(0xDDDDDD);
				add(linha26, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/clean.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(Color.DARK);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Clean space                                        ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha27 = new Container();
				linha27.setBackColor(0xDDDDDD);
				add(linha27, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/help.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(Color.DARK);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Help                                                  ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha28 = new Container();
				linha28.setBackColor(0xDDDDDD);
				add(linha28, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/inf.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(Color.DARK);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("About                                                ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha29 = new Container();
				linha29.setBackColor(0xDDDDDD);
				add(linha29, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/prob.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(Color.DARK);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Report a problem                           ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);

				Container linha30 = new Container();
				linha30.setBackColor(0xDDDDDD);
				add(linha30, LEFT, AFTER, PARENTSIZE, 1);

				ct = new Container() {
					public void initUI() {
						setBackColor(0XFFFFFF);
						try {
							img1 = new Image("img/exit.png").smoothScaledFixedAspectRatio(30 * dp, true);
							img1.applyColor2(Color.DARK);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Button bt = new Button("Log off                                              ",img1,RIGHT,15);
						bt.transparentBackground = true;
						bt.setBorder(BORDER_NONE);
						add(bt, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

					}

				};
				add(ct, LEFT, AFTER, PARENTSIZE, PARENTSIZE + 8);
			}
		};
		add(sc, LEFT, TOP, FILL, FILL);
	}
}
