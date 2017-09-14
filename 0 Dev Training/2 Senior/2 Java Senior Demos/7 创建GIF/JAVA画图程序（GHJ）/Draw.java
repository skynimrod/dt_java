
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Draw extends JFrame implements ActionListener,java.io.Serializable {
	private String[] Buttonnames={
			"�½�",
			"��",
			"����",
			"����",
			"ֱ��",
			"����",
			"ʵ�ľ���",
			"��Բ",
			"ʵ����Բ",
			"Բ",
			"ʵ��Բ",
			"Բ�Ǿ���",
			"ʵ��Բ�Ǿ���",
			"������",
			"Բ׶��",
			"��Ƥ��",
			"��ɫѡ��",
			"������ϸѡ��",
			"����"
			};
	private String[] stylewords={
			"����",
			"����",
			"���Ĳ���",
			"����"};
	private JButton[] buttons;//��Ű�ť
	private JCheckBox bold,italic;//���壬б��
	private JComboBox fontstyles;//��������
	private DrawPanel drawingPanel;//��ͼ����
	private Drawings[] DrawList=new Drawings[500000];//����ͼԪ����ÿһ����ǵ�
	private int currentDraw=3;//���
	int index=0;//��ΪDrawList�ı��
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
		JMenu file=new JMenu("�ļ�");
		 newFile=new JMenuItem("�½�");
		newFile.addActionListener(this);
		 openFile=new JMenuItem("��");
		openFile.addActionListener(this);
		 saveFile=new JMenuItem("����");
		saveFile.addActionListener(this);
		quitFile=new JMenuItem("�˳�");
		quitFile.addActionListener(this);
		file.add(newFile);
		file.add(openFile);
		file.add(saveFile);
		file.add(quitFile);
		bar.add(file);
		
		
		JMenu color=new JMenu("��ɫ");
		 choseColor=new JMenuItem("ѡ����ɫ");
		choseColor.addActionListener(this);
		color.add(choseColor);
		bar.add(color);
		
		JMenu stroke=new JMenu("��С");
	    chosestroke=new JMenuItem("ѡ��������ϸ");
		chosestroke.addActionListener(this);
		stroke.add(chosestroke);
		bar.add(stroke);
		
		JMenu help=new JMenu("����");
		helpButton=new JMenuItem("������Ϣ");
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
		bold=new JCheckBox("����");
		bold.addActionListener(this);
		italic=new JCheckBox("б��");
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
	
	
	 //��ť��Ϣ��Ӧ����

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
    			JOptionPane.showMessageDialog(null,"������ʵ�����½����򿪡����棬�滭���ߡ�ֱ�ߡ����Ρ�ʵ�ľ��Ρ���Բ��ʵ����Բ��Բ��\nʵ��Բ��Բ�Ǿ��Ρ�" +
    					"ʵ��Բ�Ǿ��Ρ������Ρ�Բ׶�Σ����֣���Ƥ������ɫѡ��������ϸѡ��ȹ��ܣ�\nע��ѡ������ѡ��ʱ��ֻ������ͼ�����������ּ��ɽ��������뵽�����λ�ã�","������Ϣ",
    					JOptionPane.INFORMATION_MESSAGE);
		
    		}
     		for(int j=3;j<Buttonnames.length-3;j++)//һһ�Ƚ�
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
     			JOptionPane.showMessageDialog(null,"���������Ҫд�����ֵ�λ��");
				currentDraw=16;
				createNewDrawList();
				repaint();
			}
     		else if(e.getSource()==choseColor)//��ɫ
    		{
    			//���û�����ɫ
    			color=JColorChooser.showDialog(Draw.this,"ѡ��һ����ɫ",color);
    			R=color.getRed();
    			G=color.getGreen();
    			B=color.getBlue();
    			DrawList[index].R=R;
    			DrawList[index].G=G;
    			DrawList[index].B=B;
    		}
    		else if(e.getSource()==chosestroke)//������ϸ
    		{
    			String input=JOptionPane.showInputDialog(null,"������������ϸ��(������)","��ͼ",JOptionPane.QUESTION_MESSAGE);
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
    	
    		else //���壬б��
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
		 //���س�ʼ״̬
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
		 fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//ֻ��ѡһ��
		 int r=fileChooser.showOpenDialog(this);
		 if(r==JFileChooser.CANCEL_OPTION)
			 return;
		 File fileName=fileChooser.getSelectedFile();
		 fileName.canRead();
		 if(fileName==null||fileName.getName().equals(""))
			 JOptionPane.showMessageDialog(null,"��д���ļ�����");
		 else {
			 try{
				 FileInputStream files=new FileInputStream(fileName);
				 input=new ObjectInputStream(files);
				 Drawings inputDraw;
				 int countNumber=input.readInt();//��¼�������
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
		 fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//ֻ��ѡһ��
		 int r=fileChooser.showOpenDialog(this);
		 if(r==JFileChooser.CANCEL_OPTION)
			 return;
		 File fileName=fileChooser.getSelectedFile();
		 fileName.canWrite();
		 if(fileName==null||fileName.getName().equals(""))
			 JOptionPane.showMessageDialog(null,"��д���ļ�����");
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
			if(currentDraw==3||currentDraw==15)//���߻���Ƥ������������¼���е㣩
			{
				DrawList[index].x1=e.getX();//���յ㸳�����
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
			if(currentDraw==3||currentDraw==15)//���߻���Ƥ������������¼���е㣩
			{
				DrawList[index].x1=DrawList[index].x2=e.getX();//���Բ�д��д�ϱ������
			    DrawList[index].y1=DrawList[index].y2=e.getY();
				
				index++;
				createNewDrawList();
			}
			if(currentDraw==16)//����
			{
				DrawList[index].x1=e.getX();
				DrawList[index].y1=e.getY();
				String input=JOptionPane.showInputDialog(null,"��������Ҫд�������","��ͼ",JOptionPane.QUESTION_MESSAGE);
				DrawList[index].s1=input;
				DrawList[index].x2=font1;//��x2��y2��Ŵ����б��
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
				DrawList[j].draw(g2d);//��ͼ
				}	
		
		    g2d.dispose();
		}
	}
    public void createNewDrawList()
    {
    	switch(currentDraw)
    	{//������break;
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
         catch ( Exception e ) {}//����������Ϊ��ǰwindows���
*/
    	 
    	Draw frame=new Draw();
    	frame.setSize(800,600);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

	
	
