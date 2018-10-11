package fc.telas;

import fc.model.Images;
import totalcross.io.IOException;
import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class TelaPost extends ScrollContainer {


	private final static int dp = (int) Settings.screenDensity;
	private Container c1, c2, stories, cstorie, ctImg, ctm, ctPost, ctp1, ctp2, ctp3,ct;
	private Button perf, fot, text, vid, loc, like, comment, share;
	private Image img1, img2, img3;
	private ScrollContainer sc, scFeed;
	private Image img;
	private ImageControl ic;

	public TelaPost() {
		super();
		setBackColor(0xEEEEEE);
	}

	public void initUI() {

		c1 = new Container() {
			public void initUI() {
				try {
					img1 = new Image("img/ftR1.1.png").smoothScaledFixedAspectRatio(50 * dp, true);
					img2 = new Image("img/galeria.png").smoothScaledFixedAspectRatio(30 * dp, true);
					img2.applyColor2(0x9E9E9E);

					setBackColor(Color.WHITE);


					perf = new Button(img1);
					perf.setBorder(BORDER_NONE);
					perf.transparentBackground = true;
					add(perf, LEFT, TOP, PARENTSIZE+18, FILL);


					Container linha = new Container();
					linha.setBackColor(0x9E9E9E);
					add(linha, AFTER, CENTER, 1, DP+45);

					Button msg = new Button("Publish a Status Update");
					msg.setBorder(BORDER_NONE);
					add(msg, AFTER + 7, CENTER,PARENTSIZE+66,DP+30);

					Container linha2 = new Container();
					linha2.setBackColor(0x9E9E9E);
					add(linha2, AFTER + 7, CENTER, 1, DP+45);

					fot = new Button(img2);
					fot.setBorder(BORDER_NONE);
					fot.transparentBackground = true;
					add(fot, AFTER, TOP, PARENTSIZE+16, FILL);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ImageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		};
		add(c1, LEFT, TOP, FILL, DP+70);



		scFeed = new ScrollContainer() {
			public void initUI() {
				setBackColor(0xDDDDDD);

				Container linha3 = new Container();
				linha3.setBackColor(0xDDDDDD);
				add(linha3, LEFT, AFTER, FILL, 1);

				c2 = new Container() {
					public void initUI() {
						try {
							setBackColor(0Xffffff);
							img = new Image("img/text.png").getSmoothScaledInstance(fmH, fmH);
							img.applyColor2(0x01579B);
							img2 = new Image("img/vid.png").getSmoothScaledInstance(fmH, fmH);
							img2.applyColor2(0xFF5722);
							img3 = new Image("img/loc.png").getSmoothScaledInstance(fmH, fmH);
							img3.applyColor2(0xF50057);

							text = new Button("Text",img,RIGHT,3);
							text.setBorder(BORDER_NONE);
							add(text, AFTER,CENTER,DP+119,DP+50);

							Container linha4 = new Container();
							linha4.setBackColor(0xBDBDBD);
							add(linha4, AFTER, CENTER, 1, DP+30);

							vid = new Button("Video",img2,RIGHT,3);
							vid.setBorder(BORDER_NONE);
							add(vid, AFTER,CENTER,DP+119,DP+50);

							Container linha5 = new Container();
							linha5.setBackColor(0xBDBDBD);
							add(linha5, AFTER, CENTER, 1, DP+30);

							loc = new Button("Location",img3,RIGHT,3);
							loc.setBorder(BORDER_NONE);
							loc.setBackColor(0xFFFFFF);
							add(loc, AFTER,CENTER,DP+119,DP+50);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				add(c2, LEFT, AFTER + 1, FILL, DP+40);

				linha3 = new Container();
				linha3.setBackColor(0xDDDDDD);
				add(linha3, LEFT, AFTER, FILL, 6);

				stories = new Container() {
					public void initUI() {
						setBackColor(0xFFFFFF);
						Label st = new Label("Stories");
						Font f5 = Font.getFont(true, Font.NORMAL_SIZE).asBold();
						st.setFont(f5);
						add(st, LEFT + 10, TOP + 5, FILL, DP+25);
						try{
							img = new Image("");
						}catch(Exception ee){

						}

						sc = new ScrollContainer(true, false) {
							public void initUI() {

								cstorie = new Container() {
									public void initUI() {
										setBackColor(0xDDDDDD);
										try{

											ic = Images.createImageControl("img/Lol.jpg");
											add(ic, LEFT,TOP,FILL,FILL);

										}catch(Exception e){

										}

										Label lb = new Label("Fans of \nLeague of...");
										lb.transparentBackground = true;
										Font ft = Font.getFont(true, Font.NORMAL_SIZE+1);
										lb.setFont(ft);
										lb.setForeColor(0xFFFFFF);
										add(lb,CENTER,BOTTOM-10,PREFERRED,DP+50);

										Button bt = new Button("5");
										bt.setBackForeColors(0x2196F3,0xFFFFFF);
										bt.setBorder(BORDER_LOWERED);
										add(bt,RIGHT-20,TOP+20,DP+30,DP+30);




									}
								};
								cstorie.setBackColor(0xE0E0E0);
								add(cstorie, LEFT, TOP, DP+100, DP+130);

								cstorie = new Container() {
									public void initUI() {
										try{

											ic = Images.createImageControl("img/jogos.jpg");
											add(ic, LEFT,TOP,FILL,FILL);

										}catch(Exception e){

										}

										Label lb = new Label("Fans of \nGames");
										lb.transparentBackground = true;
										Font ft = Font.getFont(true, Font.NORMAL_SIZE+1);
										lb.setFont(ft);
										lb.setForeColor(0xFFFFFF);
										add(lb,CENTER,BOTTOM-10,PREFERRED,DP+50);

										Button bt = new Button("18");
										bt.setBackForeColors(0x2196F3,0xFFFFFF);
										bt.setBorder(BORDER_LOWERED);
										add(bt,RIGHT-20,TOP+20,DP+30,DP+30);



									}
								};
								cstorie.setBackColor(0xE0E0E0);
								add(cstorie, AFTER + 10, TOP, SAME, SAME);

								cstorie = new Container() {
									public void initUI() {
										try{

											ic = Images.createImageControl("img/series2.png");
											add(ic, LEFT,TOP,FILL,FILL);

										}catch(Exception e){

										}
										Label lb = new Label("Fans of \nSeries");
										lb.transparentBackground = true;
										Font ft = Font.getFont(true, Font.NORMAL_SIZE+1);
										lb.setFont(ft);
										lb.setForeColor(0xFFFFFF);
										add(lb,CENTER,BOTTOM-10,PREFERRED,DP+50);

										Button bt = new Button("1");
										bt.setBackForeColors(0x2196F3,0xFFFFFF);
										bt.setBorder(BORDER_LOWERED);
										add(bt,RIGHT-20,TOP+20,DP+30,DP+30);



									}
								};
								cstorie.setBackColor(0xE0E0E0);
								add(cstorie, AFTER + 10, TOP, SAME, SAME);

								cstorie = new Container() {
									public void initUI() {
										try{

											ic = Images.createImageControl("img/pers15.2.jpg");
											add(ic, LEFT,TOP,FILL,FILL);

										}catch(Exception e){

										}

										Label lb = new Label("Angela \nKatty");
										lb.transparentBackground = true;
										Font ft = Font.getFont(true, Font.NORMAL_SIZE+1);
										lb.setFont(ft);
										lb.setForeColor(0xFFFFFF);
										add(lb,CENTER,BOTTOM-10,PREFERRED,DP+50);

										Button bt = new Button("6");
										bt.setBackForeColors(0x2196F3,0xFFFFFF);
										bt.setBorder(BORDER_LOWERED);
										add(bt,RIGHT-20,TOP+20,DP+30,DP+30);



									}
								};
								cstorie.setBackColor(0xE0E0E0);
								add(cstorie, AFTER + 2, TOP, SAME, SAME);

								cstorie = new Container() {
									public void initUI() {
										try{

											ic = Images.createImageControl("img/pers13.2.jpg");
											add(ic, LEFT,TOP,FILL,FILL);

										}catch(Exception e){

										}

										Label lb = new Label("Fãs de \nSeries");
										lb.transparentBackground = true;
										Font ft = Font.getFont(true, Font.NORMAL_SIZE+1);
										lb.setFont(ft);
										lb.setForeColor(0xFFFFFF);
										add(lb,CENTER,BOTTOM-10,PREFERRED,DP+50);

										Button bt = new Button("8");
										bt.setBackForeColors(0x2196F3,0xFFFFFF);
										bt.setBorder(BORDER_LOWERED);
										add(bt,RIGHT-20,TOP+20,DP+30,DP+30);
									}
								};
								cstorie.setBackColor(0xE0E0E0);
								add(cstorie, AFTER + 10, TOP, SAME, SAME);

								cstorie = new Container() {
									public void initUI() {
										try{

											ic = Images.createImageControl("img/pers2.2.jpg");
											add(ic, LEFT,TOP,FILL,FILL);

										}catch(Exception e){

										}

										Label lb = new Label("Mariana \nSilva");
										lb.transparentBackground = true;
										Font ft = Font.getFont(true, Font.NORMAL_SIZE+1);
										lb.setFont(ft);
										lb.setForeColor(0xFFFFFF);
										add(lb,CENTER,BOTTOM-10,PREFERRED,DP+50);

										Button bt = new Button("17");
										bt.setBackForeColors(0x2196F3,0xFFFFFF);
										bt.setBorder(BORDER_LOWERED);
										add(bt,RIGHT-20,TOP+20,DP+30,DP+30);

									}
								};
								cstorie.setBackColor(0xE0E0E0);
								add(cstorie, AFTER + 10, TOP, SAME, SAME);
							}
						};
						add(sc, LEFT, AFTER + 4, FILL, DP+125);

					}
				};

				add(stories, LEFT, AFTER + 5, FILL, DP+158);

				Container linha = new Container();
				linha.setBackColor(0xBDBDBD);
				add(linha, LEFT, AFTER, FILL, 1);

				ctm = new Container() {
					public void initUI() {
						setBackColor(Color.WHITE);
						try {
							img = new Image("img/more2.png").getSmoothScaledInstance(fmH, fmH);
							img.applyColor2(0x0277BD);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ImageException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						Button bt = new Button("Add to Story    ",img,RIGHT,15);
						bt.setBorder(BORDER_NONE);
						add(bt,LEFT,TOP,FILL,FILL);

					}
				};
				add(ctm, SAME, AFTER+1, FILL, DP+35);

				ctPost = new Container() {
					public void initUI() {
						ctp1 = new Container() {
							public void initUI() {
								setBackColor(Color.WHITE);
								ctImg = new Container() {
									public void initUI() {
										try {
											img = new Image("img/tc.png").smoothScaledFixedAspectRatio(40 * dp, true);
											ic = new ImageControl(img);
											add(ic, LEFT+25, CENTER, DP+40, DP+40);
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										} catch (ImageException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								};
								add(ctImg, LEFT, TOP, DP+50, FILL);

								ct = new Container(){
									public void initUI(){



										Label lb = new Label("TotalCross");
										Font ft = Font.getFont(true, Font.NORMAL_SIZE).asBold();
										lb.setFont(ft);
										add(lb, LEFT, TOP, PREFERRED, PREFERRED);

										Label lb1 = new Label("share this photo");
										add(lb1, AFTER+20, SAME, PREFERRED, PREFERRED);

										Label l = new Label("14 min");
										l.setForeColor(0x757575);
										Font f = Font.getFont(true, Font.NORMAL_SIZE - 4);
										l.setFont(f);
										add(l, LEFT, AFTER, PREFERRED, PREFERRED);

										ctImg = new Container() {
											public void initUI() {

												try {
													img = new Image("img/tp.png").smoothScaledFixedAspectRatio(30 * dp, true);
													img.applyColor2(0x757575);
													ic = new ImageControl(img);
													add(ic, RIGHT, TOP, PREFERRED, PREFERRED);
												} catch (IOException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												} catch (ImageException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
										};
										add(ctImg, RIGHT-50, TOP, DP+30, FILL);

									}
								};

								add(ct,AFTER+50,CENTER,FILL,PREFERRED+100);

							}
						};
						add(ctp1, LEFT, TOP, FILL, DP+50);

						ctp2 = new Container() {
							public void initUI() {
								setBackColor(0XF5F5F5);
								ctImg = new Container() {
									public void initUI() {
										try {
											ic = Images.createImageControl("img/tcPost.png");
											add(ic, CENTER, CENTER, DP+320, DP+320);
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										} catch (ImageException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								};
								add(ctImg, CENTER, CENTER,DP + 320, DP + 320);
							}
						};
						add(ctp2, LEFT, AFTER, FILL, DP + 350);

						ctp3 = new Container() {
							public void initUI() {
								setBackColor(0xFFFFFF);
								ctImg = new Container() {
									public void initUI() {
										try {
											img = new Image("img/like.png").smoothScaledFixedAspectRatio(30 * dp, true);
											img.applyColor2(0x3381ff);
											ic = new ImageControl(img);
											add(ic, CENTER, CENTER, DP+35, DP+35);
										} catch (IOException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										} catch (ImageException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								};
								add(ctImg, LEFT+10, TOP, DP+35, DP+35);
								Label lb = new Label("800 likes");
								Font f = Font.getFont(true, Font.NORMAL_SIZE - 3);
								lb.setFont(f);
								add(lb, AFTER + 2, SAME + 6,DP+75, DP+25);

								Container linha = new Container();
								linha.setBackColor(0xDDDDDD);
								add(linha, LEFT, AFTER + 10, FILL, 1);

								try{

									img1 = new Image("img/lk.png").getSmoothScaledInstance(fmH, fmH);
									img1.applyColor2(0x757575);


									img2 = new Image("img/cm.png").getSmoothScaledInstance(fmH, fmH);
									img2.applyColor2(0x757575);

									img3 = new Image("img/conp.png").getSmoothScaledInstance(fmH, fmH);
									img3.applyColor2(0x757575);

								}catch(Exception ee){	
									ee.printStackTrace();
								}

								like = new Button("Like",img1,RIGHT,5);
								like.setBorder(BORDER_NONE);
								like.transparentBackground = true;
								add(like, LEFT, AFTER, DP+122,DP+35);

								Container linhab = new Container();
								linhab.setBackColor(0xBDBDBD);
								add(linhab, AFTER, SAME, 1, DP+35);

								comment = new Button("Comment",img2,RIGHT,5);
								comment.setBorder(BORDER_NONE);
								comment.transparentBackground = true;
								add(comment, AFTER, SAME, DP+122,DP+35);

								Container linhab1 = new Container();
								linhab1.setBackColor(0xBDBDBD);
								add(linhab1, AFTER, SAME, 1, DP+35);

								share = new Button("Share",img3,RIGHT,5);
								share.setBorder(BORDER_NONE);
								share.transparentBackground = true;
								add(share, AFTER, SAME, DP+122,DP+35);

							}
						};
						add(ctp3, LEFT, AFTER, FILL, DP+80);
					}
				};

				add(ctPost, LEFT, AFTER + 50, FILL, DP + 465);

			}
		};
		add(scFeed, LEFT, AFTER, FILL, FILL);
	}
}
