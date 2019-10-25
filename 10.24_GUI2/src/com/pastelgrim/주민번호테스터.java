package com.pastelgrim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class 주민번호테스터 {
    private JPanel panel;
    private JTextField tf0;
    private JPasswordField pf;
    private JLabel lbResult;

    public static void main(String[] args) {
        JFrame frame = new JFrame("주민번호 테스터");
        주민번호테스터 app = new 주민번호테스터();
        frame.add(app.panel);
//        frame.setPreferredSize(new Dimension(400, 200));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        app.tf0.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (app.tf0.getText().length() == 6) {
                    app.pf.requestFocus();
                }
            }
        });
        app.pf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (app.pf.getPassword().length == 7) {
                    if (app.isGood(app.tf0.getText() + new String(app.pf.getPassword()))) {
                        app.lbResult.setText("O");
                    } else {
                        app.lbResult.setText("X");
                    }
                }
            }
        });
    }

    private boolean isGood(String s) {
        System.out.println(s);
        int[] testNumber = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            sum += (s.charAt(i) - '0') * testNumber[i];
        }
        int result = (11 - (sum % 11)) % 10;
        return result == s.charAt(s.length() - 1) - '0';
    }
}
