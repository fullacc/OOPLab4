import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      ArrayList<MoveableShape> shapes = new ArrayList<MoveableShape>();
      int count = 5;
      for(int i = 0; i < count;i++){
         shapes.add(new CarShape(0,0,CAR_WIDTH)); 	
      }

      ShapeIcon icon = new ShapeIcon(shapes,
            ICON_WIDTH, ICON_HEIGHT);

      final JLabel label = new JLabel(icon);
      frame.setLayout(new FlowLayout());
      frame.add(label);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      final int DELAY = 100;
      // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
            	for(MoveableShape shape: shapes){
            		shape.translate(2, 0);
            		if(shape.getx() >= ICON_WIDTH){
            			shape.resetX(); 
             	 }
            	}
               label.repaint();
            }
         });
      t.start();
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
