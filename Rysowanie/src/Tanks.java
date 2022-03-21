import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Arrays;

import javax.imageio.ImageIO;

import javax.swing.JFrame;
import javax.swing.JPanel;

 
class window{
	static int x=1300;
	static int y=650;
}

class tabs{
	static int[][] t= new int[13][26];
}

class tank1{
	static int x = 600;
	static int xold;
	static int y = 300;
	static int yold;
	static int size = 40;
	static int v=1;
	static int turn=1;
	static boolean wstop=false;
	static boolean sstop=false;
	static boolean astop=false;
	static boolean dstop=false;
}

class bulletst1{
	static int[] number= new int[20];
	static int[] x= new int[20];
	static int[] y= new int[20];
	static int num;
	static int size=20;
	static int v=1;
}
class bw{
	static int size=50;
	
}

class ob{
	static int[] bwn = new int[50];
	static int[] bwx = new int[50];
	static int[] bwy = new int[50];
	static int bwsize = 50;
	static int bwnumber;
	static int[] mwn = new int[25];
	static int[] mwx = new int[25];
	static int[] mwy = new int[25];
	static int mwsize = 50;
	static int mwnumber;
	static int[] wwn = new int[15];
	static int[] wwx = new int[15];
	static int[] wwy = new int[15];
	static int wwsize = 50;
	static int wwnumber;
	static int[] wown = new int[10];
	static int[] wowx = new int[10];
	static int[] wowy = new int[10];
	static int wowsize = 50;
	static int wownumber;
	static boolean wowpushwstop = false;
	static boolean wowpushsstop = false;
	static boolean wowpushastop = false;
	static boolean wowpushdstop = false;
	static int[] wnewn = new int[10];
	static int[] wnewx = new int[10];
	static int[] wnewy = new int[10];
	static int wnewsize = 50;
	static int wnewnumber;
	
}

