import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class ConsoleGUI {

    JLabel labelOH, labelMB, labelO, counterOH, counterMB, counterO,labelP, counterP;
    int countOH,countMB,countO,countP;

    public ConsoleGUI() {
        JFrame frame = new JFrame("Set Count");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        labelOH = new JLabel("Outside:");
        labelMB = new JLabel("Middle:");
        labelO = new JLabel("Opposite:");
        labelP = new JLabel("Pipe:");


        counterOH= new JLabel("Number of sets to the outside hitter: "+countOH);
        counterMB= new JLabel("Number of sets to the middle blocker: "+countMB);
        counterO= new JLabel("Number of sets to the opposite hitter: "+countO);
        counterP= new JLabel("Number of sets to the pipe hitter: "+countP);


        countOH = 0;
        countO = 0;
        countMB = 0;
        countP=0;


        frame.getContentPane().add(panel);



        panel.add(labelOH);
        panel.add(counterOH);
        labelOH.setFont(new Font("Arial", Font.PLAIN, 24));
        counterOH.setFont(new Font("Arial", Font.PLAIN, 22));
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_Z) { // Increment counter on 'z' press
                    countOH++;
                    counterOH.setText("Number of sets to the outside hitter: "+countOH);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}

            @Override
            public void keyTyped(KeyEvent e) {}
        });


        panel.add(labelMB);
        panel.add(counterMB);
        labelMB.setFont(new Font("Arial", Font.PLAIN, 24));
        counterMB.setFont(new Font("Arial", Font.PLAIN, 22));

        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacer
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_X) { // Increment counter on 'z' press
                    countMB++;
                    counterMB.setText("Number of sets to the middle blocker: "+countMB);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}

            @Override
            public void keyTyped(KeyEvent e) {}
        });


        panel.add(labelO);
        panel.add(counterO);
        labelO.setFont(new Font("Arial", Font.PLAIN, 24));
        counterO.setFont(new Font("Arial", Font.PLAIN, 22));
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_V) { // Increment counter on 'z' press
                    countO++;
                    counterO.setText("Number of sets to the opposite hitter: " + countO);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}

            @Override
            public void keyTyped(KeyEvent e) {}
        });

        panel.add(labelP);
        panel.add(counterP);
        labelP.setFont(new Font("Arial", Font.PLAIN, 24));
        counterP.setFont(new Font("Arial", Font.PLAIN, 22));
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_C) { // Increment counter on 'z' press
                    countP++;
                    counterP.setText("Number of sets to the outside hitter: "+countP);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}

            @Override
            public void keyTyped(KeyEvent e) {}
        });




        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(1000,500);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ConsoleGUI::new);
    }
}
