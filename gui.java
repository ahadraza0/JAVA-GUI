// JAVA FRAME WORK 2022
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class gui 
{
  public static void main(String[] args)
  {
      JFrame frame = new JFrame(); //CREATE A LABEL
      frame.setTitle("CODE WITH AHAD"); // SET TEXT OF LABEL
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EXIT OUT OF APPLICATION
      frame.setResizable(false); //THIS FROM BEING RESIZED
      frame.setSize(400,420); // SET THE X-DIMESION, AND Y-DIMENSION OF THIS
      frame.setVisible(true);// MAKE THIS VISIBLE
      
      ImageIcon image = new ImageIcon("download.png"); // CREATE AND IAMGE ICON
      frame.setIconImage(image.getImage()); // CHANGE INCON OF THIS
      frame.getContentPane().setBackground(Color.blue); //CHANGE COLOR OF BACKGROUNF
  }
}
