package fc.telas;

import totalcross.io.IOException;
import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class TelaContatos extends Container {
	private ScrollContainer body;
	private Image img1, img2;
	private ImageControl imgC;
	private Container ctImg,ct;

	private final static int dp = (int) Settings.screenDensity;
	
	public TelaContatos() {
		setBackColor(0xAAAAAA);
	}

	public void initUI() {

		body = new ScrollContainer() {

			Container boxSer;

			public void initUI() {
				setBackColor(0xAAAAAA);

				boxSer = new Container() {
					public void initUI() {
						setBackColor(0xE0E0E0);
						Label msg = new Label("Friendship request");
						msg.setForeColor(0x616161);
						add(msg, LEFT+25, CENTER, FILL, DP+21);
					}
				};

				add(boxSer, LEFT, TOP, FILL, DP+42);

				boxSer = new Container() {
					public void initUI() {
						setBackColor(0xEEEEEE);
						Label msg = new Label("No new requests");
						msg.setForeColor(0x616161);
						add(msg, CENTER, CENTER, PREFERRED, PREFERRED);
					}
				};

				add(boxSer, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 8);

				boxSer = new Container() {
					public void initUI() {
						setBackColor(0xE0E0E0);
						ctImg = new Container() {
							public void initUI() {
								try {
									img1 = new Image("img/ct.png").smoothScaledFixedAspectRatio(20 * dp, true);
									img1.applyColor2(0x9E9E9E);
									imgC = new ImageControl(img1);
									add(imgC, CENTER, CENTER, DP+20,DP+20);
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (ImageException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						};
						add(ctImg, LEFT+25, CENTER, DP+20, DP+20);

						Label msg = new Label("Import Contacts");
						msg.setForeColor(0x616161);
						add(msg, AFTER + 4, CENTER, FILL, DP+21);
					}
				};

				add(boxSer, LEFT, AFTER + 1, FILL, DP+42);

				boxSer = new Container() {
					Button bt;

					public void initUI() {

						setBackColor(0xEEEEEE);
						Label msg = new Label("Find friends from your \nphone contacts");
						add(msg, LEFT + 25, CENTER, FILL, DP+50);

						bt = new Button("Begin");
						Font f = Font.getFont(true, Font.NORMAL_SIZE).asBold();
						bt.setFont(f);
						bt.setBorder(BORDER_NONE);
						bt.setBackForeColors(0x3d76d9, 0xFFFFFF);

						add(bt, RIGHT - 50, CENTER, DP+85, DP+35);

					}
				};
				add(boxSer, LEFT, AFTER + 1, FILL, DP+70);

				boxSer = new Container() {
					public void initUI() {
						setBackColor(0xE0E0E0);
						Label msg = new Label("People you may know");
						msg.setForeColor(0x616161);
						add(msg, LEFT + 25, CENTER, FILL, DP+21);
					}
				};

				add(boxSer, LEFT, AFTER + 1, FILL, DP+42);

				boxSer = new Container() {
					public void initUI() {
						Image img;
						setBackColor(0xEEEEEE);
						try {
							img = new Image("img/persO1.jpg").smoothScaledFixedAspectRatio(90 * dp, true);
							Button bt2 = new Button(img);
							bt2.transparentBackground = true;
							bt2.setBorder(BORDER_NONE);
							add(bt2, LEFT, TOP, DP+100, FILL);
							
							ct = new Container(){
								public void initUI(){
									try{

							Button msg = new Button("Rebeca Anderson                     ");
							msg.setBorder(BORDER_NONE);
							Font f1 = Font.getFont("LatoRegular", false, this.getFont().size+1);
							msg.setFont(f1);
							msg.transparentBackground = true;
							add(msg, AFTER + 5, TOP, PREFERRED, PREFERRED);

							Button msg1 = new Button("56 friends in common                    ");
							msg1.setBorder(BORDER_NONE);
							msg1.setForeColor(0x616161);
							Font f5 = Font.getFont("LatoRegular", true, this.getFont().size);
							msg1.setFont(f5);
							msg1.transparentBackground = true;
							add(msg1, SAME, AFTER-3,PREFERRED, PREFERRED);

							img2 = new Image("img/addF.png").smoothScaledFixedAspectRatio(18 * dp, true);

							Button msg2 = new Button("Add to my friends", img2, RIGHT, 10);
							Font f = Font.getFont(true, Font.NORMAL_SIZE).asBold();
							msg2.setFont(f);
							msg2.setBackForeColors(0x3d76d9, 0xFFFFFF);
							msg2.setBorder(BORDER_NONE);
							add(msg2,SAME, AFTER + 25, PARENTSIZE+95, DP + 35);
							
									}catch(Exception ee){
										ee.printStackTrace();
									}
							
								}
							};
							
							add(ct,AFTER+25,CENTER,FILL,PARENTSIZE+75);

						} catch (Exception ee) {

						}
					}
				};

				add(boxSer, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 20);

				boxSer = new Container() {

					public void initUI() {
						Image img;
						setBackColor(0xEEEEEE);
						try {
							img = new Image("img/persO3.jpg").smoothScaledFixedAspectRatio(90 * dp, true);
							
							Button bt2 = new Button(img);
							bt2.transparentBackground = true;
							bt2.setBorder(BORDER_NONE);
							add(bt2, LEFT, TOP, DP+100, FILL);
							
							ct = new Container(){
								public void initUI(){
									try{

							Button msg = new Button("Vanessa Alves                               ");
							msg.setBorder(BORDER_NONE);
							Font f1 = Font.getFont("LatoRegular", false, this.getFont().size+1);
							msg.setFont(f1);
							msg.transparentBackground = true;
							add(msg, AFTER + 5,TOP,PREFERRED, PREFERRED);

							Button msg1 = new Button("91 friends in common                         ");
							msg1.setBorder(BORDER_NONE);
							msg1.setForeColor(0x616161);
							Font f5 = Font.getFont("LatoRegular", true, this.getFont().size);
							msg1.setFont(f5);
							msg1.transparentBackground = true;
							add(msg1, SAME, AFTER, PREFERRED, PREFERRED);

							img2 = new Image("img/addF.png").smoothScaledFixedAspectRatio(18 * dp, true);

							Button msg2 = new Button("Add to my friends", img2, RIGHT, 5);
							Font f = Font.getFont(true, Font.NORMAL_SIZE).asBold();
							msg2.setFont(f);
							msg2.setBackForeColors(0x3d76d9, 0xFFFFFF);
							msg2.setBorder(BORDER_NONE);
							add(msg2,SAME, AFTER + 25, PARENTSIZE+95, DP + 35);
							
									}catch(Exception ee){
										ee.printStackTrace();
									}
							
								}
							};
							
							add(ct,AFTER+25,CENTER,FILL,PARENTSIZE+75);

						} catch (Exception ee) {

						}
					}
				};

				add(boxSer, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 20);

				boxSer = new Container() {

					public void initUI() {
						Image img;
						setBackColor(0xEEEEEE);
						try {
							img = new Image("img/persO2.jpg").smoothScaledFixedAspectRatio(90 * dp, true);
							
							Button bt2 = new Button(img);
							bt2.transparentBackground = true;
							bt2.setBorder(BORDER_NONE);
							add(bt2, LEFT, TOP, DP+100, FILL);
							
							ct = new Container(){
								public void initUI(){
									try{

							Button msg = new Button("Roberto Costa                              ");
							msg.setBorder(BORDER_NONE);
							Font f1 = Font.getFont("LatoRegular", false, this.getFont().size+1);
							msg.setFont(f1);
							msg.transparentBackground = true;
							add(msg, AFTER + 5, TOP, PREFERRED, PREFERRED);

							Button msg1 = new Button("69 friends in common                         ");
							msg1.setBorder(BORDER_NONE);
							msg1.setForeColor(0x616161);
							Font f5 = Font.getFont("LatoRegular", true, this.getFont().size);
							msg1.setFont(f5);
							msg1.transparentBackground = true;
							add(msg1, SAME, AFTER, PREFERRED, PREFERRED);

							img2 = new Image("img/addF.png").smoothScaledFixedAspectRatio(18 * dp, true);

							Button msg2 = new Button("Add to my friends", img2, RIGHT, 5);
							Font f = Font.getFont(true, Font.NORMAL_SIZE).asBold();
							msg2.setFont(f);
							msg2.setBackForeColors(0x3d76d9, 0xFFFFFF);
							msg2.setBorder(BORDER_NONE);
							add(msg2,SAME, AFTER + 25, PARENTSIZE+95, DP + 35);
							
									}catch(Exception ee){
										ee.printStackTrace();
									}
							
								}
							};
							
							add(ct,AFTER+25,CENTER,FILL,PARENTSIZE+75);

						} catch (Exception ee) {

						}
					}
				};

				add(boxSer, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 20);

				boxSer = new Container() {

					public void initUI() {
						Image img;
						setBackColor(0xEEEEEE);
						try {
							img = new Image("img/persO6.jpg").smoothScaledFixedAspectRatio(90 * dp, true);
							
							Button bt2 = new Button(img);
							bt2.setBorder(BORDER_NONE);
							add(bt2, LEFT, TOP, DP+100, FILL);
							
							ct = new Container(){
								public void initUI(){
									try{

							Button msg = new Button("Nanda Meireles                            ");
							msg.setBorder(BORDER_NONE);
							Font f1 = Font.getFont("LatoRegular", false, this.getFont().size+1);
							msg.setFont(f1);
							msg.transparentBackground = true;
							add(msg, AFTER + 5, TOP, PREFERRED, PREFERRED);

							Button msg1 = new Button("87 friends in common                         ");
							msg1.setBorder(BORDER_NONE);
							msg1.setForeColor(0x616161);
							Font f5 = Font.getFont("LatoRegular", true, this.getFont().size);
							msg1.setFont(f5);
							msg1.transparentBackground = true;
							add(msg1, SAME, AFTER, PREFERRED, PREFERRED);

							img2 = new Image("img/addF.png").smoothScaledFixedAspectRatio(18 * dp, true);

							Button msg2 = new Button("Add to my friends", img2, RIGHT, 5);
							Font f = Font.getFont(true, Font.NORMAL_SIZE).asBold();
							msg2.setFont(f);
							msg2.setBackForeColors(0x3d76d9, 0xFFFFFF);
							msg2.setBorder(BORDER_NONE);
							add(msg2,SAME, AFTER + 25, PARENTSIZE+95, DP + 35);
							
									}catch(Exception ee){
										ee.printStackTrace();
									}
							
								}
							};
							
							add(ct,AFTER+25,CENTER,FILL,PARENTSIZE+75);

						} catch (Exception ee) {

						}
					}
				};

				add(boxSer, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 20);

				boxSer = new Container() {

					public void initUI() {
						Image img;
						setBackColor(0xEEEEEE);
						try {
							img = new Image("img/persO5.jpg").smoothScaledFixedAspectRatio(90 * dp, true);
							
							Button bt2 = new Button(img);
							bt2.transparentBackground = true;
							bt2.setBorder(BORDER_NONE);
							add(bt2, LEFT, TOP, DP+100, FILL);
							
							ct = new Container(){
								public void initUI(){
									try{

							Button msg = new Button("Paulo Antonio                               ");
							msg.setBorder(BORDER_NONE);
							Font f1 = Font.getFont("LatoRegular", false, this.getFont().size+1);
							msg.setFont(f1);
							msg.transparentBackground = true;
							add(msg, AFTER + 5, TOP, PREFERRED, PREFERRED);

							Button msg1 = new Button("101 friends in common                         ");
							msg1.setBorder(BORDER_NONE);
							msg1.setForeColor(0x616161);
							Font f5 = Font.getFont("LatoRegular", true, this.getFont().size);
							msg1.setFont(f5);
							msg1.transparentBackground = true;
							add(msg1, SAME, AFTER, PREFERRED, PREFERRED);

							img2 = new Image("img/addF.png").smoothScaledFixedAspectRatio(18 * dp, true);

							Button msg2 = new Button("Add to my friends", img2, RIGHT, 5);
							Font f = Font.getFont(true, Font.NORMAL_SIZE).asBold();
							msg2.setFont(f);
							msg2.setBackForeColors(0x3d76d9, 0xFFFFFF);
							msg2.setBorder(BORDER_NONE);
							add(msg2,SAME, AFTER + 25, PARENTSIZE+95, DP + 35);
							
									}catch(Exception ee){
										ee.printStackTrace();
									}
							
								}
							};
							
							add(ct,AFTER+25,CENTER,FILL,PARENTSIZE+75);

						} catch (Exception ee) {

						}
					}
				};

				add(boxSer, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 20);

				boxSer = new Container() {

					public void initUI() {
						Image img;
						setBackColor(0xEEEEEE);
						try {
							img = new Image("img/persO4.jpg").smoothScaledFixedAspectRatio(90 * dp, true);
							
							Button bt2 = new Button(img);
							bt2.transparentBackground = true;
							bt2.setBorder(BORDER_NONE);
							add(bt2, LEFT, TOP, DP+100, FILL);
							
							ct = new Container(){
								public void initUI(){
									try{
					
							Button msg = new Button("Ricardo Assunção                         ");
							msg.setBorder(BORDER_NONE);
							Font f1 = Font.getFont("LatoRegular", false, this.getFont().size+1);
							msg.setFont(f1);
							msg.transparentBackground = true;
							add(msg, LEFT,TOP,PREFERRED, PREFERRED);

							Button msg1 = new Button("20 friends in common                         ");
							msg1.setBorder(BORDER_NONE);
							msg1.setForeColor(0x616161);
							Font f5 = Font.getFont("LatoRegular", true, this.getFont().size);
							msg1.setFont(f5);
							msg1.transparentBackground = true;
							add(msg1, SAME, AFTER, PREFERRED, PREFERRED);

							img2 = new Image("img/addF.png").smoothScaledFixedAspectRatio(18 * dp, true);

							Button msg2 = new Button("Add to my friends", img2, RIGHT, 5);
							Font f = Font.getFont(true, Font.NORMAL_SIZE).asBold();
							msg2.setFont(f);
							msg2.setBackForeColors(0x3d76d9, 0xFFFFFF);
							msg2.setBorder(BORDER_NONE);
							add(msg2,SAME, AFTER + 25, PARENTSIZE+95, DP + 35);
							
									}catch(Exception ee){
										ee.printStackTrace();
									}
							
								}
							};
							
							add(ct,AFTER+25,CENTER,FILL,PARENTSIZE+75);

						} catch (Exception ee) {
							ee.printStackTrace();
						}
					}
				};

				add(boxSer, LEFT, AFTER + 1, PARENTSIZE, PARENTSIZE + 20);
			}
		};

		add(body, LEFT, TOP, FILL, FILL);
	}

}
