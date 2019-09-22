import com.sun.nio.sctp.MessageInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI2_Components {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JLabel lb0 = new JLabel("JLabel");
        JButton bt0 = new JButton("JButton");
        JCheckBox cb0 = new JCheckBox("JCheckBox0");
        JCheckBox cb1 = new JCheckBox("JCheckBox1");
        JRadioButton rb0 = new JRadioButton("미성년자");
        JRadioButton rb1 = new JRadioButton("성인");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb0);
        bg.add(rb1);
        JTextField tf0 = new JTextField("JTextField");
        JTextArea ta0 = new JTextArea(2, 10);
        String[] finkl = {"이효리", "성유리"};
        JComboBox<String> cbox0 = new JComboBox<>(finkl);
        cbox0.addItem("옥주현");
        cbox0.addItem("이진");

        JLabel lbResult = new JLabel("Result");

        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String result = "";
                result += lb0.getText();
                result += bt0.getText();
                result += cb0.isSelected();
                result += cb1.isSelected();
                result += rb0.isSelected();
                result += rb1.isSelected();
                result += tf0.getText();
                result += ta0.getText();
                result += cbox0.getSelectedItem();
//                result += cbox0.getItemAt(cbox0.getSelectedIndex());

                lbResult.setText(result);
            }
        });
        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == cb0) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        System.out.println(cb0.getText() + ": checked");
                    } else {
                        System.out.println(cb0.getText() + ": unchecked");
                    }
                } else if (e.getSource() == cb1) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        System.out.println(cb1.getText() + ": checked");
                    } else {
                        System.out.println(cb1.getText() + ": unchecked");
                    }
                } else if (e.getSource() == rb0) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        System.out.println(rb0.getText() + ": checked");
                    } else {
                        System.out.println(rb0.getText() + ": unchecked");
                    }
                } else if (e.getSource() == rb1) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        System.out.println(rb1.getText() + ": checked");
                    } else {
                        System.out.println(rb1.getText() + ": unchecked");
                    }
                }  else if (e.getSource() == cbox0) {
                    System.out.println(cbox0.getSelectedItem());
                }

            }
        };
        cb0.addItemListener(il);
        cb1.addItemListener(il);
        rb0.addItemListener(il);
        rb1.addItemListener(il);
        cbox0.addItemListener(il);

        panel.add(lb0);
        panel.add(bt0);
        panel.add(cb0);
        panel.add(cb1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(cbox0);
        panel.add(lbResult);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
