
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Draw extends JFrame implements ActionListener,java.io.Serializable {
	private String[] Buttonnames={
			"新建",
			"打开",
			"保存",
			"曲线",
			"直线",
			"矩形",
			"实心矩形",
			"椭圆",
			"实心椭圆",
			"圆",
			"实心圆",
			"圆角矩形",
			"实心圆角矩形",
			"三角形",
			"圆锥形",
			"橡皮擦",
			"颜色选择",
			"线条粗细选择",
			"文字"
			};
	private String[] stylewords={
			"宋体",
			"隶书",
			"华文彩云",
			"黑体"};
	private JButton[] buttons;//存放按钮
	private JCheckBox bold,italic;//粗体，斜体
	private JComboBox fontstyles;//字体名字
	private DrawPanel drawingPanel;//画图区域
	private Drawings[] DrawList=new Drawings[500000];//定义图元，即每一个标记点
	private int currentDraw=3;//标记
	int index=0;//作为DrawList的标记
	private Color color=Color.black;
	int R=0,G=0,B=0;
	float stroke=1.0f;
	int font1,font2;
	String style; 
	JMenuItem newFile;
	JMenuItem openFile;
	JMenuItem saveFile;
	JMenuItem quitFile;
	JMenuItem choseColor;
	JMenuItem chosestroke;
	JMenuItem helpButton;
	private ObjectInputStream input;
	private ObjectOutputStream output;
	
	
	public Draw()
	{
		drawingPanel=new DrawPanel();
		//ButtonsListener buttonsListener=new ButtonsListener();
		JMenuBar bar=new JMenuBar();
		JMenu file=new JMenu("文件");
		 newFile=new JMenuItem("新建");
		newFile.addActionListener(this);
		 openFile=new JMenuItem("打开");
		openFile.addActionListener(this);
		 saveFile=new JMenuItem("保存");
		saveFile.addActionListener(this);
		quitFile=new JMenuItem("退出");
		quitFile.addActionListener(this);
		file.add(newFile);
		file.add(openFile);
		file.add(saveFile);
		file.add(quitFile);
		bar.add(file);
		
		
		JMenu color=new JMenu("颜色");
		 choseColor=new JMenuItem("选择颜色");
		choseColor.addActionListener(this);
		color.add(choseColor);
		bar.add(color);
		
		JMenu stroke=new JMenu("大小");
	    chosestroke=new JMenuItem("选择线条粗细");
		chosestroke.addActionListener(this);
		stroke.add(chosestroke);
		bar.add(stroke);
		
		JMenu help=new JMenu("帮助");
		helpButton=new JMenuItem("帮助信息");
		helpButton.addActionListener(this);
		help.add(helpButton);
		bar.add(help);

		JPanel buttonsPanel=new JPanel();
		buttonsPanel.setLayout(new GridLayout(2,6));
		buttons=new JButton[Buttonnames.length-5];
		for(int i=3;i<Buttonnames.length-3;i++)
		{
			buttons[i-3]=new JButton(Buttonnames[i]);
			buttons[i-3].addActionListener(this);
			buttonsPanel.add(buttons[i-3]);
		}
		buttons[13]=new JButton(Buttonnames[18]);
		buttons[13].addActionListener(this);
		buttonsPanel.add(buttons[13]);


		
		JPanel FontPanel=new JPanel();
		bold=new JCheckBox("黑体");
		bold.addActionListener(this);
		italic=new JCheckBox("斜体");
		italic.addActionListener(this);
		fontstyles=new JComboBox(stylewords);
		fontstyles.addActionListener(this);
		FontPanel.add(bold);
		FontPanel.add(italic);
		FontPanel.add(fontstyles);
		 
		createNewDrawList();
		
		getContentPane().setLayout(new BorderLayout(1,2));
		getContentPane().add(buttonsPanel,BorderLayout.SOUTH);
		getContentPane().add(FontPanel,BorderLayout.NORTH);
		super.setJMenuBar( bar );
		getContentPane().add(drawingPanel,BorderLayout.CENTER);
	}
	
	
	 //按钮消息响应函数

    	public void actionPerformed(ActionEvent e)
    	{
    		if(e.getSource()==newFile)
    		{
    			newFile();
    		}
    		if(e.getSource()==openFile)
    		{
    			openFile();
    		}
    		if(e.getSource()==saveFile)
    		{
    			saveFile();
    		}
    		
    		if(e.getSource()==quitFile)
    		{
    			System.exit(0);
    		}
    		if(e.getSource()==helpButton)
    		{
    			JOptionPane.showMessageDialog(null,"本程序实现了新建、打开、保存，绘画曲线、直线、矩形、实心矩形、椭圆、实心椭圆、圆、\n实心圆、圆角矩形、" +
    					"实心圆角矩形、三角形、圆锥形，文字，橡皮擦，颜色选择，线条粗细选择等功能！\n注：选择文字选项时，只需点击绘图区，输入文字即可将文字输入到点击的位置！","帮助信息",
    					JOptionPane.INFORMATION_MESSAGE);
		
    		}
     		for(int j=3;j<Buttonnames.length-3;j++)//一一比较
    		{
    			if(e.getSource()==buttons[j-3])
    			{
    				currentDraw=j;
    				createNewDrawList();
    				repaint();
    			}
    		}
     		if(e.getSource()==buttons[13])
			{
     			JOptionPane.showMessageDialog(null,"请用鼠标点击要写入文字的位置");
				currentDraw=16;
				createNewDrawList();
				repaint();
			}
     		else if(e.getSource()==choseColor)//颜色
    		{
    			//设置画笔颜色
    			color=JColorChooser.showDialog(Draw.this,"选择一个颜色",color);
    			R=color.getRed();
    			G=color.getGreen();
    			B=color.getBlue();
    			DrawList[index].R=R;
    			DrawList[index].G=G;
    			DrawList[index].B=B;
    		}
    		else if(e.getSource()==chosestroke)//线条粗细
    		{
    			String input=JOptionPane.showInputDialog(null,"请输入线条粗细度(浮点数)","画图",JOptionPane.QUESTION_MESSAGE);
    			try
    			{stroke=Float.parseFloat(input);}
    			catch(Exception ex)
    			{
    				return;
    			}
    			DrawList[index].stroke=stroke;
    		}
    		else if(e.getSource()==fontstyles)
     		{
    			 style=stylewords[fontstyles.getSelectedIndex()];
     		}
    	
    		else //粗体，斜体
    			{
    			    if(e.getSource()==bold)
    		            if(bold.isSelected())
    		                font1=Font.BOLD;
    		            else
    		                font1=Font.PLAIN;
    		        if(e.getSource()==italic)
    		            if(italic.isSelected())
    		                font2=Font.ITALIC;
    		            else
    		                font2=Font.PLAIN;
    		    }
     		
    	}


    
 
	 public void newFile()
	 {
		 //返回初始状态
		 index=0;
		 currentDraw=3;
		 color=Color.black;
		 stroke=1.0f;
		 createNewDrawList();
		 repaint();
		 
	 }
	 public void openFile()
	 {
		 JFileChooser fileChooser=new JFileChooser();
		 fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//只能选一个
		 int r=fileChooser.showOpenDialog(this);
		 if(r==JFileChooser.CANCEL_OPTION)
			 return;
		 File fileName=fileChooser.getSelectedFile();
		 fileName.canRead();
		 if(fileName==null||fileName.getName().equals(""))
			 JOptionPane.showMessageDialog(null,"请写入文件名字");
		 else {
			 try{
				 FileInputStream files=new FileInputStream(fileName);
				 input=new ObjectInputStream(files);
				 Drawings inputDraw;
				 int countNumber=input.readInt();//记录对象个数
				 for(index=0;index<countNumber;index++)
				 {
					 inputDraw=(Drawings)input.readObject();
					 DrawList[index]=inputDraw;
				 }
				 createNewDrawList();
				 input.close();
				 files.close();
				 repaint();
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,"111");
			 }
		 }
			 
			 
		 }
	 
	 public void saveFile()
	 {
		
		 JFileChooser fileChooser=new JFileChooser();
		 fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//只能选一个
		 int r=fileChooser.showOpenDialog(this);
		 if(r==JFileChooser.CANCEL_OPTION)
			 return;
		 File fileName=fileChooser.getSelectedFile();
		 fileName.canWrite();
		 if(fileName==null||fileName.getName().equals(""))
			 JOptionPane.showMessageDialog(null,"请写入文件名字");
		 else {
			 try{
				 fileName.delete();
				 FileOutputStream files=new FileOutputStream(fileName,true);
				 output=new ObjectOutputStream(files);
				 Drawings outputDraw;
				 output.writeInt(index);
				 for(int j=0;j<index;j++)
				 {
					  outputDraw=DrawList[j];
					 output.writeObject(outputDraw);
					 output.flush();
				 }
				 output.close();
				 files.close();
			 }
			 catch(IOException ioe)
		       {
		         	ioe.printStackTrace();
		       }
		 }
	 }
	 
	 class DrawPanel extends JPanel implements MouseListener,MouseMotionListener
	{
		public DrawPanel()
		{
			setBackground(Color.white);
			addMouseListener(this);
			addMouseMotionListener(this);
		}
		public void mouseClicked(MouseEvent e){
		}
		public void mouseEntered(MouseEvent e){
		}
		public void mouseExited(MouseEvent e){
		}
		public void mouseReleased(MouseEvent e){
			if(currentDraw==3||currentDraw==15)//曲线或橡皮（连续画，记录所有点）
			{
				DrawList[index].x1=e.getX();//把终点赋予起点
				DrawList[index].y1=e.getY();
			}
			DrawList[index].x2=e.getX();
			DrawList[index].y2=e.getY();
			repaint();
			index++;

			createNewDrawList();
			
		}
		public void mousePressed(MouseEvent e){
			DrawList[index].x1=DrawList[index].x2=e.getX();
			DrawList[index].y1=DrawList[index].y2=e.getY();
			if(currentDraw==3||currentDraw==15)//曲线或橡皮（连续画，记录所有点）
			{
				DrawList[index].x1=DrawList[index].x2=e.getX();//可以不写，写上便于理解
			    DrawList[index].y1=DrawList[index].y2=e.getY();
				
				index++;
				createNewDrawList();
			}
			if(currentDraw==16)//文字
			{
				DrawList[index].x1=e.getX();
				DrawList[index].y1=e.getY();
				String input=JOptionPane.showInputDialog(null,"请输入你要写入的文字","画图",JOptionPane.QUESTION_MESSAGE);
				DrawList[index].s1=input;
				DrawList[index].x2=font1;//用x2，y2存放粗体和斜体
				DrawList[index].y2=font2;
				DrawList[index].s2=style;
				index++;
				currentDraw=16;
				createNewDrawList();
				repaint();
				
			}
			
			    
		
		}
		public void mouseDragged(MouseEvent e){

			   if(currentDraw==3||currentDraw==15)
			   {
				   DrawList[index].x1=DrawList[index].x2=DrawList[index-1].x1=e.getX();
				   DrawList[index].y1=DrawList[index].y2=DrawList[index-1].y1=e.getY();
				   index++;
				   createNewDrawList();
			   }
			   else
			   {
				   DrawList[index].x2=e.getX();
				   DrawList[index].y2=e.getY();
			   }
			   repaint();
		}
		public void mouseMoved(MouseEvent e){
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2d=(Graphics2D)g;

				for(int j=0;j<=index;j++)
				{
				DrawList[j].draw(g2d);//画图
				}	
		
		    g2d.dispose();
		}
	}
    public void createNewDrawList()
    {
    	switch(currentDraw)
    	{//别忘了break;
    	    case 3:
    		    DrawList[index]=new Pencil();break;
    	    case 4:
    		    DrawList[index]=new Line();break;
    	    case 5:
        		DrawList[index]=new Rect();break;
    	    case 6:
        		DrawList[index]=new FullRect();break;
    	    case 7:
        		DrawList[index]=new Oval();break;
    	    case 8:
        		DrawList[index]=new FullOval();break;
    	    case 9:
        		DrawList[index]=new Circle();break;
    	    case 10:
        		DrawList[index]=new FullCircle();break;
    	    case 11:
        		DrawList[index]=new RoundRect();break;
    	    case 12:
        		DrawList[index]=new FullRoundRect();break;
    	    case 13:
        		DrawList[index]=new Triangle();break;
    	    case 14:
        		DrawList[index]=new TrianglePrick();break;
    	    case 15:
        		DrawList[index]=new Rubber();break;
    	    case 16:
        		DrawList[index]=new Word();break;
    		
    	}
    	DrawList[index].type=currentDraw;
    	DrawList[index].R=R;
    	DrawList[index].G=G;
    	DrawList[index].B=B;
    	DrawList[index].stroke=stroke;
    }
    public static void main(String[] args)
    {
    	/*try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
            }
         catch ( Exception e ) {}//将界面设置为当前windows风格
*/
    	 
    	Draw frame=new Draw();
    	frame.setSize(800,600);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

	
	
