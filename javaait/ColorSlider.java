import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class ColorSlider extends JFrame implements ChangeListener
{
  JSlider red, blue, green;
  JPanel sliderPanel, colorPanel;
  JLabel rValue, gValue, bValue;
  JLabel rCaption, gCaption, bCaption;

  ColorSlider()
  {
    initComponents();
    setSize(300,200);
    setVisible(true);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  }

  void initComponents()
  {
    red = new JSlider(0,255,0);//min,max,curr
    blue = new JSlider(0,255,0);
    green = new JSlider(0,255,0);

    red.addChangeListener(this);
    blue.addChangeListener(this);
    green.addChangeListener(this);

    sliderPanel = new JPanel();
    sliderPanel.setLayout(new GridLayout(3,3));

    rCaption = new JLabel("Red", JLabel.RIGHT);
    gCaption = new JLabel("Green", JLabel.RIGHT);
    bCaption = new JLabel("Blue", JLabel.RIGHT);
   
    rValue = new JLabel("0");
    gValue = new JLabel("0");
    bValue = new JLabel("0");
  
    sliderPanel.add(rCaption);
    sliderPanel.add(red);
    sliderPanel.add(rValue);

    sliderPanel.add(gCaption);
    sliderPanel.add(green);
    sliderPanel.add(gValue);

    sliderPanel.add(bCaption);
    sliderPanel.add(blue);
    sliderPanel.add(bValue);

    colorPanel = new JPanel();

    setLayout(new BorderLayout());
    add(colorPanel , BorderLayout.CENTER);
    add(sliderPanel, BorderLayout.SOUTH);

  }

  public void stateChanged(ChangeEvent ce)
  {
      int r = red.getValue(); 
      rValue.setText(Integer.toString(r));

      int g = green.getValue();
      gValue.setText(Integer.toString(g));

      int b = blue.getValue(); 
      bValue.setText(Integer.toString(b));
     
      Color c = new Color(r,g,b);
   
      colorPanel.setBackground(c);
  }

  public static void main(String args[])
  {
    new ColorSlider();
  }
}	