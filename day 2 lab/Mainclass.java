import javax.swing.*;
import java.awt.*;

public class Mainclass {

    JFrame frame;

    ImageIcon i1;
    Image i2;
    ImageIcon i3;
    JLabel image;
    JLabel text = new JLabel("Electricity Management System");
    JProgressBar progressBar = new JProgressBar();
    JLabel message = new JLabel();

    Mainclass() {
        try {
            i1 = new ImageIcon(getClass().getResource("/icon/electricity.png"));
            i2 = i1.getImage();
            i3 = new ImageIcon(i2);
            image = new JLabel(i3);
        } catch (NullPointerException e) {
            System.err.println("Image not found. Loading default image.");
            // Provide a default image
            i3 = new ImageIcon(); // You can provide a path to a default image here
            image = new JLabel(i3);
        }

        createGUI();
        addImage();
        addText();
        addProgressBar();
        runningPBar();
    }

    public void createGUI() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0X78DEC7));
        frame.setVisible(true);
    }

    public void addImage() {
        image.setBounds(90, 70, 400, 200);
        frame.add(image);
    }

    public void addText() {
        text.setFont(new Font("MV Boli", Font.BOLD, 22));
        text.setBounds(120, 300, 400, 50);
        text.setForeground(Color.black);
        frame.add(text);
    }

    public void addProgressBar() {
        progressBar.setBounds(100, 380, 400, 30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.black);
        progressBar.setForeground(new Color(0XFF6464));
        progressBar.setValue(0);
        frame.add(progressBar);
    }

    public void runningPBar() {
        int i = 0;
        while (i <= 100) {
            try {
                Thread.sleep(40);
                progressBar.setValue(i);
                i++;
                if (i == 100)
                    frame.dispose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Mainclass();
    }
}
