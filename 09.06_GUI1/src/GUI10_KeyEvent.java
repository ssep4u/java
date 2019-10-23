import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI10_KeyEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField tf0 = new JTextField(10);
        JLabel lb = new JLabel("-");
        JTextField tf1 = new JTextField(10);

        tf0.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {}

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if(keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
                    tf1.setText("왼쪽 키 눌림");
                    tf0.setText("");
                } else if(keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
                    tf1.setText("오른쪽 키 눌림");
                } else if(keyEvent.getKeyCode() == KeyEvent.VK_UP) {
                    tf1.setText("위쪽 키 눌림");
                } else if(keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
                    tf1.setText("아래쪽 키 눌림");
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                if(keyEvent.getKeyChar() == 'q') {
                    System.out.println("뀨뀨");
                }
            }
        });


        panel.add(tf0);
        panel.add(lb);
        panel.add(tf1);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
