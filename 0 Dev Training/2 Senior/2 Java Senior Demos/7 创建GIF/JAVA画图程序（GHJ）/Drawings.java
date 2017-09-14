import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

class Drawings implements java.io.Serializable//只有串行化的类可以保存
{
	int x1,x2,y1,y2;
	int R,G,B;
	float stroke;
	int type;//定义属性
	String s1;//用于存放文字
	String s2;//定义字体
	void draw(Graphics2D g2d){}
}
class Line extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.drawLine(x1,y1,x2,y2);

	}
	
}
class Rect extends Drawings 
{
	void draw(Graphics2D g2d)	
	{
	    g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.drawRect(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x1-x2),Math.abs(y1-y2));

	}
}
class FullRect extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.fillRect(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x1-x2),Math.abs(y1-y2));

	}
}
class Oval extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.drawOval(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x1-x2),Math.abs(y1-y2));

	}
}
class FullOval extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.fillOval(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x1-x2),Math.abs(y1-y2));

	}
}
class Circle extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.drawOval(Math.min(x1,x2),Math.min(y1,y2),
				     Math.max(Math.abs(x1-x2),Math.abs(y1-y2)),
	                 Math.max(Math.abs(x1-x2),Math.abs(y1-y2)));

	}
}
class FullCircle extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.fillOval(Math.min(x1,x2),Math.min(y1,y2),
				     Math.max(Math.abs(x1-x2),Math.abs(y1-y2)),
	                 Math.max(Math.abs(x1-x2),Math.abs(y1-y2)));

	}
}
class RoundRect extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.drawRoundRect(Math.min(x1,x2),Math.min(y1,y2),
				     Math.abs(x1-x2),
	                 Math.abs(y1-y2),45,30);

	}
}
class FullRoundRect extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.fillRoundRect(Math.min(x1,x2),Math.min(y1,y2),
				     Math.abs(x1-x2),
	                 Math.abs(y1-y2),45,30);

	}
}
class Pencil extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.drawLine(x1,y1,x2,y2);

	}
}
class Triangle extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.drawLine(x1,y1,x2,y2);
		g2d.drawLine(x1,y1,2*x1-x2,y2);
		g2d.drawLine(2*x1-x2,y2,x2,y2);
	}
}
class TrianglePrick extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(R,G,B));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.drawLine(x1,y1,x2,y2);
		g2d.drawLine(x1,y1,2*x1-x2,y2);
		g2d.drawOval(Math.min(x2,2*x1-x2),Math.abs(y2-Math.abs((y1-y2)/10)),
			     Math.abs(2*x1-x2-x2),
			     Math.abs((y1-y2)/5));
	}
}
class Rubber extends Drawings
{
	void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(255,255,255));
		g2d.setStroke(new BasicStroke(stroke));
		g2d.drawLine(x1,y1,x2,y2);
	}
}

 class Word extends Drawings//输入文字类
 {
  void draw(Graphics2D g2d)
  {
          g2d.setColor(new Color(R,G,B));
          g2d.setFont(new Font(s2,x2+y2,((int)stroke)*18));
          if (s1!= null )
          g2d.drawString(s1,x1,y1);
         }
 }

 