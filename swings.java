import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
public class swings
{
public static void main(String args[])
{
new swings();
}
public swings()
{
JFrame frame=new JFrame("greeting");
JPanel panel=new JPanel();
String data[][]={{"vikram","btech","a"},{"ram","btech","a"},{"dhanu","btech","a"},{"shashank","btech","a"}};
String col[]={"name","batch","grades"};
JTable table=new JTable(data,col);
panel.add(table,BorderLayout.CENTER);
frame.add(panel);
frame.setSize(300,200);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
