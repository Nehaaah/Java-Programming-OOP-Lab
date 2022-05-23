import java.awt.*;
import java.applet.*;
/*
<applet code="drawShapes" width=400 height=400>
</applet>
*/
public class drawShapes extends Applet
{
	public void init()
	{
 		setForeground(Color.black);
		setBackground(Color.yellow);
	}
 	 public void paint(Graphics g) 
	{
   		g.drawLine(10, 10, 100, 100);
   		g.drawRect(100, 150, 100, 150);
    		g.drawOval(200, 200, 200, 200);
 	}
}