class et{
	static int[] n= new int [40];
	static int[] x= new int [40];
	static int[] y= new int [40];
	static int[] turn= new int [40];
	static int[] m= new int [40];
	static int[] stopw= new int [40];
	static int[] stops= new int [40];
	static int[] stopa= new int [40];
	static int[] stopd= new int [40];
	static int size = 40;
	static int timerspawn=0;
	static int nr=0;
	static int[] sn= new int [4];
	static int[] sx= new int [4];
	static int[] sy= new int [4];
	static int[] ifs= new int [4];
	static int snumber = 0;
	static int sszie = 50;
	static boolean s1=true;
	static boolean s2=true;
	static boolean s3=true;
	static boolean s4=true;
	static int ver1=10;
	static int ver1v=1;
	static int spawnx= 50;
}


	
	class meeeeJFrame extends JFrame implements KeyListener{

//		ma ma = new ma();
		public meeeeJFrame(String string) {
			
			
			addKeyListener(this);
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			char c = e.getKeyChar();
			
			if(c=='w') {
					for(int i=0;i<ob.bwn.length;i++) {
						if(tank1.x+tank1.size>ob.bwx[i]&&tank1.x<ob.bwx[i]+ob.bwsize&&tank1.y+tank1.size>=ob.bwy[i]&&tank1.y<=ob.bwy[i]+ob.bwsize) {
							if(tank1.y+tank1.size-tank1.v<ob.bwy[i])
								tank1.wstop=false;
							else
								tank1.wstop=true;
						}
					}
					for(int i=0;i<ob.mwn.length;i++) {
						if(tank1.x+tank1.size>ob.mwx[i]&&tank1.x<ob.mwx[i]+ob.mwsize&&tank1.y+tank1.size>=ob.mwy[i]&&tank1.y<=ob.mwy[i]+ob.mwsize) {
							if(tank1.y+tank1.size-tank1.v<ob.mwy[i])
								tank1.wstop=false;
							else
								tank1.wstop=true;
						}
					}
					for(int i=0;i<ob.wwn.length;i++) {
						if(tank1.x+tank1.size>ob.wwx[i]&&tank1.x<ob.wwx[i]+ob.wwsize&&tank1.y+tank1.size>=ob.wwy[i]&&tank1.y<=ob.wwy[i]+ob.wwsize) {
							if(tank1.y+tank1.size-tank1.v<ob.wwy[i])
								tank1.wstop=false;
							else
								tank1.wstop=true;
						}
					}
					if(tank1.wstop==false&&tank1.y>=0) {
						for(int i=0;i<ob.wown.length;i++) {
							if(tank1.x+tank1.size>ob.wowx[i]&&tank1.x<ob.wowx[i]+ob.wowsize&&tank1.y+tank1.size>=ob.wowy[i]&&tank1.y<=ob.wowy[i]+ob.wowsize) {
								for(int j=0;j<ob.bwn.length;j++) {
									if(ob.wowx[i]+ob.wowsize>ob.bwx[j]&&ob.wowx[i]<ob.bwx[j]+ob.bwsize&&ob.wowy[i]+ob.wowsize>=ob.bwy[j]&&ob.wowy[i]<=ob.bwy[j]+ob.bwsize) {
										tank1.wstop=true;
										ob.wowpushwstop=true;
										}
									}
								for(int j=0;j<ob.wown.length-1;j++) {
									if(ob.wowx[i]!=ob.wowx[j]) {
										if(ob.wowx[i]+ob.wowsize>ob.mwx[j]&&ob.wowx[i]<ob.mwx[j]+ob.mwsize&&ob.wowy[i]+ob.wowsize>=ob.mwy[j]&&ob.wowy[i]<=ob.mwy[j]+ob.mwsize) {
											tank1.wstop=true;
											ob.wowpushwstop=true;
											}
										}
									}
								for(int j=0;j<ob.wwn.length;j++) {
									if(ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]+1==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]-1==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]+1==ob.wwy[j]||
										ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]-1==ob.wwy[j]){
										ob.wnewn[ob.wnewnumber]=6;
										ob.wnewx[ob.wnewnumber]=ob.wwx[j];
										ob.wnewy[ob.wnewnumber]=ob.wwy[j];
										ob.wnewnumber++;
										ob.wowx[i]=0;
										ob.wowy[i]=0;
										ob.wown[i]=0;
										ob.wwx[j]=0;
										ob.wwy[j]=0;
										ob.wwn[j]=0;
									}
								}
								
								if(tank1.y+tank1.size-tank1.v<ob.wowy[i]&&tank1.y+tank1.size+tank1.size<ob.wowy[i]+ob.wowsize) {
									tank1.wstop=false;
									ob.wowpushwstop=true;
								}
								
								if(ob.wowy[i]-1<=0) {
									tank1.wstop=true;
									ob.wowpushwstop=true;
								}	
								if(ob.wowpushwstop==false&&tank1.y-tank1.v<ob.wowy[i]+ob.wowsize) 
									ob.wowy[i]-=tank1.v;
								}
							
								
							
							}
						
						if(tank1.wstop==false)
							tank1.y-=tank1.v;
						if(tank1.turn!=1) {
							tank1.turn=1;
						}
					}
					else {
						if(tank1.turn!=1) {
							tank1.turn=1;
						}
					}
					tank1.wstop=false;
					ob.wowpushwstop=false;
				}
			if(c=='s') {
				for(int i=0;i<ob.bwn.length;i++) {
					if(tank1.x+tank1.size>ob.bwx[i]&&tank1.x<ob.bwx[i]+ob.bwsize&&tank1.y+tank1.size>=ob.bwy[i]&&tank1.y<=ob.bwy[i]+ob.bwsize) {
						if(tank1.y+tank1.v>ob.bwy[i]+ob.bwsize)
							tank1.sstop=false;
						else
							tank1.sstop=true;
					}
				}
				for(int i=0;i<ob.mwn.length;i++) {
					if(tank1.x+tank1.size>ob.mwx[i]&&tank1.x<ob.mwx[i]+ob.mwsize&&tank1.y+tank1.size>=ob.mwy[i]&&tank1.y<=ob.mwy[i]+ob.mwsize) {
						if(tank1.y+tank1.v>ob.mwy[i]+ob.mwsize)
							tank1.sstop=false;
						else
							tank1.sstop=true;
					}
				}
				for(int i=0;i<ob.wwn.length;i++) {
					if(tank1.x+tank1.size>ob.wwx[i]&&tank1.x<ob.wwx[i]+ob.wwsize&&tank1.y+tank1.size>=ob.wwy[i]&&tank1.y<=ob.wwy[i]+ob.wwsize) {
						if(tank1.y+tank1.v>ob.wwy[i]+ob.wwsize)
							tank1.sstop=false;
						else
							tank1.sstop=true;
					}
				}
				if(tank1.sstop==false&&tank1.y<=649) {
					for(int i=0;i<ob.wown.length;i++) {
						if(tank1.x+tank1.size>ob.wowx[i]&&tank1.x<ob.wowx[i]+ob.wowsize&&tank1.y+tank1.size>=ob.wowy[i]&&tank1.y<=ob.wowy[i]+ob.wowsize) {
							for(int j=0;j<ob.bwn.length;j++) {
								if(ob.wowx[i]+ob.wowsize>ob.bwx[j]&&ob.wowx[i]<ob.bwx[j]+ob.bwsize&&ob.wowy[i]+ob.wowsize>=ob.bwy[j]&&ob.wowy[i]<=ob.bwy[j]+ob.bwsize) {
									tank1.sstop=true;
									ob.wowpushsstop=true;
									}
								}
							for(int j=0;j<ob.mwn.length;j++) {
								if(ob.wowx[i]+ob.wowsize>ob.mwx[j]&&ob.wowx[i]<ob.mwx[j]+ob.mwsize&&ob.wowy[i]+ob.wowsize>=ob.mwy[j]&&ob.wowy[i]<=ob.mwy[j]+ob.mwsize) {
									tank1.sstop=true;
									ob.wowpushsstop=true;
									}
								}
							
							for(int j=0;j<ob.wown.length-1;j++) {
								if(ob.wowx[i]!=ob.wowx[j]) {
									if(ob.wowx[i]+ob.wowsize>ob.wowx[j]&&ob.wowx[i]<ob.wowx[j]+ob.wowsize&&ob.wowy[i]+ob.wowsize>=ob.wowy[j]&&ob.wowy[i]<=ob.wowy[j]+ob.wowsize) {
										tank1.sstop=true;
										ob.wowpushsstop=true;
										}
									}
								}
							for(int j=0;j<ob.wwn.length;j++) {
								if(ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]+1==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]-1==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]+1==ob.wwy[j]||
										ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]-1==ob.wwy[j]) {
									ob.wnewn[ob.wnewnumber]=6;
									ob.wnewx[ob.wnewnumber]=ob.wwx[j];
									ob.wnewy[ob.wnewnumber]=ob.wwy[j];
									ob.wnewnumber++;
									ob.wowx[i]=0;
									ob.wowy[i]=0;
									ob.wown[i]=0;
									ob.wwx[j]=0;
									ob.wwy[j]=0;
									ob.wwn[j]=0;
								}
							}
							if(tank1.y+tank1.v>ob.wowy[i]+ob.wowsize) {
								tank1.sstop=false;
								ob.wowpushsstop=true;
							}
							
							if(ob.wowy[i]+1>=650) {
								tank1.sstop=true;
								ob.wowpushsstop=true;
							}	
							if(ob.wowpushsstop==false) 
								ob.wowy[i]+=tank1.v;
							}
						}
					
					if(tank1.sstop==false)
						tank1.y+=tank1.v;
					if(tank1.turn!=4) {
						tank1.turn=4;
					}
				}
				else {
					if(tank1.turn!=4) {
						tank1.turn=4;
					}
				}
				tank1.sstop=false;
				ob.wowpushsstop=false;
			}
			if(c=='a') {
				for(int i=0;i<ob.bwn.length;i++) {
					if(tank1.x+tank1.size>=ob.bwx[i]&&tank1.x<=ob.bwx[i]+ob.bwsize&&tank1.y+tank1.size>ob.bwy[i]&&tank1.y<ob.bwy[i]+ob.bwsize) {
						if(tank1.x+tank1.size-tank1.v<ob.bwx[i])
							tank1.astop=false;
						else
							tank1.astop=true;
					}
				}
				for(int i=0;i<ob.mwn.length;i++) {
					if(tank1.x+tank1.size>=ob.mwx[i]&&tank1.x<=ob.mwx[i]+ob.mwsize&&tank1.y+tank1.size>ob.mwy[i]&&tank1.y<ob.mwy[i]+ob.mwsize) {
						if(tank1.x+tank1.size-tank1.v<ob.mwx[i])
							tank1.astop=false;
						else
							tank1.astop=true;
					}
				}
				for(int i=0;i<ob.wwn.length;i++) {
					if(tank1.x+tank1.size>=ob.wwx[i]&&tank1.x<=ob.wwx[i]+ob.wwsize&&tank1.y+tank1.size>ob.wwy[i]&&tank1.y<ob.wwy[i]+ob.wwsize) {
						if(tank1.x+tank1.size-tank1.v<ob.wwx[i])
							tank1.astop=false;
						else
							tank1.astop=true;
					}
				}
				if(tank1.astop==false&&tank1.x>=0) {
					for(int i=0;i<ob.wown.length;i++) {
						if(tank1.x+tank1.size>=ob.wowx[i]&&tank1.x<=ob.wowx[i]+ob.wowsize&&tank1.y+tank1.size>ob.wowy[i]&&tank1.y<ob.wowy[i]+ob.wowsize) {
							for(int j=0;j<ob.bwn.length;j++) {
								if(ob.wowx[i]+ob.wowsize>=ob.bwx[j]&&ob.wowx[i]<=ob.bwx[j]+ob.bwsize&&ob.wowy[i]+ob.wowsize>ob.bwy[j]&&ob.wowy[i]<ob.bwy[j]+ob.bwsize) {
									tank1.astop=true;
									ob.wowpushastop=true;
									}
								}
							for(int j=0;j<ob.mwn.length;j++) {
								if(ob.wowx[i]+ob.wowsize>=ob.mwx[j]&&ob.wowx[i]<=ob.mwx[j]+ob.mwsize&&ob.wowy[i]+ob.wowsize>ob.mwy[j]&&ob.wowy[i]<ob.mwy[j]+ob.mwsize) {
									tank1.astop=true;
									ob.wowpushastop=true;
									}
								}
							for(int j=0;j<ob.wown.length-1;j++) {
								if(ob.wowx[i]!=ob.wowx[j]) {
									if(ob.wowx[i]+ob.wowsize>=ob.wowx[j]&&ob.wowx[i]<=ob.wowx[j]+ob.wowsize&&ob.wowy[i]+ob.wowsize>ob.wowy[j]&&ob.wowy[i]<ob.wowy[j]+ob.wowsize) {
										tank1.astop=true;
										ob.wowpushastop=true;
										}
									}
								}
							for(int j=0;j<ob.wwn.length;j++) {
								if(ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]+1==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]-1==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]+1==ob.wwy[j]||
										ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]-1==ob.wwy[j]) {
									ob.wnewn[ob.wnewnumber]=6;
									ob.wnewx[ob.wnewnumber]=ob.wwx[j];
									ob.wnewy[ob.wnewnumber]=ob.wwy[j];
									ob.wnewnumber++;
									ob.wowx[i]=0;
									ob.wowy[i]=0;
									ob.wown[i]=0;
									ob.wwx[j]=0;
									ob.wwy[j]=0;
									ob.wwn[j]=0;
								}
							}
							
							if(tank1.x+tank1.size-tank1.v<ob.wowx[i]) {
								tank1.astop=false;
								ob.wowpushastop=true;
							}
							
							if(ob.wowx[i]-1<=0) {
								tank1.astop=true;
								ob.wowpushastop=true;
							}	
							if(ob.wowpushastop==false&&tank1.x-tank1.v<ob.wowx[i]+ob.wowsize) 
								ob.wowx[i]-=tank1.v;
							}
						}
					
					if(tank1.astop==false)
						tank1.x-=tank1.v;
					if(tank1.turn!=2) {
						tank1.turn=2;
					}
				}
				else {
					if(tank1.turn!=2) {
						tank1.turn=2;
					}
				}
				tank1.astop=false;
				ob.wowpushastop=false;
			}
			if(c=='d') {
				for(int i=0;i<ob.bwn.length;i++) {
					if(tank1.x+tank1.size>=ob.bwx[i]&&tank1.x<=ob.bwx[i]+ob.bwsize&&tank1.y+tank1.size>ob.bwy[i]&&tank1.y<ob.bwy[i]+ob.bwsize) {
						if(tank1.x+tank1.v>ob.bwx[i]+ob.bwsize)
							tank1.dstop=false;
						else
							tank1.dstop=true;
					}
				}
				for(int i=0;i<ob.mwn.length;i++) {
					if(tank1.x+tank1.size>=ob.mwx[i]&&tank1.x<=ob.mwx[i]+ob.mwsize&&tank1.y+tank1.size>ob.mwy[i]&&tank1.y<ob.mwy[i]+ob.mwsize) {
						if(tank1.x+tank1.v>ob.mwx[i]+ob.mwsize)
							tank1.dstop=false;
						else
							tank1.dstop=true;
					}
				}
				for(int i=0;i<ob.wwn.length;i++) {
					if(tank1.x+tank1.size>=ob.wwx[i]&&tank1.x<=ob.wwx[i]+ob.wwsize&&tank1.y+tank1.size>ob.wwy[i]&&tank1.y<ob.wwy[i]+ob.wwsize) {
						if(tank1.x+tank1.v>ob.wwx[i]+ob.wwsize)
							tank1.dstop=false;
						else
							tank1.dstop=true;
					}
				}
				if(tank1.dstop==false&&tank1.x>=0) {
					for(int i=0;i<ob.wown.length;i++) {
						if(tank1.x+tank1.size>=ob.wowx[i]&&tank1.x<=ob.wowx[i]+ob.wowsize&&tank1.y+tank1.size>ob.wowy[i]&&tank1.y<ob.wowy[i]+ob.wowsize) {
							for(int j=0;j<ob.bwn.length;j++) {
								if(ob.wowx[i]+ob.wowsize>=ob.bwx[j]&&ob.wowx[i]<=ob.bwx[j]+ob.bwsize&&ob.wowy[i]+ob.wowsize>ob.bwy[j]&&ob.wowy[i]<ob.bwy[j]+ob.bwsize) {
									tank1.dstop=true;
									ob.wowpushdstop=true;
									}
								}
							for(int j=0;j<ob.mwn.length;j++) {
								if(ob.wowx[i]+ob.wowsize>=ob.mwx[j]&&ob.wowx[i]<=ob.mwx[j]+ob.mwsize&&ob.wowy[i]+ob.wowsize>ob.mwy[j]&&ob.wowy[i]<ob.mwy[j]+ob.mwsize) {
									tank1.dstop=true;
									ob.wowpushdstop=true;
									}
								}
							for(int j=0;j<ob.wown.length-1;j++) {
								if(ob.wowx[i]!=ob.wowx[j]) {
									if(ob.wowx[i]+ob.wowsize>=ob.wowx[j]&&ob.wowx[i]<=ob.wowx[j]+ob.wowsize&&ob.wowy[i]+ob.wowsize>ob.wowy[j]&&ob.wowy[i]<ob.wowy[j]+ob.wowsize) {
										tank1.dstop=true;
										ob.wowpushdstop=true;
										}
									}
								}
							for(int j=0;j<ob.wwn.length;j++) {
								if(ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]+1==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]-1==ob.wwx[j]&&ob.wowy[i]==ob.wwy[j]||
										ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]+1==ob.wwy[j]||
										ob.wowx[i]==ob.wwx[j]&&ob.wowy[i]-1==ob.wwy[j]) {
									ob.wnewn[ob.wnewnumber]=6;
									ob.wnewx[ob.wnewnumber]=ob.wwx[j];
									ob.wnewy[ob.wnewnumber]=ob.wwy[j];
									ob.wnewnumber++;
									ob.wowx[i]=0;
									ob.wowy[i]=0;
									ob.wown[i]=0;
									ob.wwx[j]=0;
									ob.wwy[j]=0;
									ob.wwn[j]=0;
								}
							}
							if(tank1.x+tank1.v>ob.wowx[i]+ob.wowsize) {
								tank1.dstop=false;
								ob.wowpushdstop=true;
							}
							
							if(ob.wowx[i]+1>=1300) {
								tank1.dstop=true;
								ob.wowpushdstop=true;
							}	
							if(ob.wowpushdstop==false) 
								ob.wowx[i]+=tank1.v;
							}
						}
					
					if(tank1.dstop==false)
						tank1.x+=tank1.v;
					if(tank1.turn!=3) {
						tank1.turn=3;
					}
				}
				else {
					if(tank1.turn!=3) {
						tank1.turn=3;
					}
				}
				tank1.dstop=false;
				ob.wowpushdstop=false;
			}
			
			if(c=='e') {
				//w
				if(tank1.turn==1) {
					bulletst1.number[bulletst1.num]=1;
					bulletst1.x[bulletst1.num]=tank1.x+tank1.size/2-bulletst1.size/2;
					bulletst1.y[bulletst1.num]=tank1.y-bulletst1.size;
					bulletst1.num++;
					if(bulletst1.num>=20) {
						bulletst1.num=0;
					}
				}
				//s
				if(tank1.turn==4) {
					bulletst1.number[bulletst1.num]=4;
					bulletst1.x[bulletst1.num]=tank1.x+tank1.size/2-bulletst1.size/2;
					bulletst1.y[bulletst1.num]=tank1.y+bulletst1.size+tank1.size;
					bulletst1.num++;
					if(bulletst1.num>=20) {
						bulletst1.num=0;
					}
				}
				//a
				if(tank1.turn==2) {
					bulletst1.number[bulletst1.num]=2;
					bulletst1.x[bulletst1.num]=tank1.x-bulletst1.size;
					bulletst1.y[bulletst1.num]=tank1.y+tank1.size/2-bulletst1.size/2;
					bulletst1.num++;
					if(bulletst1.num>=20) {
						bulletst1.num=0;
					}
				}
				
				//d
				if(tank1.turn==3) {
					bulletst1.number[bulletst1.num]=3;
					bulletst1.x[bulletst1.num]=tank1.x+bulletst1.size;
					bulletst1.y[bulletst1.num]=tank1.y+tank1.size/2-bulletst1.size/2;
					bulletst1.num++;
					if(bulletst1.num>=20) {
						bulletst1.num=0;
					}
				}
				
			}
			
			repaint();
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	public class Tanks extends JPanel{
			
			@Override
			public Dimension getPreferredSize() {
				return new Dimension(window.x, window.y);
			}
	
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
			
			
			try {
				
				Image tanka = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\tank11.png"));
				Image tankaleft = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\tank11left.png"));
				Image tankaright = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\tank11right.png"));
				Image tankaback = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\tank11back.png"));
				Image bullet = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\pocisk1.png"));
				Image bulletright = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\pocisk1right.png"));
				Image bulletleft = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\pocisk1left.png"));
				Image bulletback = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\pocisk1back.png"));
				Image brickwall = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\brickwall1.jpg"));
				Image metalwall = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\metalblock11.jpg"));
				Image watherwall = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\wather11.png"));
				Image woodwall = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\wood.jpg"));
				Image newwoodwall = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\woodwallnew11.jpg"));
				Image et1back = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\et22back.jpg"));
				Image et1front = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\et22front.jpg"));
				Image et1left = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\et22left.jpg"));
				Image et1right = ImageIO.read(new File("C:\\Users\\Kris\\Desktop\\Obrazki\\et22right.jpg"));
				
				g.setColor(Color.black);
				g.fillRect(0, 0, window.x, window.y);
				
				//woodwallnew
				for(int i=0;i<ob.wnewn.length;i++) {
					if(ob.wnewn[i]==6) {
							g.drawImage(newwoodwall,ob.wnewx[i],ob.wnewy[i],ob.wnewsize,ob.wnewsize,null);
						}
				}
				
				//tank movment
				
				if(tank1.turn==1)
					g.drawImage(tanka,tank1.x,tank1.y,tank1.size,tank1.size,null);
				else if(tank1.turn==2)
					g.drawImage(tankaleft,tank1.x,tank1.y,tank1.size,tank1.size,null);
				else if(tank1.turn==3)
					g.drawImage(tankaright,tank1.x,tank1.y,tank1.size,tank1.size,null);
				else if(tank1.turn==4)
					g.drawImage(tankaback,tank1.x,tank1.y,tank1.size,tank1.size,null);
				g.setColor(Color.white);
				g.drawString("X: "+Integer.toString(tank1.x), 20, 20);
				g.drawString("Y: "+Integer.toString(tank1.y), 20, 40);
				
				//bullets
				
				for(int i =0;i<et.n.length;i++) {
					if(et.n[i]==et.ver1&&et.turn[i]==1) {
						g.drawImage(et1front,et.x[i],et.y[i],et.size,et.size,null);
					}
					else if(et.n[i]==et.ver1&&et.turn[i]==2) {
						g.drawImage(et1left,et.x[i],et.y[i],et.size,et.size,null);
					}
					else if(et.n[i]==et.ver1&&et.turn[i]==3) {
						g.drawImage(et1right,et.x[i],et.y[i],et.size,et.size,null);
					}
					else if(et.n[i]==et.ver1&&et.turn[i]==4) {
						g.drawImage(et1back,et.x[i],et.y[i],et.size,et.size,null);
					}
				}
				
				for(int i=0;i<bulletst1.number.length-1;i++) {
					if(bulletst1.number[i]==1) {
						g.drawImage(bullet,bulletst1.x[i],bulletst1.y[i],bulletst1.size,bulletst1.size,null);
					}
					else if(bulletst1.number[i]==2) {
						g.drawImage(bulletleft,bulletst1.x[i],bulletst1.y[i],bulletst1.size,bulletst1.size,null);
					}
					else if(bulletst1.number[i]==3) {
						g.drawImage(bulletright,bulletst1.x[i],bulletst1.y[i],bulletst1.size,bulletst1.size,null);
					}
					else if(bulletst1.number[i]==4) {
						g.drawImage(bulletback,bulletst1.x[i],bulletst1.y[i],bulletst1.size,bulletst1.size,null);
					}
				}
				
				//brickwall
//				System.out.println(tabs.t.length-1 + ".le");
//				System.out.println(tabs.t[0].length+"[]");
				int j=0;
				for(int i=0;i<ob.bwn.length;i++) {
					if(ob.bwn[i]==2) {
					g.drawImage(brickwall,ob.bwx[i],ob.bwy[i],ob.bwsize,ob.bwsize,null);
						}
				}
				
				//metalwall
			
			
				for(int i=0;i<ob.mwn.length;i++) {
					if(ob.mwn[i]==3) {
							g.drawImage(metalwall,ob.mwx[i],ob.mwy[i],ob.mwsize,ob.mwsize,null);
						}
				}
				
				//watherwall
				for(int i=0;i<ob.wwn.length;i++) {
					if(ob.wwn[i]==4) {
							g.drawImage(watherwall,ob.wwx[i],ob.wwy[i],ob.wwsize,ob.wwsize,null);
						}
				}
				//woodwall
				for(int i=0;i<ob.wown.length;i++) {
					if(ob.wown[i]==5) {
							g.drawImage(woodwall,ob.wowx[i],ob.wowy[i],ob.wowsize,ob.wowsize,null);
						}
				}
				
//				g.drawImage(brickwall,0,0,bw.size,bw.size,null);
				
			}
			
			catch (Exception e) { 
			}		
	}
			
			public void animacja() {
				
				while(true) {
					
					pocisk();
					pociskend();
					pociskprzeszkody();
					enemyspawn();
					enemymovment();
					repaint(); 
					
					System.out.println(et.x[1] +"x");
					System.out.println(et.y[1] +"y");
					try {
						Thread.sleep(1); 
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
						} 
					
				}
				
			}
			
			public void enemymovment() {
				
				for(int i=0;i<et.n.length;i++) {
					if(et.n[i]>0&&et.m[i]==0) {
						int m=(int)(Math.random() *4+1);
						et.m[i]=m;
//						System.out.println("m"+m);
					}
					//w v1
					if(et.n[i]==et.ver1&&et.m[i]==1) {
						for(int j=0;j<ob.bwn.length;j++) {
							if(et.x[i]+et.size>ob.bwx[j]&&et.x[i]<ob.bwx[j]+ob.bwsize&&et.y[i]+et.size>=ob.bwy[j]&&et.y[i]<=ob.bwy[j]+ob.bwsize) {
								if(et.y[i]+et.size-et.ver1v<ob.bwy[j])
									et.stopw[i]=0;
								else
									et.stopw[i]=1;
							}
						}
						for(int j=0;j<ob.mwn.length;j++) {
							if(et.x[i]+et.size>ob.mwx[j]&&et.x[i]<ob.mwx[j]+ob.mwsize&&et.y[i]+et.size>=ob.mwy[j]&&et.y[i]<=ob.mwy[j]+ob.mwsize) {
								if(et.y[i]+et.size-et.ver1v<ob.mwy[j])
									et.stopw[i]=0;
								else
									et.stopw[i]=1;
							}
						}
						for(int j=0;j<ob.wwn.length;j++) {
							if(et.x[i]+et.size>ob.wwx[j]&&et.x[i]<ob.wwx[j]+ob.wwsize&&et.y[i]+et.size>=ob.wwy[j]&&et.y[i]<=ob.wwy[j]+ob.wwsize) {
								if(et.y[i]+et.size-et.ver1v<ob.wwy[j])
									et.stopw[i]=0;
								else
									et.stopw[i]=1;
							}
						}
						for(int j=0;j<ob.wown.length;j++) {
							if(et.x[i]+et.size>ob.wowx[j]&&et.x[i]<ob.wowx[j]+ob.wowsize&&et.y[i]+et.size>=ob.wowy[j]&&et.y[i]<=ob.wowy[j]+ob.wowsize) {
								if(et.y[i]+et.size-et.ver1v<ob.wowy[j])
									et.stopw[i]=0;
								else
									et.stopw[i]=1;
							}
						}
						if(et.stopw[i]==0&&et.y[i]>0) {
							et.y[i]-=et.ver1v;
							if(et.turn[i]!=1) {
								et.turn[i]=1;
							}
						}
						else {
							if(et.turn[i]!=1) {
								et.turn[i]=1;
							}
							
						}
						if(et.stopw[i]==1) {
							et.m[i]=0;
							et.stopw[i]=0;
						}
						else if(et.y[i]-et.ver1v<=0) {
							et.m[i]=0;
							et.stopw[i]=0;
						}
						
					}
					//s v1
					if(et.n[i]==et.ver1&&et.m[i]==4) {
						for(int j=0;j<ob.bwn.length;j++) {
							if(et.x[i]+et.size>ob.bwx[j]&&et.x[i]<ob.bwx[j]+ob.bwsize&&et.y[i]+et.size>=ob.bwy[j]&&et.y[i]<=ob.bwy[j]+ob.bwsize) {
								if(et.y[i]+et.ver1v>ob.bwy[j]+ob.bwsize)
									et.stops[i]=0;
								else
									et.stops[i]=1;
							}
						}
						for(int j=0;j<ob.mwn.length;j++) {
							if(et.x[i]+et.size>ob.mwx[j]&&et.x[i]<ob.mwx[j]+ob.mwsize&&et.y[i]+et.size>=ob.mwy[j]&&et.y[i]<=ob.mwy[j]+ob.mwsize) {
								if(et.y[i]+et.ver1v>ob.mwy[j]+ob.mwsize)
									et.stops[i]=0;
								else
									et.stops[i]=1;
							}
						}
						for(int j=0;j<ob.wwn.length;j++) {
							if(et.x[i]+et.size>ob.wwx[j]&&et.x[i]<ob.wwx[j]+ob.wwsize&&et.y[i]+et.size>=ob.wwy[j]&&et.y[i]<=ob.wwy[j]+ob.wwsize) {
								if(et.y[i]+et.ver1v>ob.wwy[j]+ob.wwsize)
									et.stops[i]=0;
								else
									et.stops[i]=1;
							}
						}
						for(int j=0;j<ob.wown.length;j++) {
							if(et.x[i]+et.size>ob.wowx[j]&&et.x[i]<ob.wowx[j]+ob.wowsize&&et.y[i]+et.size>=ob.wowy[j]&&et.y[i]<=ob.wowy[j]+ob.wowsize) {
								if(et.y[i]+et.ver1v>ob.wowy[j]+ob.wowsize)
									et.stops[i]=0;
								else
									et.stops[i]=1;
							}
						}
						if(et.stopw[i]==0&&et.y[i]+et.size<650) {
							et.y[i]+=et.ver1v;
							if(et.turn[i]!=4) {
								et.turn[i]=4;
							}
						}
						else {
							if(et.turn[i]!=4) {
								et.turn[i]=4;
							}
							
						}
						if(et.stops[i]==1) {
							et.m[i]=0;
							et.stops[i]=0;
						}
						else if(et.y[i]+et.ver1v+et.size>=650) {
							et.m[i]=0;
							et.stops[i]=0;
						}
					}
					//a ver1
					if(et.n[i]==et.ver1&&et.m[i]==2) {
						for(int j=0;j<ob.bwn.length;j++) {
							if(et.x[i]+et.size>=ob.bwx[j]&&et.x[i]<=ob.bwx[j]+ob.bwsize&&et.y[i]+et.size>ob.bwy[j]&&et.y[i]<ob.bwy[j]+ob.bwsize) {
								if(et.x[i]+et.size-et.ver1<ob.bwx[j])
									et.stopa[i]=0;
								else
									et.stopa[i]=1;
							}
						}
						for(int j=0;j<ob.mwn.length;j++) {
							if(et.x[i]+et.size>=ob.mwx[j]&&et.x[i]<=ob.mwx[j]+ob.mwsize&&et.y[i]+et.size>ob.mwy[j]&&et.y[i]<ob.mwy[j]+ob.mwsize) {
								if(et.x[i]+et.size-et.ver1<ob.mwx[j])
									et.stopa[i]=0;
								else
									et.stopa[i]=1;
							}
						}
						for(int j=0;j<ob.wwn.length;j++) {
							if(et.x[i]+et.size>=ob.wwx[j]&&et.x[i]<=ob.wwx[j]+ob.wwsize&&et.y[i]+et.size>ob.wwy[j]&&et.y[i]<ob.wwy[j]+ob.wwsize) {
								if(et.x[i]+et.size-et.ver1<ob.wwx[j])
									et.stopa[i]=0;
								else
									et.stopa[i]=1;
							}
						}
						for(int j=0;j<ob.wown.length;j++) {
							if(et.x[i]+et.size>=ob.wowx[j]&&et.x[i]<=ob.wowx[j]+ob.wowsize&&et.y[i]+et.size>ob.wowy[j]&&et.y[i]<ob.wowy[j]+ob.wowsize) {
								if(et.x[i]+et.size-et.ver1<ob.wowx[j])
									et.stopa[i]=0;
								else
									et.stopa[i]=1;
							}
						}
						if(et.stopa[i]==0&&et.x[i]>0) {
							et.x[i]-=et.ver1v;
							if(et.turn[i]!=2) {
								et.turn[i]=2;
							}
						}
						else {
							if(et.turn[i]!=2) {
								et.turn[i]=2;
							}
							
						}
						if(et.stopa[i]==1) {
							et.m[i]=0;
							et.stopa[i]=0;
						}
						else if(et.x[i]-et.ver1v<=0) {
							et.m[i]=0;
							et.stopa[i]=0;
						}
					}
					//d ver1
					if(et.n[i]==et.ver1&&et.m[i]==3) {
						for(int j=0;j<ob.bwn.length;j++) {
							if(et.x[i]+et.size>=ob.bwx[j]&&et.x[i]<=ob.bwx[j]+ob.bwsize&&et.y[i]+et.size>ob.bwy[j]&&et.y[i]<ob.bwy[j]+ob.bwsize) {
								if(et.x[i]+et.ver1>ob.bwx[j]+ob.bwsize)
									et.stopd[i]=0;
								else
									et.stopd[i]=1;
							}
						}
						for(int j=0;j<ob.mwn.length;j++) {
							if(et.x[i]+et.size>=ob.mwx[j]&&et.x[i]<=ob.mwx[j]+ob.mwsize&&et.y[i]+et.size>ob.mwy[j]&&et.y[i]<ob.mwy[j]+ob.mwsize) {
								if(et.x[i]+et.ver1>ob.mwx[j]+ob.mwsize)
									et.stopd[i]=0;
								else
									et.stopd[i]=1;
							}
						}
						for(int j=0;j<ob.wwn.length;j++) {
							if(et.x[i]+et.size>=ob.wwx[j]&&et.x[i]<=ob.wwx[j]+ob.wwsize&&et.y[i]+et.size>ob.wwy[j]&&et.y[i]<ob.wwy[j]+ob.wwsize) {
								if(et.x[i]+et.ver1>ob.wwx[j]+ob.wwsize)
									et.stopd[i]=0;
								else
									et.stopd[i]=1;
							}
						}
						for(int j=0;j<ob.wown.length;j++) {
							if(et.x[i]+et.size>=ob.wowx[j]&&et.x[i]<=ob.wowx[j]+ob.wowsize&&et.y[i]+et.size>ob.wowy[j]&&et.y[i]<ob.wowy[j]+ob.wowsize) {
								if(et.x[i]+et.ver1>ob.wowx[j]+ob.wowsize)
									et.stopd[i]=0;
								else
									et.stopd[i]=1;
							}
						}
						if(et.stopd[i]==0&&et.x[i]+et.size<=1300) {
							et.x[i]+=et.ver1v;
							if(et.turn[i]!=3) {
								et.turn[i]=3;
							}
						}
						else {
							if(et.turn[i]!=3) {
								et.turn[i]=3;
							}
							
						}
						if(et.stopd[i]==1) {
							et.m[i]=0;
							et.stopd[i]=0;
						}
						else if(et.y[i]+et.ver1v+et.size>=1300) {
							et.m[i]=0;
							et.stopd[i]=0;
						}
					}
				}
				
				
				
				return;
			}
			
			public void enemyspawn() {
				int j=0;
				et.timerspawn++;
				if(et.timerspawn>=1000) {
					for(int i=0;i<et.n.length;i++) {
						for(;j<et.sn.length;j++)
							if(j==0) {
								if(et.x[i]>=et.sx[j]&&et.x[i]<=et.sx[j]+et.sszie*2&&et.y[i]>=et.sy[j]&&et.y[i]<=et.sy[j]+et.sszie*2) {
									//et.x[i]+et.size<=et.sx[j]&&et.x[i]>=et.sx[j]+et.sszie*2&&et.y[i]+et.size<=et.sy[j]&&et.y[i]>=et.sy[j]+et.sszie*2
									et.ifs[j]=1;
									
								}
							}
							if(j==1) {
								if(et.x[i]+et.size>=et.sx[j]-et.sszie&&et.x[i]<=et.sx[j]+et.sszie&&et.y[i]+et.size>=et.sy[j]&&et.y[i]<=et.sy[j]+et.sszie*2) {
									et.ifs[j]=1;
									
								}
							}
							if(j==2) {
								if(et.x[i]+et.size>=et.sx[j]&&et.x[i]<=et.sx[j]+et.sszie*2&&et.y[i]+et.size>=et.sy[j]-et.sszie&&et.y[i]<=et.sy[j]+et.sszie) {
									et.ifs[j]=1;
									
								}
							}
							if(j==3) {
								if(et.x[i]+et.size>=et.sx[j]-et.sszie&&et.x[i]<=et.sx[j]+et.sszie&&et.y[i]+et.size>=et.sy[j]-et.sszie&&et.y[i]<=et.sy[j]+et.sszie) {
									et.ifs[j]=1;
									
								}
							}
					}
					j=0;
				}
//				for(int i=0;i<et.ifs.length;i++) {
//					System.out.println(et.ifs[i]+"ifs"+i);
//				}
				for(int i=0;i<et.ifs.length;i++)
					if(et.ifs[i]==0&&et.timerspawn>=1000) {
						et.n[et.nr]=et.ver1;
						et.x[et.nr]=et.sx[i];
						et.y[et.nr]=et.sy[i];
						et.nr++;
						if(et.nr>=et.n.length) {
							et.nr=0;
						}
						et.timerspawn=0;
					}
				
				for(int i=0;i<et.ifs.length;i++)
					et.ifs[i]=0;
//				System.out.println(et.timerspawn+"timer");
				return;
			}
	
			public void pociskprzeszkody() {
				int j=0;
				for(int i=0;i<bulletst1.number.length;i++) {
					//bw
					for(;j<ob.bwn.length;j++) {
						if(bulletst1.x[i]+bulletst1.size>=ob.bwx[j]&&bulletst1.x[i]<=ob.bwx[j]+ob.bwsize&&bulletst1.y[i]+bulletst1.size>=ob.bwy[j]&&bulletst1.y[i]<ob.bwy[j]+ob.bwsize&&ob.bwn[j]==2) {
							bulletst1.number[i]=0;
							bulletst1.x[i]=0;
							bulletst1.y[i]=0;
							ob.bwn[j]=0;
							ob.bwx[j]=0;
							ob.bwy[j]=0;
							// &&bulletst1.y[i]+bulletst1.size>=ob.bwy[j]&&bulletst1.y[i]<ob.bwy[j]+ob.bwsize&&ob.bwn[j]==2
						}
					}
					j=0;
					//mw
					for(;j<ob.mwn.length;j++) {
						if(bulletst1.x[i]+bulletst1.size>=ob.mwx[j]&&bulletst1.x[i]<=ob.mwx[j]+ob.mwsize&&bulletst1.y[i]+bulletst1.size>=ob.mwy[j]&&bulletst1.y[i]<ob.mwy[j]+ob.mwsize&&ob.mwn[j]==3) {
							bulletst1.number[i]=0;
							bulletst1.x[i]=0;
							bulletst1.y[i]=0;
						}
					}
					j=0;
				
					//wow
					for(;j<ob.wown.length;j++) {
						if(bulletst1.x[i]+bulletst1.size>=ob.wowx[j]&&bulletst1.x[i]<=ob.wowx[j]+ob.wowsize&&bulletst1.y[i]+bulletst1.size>=ob.wowy[j]&&bulletst1.y[i]<ob.wowy[j]+ob.wowsize&&ob.wown[j]==5) {
							bulletst1.number[i]=0;
							bulletst1.x[i]=0;
							bulletst1.y[i]=0;
						}
					}
					j=0;
			
				}
				return;
			}
			public void pocisk() {
				
				for(int i=0;i<bulletst1.number.length-1;i++) {
					if(bulletst1.number[i]==1) {
						bulletst1.y[i]-=bulletst1.v;
					}
					if(bulletst1.number[i]==2) {
						bulletst1.x[i]-=bulletst1.v;
					}
					if(bulletst1.number[i]==3) {
						bulletst1.x[i]+=bulletst1.v;
					}
					if(bulletst1.number[i]==4) {
						bulletst1.y[i]+=bulletst1.v;
					}
				}
				
				return;
			}
			
			public void pociskend() {
				
				for(int i=0;i<bulletst1.number.length-1;i++) {
					if(bulletst1.number[i]==1) {
						if(bulletst1.y[i]<=0) {
							bulletst1.number[i]=0;
							bulletst1.x[i]=0;
							bulletst1.y[i]=0;
						}
						
					}
					if(bulletst1.number[i]==2) {
						if(bulletst1.y[i]>=window.y+bulletst1.size) {
							bulletst1.number[i]=0;
							bulletst1.x[i]=0;
							bulletst1.y[i]=0;
						}
					}
					if(bulletst1.number[i]==3) {
						if(bulletst1.x[i]<=0) {
							bulletst1.number[i]=0;
							bulletst1.x[i]=0;
							bulletst1.y[i]=0;
						}
					}
					if(bulletst1.number[i]==4) {
						if(bulletst1.x[i]>=window.x+bulletst1.size) {
							bulletst1.number[i]=0;
							bulletst1.x[i]=0;
							bulletst1.y[i]=0;
							
					return;
						}
					}
					
				}
			}
			public static int[][] settings() {
				//player 
				tabs.t[6][12]=1;
				
				//spawn
				tabs.t[0][0]=9;
				tabs.t[12][0]=9;
				tabs.t[0][25]=9;
				tabs.t[12][25]=9;
				//1 area spawn
				tabs.t[0][1]=8;
				tabs.t[1][0]=8;
				tabs.t[1][1]=8;
				//2 area spawn
				tabs.t[0][24]=8;
				tabs.t[1][24]=8;
				tabs.t[1][25]=8;
				//3 area spawn
				tabs.t[11][0]=8;
				tabs.t[11][1]=8;
				tabs.t[12][1]=8;
				//4 area spawn
				tabs.t[11][24]=8;
				tabs.t[11][25]=8;
				tabs.t[12][24]=8;
				
				
				return tabs.t;
			}
			
			
			public static int[][] drawBrickWall() {
				int j=0;
				int i=0;
				int k=0;
				while(k<50) {
					int a=(int)(Math.random() * tabs.t.length);
					int b=(int)(Math.random() * tabs.t[0].length);
					for(;i<tabs.t.length;i++) {
						for(;j<tabs.t[0].length;j++) {
							if(tabs.t[a][b]==0) {
								tabs.t[a][b]=2;
								k++;
							}
						}
						j=0;
					}
					j=0;
					i=0;
				}
				
				
				
				
				return tabs.t;
			}
			
			public static int[][] drawMetalWall() {
				int j=0;
				int i=0;
				int k=0;
				while(k<25) {
					int a=(int)(Math.random() * tabs.t.length);
					int b=(int)(Math.random() * tabs.t[0].length);
					for(;i<tabs.t.length;i++) {
						for(;j<tabs.t[0].length;j++) {
							if(tabs.t[a][b]==0) {
								tabs.t[a][b]=3;
								k++;
							}
						}
						j=0;
					}
					j=0;
					i=0;
				}
				
				
				
				
				return tabs.t;
			}
			
			public static int[][] drawWatherWall() {
				int j=0;
				int i=0;
				int k=0;
				while(k<15) {
					int a=(int)(Math.random() * tabs.t.length);
					int b=(int)(Math.random() * tabs.t[0].length);
					for(;i<tabs.t.length;i++) {
						for(;j<tabs.t[0].length;j++) {
							if(tabs.t[a][b]==0) {
								tabs.t[a][b]=4;
								k++;
							}
						}
						j=0;
					}
					j=0;
					i=0;
				}
				
				
				
				
				return tabs.t;
			}
			
			public static int[][] drawWoodWall() {
				int j=0;
				int i=0;
				int k=0;
				while(k<10) {
					int a=(int)(Math.random() * tabs.t.length);
					int b=(int)(Math.random() * tabs.t[0].length);
					for(;i<tabs.t.length;i++) {
						for(;j<tabs.t[0].length;j++) {
							if(tabs.t[a][b]==0) {
								tabs.t[a][b]=5;
								k++;
							}
						}
						j=0;
					}
					j=0;
					i=0;
				}
				
				
				
				
				return tabs.t;
			}
			
			public static int[][] placingBrickWall() {
				
				int j=0;
				for(int i=0;i<tabs.t.length;i++) {
					for(;j<tabs.t[0].length;j++) {
						if(tabs.t[i][j]==2) {
							ob.bwx[ob.bwnumber]=j*ob.bwsize;
							ob.bwy[ob.bwnumber]=i*ob.bwsize;
							ob.bwn[ob.bwnumber]=2;
							ob.bwnumber++;
							
						}
					}
					j=0;
				}
				
				
				return tabs.t;
			}
			public static int[][] placingMetalWall() {
				
				int j=0;
				for(int i=0;i<tabs.t.length;i++) {
					for(;j<tabs.t[0].length;j++) {
						if(tabs.t[i][j]==3) {
							ob.mwx[ob.mwnumber]=j*ob.mwsize;
							ob.mwy[ob.mwnumber]=i*ob.mwsize;
							ob.mwn[ob.mwnumber]=3;
							ob.mwnumber++;
							
						}
					}
					j=0;
				}
				
				
				return tabs.t;
			}
			
			public static int[][] placingWatherWall() {
				
				int j=0;
				for(int i=0;i<tabs.t.length;i++) {
					for(;j<tabs.t[0].length;j++) {
						if(tabs.t[i][j]==4) {
							ob.wwx[ob.wwnumber]=j*ob.wwsize;
							ob.wwy[ob.wwnumber]=i*ob.wwsize;
							ob.wwn[ob.wwnumber]=4;
							ob.wwnumber++;
							
						}
					}
					j=0;
				}
				
				
				return tabs.t;
			}
			
			public static int[][] placingWoodWall() {
				
				int j=0;
				for(int i=0;i<tabs.t.length;i++) {
					for(;j<tabs.t[0].length;j++) {
						if(tabs.t[i][j]==5) {
							ob.wowx[ob.wownumber]=j*ob.wowsize;
							ob.wowy[ob.wownumber]=i*ob.wowsize;
							ob.wown[ob.wownumber]=5;
							ob.wownumber++;
							
						}
					}
					j=0;
				}
				
				
				return tabs.t;
			}
			
			public static int[][] placingSpawns() {
				
				int j=0;
				for(int i=0;i<tabs.t.length;i++) {
					for(;j<tabs.t[0].length;j++) {
						if(tabs.t[i][j]==9) {
							et.sx[et.snumber]=j*et.spawnx;
							et.sy[et.snumber]=i*et.spawnx;
							et.sn[et.snumber]=9;
							et.snumber++;
							
						}
					}
					j=0;
				}
				
				
				return tabs.t;
			}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tabs.t=settings();
		tabs.t=drawBrickWall();
		tabs.t=drawMetalWall();
		tabs.t=drawWatherWall();
		tabs.t=drawWoodWall();
		tabs.t=placingBrickWall();
		tabs.t=placingMetalWall();
		tabs.t=placingWatherWall();
		tabs.t=placingWoodWall();
		tabs.t=placingSpawns();
	
//		System.out.println(tabs.t.length+"co to?");
		System.out.println(Arrays.deepToString(tabs.t));
		Tanks ta = new Tanks();
		meeeeJFrame window = new meeeeJFrame("Rysowanie");
		window.setDefaultCloseOperation(meeeeJFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.add(ta);
		window.pack();
		
		ta.animacja();

	}

}

//1=tank
//2=brickwall