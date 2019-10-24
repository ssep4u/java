import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI11_주민번호테스터 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField tf0 = new JTextField(10);
        JLabel lb = new JLabel("-");
        JTextField tf1 = new JTextField(10);
//        JButton btTest = new JButton("테스트");

//        btTest.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (isGood(tf0.getText() + tf1.getText())) {
//                    lb.setText("O");
//                } else {
//                    lb.setText("X");
//                }
//            }
//        });
        tf0.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (tf0.getText().length() == 6) {
                    tf1.requestFocus();
                }
            }
        });
        tf1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (tf1.getText().length() == 7) {
                    if (isGood(tf0.getText() + tf1.getText())) {
                        lb.setText("O");
                    } else {
                        lb.setText("X");
                    }
                }
            }
        });

        panel.add(tf0);
        panel.add(lb);
        panel.add(tf1);
//        panel.add(btTest);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static boolean isGood(String s) {
        int[] testNumber = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            sum += (s.charAt(i) - '0') * testNumber[i];
        }
        int result = 11 - (sum % 11);
        return result == s.charAt(s.length() - 1) - '0';
    }
}
