import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/*
<applet code="text_formeting" height=300 width=300></applet>
*/

public class text_formeting extends JApplet {
    JComboBox<String> fontNameCB;
    JComboBox<Integer> fontSizeCB;
    JComboBox<String> colorCB;

    JLabel label;

    String msg = "WELCOME TO JAVA!";

    Font font;

    String[] fontNames = { "TimesRoman", "Serif", "SansSerif" };
    Integer[] fontSizes = { 12, 14, 16, 18 };
    String[] colors = {"red", "green", "blue"};

    public void init() {
        try {
            SwingUtilities.invokeAndWait(
                new Runnable() {
                    public void run() {
                        makeGUI();
                    }
                }
            );
        }

        catch(Exception ex) {
            System.out.println("Can't create because of " + ex);
        }
    }

    private void makeGUI() {
        setLayout(null);

        // Instantiate comboboxes
        fontNameCB = new JComboBox<String>(fontNames);
        fontSizeCB = new JComboBox<Integer>(fontSizes);
        colorCB = new JComboBox<String>(colors);

        add(fontNameCB);
        add(fontSizeCB);
        add(colorCB);

        label = new JLabel("WELCOME TO JAVA!");

        add(label);


        // Handle Selections
        fontNameCB.addActionListener(new ComboBoxHandler());
        fontSizeCB.addActionListener(new ComboBoxHandler());
        colorCB.addActionListener(new ComboBoxHandler());

        // fontNameCB.setBounds(50, 150, 150, 50);
        // fontSizeCB.setBounds(150, 150, 150, 50);
        // colorCB.setBounds(250, 150, 150, 50);
        
        Dimension appletDimensions = getSize();
        System.out.println(appletDimensions);
        label.setBounds(appletDimensions.width / 2, appletDimensions.height / 2, 150, 10);
    }

    class ComboBoxHandler implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String name = (String)fontNameCB.getSelectedItem();
            Integer size = (Integer)fontSizeCB.getSelectedItem();
            String c = (String)colorCB.getSelectedItem();
            Color color = Color.black;

            switch(c) {
            	case "red":
            		color = Color.red;
            		break;
            	case "blue":
            		color = Color.blue;
            		break;
            	case "green":
            		color = Color.green;
            		break;
            }

            font = new Font(name, Font.PLAIN, size);
            label.setFont(font);
            label.setForeground(color);
        }
    }

}